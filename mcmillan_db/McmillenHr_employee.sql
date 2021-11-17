-- MySQL dump 10.13  Distrib 8.0.26, for Win64 (x86_64)
--
-- Host: 35.238.229.38    Database: McmillenHr
-- ------------------------------------------------------
-- Server version	8.0.18-google

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
SET @MYSQLDUMP_TEMP_LOG_BIN = @@SESSION.SQL_LOG_BIN;
SET @@SESSION.SQL_LOG_BIN= 0;

--
-- GTID state at the beginning of the backup 
--

SET @@GLOBAL.GTID_PURGED=/*!80000 '+'*/ '2eeedd09-423c-11ec-9169-42010a800003:1-121506';

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employee` (
  `employee_id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  'last_name' varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `email` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `phone_number` varchar(15) NOT NULL,
  `hire_date` date NOT NULL,
  `salary` decimal(8,2) DEFAULT NULL,
  `manager_id` int(11) NOT NULL,
  `dep_id` int(11) NOT NULL,
  `training_status` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT 'In Progress',
  `performance_status` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`employee_id`),
  UNIQUE KEY `manager_id` (`manager_id`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee`
--

LOCK TABLES `employee` WRITE;
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` VALUES (1,'Merkys Santiago','100 Goat Ave, Stroudsburg PA 18360','m.santiago@gmail.com','5701340987','2014-10-20',NULL,0,100,'In Progress',NULL),(2,'Tyree Harper','234 Coloardo Commons, Bartonsville PA 18360','t.harper@gmail.com','5703345567','2012-09-10',NULL,1,200,'In Progress',NULL),(3,'Christerle Nounoute','345 Industrial Lane, Henryville PA 18332','c.nounoute@gmail.com','5705553434','2015-03-02',NULL,2,300,'In Progress',NULL),(4,'Zachary Berghoff','456 North 5th St, Stroudsburg PA 18360','z.berghoff@gmail.com','5709921005','2017-04-07',NULL,3,400,'In Progress',NULL),(5,'Trey\'Vyon Bates','567 South Main St, Phillipsburg NJ 08865','t.bates@gmail.com','5709008001','2016-03-22',NULL,4,500,'In Progress',NULL),(6,'Isaiah Vojnovski','678 Enderman Circle, Scranton PA 18510','i.vojnoxski@gmail.com','5702242323','2020-01-23',NULL,5,100,'In Progress',NULL),(7,'Holly Micheals','North 3rd St, Easton PA 18042','h.micheals@gmail.com','5708389675','2018-10-10',NULL,6,200,'In Progress',NULL),(8,'Marinda Diaz','98 Tyrolean Way, Henryville PA 18332','m.diaz@gmail.com','570-465-0983','2018-02-27',NULL,7,300,'In Progress',NULL),(9,'Micheal Rogers','1001 Millennial Drive, Stroudsburg PA 18360','m.rogers@gmail.com','570-990-8796','2017-06-26',NULL,8,400,'In Progress',NULL),(10,'Meghan LeMar','444 Thee Stallion Way, Houston TX 77001','m.lemar@gmail.com','570-758-1234','2020-09-06',NULL,9,500,'In Progress',NULL),(11,'Sarah Smiles','110 River Rd, Easton PA 18042','s.smiles@gmail.com','570-956-2435','2020-11-10',NULL,10,100,'In Progress',NULL),(12,'Melissa Hendricks','1290 Gen Z Circle, Allentown PA 18001','m.hendricks@gmail.com','570-213-2215','2019-05-30',NULL,11,200,'In Progress',NULL),(13,'Maria Pajana','18 Circle Rd, Stroudsburg PA 18360','m.pajana@gmail.com','570-807-9898','2012-12-13',NULL,12,300,'In Progress',NULL),(14,'Roger Hernandez','5 Hello St, Easton PA 18042','r.hernandez@gmail.com','570-857-9009','2016-05-09',NULL,13,400,'In Progress',NULL),(15,'Melanie Jones','1 Pennsylvania Rd, Henryville PA 18332','m.jones@gmail.com','570-419-4564','2015-11-12',NULL,14,500,'In Progress',NULL),(16,'Anna Hampton','100 President St, Stroudsburg PA 18360','a.hampton@gmail.com','570-734-9821','2014-02-07',NULL,15,100,'In Progress',NULL),(17,'Kyler Kyles','102 President St, Stroudsburg PA 18360','k.kyles@gmail.com','570-267-5698','2018-12-02',NULL,16,200,'In Progress',NULL),(18,'Joshua Turner','180 Bar St, Stroudsburg PA 18360','j.turner@gmail.com','938-758-9032','2019-09-01',NULL,17,300,'In Progress',NULL),(19,'Brian McCafrey','81 Panthers Ave, Henryville PA 18332','b.mccafrey@gmail.com','908-556-9965','2021-05-04',NULL,18,400,'In Progress',NULL),(20,'Kevin Martinez','S 2nd St, Easton PA 18042','k.martinez@gmail.com','570-719-5619','2016-08-10',NULL,19,500,'In Progress',NULL),(21,'Riley Biles','8890 Main St, Stroudsburg PA 18360','r.biles@gmail.com','484-895-3346','2015-10-09',NULL,20,100,'In Progress',NULL),(22,'Simon Lee','21 Pawnee St, Allentown PA 18001','s.lee@gmail.com','570-919-5789','2016-03-03',NULL,21,200,'In Progress',NULL),(23,'Michaela Johnson','160 Fahgettaboutit St, Stroudsburg PA 18360','m.johnson@gmail.com','918-539-3348','2014-02-04',NULL,22,300,'In Progress',NULL),(24,'Owen Smith','21 Pawnee St, Allentown PA 18001','o.smith@gmail.com','570-325-5699','2015-06-01',NULL,23,400,'In Progress',NULL),(25,'Dorian Williams','10 Green Forest St, Henryville PA 18332','d.williams@gmail.com','570-234-9813','2013-10-24',NULL,24,500,'In Progress',NULL);
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;
UNLOCK TABLES;
SET @@SESSION.SQL_LOG_BIN = @MYSQLDUMP_TEMP_LOG_BIN;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-11-17 11:35:15
