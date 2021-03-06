package com.alipeker.springboot.transactional.ts14;

import com.alipeker.springboot.service.entityservice.KategoriEntityService;
import com.alipeker.springboot.entity.Kategori;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class Ts14Service2 {

    @Autowired
    private KategoriEntityService kategoriEntityService;

    @Transactional(propagation = Propagation.SUPPORTS)
    public void save(){
        Kategori kategori = new Kategori();
        kategori.setAdi("transactional14-2");
        kategori.setKirilim(1L);
        kategoriEntityService.save(kategori);

        System.out.println("14-2");
    }
}
