package com.alipeker.springboot.transactional.ts3;

import com.alipeker.springboot.service.entityservice.KategoriEntityService;
import com.alipeker.springboot.entity.Kategori;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Ts3Service2 {

    @Autowired
    private KategoriEntityService kategoriEntityService;

    public void save(){

        Kategori kategori = new Kategori();
        kategori.setAdi("transactional3-2");
        kategori.setKirilim(1L);
        kategoriEntityService.save(kategori);

        System.out.println("non transactional service ends");

    }
}
