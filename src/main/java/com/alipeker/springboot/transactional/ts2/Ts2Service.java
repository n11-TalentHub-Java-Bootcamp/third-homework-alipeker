package com.alipeker.springboot.transactional.ts2;

import com.alipeker.springboot.service.entityservice.KategoriEntityService;
import com.alipeker.springboot.entity.Kategori;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class Ts2Service {

    @Autowired
    private KategoriEntityService kategoriEntityService;

    public void save(){

        Kategori kategori = new Kategori();
        kategori.setAdi("transactional2");
        kategori.setKirilim(1L);
        kategoriEntityService.save(kategori);

        System.out.println("end");
    }

    public void test(){
        System.out.println("");
    }
}
