package com.alipeker.springboot.designpattern.template;

import com.alipeker.springboot.service.entityservice.UrunEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductReportService2 extends AbstractReportService {

    @Autowired
    private UrunEntityService urunEntityService;

    @Override
    public String getTitle() {
        return "Ürünler: ";
    }

    @Override
    public List getList() {
        return urunEntityService.findAll();
    }
}
