package com.alipeker.springboot.transactional.ts16;

import com.alipeker.springboot.service.entityservice.KategoriEntityService;
import com.alipeker.springboot.entity.Kategori;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class Ts16Service2 {

    @Autowired
    private KategoriEntityService kategoriEntityService;

    @Transactional(propagation = Propagation.NESTED)
    public void save(){
        Kategori kategori = new Kategori();
        kategori.setAdi("transactional16-2");
        kategori.setKirilim(1L);
        kategoriEntityService.save(kategori);
    }
}
