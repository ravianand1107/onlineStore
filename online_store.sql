-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.0.13-rc-nt


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema online_store
--

CREATE DATABASE IF NOT EXISTS online_store;
USE online_store;

--
-- Definition of table `address`
--

DROP TABLE IF EXISTS `address`;
CREATE TABLE `address` (
  `id` int(11) NOT NULL auto_increment,
  `customer_id` int(11) default NULL,
  `address` text,
  `city` varchar(50) default NULL,
  `state` varchar(50) default NULL,
  `pincode` int(6) default NULL,
  `mobile` varchar(10) default NULL,
  `name` varchar(50) default NULL,
  PRIMARY KEY  (`id`),
  KEY `customer_id` (`customer_id`),
  CONSTRAINT `address_ibfk_1` FOREIGN KEY (`customer_id`) REFERENCES `customer` (`id`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `address`
--

/*!40000 ALTER TABLE `address` DISABLE KEYS */;
INSERT INTO `address` (`id`,`customer_id`,`address`,`city`,`state`,`pincode`,`mobile`,`name`) VALUES 
 (3,3,'Hostel No- 11, Appu Bhawan, MANIT Campusl','Bhopal','Madhya Pradesh',462003,'870696501','Ravi Anand'),
 (4,3,'manit','Bhopal','Madhya Pradesh',462003,'7896541230','axay');
/*!40000 ALTER TABLE `address` ENABLE KEYS */;


--
-- Definition of table `cart`
--

DROP TABLE IF EXISTS `cart`;
CREATE TABLE `cart` (
  `id` int(11) NOT NULL auto_increment,
  `customer_id` int(11) default NULL,
  `product_id` int(11) default NULL,
  `qty` int(11) default NULL,
  PRIMARY KEY  (`id`),
  KEY `customer_id` (`customer_id`),
  KEY `product_id` (`product_id`),
  CONSTRAINT `cart_ibfk_1` FOREIGN KEY (`customer_id`) REFERENCES `customer` (`id`) ON DELETE CASCADE,
  CONSTRAINT `cart_ibfk_2` FOREIGN KEY (`product_id`) REFERENCES `product` (`id`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `cart`
--

/*!40000 ALTER TABLE `cart` DISABLE KEYS */;
INSERT INTO `cart` (`id`,`customer_id`,`product_id`,`qty`) VALUES 
 (3,3,4,3),
 (6,3,2,2);
/*!40000 ALTER TABLE `cart` ENABLE KEYS */;


--
-- Definition of table `category`
--

DROP TABLE IF EXISTS `category`;
CREATE TABLE `category` (
  `id` int(11) NOT NULL auto_increment,
  `name` varchar(30) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `category`
--

/*!40000 ALTER TABLE `category` DISABLE KEYS */;
INSERT INTO `category` (`id`,`name`) VALUES 
 (1,'jeans'),
 (2,'casual shirt'),
 (3,'formal shirt'),
 (4,'t-shirt'),
 (5,'top'),
 (6,'saree'),
 (7,'kurti'),
 (8,'lehenga'),
 (9,'blazer'),
 (10,'kurta');
/*!40000 ALTER TABLE `category` ENABLE KEYS */;


--
-- Definition of table `customer`
--

DROP TABLE IF EXISTS `customer`;
CREATE TABLE `customer` (
  `id` int(11) NOT NULL auto_increment,
  `name` varchar(40) default NULL,
  `gender` varchar(8) default NULL,
  `email` varchar(50) default NULL,
  `mobile` varchar(10) default NULL,
  `userid` varchar(20) default NULL,
  `password` varchar(20) default NULL,
  `role` varchar(20) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `customer`
--

/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
INSERT INTO `customer` (`id`,`name`,`gender`,`email`,`mobile`,`userid`,`password`,`role`) VALUES 
 (3,'Ravi Anand','male','r.anand1107@gmail.com','7870696501','ravi123','ravi123','customer'),
 (4,'admin','male','r.anand110896@gmail.com','8210431755','admin123','admin123','admin');
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;


--
-- Definition of table `order_items`
--

DROP TABLE IF EXISTS `order_items`;
CREATE TABLE `order_items` (
  `id` int(11) NOT NULL auto_increment,
  `product_id` int(11) default NULL,
  `order_id` int(11) default NULL,
  `quantity` int(3) default NULL,
  `price` int(7) default NULL,
  PRIMARY KEY  (`id`),
  KEY `product_id` (`product_id`),
  KEY `order_id` (`order_id`),
  CONSTRAINT `order_items_ibfk_1` FOREIGN KEY (`product_id`) REFERENCES `product` (`id`),
  CONSTRAINT `order_items_ibfk_2` FOREIGN KEY (`order_id`) REFERENCES `orders` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `order_items`
--

/*!40000 ALTER TABLE `order_items` DISABLE KEYS */;
/*!40000 ALTER TABLE `order_items` ENABLE KEYS */;


--
-- Definition of table `orders`
--

DROP TABLE IF EXISTS `orders`;
CREATE TABLE `orders` (
  `id` int(11) NOT NULL auto_increment,
  `customer_id` int(11) default NULL,
  `status` varchar(30) default NULL,
  `date` date default NULL,
  `details` text,
  PRIMARY KEY  (`id`),
  KEY `customer_id` (`customer_id`),
  CONSTRAINT `orders_ibfk_1` FOREIGN KEY (`customer_id`) REFERENCES `customer` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `orders`
--

/*!40000 ALTER TABLE `orders` DISABLE KEYS */;
/*!40000 ALTER TABLE `orders` ENABLE KEYS */;


--
-- Definition of table `payment`
--

DROP TABLE IF EXISTS `payment`;
CREATE TABLE `payment` (
  `id` int(11) NOT NULL auto_increment,
  `order_id` int(11) default NULL,
  `amount` int(11) default NULL,
  `mode` varchar(30) default NULL,
  `status` varchar(30) default NULL,
  `date` date default NULL,
  PRIMARY KEY  (`id`),
  KEY `order_id` (`order_id`),
  CONSTRAINT `payment_ibfk_1` FOREIGN KEY (`order_id`) REFERENCES `orders` (`id`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `payment`
--

/*!40000 ALTER TABLE `payment` DISABLE KEYS */;
/*!40000 ALTER TABLE `payment` ENABLE KEYS */;


--
-- Definition of table `product`
--

DROP TABLE IF EXISTS `product`;
CREATE TABLE `product` (
  `id` int(11) NOT NULL auto_increment,
  `name` text,
  `price` int(6) default NULL,
  `size` varchar(5) default NULL,
  `color` varchar(20) default NULL,
  `brand` varchar(30) default NULL,
  `image` text,
  `description` text,
  `stock` int(4) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `product`
--

/*!40000 ALTER TABLE `product` DISABLE KEYS */;
INSERT INTO `product` (`id`,`name`,`price`,`size`,`color`,`brand`,`image`,`description`,`stock`) VALUES 
 (1,'skinny fit jeans',999,'30','black','levis','media/product/1.jpg','100% cooton',10),
 (2,'denim shirt',699,'m','blue','wrangler','media/product/2.jpg','100% cooton and mild wash',15),
 (3,'Casual blazer',2699,'m','cream','blackberry','media/product/3.jpg','100% cooton and body fit',5),
 (4,'banarsi saree',1499,'free','red','laxmi sarees','media/product/4.jpg','100% cooton and border embordary',9),
 (5,'cropped top',499,'s','pink','zara','media/product/5.jpg','pure cotton and light wight',18),
 (6,'skinny fit girls jeans',1999,'28','blue','fab india','media/product/6.jpg','pure cotton and light wight',25),
 (7,'tdfgf',25,'5','xcgvhj','ikjbn','media/product/1.jpg','vfyucvbdjigbhk',6),
 (9,'cotton pant',1499,'32','black','peter england','media/product/1.jpg','cotton',6);
/*!40000 ALTER TABLE `product` ENABLE KEYS */;


--
-- Definition of table `product_details`
--

DROP TABLE IF EXISTS `product_details`;
CREATE TABLE `product_details` (
  `id` int(11) NOT NULL auto_increment,
  `product_id` int(11) default NULL,
  `weartype_id` int(11) default NULL,
  `cat_id` int(11) default NULL,
  PRIMARY KEY  (`id`),
  KEY `product_id` (`product_id`),
  KEY `weartype_id` (`weartype_id`),
  KEY `cat_id` (`cat_id`),
  CONSTRAINT `product_details_ibfk_1` FOREIGN KEY (`product_id`) REFERENCES `product` (`id`),
  CONSTRAINT `product_details_ibfk_2` FOREIGN KEY (`weartype_id`) REFERENCES `weartype` (`id`),
  CONSTRAINT `product_details_ibfk_3` FOREIGN KEY (`cat_id`) REFERENCES `category` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `product_details`
--

/*!40000 ALTER TABLE `product_details` DISABLE KEYS */;
INSERT INTO `product_details` (`id`,`product_id`,`weartype_id`,`cat_id`) VALUES 
 (1,1,1,1),
 (2,2,1,2),
 (3,3,1,9),
 (4,4,2,6),
 (5,5,2,5),
 (6,6,2,1),
 (7,7,3,1),
 (9,9,1,1);
/*!40000 ALTER TABLE `product_details` ENABLE KEYS */;


--
-- Definition of table `weartype`
--

DROP TABLE IF EXISTS `weartype`;
CREATE TABLE `weartype` (
  `id` int(11) NOT NULL auto_increment,
  `name` varchar(20) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `weartype`
--

/*!40000 ALTER TABLE `weartype` DISABLE KEYS */;
INSERT INTO `weartype` (`id`,`name`) VALUES 
 (1,'men'),
 (2,'women'),
 (3,'kids'),
 (6,'footwear');
/*!40000 ALTER TABLE `weartype` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
