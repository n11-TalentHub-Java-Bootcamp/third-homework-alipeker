-- create table IF NOT EXISTS kategori  (id bigint not null, adi varchar(50) not null, kirilim bigint, id_ust_kategori bigint, primary key (id));
-- create table IF NOT EXISTS urun  (id bigint not null, adi varchar(50), fiyat decimal(19,2), kayit_tarihi timestamp, id_kategori bigint, primary key (id));
-- create sequence IF NOT EXISTS kategori_id_seq  start with 10 increment by 100;
-- create sequence IF NOT EXISTS urun_id_seq  start with 10 increment by 100;
-- alter table kategori add constraint FK634b48g2infjssbxao4kyf88b foreign key (id_ust_kategori) references kategori;
-- alter table urun add constraint FK_URUN_KATEGORI_ID foreign key (id_kategori) references kategori;
