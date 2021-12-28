package com.alipeker.springboot.designpattern.template;

import com.alipeker.springboot.service.entityservice.KategoriEntityService;
import com.alipeker.springboot.entity.Kategori;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryReportService {

    @Autowired
    private KategoriEntityService kategoriEntityService;

    public void report(){

        List<Kategori> kategoriList = kategoriEntityService.findAll();

        System.out.println("Kategoriler: ");
        for (Kategori kategori : kategoriList) {
            System.out.println(kategori);
        }
    }
}
