-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: databace
-- ------------------------------------------------------
-- Server version	5.7.18-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `pic`
--

DROP TABLE IF EXISTS `pic`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pic` (
  `name` varchar(255) DEFAULT NULL,
  `url` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pic`
--

LOCK TABLES `pic` WRITE;
/*!40000 ALTER TABLE `pic` DISABLE KEYS */;
INSERT INTO `pic` VALUES ('20170710','/pic/2017/07/10/20170710.jpg'),('201707104715','/pic/2017/07/10/201707104715.jpg'),('201707105617','/pic/2017/07/10/201707105617.jpg'),('201707146710','/pic/2017/07/14/201707146710.jpg'),('201709043522','/pic/2017/09/04/201709043522.jpg');
/*!40000 ALTER TABLE `pic` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `createdate` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES ('admin','zxc123456','haoshuang@cloudcc.com',NULL),('test','zxc123456','554042469@qq.com','2017-07-14 18:05:37'),('test2','zxc123456','222@qq.com','2017-07-14 18:08:44'),('xiaoming','123456','haoshuang@te.com','2017-07-21 16:36:58'),('user','123','user@cc.com','2017-07-21 16:44:21'),('uu','123','certi@qq.com','2017-07-26 15:43:28'),('person','123','a554042469@163.com','2017-07-26 15:45:55'),('mmm','123456','zw@qqq.com','2017-07-26 16:38:05'),('test4','123','222@qq.com','2017-07-26 16:46:28'),('test5','123456','222@qq.com','2017-07-26 17:05:23'),('nexus','123','222@qq.com','2017-07-26 18:17:22'),('xiaoli','123','554042469@qq.com','2017-07-27 11:08:50');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_test`
--

DROP TABLE IF EXISTS `user_test`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user_test` (
  `name` varchar(255) NOT NULL,
  `sex` varchar(255) DEFAULT NULL,
  `age` int(255) DEFAULT NULL,
  PRIMARY KEY (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_test`
--

LOCK TABLES `user_test` WRITE;
/*!40000 ALTER TABLE `user_test` DISABLE KEYS */;
INSERT INTO `user_test` VALUES ('user','女',1872),('小李','男',21),('小李1','男',21),('小李10','男',21),('小李11','男',21),('小李12','男',21),('小李13','男',21),('小李2','男',21),('小李3','男',21),('小李4','男',21),('小李5','男',21),('小李6','男',21),('小李7','男',21),('小李8','男',21),('小李9','男',21);
/*!40000 ALTER TABLE `user_test` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-09-04 17:32:35
