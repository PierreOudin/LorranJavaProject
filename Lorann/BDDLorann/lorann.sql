-- phpMyAdmin SQL Dump
-- version 4.7.9
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le :  mar. 05 juin 2018 à 14:23
-- Version du serveur :  5.7.21
-- Version de PHP :  5.6.35

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `lorann`
--

DELIMITER $$
--
-- Procédures
--
DROP PROCEDURE IF EXISTS `findAllExamples`$$
CREATE DEFINER=`root`@`localhost` PROCEDURE `findAllExamples` ()  NO SQL
SELECT id, name, chemin
FROM example$$

DROP PROCEDURE IF EXISTS `findExampleById`$$
CREATE DEFINER=`root`@`localhost` PROCEDURE `findExampleById` (IN `id` INT)  NO SQL
SELECT id, name, chemin
FROM example
WHERE example.id = id$$

DROP PROCEDURE IF EXISTS `findExampleByName`$$
CREATE DEFINER=`root`@`localhost` PROCEDURE `findExampleByName` (IN `name` VARCHAR(255))  NO SQL
SELECT id, name, chemin
FROM example
WHERE example.name = name$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Structure de la table `example`
--

DROP TABLE IF EXISTS `example`;
CREATE TABLE IF NOT EXISTS `example` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `chemin` varchar(1000) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `example`
--

INSERT INTO `example` (`id`, `name`, `chemin`) VALUES
(1, 'niveau 1', '98888888888888888889700000000000000000077090009000000900090770701070000007010707709888900900098889077000000093B900000057720000009A09000000077098889000900988890770701070000007010707709000900000090009077000000000000000000798888888888888888889'),
(2, 'niveau 2', '9888888888888888888971107000000000070037711070000000000700077000000000000000000798800000900900000889700000007117000000A7700000007117000000B77880000098890000088970000000000000000007700070000000007000077200700000000070005798889888888888988889'),
(3, 'niveau 3', '9889888888888888888970070000030001100007700700000000011000077009888888888890000770000000000000000007700098909898889000077010700000700000000770007000007001001007705070020070C0000D07700070000070000100077000700000700000000798889888889888888889'),
(4, 'niveau 4', '009988888888888888890990000000000000000799000000000000000027903098888888989098897000700000000070000770007A98888888988907700070000000007000077000988888889B7098897000700000000070000798807C988888889889077500700000000070000798889888888888988889'),
(5, 'niveau 5', '988888988888888988997100009000100099037970000099000009900079700000099000090000797000990099009900007970999000000990000079999000000000000991797000000090000000997970000999000009900999702099000100009900099888988888888889905999999999999999999999');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;