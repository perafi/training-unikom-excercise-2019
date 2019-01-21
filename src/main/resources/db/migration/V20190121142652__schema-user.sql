create table user
(
    id varchar(64) not null primary key,
    username varchar(64) not null,
    password varchar(64) not null,
    akses ENUM('Toko', 'Pelanggan') not null
) engine = InnoDB;

insert into user (id, username, password, akses) values
('001', 'Asep', '1234', 'Pelanggan'),
('002', 'Perdana', '5678', 'Toko');