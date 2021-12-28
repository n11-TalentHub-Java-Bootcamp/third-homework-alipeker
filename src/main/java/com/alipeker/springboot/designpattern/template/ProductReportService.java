package com.alipeker.springboot.designpattern.template;

import com.alipeker.springboot.entity.Urun;
import com.alipeker.springboot.service.entityservice.UrunEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductReportService {

    @Autowired
    private UrunEntityService urunEntityService;

    public void report(){

        List<Urun> urunList = urunEntityService.findAll();

        System.out.println("Ürünler: ");
        for (Urun urun : urunList) {
            System.out.println(urun);
        }

    }
}
