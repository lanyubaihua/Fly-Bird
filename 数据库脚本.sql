/*
 Navicat Premium Data Transfer

 Source Server         : 宽
 Source Server Type    : MySQL
 Source Server Version : 80022
 Source Host           : localhost:3306
 Source Schema         : game

 Target Server Type    : MySQL
 Target Server Version : 80022
 File Encoding         : 65001

 Date: 12/09/2021 22:57:31
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for rank_list
-- ----------------------------
DROP TABLE IF EXISTS `rank_list`;
CREATE TABLE `rank_list`  (
  `rank` int(0) NOT NULL,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `score` int(0) NOT NULL
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of rank_list
-- ----------------------------
INSERT INTO `rank_list` VALUES (1, 'song', 100);
INSERT INTO `rank_list` VALUES (2, '1', 80);
INSERT INTO `rank_list` VALUES (3, '2', 60);
INSERT INTO `rank_list` VALUES (4, '2', 50);

-- ----------------------------
-- Table structure for user_information
-- ----------------------------
DROP TABLE IF EXISTS `user_information`;
CREATE TABLE `user_information`  (
  `user_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `passward` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `coin` int(0) NOT NULL,
  `bird_1` int(0) NOT NULL,
  `bird_2` int(0) NOT NULL,
  `bird_set` int(0) NOT NULL,
  `music_set` int(0) NOT NULL,
  `background_set` int(0) NOT NULL
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user_information
-- ----------------------------
INSERT INTO `user_information` VALUES ('song', '1234', 1000, 0, 0, 0, 0, 0);
INSERT INTO `user_information` VALUES ('1', '1', 0, 0, 0, 0, 0, 0);
INSERT INTO `user_information` VALUES ('2', '2', 8413, 1, 1, 2, 0, 0);
INSERT INTO `user_information` VALUES ('4', '4', 500, 0, 0, 0, 0, 0);
INSERT INTO `user_information` VALUES ('csu', '123', 117, 0, 1, 2, 0, 0);

SET FOREIGN_KEY_CHECKS = 1;
