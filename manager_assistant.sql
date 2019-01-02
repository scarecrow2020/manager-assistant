/*
Navicat MySQL Data Transfer

Source Server         : localhost_13302
Source Server Version : 50505
Source Host           : localhost:13302
Source Database       : manager_assistant

Target Server Type    : MYSQL
Target Server Version : 50505
File Encoding         : 65001

Date: 2019-01-02 16:33:38
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for prduct
-- ----------------------------
DROP TABLE IF EXISTS `prduct`;
CREATE TABLE `prduct` (
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
-- Records of prduct
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
  `create_date` datetime DEFAULT NULL,
  `operate_date` datetime DEFAULT NULL,
  `create_user` bigint(20) DEFAULT NULL,
  `operate_user` bigint(20) DEFAULT NULL,
  `del_flag` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `index2` (`type`,`dict_key`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of sys_dict
-- ----------------------------

-- ----------------------------
-- Table structure for sys_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_role`;
CREATE TABLE `sys_role` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `type` varchar(50) DEFAULT NULL,
  `group` varchar(50) DEFAULT NULL,
  `introduce` varchar(255) DEFAULT NULL COMMENT '介绍',
  `sys_flag` char(1) DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  `operate_date` datetime DEFAULT NULL,
  `create_user` bigint(20) DEFAULT NULL,
  `operate_user` bigint(20) DEFAULT NULL,
  `del_flag` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of sys_role
-- ----------------------------

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT '',
  `user_name` varchar(50) DEFAULT NULL,
  `age` int(20) DEFAULT NULL,
  `card_code` varchar(50) DEFAULT '',
  `birthday` date DEFAULT NULL,
  `sex` char(1) DEFAULT '0',
  `role` bigint(20) DEFAULT NULL,
  `job_number` varchar(20) DEFAULT NULL,
  `phone` varchar(50) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `contact_way1` varchar(50) DEFAULT NULL,
  `contact_way2` varchar(50) DEFAULT NULL,
  `registration_date` datetime DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  `operate_date` datetime DEFAULT NULL,
  `create_user` bigint(20) DEFAULT NULL,
  `operate_user` bigint(20) DEFAULT NULL,
  `del_flag` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of sys_user
-- ----------------------------
