/*
Navicat MySQL Data Transfer

Source Server         : MYSQL
Source Server Version : 50718
Source Host           : localhost:3306
Source Database       : databace

Target Server Type    : MYSQL
Target Server Version : 50718
File Encoding         : 65001

Date: 2017-07-05 14:29:25
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user_test
-- ----------------------------
DROP TABLE IF EXISTS `user_test`;
CREATE TABLE `user_test` (
  `name` varchar(255) NOT NULL,
  `sex` varchar(255) DEFAULT NULL,
  `age` int(255) DEFAULT NULL,
  PRIMARY KEY (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_test
-- ----------------------------
INSERT INTO `user_test` VALUES ('user', '女', '1872');
INSERT INTO `user_test` VALUES ('小李', '男', '21');
INSERT INTO `user_test` VALUES ('小李1', '男', '21');
INSERT INTO `user_test` VALUES ('小李10', '男', '21');
INSERT INTO `user_test` VALUES ('小李11', '男', '21');
INSERT INTO `user_test` VALUES ('小李12', '男', '21');
INSERT INTO `user_test` VALUES ('小李13', '男', '21');
INSERT INTO `user_test` VALUES ('小李2', '男', '21');
INSERT INTO `user_test` VALUES ('小李3', '男', '21');
INSERT INTO `user_test` VALUES ('小李4', '男', '21');
INSERT INTO `user_test` VALUES ('小李5', '男', '21');
INSERT INTO `user_test` VALUES ('小李6', '男', '21');
INSERT INTO `user_test` VALUES ('小李7', '男', '21');
INSERT INTO `user_test` VALUES ('小李8', '男', '21');
INSERT INTO `user_test` VALUES ('小李9', '男', '21');
