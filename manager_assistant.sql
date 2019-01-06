/*
Navicat MySQL Data Transfer

Source Server         : localhost_13302
Source Server Version : 50505
Source Host           : localhost:13302
Source Database       : manager_assistant

Target Server Type    : MYSQL
Target Server Version : 50505
File Encoding         : 65001

Date: 2019-01-03 18:57:17
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for product
-- ----------------------------
DROP TABLE IF EXISTS `product`;
CREATE TABLE `product` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `type` varchar(10) DEFAULT NULL,
  `code` varchar(50) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `band` varchar(255) DEFAULT NULL,
  `sys_flag` char(1) DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  `operate_date` datetime DEFAULT NULL,
  `create_user` bigint(20) DEFAULT NULL,
  `operate_user` bigint(20) DEFAULT NULL,
  `del_flag` varchar(10) CHARACTER SET utf8mb4 DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of product
-- ----------------------------

-- ----------------------------
-- Table structure for purchase
-- ----------------------------
DROP TABLE IF EXISTS `purchase`;
CREATE TABLE `purchase` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `code` varchar(50) DEFAULT NULL COMMENT '产品编号',
  `batch_no` varchar(50) DEFAULT NULL COMMENT '批次',
  `price` decimal(20,2) DEFAULT NULL COMMENT '采购单价-不含运费',
  `quantity` bigint(20) DEFAULT NULL COMMENT '数量',
  `left_quantity` bigint(20) DEFAULT NULL COMMENT '剩余数量',
  `cost` decimal(20,2) DEFAULT NULL COMMENT '成本单价-含运费',
  `poundage` decimal(20,2) DEFAULT NULL COMMENT '手续费',
  `total` decimal(20,2) DEFAULT NULL COMMENT '采购金额',
  `amount` decimal(20,2) DEFAULT NULL COMMENT '总价',
  `stock_id` bigint(20) DEFAULT NULL COMMENT '库存id',
  `create_date` datetime DEFAULT NULL,
  `operate_date` datetime DEFAULT NULL,
  `create_user` bigint(20) DEFAULT NULL,
  `operate_user` bigint(20) DEFAULT NULL,
  `del_flag` varchar(10) CHARACTER SET utf8mb4 DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of purchase
-- ----------------------------

-- ----------------------------
-- Table structure for sale
-- ----------------------------
DROP TABLE IF EXISTS `sale`;
CREATE TABLE `sale` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `stock_id` bigint(20) DEFAULT NULL COMMENT '库存ID',
  `purchase_id` bigint(20) DEFAULT NULL COMMENT '采购ID',
  `code` varchar(50) DEFAULT NULL,
  `price` decimal(20,2) DEFAULT NULL,
  `batch_no` varchar(50) DEFAULT NULL,
  `profit_or_lost` decimal(20,2) DEFAULT NULL COMMENT '盈亏',
  `batch_profit_or_lost` decimal(20,2) DEFAULT NULL COMMENT '单批次盈亏',
  `create_date` datetime DEFAULT NULL,
  `operate_date` datetime DEFAULT NULL,
  `create_user` bigint(20) DEFAULT NULL,
  `operate_user` bigint(20) DEFAULT NULL,
  `del_flag` varchar(10) CHARACTER SET utf8mb4 DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sale
-- ----------------------------

-- ----------------------------
-- Table structure for stock
-- ----------------------------
DROP TABLE IF EXISTS `stock`;
CREATE TABLE `stock` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `price` decimal(20,2) DEFAULT NULL COMMENT '平均单价',
  `quantity` bigint(20) DEFAULT NULL COMMENT '数量',
  `code` varchar(50) DEFAULT NULL COMMENT '商品编号',
  `sale_price` decimal(20,2) DEFAULT NULL COMMENT '销售单价',
  `create_date` datetime DEFAULT NULL,
  `operate_date` datetime DEFAULT NULL,
  `create_user` bigint(20) DEFAULT NULL,
  `operate_user` bigint(20) DEFAULT NULL,
  `del_flag` varchar(10) CHARACTER SET utf8mb4 DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of stock
-- ----------------------------

-- ----------------------------
-- Table structure for sys_dict
-- ----------------------------
DROP TABLE IF EXISTS `sys_dict`;
CREATE TABLE `sys_dict` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `type` varchar(50) CHARACTER SET utf8 DEFAULT NULL COMMENT '字典类型',
  `dict_key` varchar(20) CHARACTER SET utf8 DEFAULT NULL COMMENT '字典键',
  `dict_value` varchar(50) CHARACTER SET utf8 DEFAULT NULL COMMENT '字典值',
  `parent_key` varchar(10) CHARACTER SET utf8 DEFAULT NULL COMMENT '父key',
  `sequence` int(11) DEFAULT NULL COMMENT '序号',
  `sys_flag` varchar(10) CHARACTER SET utf8 DEFAULT NULL COMMENT '是否系统',
  `introduce` varchar(255) DEFAULT NULL COMMENT '简介',
  `create_date` datetime DEFAULT NULL,
  `operate_date` datetime DEFAULT NULL,
  `create_user` bigint(20) DEFAULT NULL,
  `operate_user` bigint(20) DEFAULT NULL,
  `del_flag` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `index2` (`type`,`dict_key`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of sys_dict
-- ----------------------------
INSERT INTO `sys_dict` VALUES ('1', 'role', 'admin', '超管', null, '1', '1', null, '2019-01-01 00:00:00', '2019-01-01 00:00:00', '1', '1', '0');
INSERT INTO `sys_dict` VALUES ('2', 'role', 'visitor', '游客', null, '2', '1', null, '2019-01-01 00:00:00', '2019-01-01 00:00:00', '1', '1', '0');
INSERT INTO `sys_dict` VALUES ('3', 'role', 'boss', '总经理', null, '3', '1', null, '2019-01-01 00:00:00', '2019-01-01 00:00:00', '1', '1', '0');
INSERT INTO `sys_dict` VALUES ('4', 'role', 'employee', '员工', null, '4', '1', null, '2019-01-01 00:00:00', '2019-01-01 00:00:00', '1', '1', '0');
INSERT INTO `sys_dict` VALUES ('5', 'role', 'customer', '客户', null, '5', '1', null, '2019-01-01 00:00:00', '2019-01-01 00:00:00', '1', '1', '0');
INSERT INTO `sys_dict` VALUES ('21', 'consumption', 'rent', '房租', null, '1', '1', null, '2019-01-01 00:00:00', '2019-01-01 00:00:00', '1', '1', '0');
INSERT INTO `sys_dict` VALUES ('22', 'consumption', 'water', '水费', null, '2', '1', null, '2019-01-01 00:00:00', '2019-01-01 00:00:00', '1', '1', '0');
INSERT INTO `sys_dict` VALUES ('23', 'consumption', 'electricity', '电费', null, '3', '1', null, '2019-01-01 00:00:00', '2019-01-01 00:00:00', '1', '1', '0');
INSERT INTO `sys_dict` VALUES ('24', 'consumption', 'gas', '燃气费', null, '4', '1', null, '2019-01-01 00:00:00', '2019-01-01 00:00:00', '1', '1', '0');
INSERT INTO `sys_dict` VALUES ('25', 'consumption', 'catering', '餐饮', null, '5', '1', null, '2019-01-01 00:00:00', '2019-01-01 00:00:00', '1', '1', '0');

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT '',
  `user_name` varchar(50) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  `age` int(20) DEFAULT NULL,
  `card_code` varchar(50) DEFAULT '',
  `birthday` date DEFAULT NULL,
  `sex` char(1) DEFAULT '0',
  `role` varchar(50) DEFAULT NULL,
  `job_number` varchar(20) DEFAULT NULL,
  `phone` varchar(50) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `contact_way` varchar(50) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `registration_date` datetime DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  `operate_date` datetime DEFAULT NULL,
  `create_user` bigint(20) DEFAULT NULL,
  `operate_user` bigint(20) DEFAULT NULL,
  `del_flag` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES ('1', 'admin', 'admin', 'admin', '0', 'system_001', '2019-01-01', '0', 'admin', 'system_001', null, null, null, null, null, '2019-01-01 00:00:00', '2019-01-01 00:00:00', '2019-01-01 00:00:00', '1', '1', '0');
INSERT INTO `sys_user` VALUES ('2', 'visitor', 'visitor', 'visitor', '0', 'system_002', '2019-01-01', '0', 'visitor', 'system_002', '', '', '', '', '', '2019-01-01 00:00:00', '2019-01-01 00:00:00', '2019-01-01 00:00:00', '1', '1', '0');
INSERT INTO `sys_user` VALUES ('3', 'boss', 'boss', 'boss', '0', null, null, '0', 'boss', null, '', '', '', '', '', '2019-01-01 00:00:00', '2019-01-01 00:00:00', '2019-01-01 00:00:00', '1', '1', '0');
