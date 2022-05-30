DROP TABLE IF EXISTS `profile`;

CREATE TABLE `profile` (
  `profile_id` int NOT NULL,
  `valid_flg` int NOT NULL,
  PRIMARY KEY (`profile_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `profile` (`profile_id`,`valid_flg`) VALUES (1,1);