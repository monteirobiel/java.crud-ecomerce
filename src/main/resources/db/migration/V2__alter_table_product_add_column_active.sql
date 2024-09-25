ALTER TABLE product add active tinyint;
update product set active = 1;