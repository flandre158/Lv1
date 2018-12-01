/*
 Navicat Premium Data Transfer

 Source Server         : localhost_158
 Source Server Type    : MySQL
 Source Server Version : 50719
 Source Host           : localhost:3306
 Source Schema         : test

 Target Server Type    : MySQL
 Target Server Version : 50719
 File Encoding         : 65001

 Date: 28/11/2018 22:25:27
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for cat
-- ----------------------------
DROP TABLE IF EXISTS `cat`;
CREATE TABLE `cat`  (
  `id` int(11) DEFAULT NULL,
  `name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `color` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of cat
-- ----------------------------
INSERT INTO `cat` VALUES (1, '就是她吗？', 'scarlet');
INSERT INTO `cat` VALUES (2, '威严尽失', 'scarlet');
INSERT INTO `cat` VALUES (4, '小黄', 'yellow');
INSERT INTO `cat` VALUES (5, '老白', 'white');
INSERT INTO `cat` VALUES (6, '愣头青', 'red');

-- ----------------------------
-- Procedure structure for myproc
-- ----------------------------
DROP PROCEDURE IF EXISTS `myproc`;
delimiter ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `myproc`(IN p1 int,INOUT p2 int,OUT p3 int)
BEGIN
    SELECT p1,p2,p3 ;
    SET p1=10 ;

    SET p2=20 ;
    SET p3=30 ;
END
;;
delimiter ;

SET FOREIGN_KEY_CHECKS = 1;
