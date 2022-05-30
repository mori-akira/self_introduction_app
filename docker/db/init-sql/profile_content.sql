DROP TABLE IF EXISTS `profile_content`;

CREATE TABLE `profile_content` (
	`content_id` int NOT NULL,
	`profile_id` int NOT NULL,
	`content_type` varchar(8) NOT NULL,
	`content_name` varchar(32) NOT NULL,
	`content_image_path` varchar(256) DEFAULT NULL,
	PRIMARY KEY (`content_id`)
)
ENGINE=InnoDB
DEFAULT CHARSET=utf8;

INSERT INTO `profile_content` (`content_id`,`profile_id`,`content_type`,`content_name`,`content_image_path`) VALUES (1,1,'1','BASIC','./image/profile.jpg');
INSERT INTO `profile_content` (`content_id`,`profile_id`,`content_type`,`content_name`,`content_image_path`) VALUES (2,1,'2','SKILL','./image/yaruki_moeru_man.png');
INSERT INTO `profile_content` (`content_id`,`profile_id`,`content_type`,`content_name`,`content_image_path`) VALUES (3,1,'2','STUDYING','./image/study_man_normal.png');
INSERT INTO `profile_content` (`content_id`,`profile_id`,`content_type`,`content_name`,`content_image_path`) VALUES (4,1,'3','GREET','./image/ojigi_mask_casual.png');