create table transaksi
(
    id varchar(64) not null primary key,
    toko_id varchar(64) not null,
    pelanggan_id varchar(64) not null,
    tanggal_transaksi timestamp not null
) engine = InnoDB;

alter table transaksi
    add constraint fk_transaksi_toko foreign key (toko_id)
        references toko (id) on update cascade on delete restrict;

alter table transaksi
    add constraint fk_transaksi_pelanggan foreign key (pelanggan_id)
        references pelanggan (id) on update cascade on delete restrict;

insert into transaksi (id, toko_id, pelanggan_id, tanggal_transaksi) values
('001', '001', '001', now());

create table detail_transaksi
(
    id varchar(64) not null primary key,
    transaksi_id varchar(64) not null,
    produk_id varchar(64) not null,
    quantity integer not null,
    total_harga integer not null
) engine = InnoDB;

alter table detail_transaksi
    add constraint fk_detailtransaksi_produk foreign key (produk_id)
        references produk (id) on update cascade on delete restrict;

alter table detail_transaksi
    add constraint fk_detailtransaksi_transaksi foreign key (transaksi_id)
        references transaksi (id) on update cascade on delete restrict;

insert into detail_transaksi (id, transaksi_id, produk_id, quantity,  total_harga) values
('001', '001', '001', 3, 36000);