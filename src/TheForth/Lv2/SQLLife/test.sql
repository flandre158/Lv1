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

 Date: 30/11/2018 22:38:10
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for 熟食部
-- ----------------------------
DROP TABLE IF EXISTS `熟食部`;
CREATE TABLE `熟食部`  (
  `id` int(11) DEFAULT NULL,
  `businessExpenses` int(11) DEFAULT NULL,
  `supervisorName` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `phoneNumber` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `address` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of 熟食部
-- ----------------------------
INSERT INTO `熟食部` VALUES (2, 111111, '老白', '654321', '???');

-- ----------------------------
-- Table structure for 熟食部员工
-- ----------------------------
DROP TABLE IF EXISTS `熟食部员工`;
CREATE TABLE `熟食部员工`  (
  `id` int(11) DEFAULT NULL,
  `name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `position` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `phoneNumber` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `address` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of 熟食部员工
-- ----------------------------
INSERT INTO `熟食部员工` VALUES (1, '老白', 40, '主管', '654321', '???');
INSERT INTO `熟食部员工` VALUES (2, '小白', 23, '副管', '754321', '???');

-- ----------------------------
-- Table structure for 生鲜部
-- ----------------------------
DROP TABLE IF EXISTS `生鲜部`;
CREATE TABLE `生鲜部`  (
  `id` int(11) DEFAULT NULL,
  `businessExpenses` int(11) DEFAULT NULL,
  `supervisorName` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `phoneNumber` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `address` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of 生鲜部
-- ----------------------------
INSERT INTO `生鲜部` VALUES (1, 100000, '老黄', '123456', '十里坡');

-- ----------------------------
-- Table structure for 生鲜部员工
-- ----------------------------
DROP TABLE IF EXISTS `生鲜部员工`;
CREATE TABLE `生鲜部员工`  (
  `id` int(11) DEFAULT NULL,
  `name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `position` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `phoneNumber` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `address` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of 生鲜部员工
-- ----------------------------
INSERT INTO `生鲜部员工` VALUES (1, '老黄', 38, '主管', '123456', '诺莫瑞根');

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
-- Table structure for commodity
-- ----------------------------
DROP TABLE IF EXISTS `commodity`;
CREATE TABLE `commodity`  (
  `id` int(11) DEFAULT NULL,
  `name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `cost` int(11) DEFAULT NULL,
  `sale` int(11) DEFAULT NULL,
  `supplierName` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `storageId` int(11) DEFAULT NULL,
  `departmentId` int(11) DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of commodity
-- ----------------------------
INSERT INTO `commodity` VALUES (111, '生鲜1', 10, 20, '大黄', 1, 1);
INSERT INTO `commodity` VALUES (211, '生鲜2', 11, 21, '大黄', 1, 1);
INSERT INTO `commodity` VALUES (301, '熟食1', 18, 36, '大黑', 2, 2);
INSERT INTO `commodity` VALUES (422, '熟食2', 33, 55, '大黑', 2, 2);

-- ----------------------------
-- Table structure for storage
-- ----------------------------
DROP TABLE IF EXISTS `storage`;
CREATE TABLE `storage`  (
  `id` int(11) DEFAULT NULL,
  `storageKeeperName` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `phoneNumber` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of storage
-- ----------------------------
INSERT INTO `storage` VALUES (1, '二狗子', '13868858688');
INSERT INTO `storage` VALUES (2, '二愣子', '666');

-- ----------------------------
-- Table structure for supplier
-- ----------------------------
DROP TABLE IF EXISTS `supplier`;
CREATE TABLE `supplier`  (
  `supplierName` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `phoneNumber` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `address` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of supplier
-- ----------------------------
INSERT INTO `supplier` VALUES ('大黄', '123', '奥格瑞玛');
INSERT INTO `supplier` VALUES ('大黑', '163', '???');

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
