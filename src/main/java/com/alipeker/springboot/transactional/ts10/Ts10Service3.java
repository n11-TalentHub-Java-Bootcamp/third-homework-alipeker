package com.alipeker.springboot.transactional.ts10;

import com.alipeker.springboot.service.entityservice.KategoriEntityService;
import com.alipeker.springboot.entity.Kategori;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class Ts10Service3 {

    @Autowired
    private KategoriEntityService kategoriEntityService;

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void kategoriKaydet(int i) {

        Kategori kategori = new Kategori();
        kategori.setAdi("transactional10-" + i);
        kategori.setKirilim(1L);
        kategoriEntityService.save(kategori);

        if (i == 9){
            throw new RuntimeException("hata");
        }
    }
}
