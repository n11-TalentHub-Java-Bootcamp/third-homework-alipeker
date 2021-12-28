package com.alipeker.springboot.converter;

import com.alipeker.springboot.dto.KategoriDto;
import com.alipeker.springboot.entity.Kategori;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-12-28T17:39:36+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 16.0.2 (Oracle Corporation)"
)
public class KategoriConverterImpl implements KategoriConverter {

    @Override
    public KategoriDto convertKategoriToKategoriDto(Kategori kategori) {
        if ( kategori == null ) {
            return null;
        }

        KategoriDto kategoriDto = new KategoriDto();

        kategoriDto.setUstKategoriId( kategoriUstKategoriId( kategori ) );
        kategoriDto.setId( kategori.getId() );
        kategoriDto.setAdi( kategori.getAdi() );
        kategoriDto.setKirilim( kategori.getKirilim() );

        return kategoriDto;
    }

    @Override
    public List<KategoriDto> convertAllKategoriListToKategoriDtoList(List<Kategori> kategoriList) {
        if ( kategoriList == null ) {
            return null;
        }

        List<KategoriDto> list = new ArrayList<KategoriDto>( kategoriList.size() );
        for ( Kategori kategori : kategoriList ) {
            list.add( convertKategoriToKategoriDto( kategori ) );
        }

        return list;
    }

    @Override
    public Kategori convertKategoriDtoToKategori(KategoriDto kategoriDto) {
        if ( kategoriDto == null ) {
            return null;
        }

        Kategori kategori = new Kategori();

        kategori.setUstKategori( kategoriDtoToKategori( kategoriDto ) );
        kategori.setId( kategoriDto.getId() );
        kategori.setAdi( kategoriDto.getAdi() );
        kategori.setKirilim( kategoriDto.getKirilim() );

        setNulls( kategori, kategoriDto );

        return kategori;
    }

    private Long kategoriUstKategoriId(Kategori kategori) {
        if ( kategori == null ) {
            return null;
        }
        Kategori ustKategori = kategori.getUstKategori();
        if ( ustKategori == null ) {
            return null;
        }
        Long id = ustKategori.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    protected Kategori kategoriDtoToKategori(KategoriDto kategoriDto) {
        if ( kategoriDto == null ) {
            return null;
        }

        Kategori kategori = new Kategori();

        kategori.setId( kategoriDto.getUstKategoriId() );

        setNulls( kategori, kategoriDto );

        return kategori;
    }
}
