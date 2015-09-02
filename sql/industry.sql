/*
Navicat MySQL Data Transfer

Source Server         : stock
Source Server Version : 50621
Source Host           : localhost:3306
Source Database       : stock_data

Target Server Type    : MYSQL
Target Server Version : 50621
File Encoding         : 65001

Date: 2015-09-02 16:43:12
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for industry
-- ----------------------------
DROP TABLE IF EXISTS `industry`;
CREATE TABLE `industry` (
  `id` varchar(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `simple_name` varchar(2) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of industry
-- ----------------------------
INSERT INTO `industry` VALUES ('1', '保险', 'b');
INSERT INTO `industry` VALUES ('10', '公用事业', 'g');
INSERT INTO `industry` VALUES ('11', '高速公路', 'g');
INSERT INTO `industry` VALUES ('12', '工程建设', 'g');
INSERT INTO `industry` VALUES ('13', '国际贸易', 'g');
INSERT INTO `industry` VALUES ('14', '港口水运', 'g');
INSERT INTO `industry` VALUES ('15', '钢铁行业', 'g');
INSERT INTO `industry` VALUES ('16', '化纤行业', 'h');
INSERT INTO `industry` VALUES ('17', '航天航空', 'h');
INSERT INTO `industry` VALUES ('18', '化工行业', 'h');
INSERT INTO `industry` VALUES ('19', '交运物流', 'j');
INSERT INTO `industry` VALUES ('2', '玻璃陶瓷', 'b');
INSERT INTO `industry` VALUES ('20', '家电行业', 'j');
INSERT INTO `industry` VALUES ('21', '机械行业', 'j');
INSERT INTO `industry` VALUES ('22', '交运设备', 'j');
INSERT INTO `industry` VALUES ('23', '旅游酒店', 'l');
INSERT INTO `industry` VALUES ('24', '木业家具', 'm');
INSERT INTO `industry` VALUES ('25', '民航机场', 'm');
INSERT INTO `industry` VALUES ('26', '煤炭采选', 'm');
INSERT INTO `industry` VALUES ('27', '酿酒行业', 'n');
INSERT INTO `industry` VALUES ('28', '农牧饲渔', 'n');
INSERT INTO `industry` VALUES ('29', '券商信托', 'q');
INSERT INTO `industry` VALUES ('3', '材料行业', 'c');
INSERT INTO `industry` VALUES ('30', '汽车行业', 'q');
INSERT INTO `industry` VALUES ('31', '商业百货', 's');
INSERT INTO `industry` VALUES ('32', '食品行业', 's');
INSERT INTO `industry` VALUES ('33', '塑胶制品', 's');
INSERT INTO `industry` VALUES ('34', '石油行业', 's');
INSERT INTO `industry` VALUES ('35', '输配电气', 's');
INSERT INTO `industry` VALUES ('36', '水泥建材', 's');
INSERT INTO `industry` VALUES ('37', '通讯行业', 't');
INSERT INTO `industry` VALUES ('38', '文化传媒', 'w');
INSERT INTO `industry` VALUES ('39', '有色金属', 'y');
INSERT INTO `industry` VALUES ('4', '电子元件', 'd');
INSERT INTO `industry` VALUES ('40', '银行', 'y');
INSERT INTO `industry` VALUES ('41', '仪器仪表', 'y');
INSERT INTO `industry` VALUES ('42', '医药行业', 'y');
INSERT INTO `industry` VALUES ('43', '造纸印刷', 'z');
INSERT INTO `industry` VALUES ('44', '综合行业', 'z');
INSERT INTO `industry` VALUES ('5', '电子信息', 'd');
INSERT INTO `industry` VALUES ('6', '电力行业', 'd');
INSERT INTO `industry` VALUES ('7', '纺织服装', 'f');
INSERT INTO `industry` VALUES ('8', '房地产', 'f');
INSERT INTO `industry` VALUES ('9', '工艺商品', 'g');
