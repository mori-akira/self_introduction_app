DROP TABLE IF EXISTS `list_content`;

CREATE TABLE `list_content` (
  `content_id` int NOT NULL,
  `item_id` int NOT NULL,
  `item_name` varchar(32) NOT NULL,
  PRIMARY KEY (`content_id`,`item_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

insert into list_content(content_id,item_id,item_name) values (2,1,'Java');
insert into list_content(content_id,item_id,item_name) values (2,2,'HTML');
insert into list_content(content_id,item_id,item_name) values (2,3,'その他保有資格');
insert into list_content(content_id,item_id,item_name) values (3,1,'ミドルウェア');
insert into list_content(content_id,item_id,item_name) values (3,2,'AI');
