CREATE DATABASE  IF NOT EXISTS `nexo` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `nexo`;
-- MySQL dump 10.13  Distrib 8.0.26, for Win64 (x86_64)
--
-- Host: localhost    Database: nexo
-- ------------------------------------------------------
-- Server version	8.0.26

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

--
-- Table structure for table `grupos_apex`
--

DROP TABLE IF EXISTS `grupos_apex`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `grupos_apex` (
  `id_grupo` int NOT NULL AUTO_INCREMENT,
  `titulo_grupo` varchar(45) DEFAULT NULL,
  `modo_juego` varchar(45) DEFAULT NULL,
  `rango_competitivo` varchar(45) DEFAULT NULL,
  `numero_jugadores` int DEFAULT NULL,
  `region` varchar(45) DEFAULT NULL,
  `microfono_requerido` varchar(45) DEFAULT NULL,
  `descripcion` text,
  `lider_grupo` varchar(45) DEFAULT NULL,
  `jugador1` varchar(45) DEFAULT NULL,
  `jugador2` varchar(45) DEFAULT NULL,
  `discord_lider_grupo` varchar(45) DEFAULT NULL,
  `discord_jugador1` varchar(45) DEFAULT NULL,
  `discord_jugador2` varchar(45) DEFAULT NULL,
  `fecha_creacion` datetime DEFAULT NULL,
  `grupo_activo` tinyint DEFAULT '1',
  PRIMARY KEY (`id_grupo`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `grupos_apex`
--

LOCK TABLES `grupos_apex` WRITE;
/*!40000 ALTER TABLE `grupos_apex` DISABLE KEYS */;
/*!40000 ALTER TABLE `grupos_apex` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `grupos_counter_strike`
--

DROP TABLE IF EXISTS `grupos_counter_strike`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `grupos_counter_strike` (
  `id_grupo` int NOT NULL AUTO_INCREMENT,
  `titulo_grupo` varchar(45) DEFAULT NULL,
  `modo_juego` varchar(45) DEFAULT NULL,
  `rango_competitivo` varchar(45) DEFAULT NULL,
  `numero_jugadores` int DEFAULT NULL,
  `region` varchar(45) DEFAULT NULL,
  `microfono_requerido` varchar(45) DEFAULT NULL,
  `descripcion` text,
  `lider_grupo` varchar(45) DEFAULT NULL,
  `jugador1` varchar(45) DEFAULT NULL,
  `jugador2` varchar(45) DEFAULT NULL,
  `jugador3` varchar(45) DEFAULT NULL,
  `jugador4` varchar(45) DEFAULT NULL,
  `discord_lider_grupo` varchar(45) DEFAULT NULL,
  `discord_jugador1` varchar(45) DEFAULT NULL,
  `discord_jugador2` varchar(45) DEFAULT NULL,
  `discord_jugador3` varchar(45) DEFAULT NULL,
  `discord_jugador4` varchar(45) DEFAULT NULL,
  `fecha_creacion` datetime DEFAULT NULL,
  `grupo_activo` tinyint DEFAULT '1',
  PRIMARY KEY (`id_grupo`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `grupos_counter_strike`
--

LOCK TABLES `grupos_counter_strike` WRITE;
/*!40000 ALTER TABLE `grupos_counter_strike` DISABLE KEYS */;
/*!40000 ALTER TABLE `grupos_counter_strike` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `grupos_dota2`
--

DROP TABLE IF EXISTS `grupos_dota2`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `grupos_dota2` (
  `id_grupo` int NOT NULL AUTO_INCREMENT,
  `titulo_grupo` varchar(45) DEFAULT NULL,
  `modo_juego` varchar(45) DEFAULT NULL,
  `rango_competitivo` varchar(45) DEFAULT NULL,
  `numero_jugadores` int DEFAULT NULL,
  `region` varchar(45) DEFAULT NULL,
  `descripcion` text,
  `lider_grupo` varchar(45) DEFAULT NULL,
  `jugador1` varchar(45) DEFAULT NULL,
  `jugador2` varchar(45) DEFAULT NULL,
  `jugador3` varchar(45) DEFAULT NULL,
  `jugador4` varchar(45) DEFAULT NULL,
  `discord_lider_grupo` varchar(45) DEFAULT NULL,
  `discord_jugador1` varchar(45) DEFAULT NULL,
  `discord_jugador2` varchar(45) DEFAULT NULL,
  `discord_jugador3` varchar(45) DEFAULT NULL,
  `discord_jugador4` varchar(45) DEFAULT NULL,
  `fecha_creacion` datetime DEFAULT NULL,
  `grupo_activo` tinyint DEFAULT '1',
  PRIMARY KEY (`id_grupo`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `grupos_dota2`
--

LOCK TABLES `grupos_dota2` WRITE;
/*!40000 ALTER TABLE `grupos_dota2` DISABLE KEYS */;
/*!40000 ALTER TABLE `grupos_dota2` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `grupos_fortnite`
--

DROP TABLE IF EXISTS `grupos_fortnite`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `grupos_fortnite` (
  `id_grupo` int NOT NULL AUTO_INCREMENT,
  `titulo_grupo` varchar(45) DEFAULT NULL,
  `modo_juego` varchar(45) DEFAULT NULL,
  `rango_competitivo` varchar(45) DEFAULT NULL,
  `numero_jugadores` int DEFAULT NULL,
  `region` varchar(45) DEFAULT NULL,
  `microfono_requerido` varchar(45) DEFAULT NULL,
  `descripcion` text,
  `lider_grupo` varchar(45) DEFAULT NULL,
  `jugador1` varchar(45) DEFAULT NULL,
  `jugador2` varchar(45) DEFAULT NULL,
  `jugador3` varchar(45) DEFAULT NULL,
  `discord_lider_grupo` varchar(45) DEFAULT NULL,
  `discord_jugador1` varchar(45) DEFAULT NULL,
  `discord_jugador2` varchar(45) DEFAULT NULL,
  `discord_jugador3` varchar(45) DEFAULT NULL,
  `fecha_creacion` datetime DEFAULT NULL,
  `grupo_activo` tinyint DEFAULT '1',
  PRIMARY KEY (`id_grupo`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `grupos_fortnite`
--

LOCK TABLES `grupos_fortnite` WRITE;
/*!40000 ALTER TABLE `grupos_fortnite` DISABLE KEYS */;
/*!40000 ALTER TABLE `grupos_fortnite` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `grupos_league_of_legends`
--

DROP TABLE IF EXISTS `grupos_league_of_legends`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `grupos_league_of_legends` (
  `id_grupo` int NOT NULL AUTO_INCREMENT,
  `titulo_grupo` varchar(45) DEFAULT NULL,
  `modo_juego` varchar(45) DEFAULT NULL,
  `rango_competitivo` varchar(45) DEFAULT NULL,
  `numero_jugadores` int DEFAULT NULL,
  `region` varchar(45) DEFAULT NULL,
  `descripcion` text,
  `lider_grupo` varchar(45) DEFAULT NULL,
  `jugador1` varchar(45) DEFAULT NULL,
  `jugador2` varchar(45) DEFAULT NULL,
  `jugador3` varchar(45) DEFAULT NULL,
  `jugador4` varchar(45) DEFAULT NULL,
  `discord_lider_grupo` varchar(45) DEFAULT NULL,
  `discord_jugador1` varchar(45) DEFAULT NULL,
  `discord_jugador2` varchar(45) DEFAULT NULL,
  `discord_jugador3` varchar(45) DEFAULT NULL,
  `discord_jugador4` varchar(45) DEFAULT NULL,
  `fecha_creacion` datetime DEFAULT NULL,
  `grupo_activo` tinyint DEFAULT '1',
  PRIMARY KEY (`id_grupo`)
) ENGINE=InnoDB AUTO_INCREMENT=59 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `grupos_league_of_legends`
--

LOCK TABLES `grupos_league_of_legends` WRITE;
/*!40000 ALTER TABLE `grupos_league_of_legends` DISABLE KEYS */;
/*!40000 ALTER TABLE `grupos_league_of_legends` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `grupos_overwatch`
--

DROP TABLE IF EXISTS `grupos_overwatch`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `grupos_overwatch` (
  `id_grupo` int NOT NULL AUTO_INCREMENT,
  `titulo_grupo` varchar(45) DEFAULT NULL,
  `modo_juego` varchar(45) DEFAULT NULL,
  `rango_competitivo` varchar(45) DEFAULT NULL,
  `numero_jugadores` int DEFAULT NULL,
  `region` varchar(45) DEFAULT NULL,
  `microfono_requerido` varchar(45) DEFAULT NULL,
  `descripcion` text,
  `lider_grupo` varchar(45) DEFAULT NULL,
  `jugador1` varchar(45) DEFAULT NULL,
  `jugador2` varchar(45) DEFAULT NULL,
  `jugador3` varchar(45) DEFAULT NULL,
  `jugador4` varchar(45) DEFAULT NULL,
  `discord_lider_grupo` varchar(45) DEFAULT NULL,
  `discord_jugador1` varchar(45) DEFAULT NULL,
  `discord_jugador2` varchar(45) DEFAULT NULL,
  `discord_jugador3` varchar(45) DEFAULT NULL,
  `discord_jugador4` varchar(45) DEFAULT NULL,
  `fecha_creacion` datetime DEFAULT NULL,
  `grupo_activo` tinyint DEFAULT '1',
  PRIMARY KEY (`id_grupo`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `grupos_overwatch`
--

LOCK TABLES `grupos_overwatch` WRITE;
/*!40000 ALTER TABLE `grupos_overwatch` DISABLE KEYS */;
/*!40000 ALTER TABLE `grupos_overwatch` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `grupos_rainbow_six`
--

DROP TABLE IF EXISTS `grupos_rainbow_six`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `grupos_rainbow_six` (
  `id_grupo` int NOT NULL AUTO_INCREMENT,
  `titulo_grupo` varchar(45) DEFAULT NULL,
  `modo_juego` varchar(45) DEFAULT NULL,
  `rango_competitivo` varchar(45) DEFAULT NULL,
  `numero_jugadores` int DEFAULT NULL,
  `region` varchar(45) DEFAULT NULL,
  `microfono_requerido` varchar(45) DEFAULT NULL,
  `descripcion` text,
  `lider_grupo` varchar(45) DEFAULT NULL,
  `jugador1` varchar(45) DEFAULT NULL,
  `jugador2` varchar(45) DEFAULT NULL,
  `jugador3` varchar(45) DEFAULT NULL,
  `jugador4` varchar(45) DEFAULT NULL,
  `discord_lider_grupo` varchar(45) DEFAULT NULL,
  `discord_jugador1` varchar(45) DEFAULT NULL,
  `discord_jugador2` varchar(45) DEFAULT NULL,
  `discord_jugador3` varchar(45) DEFAULT NULL,
  `discord_jugador4` varchar(45) DEFAULT NULL,
  `fecha_creacion` datetime DEFAULT NULL,
  `grupo_activo` tinyint DEFAULT '1',
  PRIMARY KEY (`id_grupo`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `grupos_rainbow_six`
--

LOCK TABLES `grupos_rainbow_six` WRITE;
/*!40000 ALTER TABLE `grupos_rainbow_six` DISABLE KEYS */;
/*!40000 ALTER TABLE `grupos_rainbow_six` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `grupos_valorant`
--

DROP TABLE IF EXISTS `grupos_valorant`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `grupos_valorant` (
  `id_grupo` int NOT NULL AUTO_INCREMENT,
  `titulo_grupo` varchar(45) DEFAULT NULL,
  `modo_juego` varchar(45) DEFAULT NULL,
  `rango_competitivo` varchar(45) DEFAULT NULL,
  `numero_jugadores` int DEFAULT NULL,
  `region` varchar(45) DEFAULT NULL,
  `microfono_requerido` varchar(45) DEFAULT NULL,
  `descripcion` text,
  `lider_grupo` varchar(45) DEFAULT NULL,
  `jugador1` varchar(45) DEFAULT NULL,
  `jugador2` varchar(45) DEFAULT NULL,
  `jugador3` varchar(45) DEFAULT NULL,
  `jugador4` varchar(45) DEFAULT NULL,
  `discord_lider_grupo` varchar(45) DEFAULT NULL,
  `discord_jugador1` varchar(45) DEFAULT NULL,
  `discord_jugador2` varchar(45) DEFAULT NULL,
  `discord_jugador3` varchar(45) DEFAULT NULL,
  `discord_jugador4` varchar(45) DEFAULT NULL,
  `fecha_creacion` datetime DEFAULT NULL,
  `grupo_activo` tinyint DEFAULT '1',
  PRIMARY KEY (`id_grupo`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `grupos_valorant`
--

LOCK TABLES `grupos_valorant` WRITE;
/*!40000 ALTER TABLE `grupos_valorant` DISABLE KEYS */;
/*!40000 ALTER TABLE `grupos_valorant` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-05-15 20:17:12
