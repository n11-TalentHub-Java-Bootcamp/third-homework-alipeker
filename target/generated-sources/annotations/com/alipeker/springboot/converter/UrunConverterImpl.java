package com.alipeker.springboot.converter;

import com.alipeker.springboot.dto.UrunDetayDto;
import com.alipeker.springboot.dto.UrunDto;
import com.alipeker.springboot.entity.Kategori;
import com.alipeker.springboot.entity.Urun;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-12-28T17:39:36+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 16.0.2 (Oracle Corporation)"
)
public class UrunConverterImpl implements UrunConverter {

    @Override
    public Urun convertUrunDtoToUrun(UrunDto urunDto) {
        if ( urunDto == null ) {
            return null;
        }

        Urun urun = new Urun();

        urun.setKategori( urunDtoToKategori( urunDto ) );
        urun.setId( urunDto.getId() );
        urun.setAdi( urunDto.getAdi() );
        urun.setFiyat( urunDto.getFiyat() );
        urun.setKayitTarihi( urunDto.getKayitTarihi() );

        setNulls( urun, urunDto );

        return urun;
    }

    @Override
    public UrunDto convertUrunToUrunDto(Urun urun) {
        if ( urun == null ) {
            return null;
        }

        UrunDto urunDto = new UrunDto();

        urunDto.setKategoriId( urunKategoriId( urun ) );
        urunDto.setId( urun.getId() );
        urunDto.setAdi( urun.getAdi() );
        urunDto.setFiyat( urun.getFiyat() );
        urunDto.setKayitTarihi( urun.getKayitTarihi() );

        return urunDto;
    }

    @Override
    public UrunDetayDto convertUrunToUrunDetayDto(Urun urun) {
        if ( urun == null ) {
            return null;
        }

        UrunDetayDto urunDetayDto = new UrunDetayDto();

        urunDetayDto.setUrunFiyati( urun.getFiyat() );
        urunDetayDto.setUrunAdi( urun.getAdi() );
        urunDetayDto.setKategoriAdi( urunKategoriAdi( urun ) );

        return urunDetayDto;
    }

    @Override
    public List<UrunDetayDto> convertAllUrunListToUrunDetayDtoList(List<Urun> urunList) {
        if ( urunList == null ) {
            return null;
        }

        List<UrunDetayDto> list = new ArrayList<UrunDetayDto>( urunList.size() );
        for ( Urun urun : urunList ) {
            list.add( convertUrunToUrunDetayDto( urun ) );
        }

        return list;
    }

    protected Kategori urunDtoToKategori(UrunDto urunDto) {
        if ( urunDto == null ) {
            return null;
        }

        Kategori kategori = new Kategori();

        kategori.setId( urunDto.getKategoriId() );

        return kategori;
    }

    private Long urunKategoriId(Urun urun) {
        if ( urun == null ) {
            return null;
        }
        Kategori kategori = urun.getKategori();
        if ( kategori == null ) {
            return null;
        }
        Long id = kategori.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String urunKategoriAdi(Urun urun) {
        if ( urun == null ) {
            return null;
        }
        Kategori kategori = urun.getKategori();
        if ( kategori == null ) {
            return null;
        }
        String adi = kategori.getAdi();
        if ( adi == null ) {
            return null;
        }
        return adi;
    }
}
