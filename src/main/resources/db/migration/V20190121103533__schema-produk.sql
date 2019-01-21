create table produk
(
    id varchar(64) not null primary key,
    nama varchar(100) not null,
    harga int not null,
    tanggal_tambah timestamp,
    toko_id varchar(64) not null
) engine = InnoDB;

alter table produk
    add constraint fk_produk_toko foreign key (toko_id)
        references toko (id) on update cascade on delete restrict;

insert into produk (id, nama, harga, tanggal_tambah, toko_id) values
('001', 'Teh Celup', 12000, now(), '001'),
('002', 'Jepitan Rambut', 5000, now(), '002'),
('003', 'Teh Bubuk', 12000, now(), '001');