package com.alipeker.springboot.transactional.ts11;

import com.alipeker.springboot.service.entityservice.KategoriEntityService;
import com.alipeker.springboot.entity.Kategori;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class Ts11Service2 {

    @Autowired
    private KategoriEntityService kategoriEntityService;

    @Transactional(propagation = Propagation.MANDATORY)
    public void save(){
        Kategori kategori = new Kategori();
        kategori.setAdi("transactional11-2");
        kategori.setKirilim(1L);
        kategoriEntityService.save(kategori);
    }
}
