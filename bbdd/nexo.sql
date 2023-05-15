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
INSERT INTO `grupos_apex` VALUES (13,'Equipo de demolición','Battle Royale','',2,'?? Norteamérica','Sí','asrgdsthfth','test','test1','Juanma','ejemploUsuario#1234','test1#1243','player2#8271','2023-05-13 13:28:00',NULL),(14,'Con duscord','Battle Royale Competitivo','Predator',2,'?? Norteamérica','Sí','','1323234re4ws4','antonio08','','jungals#1893','antonio08#4873','','2023-05-13 13:33:23',NULL),(15,'Competitiva Oro 4','Battle Royale','',2,'?? Europa','Sí','','123','NUEVOF','','megauser#1234','NUEVOF#4234','','2023-05-13 18:55:10',NULL);
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
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `grupos_counter_strike`
--

LOCK TABLES `grupos_counter_strike` WRITE;
/*!40000 ALTER TABLE `grupos_counter_strike` DISABLE KEYS */;
INSERT INTO `grupos_counter_strike` VALUES (4,'test','Competitivo','Maestro Guardián Distinguido',2,'?? Europa','Sí','','QWERQWE','test1','jugador2','','','usuarionuevo#1234','test1#1243','jugador2#1232','','','2023-05-13 14:10:45',NULL),(5,'con pruebas','Retake','',4,'?? Norteamérica','No','','Lider de 4','NUEVOF','player 2','jugador3','jugador4','demo#5645','NUEVOF#4234','player2#8271','jugador3#1233','jugador#4133','2023-05-13 14:11:53',NULL),(6,'SGFDGS','Casual','',1,'?? Europa','Sí','','probador','Jugador','','','','usuarionuevo#1234','NUEVOF#4234','','','','2023-05-13 14:36:39',1);
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
INSERT INTO `grupos_dota2` VALUES (1,'testcomp','MODO CAPITÁN','Archon',2,'?? Dubai','','test','test1','Juanma','','','megauser#1234','test1#1243','jugador2#1232','','','2023-05-12 13:48:31',NULL),(2,'Grupo de ejemplo','SELECCIÓN SIMPLE','',1,'?? US West','','DFGSDFG','NUEVOF','player 2','jugador3','','jungals#1893','test1#1243','jugador2#1232','jugador3#1233','','2023-05-12 13:49:07',NULL),(3,'preuba','SELECCIÓN ALEATORIA RANKED','Ancient',3,'?? US East','','asfdgfdfg','NUEVOF','player 2','jugador3','','jungals#1893','test1#1243','jugador2#1232','jugador3#1233','','2023-05-13 15:19:59',NULL);
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
INSERT INTO `grupos_fortnite` VALUES (1,'test','BR Escuadrones',NULL,3,'Asia','No','','DFGSDFG','NUEVOF','','','megauser#1234','test1#1243','','','2023-05-12 18:00:32',NULL),(2,'Grupo de ejemplo','BR Tríos',NULL,2,'Brazil','No','','El demo','NUEVOF','Juanma','','cuatro#4444','','NUEVOF#4234','','2023-05-13 17:09:13',NULL);
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
INSERT INTO `grupos_league_of_legends` VALUES (48,'Grupo de cuatro','Partida Clasificatoria','Platino',4,'?? Europa Occidental (EUW)','Creación de un grupo de 4 personas par comprobar el funcionamiento','Lider de 4','Jugador1','jugador2','jugador3','jugador4','cuatro#4444','jugador#1342','jugador2#1232','jugador3#1233','jugador#4133','2023-05-12 21:11:36',1),(49,'De leyendas','Partida Clasificatoria','Maestro',2,'?? Europa del Este (EUNE)',' Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam maximus ex dolor. Nulla gravida suscipit nunc in auctor. Nam bibendum laoreet enim pharetra faucibus. Praesent semper sapien eros, id sagittis nulla elementum at. Integer elit ex, aliquet a lacinia et, laoreet quis tortor. Integer accumsan, metus nec condimentum pulvinar, arcu tortor viverra ex, sed ornare purus diam malesuada nisi. In venenatis, dui sit amet ultrices convallis, tellus turpis lobortis ex, non tincidunt est nulla vel arcu. Phasellus egestas vulputate cursus. Donec varius congue lacinia. Cras tristique consectetur sollicitudin. In hac habitasse platea dictumst. Maecenas quis ultricies nulla. Ut quis cursus erat. Praesent tincidunt neque eu est laoreet, vitae maximus lectus malesuada.\n\nCurabitur sit amet eros finibus, finibus urna vel, sodales dolor. Sed rhoncus interdum ante, at condimentum lacus aliquam quis. Sed condimentum turpis purus, ac ultricies erat maximus eu. Curabitur elementum vehicula metus, sit amet blandit neque vestibulum ac. Nam vestibulum aliquet nibh. Nam eu porttitor risus. Etiam a varius arcu, quis tristique nisl. Aenean gravida sollicitudin erat quis ullamcorper. Curabitur gravida vitae mauris et auctor. ','Usuario pro','NUEVOF','player 2','','','algo#1111','j1#4536','player2#8271','','','2023-05-12 23:25:09',1),(50,'probador','Partida Normal','',1,'?? América del Norte (NA)','','Algo','Jugador','','','','demo#5645','NUEVOF#4234','','','','2023-05-12 23:28:36',1),(55,'Almacenar grupo activo','Partida Clasificatoria','Retador (Challenger)',4,'?? Corea (KR)','this.grupoActivo = 1','activo','NUEVOF','','','','activo#3452','j1#4536','','','','2023-05-13 10:07:30',1),(56,'Con duscord','Partida Clasificatoria','Plata',4,'?? China (CN)','','DFGSDFG','test1','','','','megauser#1234','test1#1243','','','','2023-05-13 12:14:36',1),(57,'Busco gente para jugar','Partida Clasificatoria','Bronce',3,'?? Latinoamérica Norte (LAN)','Busco gente para jugar al lol ','paquito12','antonio08','Juanma','','','paquito12#4535','antonio08#4873','','','','2023-05-13 12:46:48',1),(58,'Docker Group','Partida Clasificatoria','Gran Maestro',3,'?? América del Norte (NA)','Equipo de prueba en docker','Docker','Jugador','','','','Docker#9127','test1#1243','','','','2023-05-14 10:11:28',1);
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
INSERT INTO `grupos_overwatch` VALUES (1,'Con duscord','Partida Competitiva','diamante',2,'?? Norteamérica','Sí','','DFGSDFG','test1','jugador2','','','usuarionuevo#1234','test1#1243','jugador2#1232','','','2023-05-12 14:55:17',NULL),(2,'Almacenar grupo','Partida Competitiva','platino',4,'?? Asia','No','Buscamos gente agradable y competitiva xD','Algo','antonio08','Juanma','','','algo#1111','antonio08#4873','player2#8271','','','2023-05-12 14:57:22',NULL),(3,'Busco gente de master','Partida Competitiva','maestro',3,'?? Europa','Sí','Busco un grupo de 3 personas para competir en liga master ','Genji main',NULL,NULL,NULL,NULL,'maingenji#2543',NULL,NULL,NULL,NULL,'2023-05-12 20:04:10',NULL),(4,'SGFDGS','Partida Rápida','',1,'?? Norteamérica','Sí','','probador','NUEVOF','','','','usuarionuevo#1234','antonio08#4873','','','','2023-05-13 16:38:21',1);
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
INSERT INTO `grupos_rainbow_six` VALUES (3,'Con duscord','Partida competitiva','Oro',3,'','Sí','Rango de oro competitivos buenos gameplays','DFGSDFG','Jugador','','','','megauser#1234','antonio08#4873','','','','2023-05-12 16:32:23',NULL),(4,'Almacenar grupo activo','Partida competitiva','Platino',4,'','No','rainbow-six','Usuario nuevo','Jugador','player 2','jugador3','jugador4','megauser#1234','antonio08#4873','jugador2#1232','jugador3#1233','jugador#4133','2023-05-13 16:54:19',1);
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
INSERT INTO `grupos_valorant` VALUES (1,'test','Partida competitiva','Diamante',3,'?? Europa','no','Juan, un jugador de Counter-Strike: Global Offensive (CSGO), se unió a un equipo de jugadores de alto nivel durante una partida en línea. Gracias a los consejos y tácticas de su equipo, su habilidad mejoró rápidamente. El equipo decidió participar en un torneo local de CSGO, y aunque eran relativamente nuevos, llegaron a la final y ganaron. Juan se sintió orgulloso de su equipo y de sí mismo, y aprendió que con esfuerzo y dedicación cualquier jugador puede mejorar y alcanzar grandes logros en CSGO.','probador','amigo','jugador2','','','megauser#1234','amigo#1458','jugador2#1232','','','2023-05-11 21:05:05',NULL),(2,'SGFDGS','Partida no competitiva','',1,'?? Norteamérica',NULL,'','DFGSDFG','amigo','jugador2','','','competidor44#4453','amigo#1458','jugador2#1232','','','2023-05-11 21:08:13',NULL),(3,'test test','Partida personalizada','',2,'?? Asia','Sí','efg yhrv','test comp','amigo','jugador2','','','jungals#1893','amigo#1458','jugador2#1232','','','2023-05-11 21:11:55',NULL);
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

-- Dump completed on 2023-05-14 19:09:51
