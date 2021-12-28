package com.alipeker.springboot.mongodb.converter;

import com.alipeker.springboot.mongodb.dto.ProductDetailDto;
import com.alipeker.springboot.mongodb.entity.Product;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-12-28T17:39:36+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 16.0.2 (Oracle Corporation)"
)
public class ProductConverterImpl implements ProductConverter {

    @Override
    public ProductDetailDto convertProductToProductDetailDto(Product product) {
        if ( product == null ) {
            return null;
        }

        ProductDetailDto productDetailDto = new ProductDetailDto();

        productDetailDto.setProductName( product.getName() );
        productDetailDto.setProductPrice( product.getPrice() );
        productDetailDto.setCategoryId( product.getCategoryId() );

        return productDetailDto;
    }

    @Override
    public List<ProductDetailDto> convertAllProductListToProductDetailDtoList(List<Product> product) {
        if ( product == null ) {
            return null;
        }

        List<ProductDetailDto> list = new ArrayList<ProductDetailDto>( product.size() );
        for ( Product product1 : product ) {
            list.add( convertProductToProductDetailDto( product1 ) );
        }

        return list;
    }
}
