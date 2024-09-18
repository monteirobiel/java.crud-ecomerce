CREATE TABLE product
(
    id             bigint       not null auto_increment,
    name           VARCHAR(100) NOT NULL,
    price_in_cents VARCHAR(100) NOT NULL,
    PRIMARY KEY (id)
);