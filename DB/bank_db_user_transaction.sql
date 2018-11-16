-- MySQL dump 10.13  Distrib 5.7.24, for Linux (x86_64)
--
-- Host: 127.0.0.1    Database: bank_db
-- ------------------------------------------------------
-- Server version	5.7.24-0ubuntu0.16.04.1

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
-- Table structure for table `user_transaction`
--

DROP TABLE IF EXISTS `user_transaction`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user_transaction` (
  `id` varchar(36) NOT NULL,
  `account_id` varchar(36) NOT NULL,
  `credit_time` datetime DEFAULT NULL,
  `credit_amount` decimal(20,5) DEFAULT NULL,
  `debit_time` datetime DEFAULT NULL,
  `debit_amount` decimal(20,5) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `account_id` (`account_id`),
  CONSTRAINT `user_transaction_ibfk_1` FOREIGN KEY (`account_id`) REFERENCES `user_account` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_transaction`
--

LOCK TABLES `user_transaction` WRITE;
/*!40000 ALTER TABLE `user_transaction` DISABLE KEYS */;
INSERT INTO `user_transaction` VALUES ('064f9f45-e9bf-11e8-8b75-02423d2acc6f','e7c5f6a5-e9bd-11e8-8b75-02423d2acc6f','2018-11-16 22:15:28',5500.00000,NULL,NULL),('064fa583-e9bf-11e8-8b75-02423d2acc6f','e7c5f6a5-e9bd-11e8-8b75-02423d2acc6f',NULL,NULL,'2018-11-16 22:15:28',500.00000),('064fa837-e9bf-11e8-8b75-02423d2acc6f','e7c5f83e-e9bd-11e8-8b75-02423d2acc6f','2018-11-16 22:15:28',3000.00000,NULL,NULL),('064fa99e-e9bf-11e8-8b75-02423d2acc6f','e7c5f83e-e9bd-11e8-8b75-02423d2acc6f',NULL,NULL,'2018-11-16 22:15:28',700.00000),('064faac5-e9bf-11e8-8b75-02423d2acc6f','e7c5f8d6-e9bd-11e8-8b75-02423d2acc6f','2018-11-16 22:15:28',2800.00000,NULL,NULL),('064fabe3-e9bf-11e8-8b75-02423d2acc6f','e7c5f8d6-e9bd-11e8-8b75-02423d2acc6f',NULL,NULL,'2018-11-16 22:15:28',300.00000);
/*!40000 ALTER TABLE `user_transaction` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-11-16 23:33:54
