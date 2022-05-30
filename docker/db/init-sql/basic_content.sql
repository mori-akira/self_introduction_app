DROP TABLE IF EXISTS `basic_content`;

CREATE TABLE `basic_content` (
  `content_id` int NOT NULL,
  `item_id` int NOT NULL,
  `item_name` varchar(32) NOT NULL,
  `item_value` varchar(256) NOT NULL,
  PRIMARY KEY (`content_id`,`item_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

insert into basic_content(content_id,item_id,item_name,item_value) values (1,1,'名前','木暮 守晶 (こぐれ もりあき)');
insert into basic_content(content_id,item_id,item_name,item_value) values (1,2,'所属','ｼｽﾃﾑ開発技術部 東京ｼｽﾃﾑ開発課');
insert into basic_content(content_id,item_id,item_name,item_value) values (1,3,'年齢','26歳 (エンジニア3年目)');
insert into basic_content(content_id,item_id,item_name,item_value) values (1,4,'KCCS入社日','2022/1/5');
insert into basic_content(content_id,item_id,item_name,item_value) values (1,5,'出身地','群馬県 前橋市');
insert into basic_content(content_id,item_id,item_name,item_value) values (1,6,'出身大学','明治大学 理工学部 情報科学科');
insert into basic_content(content_id,item_id,item_name,item_value) values (1,7,'趣味','ゲーム・ボウリング・散歩・ラーメン');
insert into basic_content(content_id,item_id,item_name,item_value) values (1,8,'座右の銘','蛟竜雲雨');
