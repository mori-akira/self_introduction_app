DROP TABLE IF EXISTS `list_content_item`;

CREATE TABLE `list_content_item` (
  `content_id` int NOT NULL,
  `item_id` int NOT NULL,
  `item_children_id` int NOT NULL,
  `item_value` varchar(256) NOT NULL,
  PRIMARY KEY (`content_id`,`item_id`,`item_children_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

insert into self_introduction.list_content_item(content_id,item_id,item_children_id,item_value) values (2,1,1,'高校2年から独学でJavaの学習を始める');
insert into self_introduction.list_content_item(content_id,item_id,item_children_id,item_value) values (2,1,2,'高校生の頃はJavaでゲーム作りにドはまり');
insert into self_introduction.list_content_item(content_id,item_id,item_children_id,item_value) values (2,1,3,'大学では視野を広げて、幅広く情報科学を学習');
insert into self_introduction.list_content_item(content_id,item_id,item_children_id,item_value) values (2,1,4,'中でもJavaの学習は続けていて、入社が決まってからの3ヶ月でJava SilverとGoldを取得');
insert into self_introduction.list_content_item(content_id,item_id,item_children_id,item_value) values (2,1,5,'入社後、残業時間100h超えの地獄の炎上案件に放り込まれる');
insert into self_introduction.list_content_item(content_id,item_id,item_children_id,item_value) values (2,1,6,'Spring bootやWebアプリケーションについて学べた');
insert into self_introduction.list_content_item(content_id,item_id,item_children_id,item_value) values (2,2,1,'地獄の案件で学んだことを活かそうと学習を始める');
insert into self_introduction.list_content_item(content_id,item_id,item_children_id,item_value) values (2,2,2,'HTML認定試験のレベル1、レベル2を所持');
insert into self_introduction.list_content_item(content_id,item_id,item_children_id,item_value) values (2,2,3,'HTML、CSS、JavaScript、HTTP通信仕様などは大体OK');
insert into self_introduction.list_content_item(content_id,item_id,item_children_id,item_value) values (2,2,4,'デザインのセンスは無し...');
insert into self_introduction.list_content_item(content_id,item_id,item_children_id,item_value) values (2,3,1,'ITパスポート');
insert into self_introduction.list_content_item(content_id,item_id,item_children_id,item_value) values (2,3,2,'基本情報技術者試験');
insert into self_introduction.list_content_item(content_id,item_id,item_children_id,item_value) values (2,3,3,'Oracle Master Bronze 12c');
insert into self_introduction.list_content_item(content_id,item_id,item_children_id,item_value) values (2,3,4,'Python 基礎認定試験');
insert into self_introduction.list_content_item(content_id,item_id,item_children_id,item_value) values (3,1,1,'環境構築をある程度自力でできるようにしたい');
insert into self_introduction.list_content_item(content_id,item_id,item_children_id,item_value) values (3,1,2,'GCPの資格取得');
insert into self_introduction.list_content_item(content_id,item_id,item_children_id,item_value) values (3,1,3,'Docker');
insert into self_introduction.list_content_item(content_id,item_id,item_children_id,item_value) values (3,2,1,'とりあえず自力でニューラルネット組んでみたい');
insert into self_introduction.list_content_item(content_id,item_id,item_children_id,item_value) values (3,2,2,'畳み込みニューラルネットとかにも挑戦してみたい');
insert into self_introduction.list_content_item(content_id,item_id,item_children_id,item_value) values (3,2,3,'自力で作ったニューラルネットでサービス化してみたい');
insert into self_introduction.list_content_item(content_id,item_id,item_children_id,item_value) values (3,2,4,'部で行っている10%ルールで開発中');
