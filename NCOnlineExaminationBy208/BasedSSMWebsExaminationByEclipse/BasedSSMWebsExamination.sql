/*
MySQL Backup
Source Server Version: 5.6.41
Source Database: online_exam
Date: 2019/5/19 08:47:06
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
--  Table structure for `exam`
-- ----------------------------
DROP TABLE IF EXISTS `exam`;
CREATE TABLE `exam` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `start_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `end_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `length` int(11) DEFAULT NULL,
  `create_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `class_id` int(11) DEFAULT NULL,
  `number` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
--  Table structure for `exam_class`
-- ----------------------------
DROP TABLE IF EXISTS `exam_class`;
CREATE TABLE `exam_class` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `classname` varchar(255) DEFAULT NULL,
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
--  Table structure for `exam_history`
-- ----------------------------
DROP TABLE IF EXISTS `exam_history`;
CREATE TABLE `exam_history` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `exam_id` int(11) DEFAULT NULL,
  `student_email` varchar(255) DEFAULT NULL,
  `question_id` int(11) DEFAULT NULL,
  `score` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
--  Table structure for `exam_score`
-- ----------------------------
DROP TABLE IF EXISTS `exam_score`;
CREATE TABLE `exam_score` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `student_email` varchar(255) DEFAULT NULL,
  `exam_id` int(11) DEFAULT NULL,
  `total_score` int(11) DEFAULT NULL,
  `total_point` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
--  Table structure for `exam_student`
-- ----------------------------
DROP TABLE IF EXISTS `exam_student`;
CREATE TABLE `exam_student` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `exam_id` int(11) DEFAULT NULL,
  `student_name` varchar(255) DEFAULT NULL,
  `student_email` varchar(255) DEFAULT NULL,
  `student_grade` int(11) DEFAULT NULL,
  `student_class` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
--  Table structure for `question`
-- ----------------------------
DROP TABLE IF EXISTS `question`;
CREATE TABLE `question` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `class_id` int(11) DEFAULT NULL,
  `content` varchar(255) DEFAULT NULL,
  `type` int(11) DEFAULT NULL,
  `options` varchar(255) DEFAULT NULL,
  `answer` varchar(255) DEFAULT NULL,
  `point` int(11) DEFAULT NULL,
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
--  Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `email` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `identity` int(11) DEFAULT NULL,
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
--  Records 
-- ----------------------------
INSERT INTO `exam` VALUES ('1','208?','','2019-05-19 08:00:00','2019-05-19 10:00:00','120','2019-05-19 07:33:29','3','1'), ('2','204Java?','123456','2019-05-19 08:00:00','2019-05-19 10:00:00','120','2019-05-19 07:37:05','0','1'), ('3','???204?','123456','2019-05-19 08:00:00','2019-05-19 10:00:00','120','2019-05-19 08:40:12','3','1');
INSERT INTO `exam_class` VALUES ('3','JavaSE','2019-05-17 17:02:39');
INSERT INTO `exam_history` VALUES ('1','2','46536207@qq.com','2','5'), ('2','3','46536207@qq.com','1','0');
INSERT INTO `exam_score` VALUES ('1','46536207@qq.com','2','5','5'), ('2','46536207@qq.com','3','0','5');
INSERT INTO `exam_student` VALUES ('1','1','??','141250183@smail.nju.edu.cn','4','2'), ('2','1','garystd','46536207@qq.com','4','2'), ('3','2','??','141250183@smail.nju.edu.cn','4','2'), ('4','2','garystd','46536207@qq.com','4','2'), ('5','3','??','141250183@smail.nju.edu.cn','4','2'), ('6','3','garystd','46536207@qq.com','4','2');
INSERT INTO `question` VALUES ('1','3','?????????????','0','5;  6;  7;  8;','D','5','2019-05-19 07:32:59'), ('2','0','?????????????','0','5;  6;  7;  8;','D','5','2019-05-19 07:37:05'), ('3','3','?????????????','0','5;  6;  7;  8;','D','5','2019-05-19 08:40:12');
INSERT INTO `user` VALUES ('1','46536207@qq.com','garystd','dragon','1','2019-05-17 16:12:10'), ('2','teacher@qq.com','garyteacher','dragon','0','2019-05-17 16:36:51');
