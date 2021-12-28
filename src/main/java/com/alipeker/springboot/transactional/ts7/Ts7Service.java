package com.alipeker.springboot.transactional.ts7;

import com.alipeker.springboot.service.entityservice.KategoriEntityService;
import com.alipeker.springboot.entity.Kategori;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Ts7Service {

    @Autowired
    private KategoriEntityService kategoriEntityService;

    public void save(){
        Kategori kategori = new Kategori();
        kategori.setAdi("transactional7-1");
        kategori.setKirilim(1L);
        kategoriEntityService.save(kategori);

        System.out.println("kayıt başarılı");

        throw new RuntimeException("hata");
    }
}
