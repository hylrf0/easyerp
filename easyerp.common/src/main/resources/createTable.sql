--用户表easyerp_user_info
CREATE TABLE `easyerp_user_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `is_deleted` char(2) NOT NULL COMMENT '是否删除 N-未删除 Y-已删除',
  `creator` int(11) NOT NULL COMMENT '创建人',
  `modifier` int(11) NOT NULL COMMENT '修改人',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `modify_time` datetime NOT NULL COMMENT '修改时间',
  `username` varchar(255) NOT NULL COMMENT '用户名',
  `password` varchar(255) NOT NULL COMMENT '密码',
  `name` varchar(255) NOT NULL COMMENT '中文名',
  `group_id` int(11) NOT NULL COMMENT '组织ID',
  `mobile` varchar(255) DEFAULT NULL COMMENT '手机号',
  `qq` varchar(255) DEFAULT NULL COMMENT 'QQ',
  `we_chat` varchar(255) DEFAULT NULL COMMENT '微信',
  `e_mail` varchar(255) DEFAULT NULL COMMENT '邮箱',
  PRIMARY KEY (`id`),
  KEY `groupId_index` (`group_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
--菜单表
CREATE TABLE `easyerp_menu` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `is_deleted` char(2) NOT NULL COMMENT '是否删除 N-未删除 Y-已删除',
  `creator` int(11) NOT NULL COMMENT '创建人',
  `modifier` int(11) NOT NULL COMMENT '修改人',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `modify_time` datetime NOT NULL COMMENT '修改时间',
  `parent_id` int(11) NOT NULL COMMENT '父菜单 0表示一级菜单 -1只有超级管理员才能看到',
  `menu_name` varchar(255) NOT NULL COMMENT '菜单名称',
  PRIMARY KEY (`id`),
  KEY `parent_id_index` (`parent_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;