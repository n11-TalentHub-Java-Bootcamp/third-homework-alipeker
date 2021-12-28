package com.alipeker.springboot.transactional.ts1;

import com.alipeker.springboot.service.entityservice.KategoriEntityService;
import com.alipeker.springboot.entity.Kategori;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Ts1Service {

    @Autowired
    private KategoriEntityService kategoriEntityService;

    public void save(){

        Kategori kategori = new Kategori();
        kategori.setAdi("transactional1");
        kategori.setKirilim(1L);

        kategoriEntityService.save(kategori);

        System.out.println("end");
    }
}
