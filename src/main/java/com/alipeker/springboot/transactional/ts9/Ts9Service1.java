package com.alipeker.springboot.transactional.ts9;

import com.alipeker.springboot.service.entityservice.KategoriEntityService;
import com.alipeker.springboot.entity.Kategori;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class Ts9Service1 {

    @Autowired
    private KategoriEntityService kategoriEntityService;

    @Autowired
    private Ts9Service2 ts9Service2;

    public void save(){
        Kategori kategori = new Kategori();
        kategori.setAdi("transactional9-1");
        kategori.setKirilim(1L);
        kategoriEntityService.save(kategori);

        ts9Service2.save2();

        System.out.println("8-1");

    }
}
