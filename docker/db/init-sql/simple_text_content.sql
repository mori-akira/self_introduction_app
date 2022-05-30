DROP TABLE IF EXISTS `simple_text_content`;

CREATE TABLE `simple_text_content` (
  `content_id` int NOT NULL,
  `content` varchar(4000) NOT NULL,
  PRIMARY KEY (`content_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

