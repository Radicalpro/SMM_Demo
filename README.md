# SpringMvcDemo

## Feature
* 对spring + springmvc + mybatis进行简单的整合
* 使用maven仓库管理包

## 目标
* 实现前后端分离，提供接口
* 进一步封装，减少后台开发难度，提高开发效率

## 使用
* 安装maven，配置仓库
* 安装jdk,mysql,tomcat等

t_user.sql
```
/*
 Navicat Premium Data Transfer

 Source Server         : mylocal
 Source Server Type    : MySQL
 Source Server Version : 50720
 Source Host           : localhost:3306
 Source Schema         : demo

 Target Server Type    : MySQL
 Target Server Version : 50720
 File Encoding         : 65001

 Date: 29/10/2017 10:16:53
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(255) DEFAULT NULL COMMENT '用户名',
  `user_phone` varchar(20) DEFAULT NULL COMMENT '手机号',
  `user_email` varchar(255) DEFAULT NULL COMMENT '邮箱地址',
  `user_pwd` varchar(32) DEFAULT NULL COMMENT '加盐后用户密码',
  `pwd_salt` varchar(6) DEFAULT NULL COMMENT 'MD5盐',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `modify_time` datetime DEFAULT NULL COMMENT '最后修改时间',
  `is_delete` tinyint(4) DEFAULT NULL COMMENT '是否删除，0-未删除；1-已删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='用户登录表';

-- ----------------------------
-- Records of t_user
-- ----------------------------
BEGIN;
INSERT INTO `t_user` VALUES (1, '龙哥', '111111111111', '1016579848@qq.com', '1', 'KJUYT5', '2016-07-15 23:38:56', '2016-07-15 23:39:09', 0);
INSERT INTO `t_user` VALUES (2, '浪哥', '2222222', '1198224554@qq.com', '2', '656JHU', '2016-07-15 23:39:01', '2016-07-15 23:39:13', 0);
INSERT INTO `t_user` VALUES (3, '爱谁谁', '333333333', '1256221654@qq.com', '3', '89UIKQ', '2016-07-15 23:39:05', '2016-07-15 23:39:16', 0);
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;

```

