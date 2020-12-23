-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le : mer. 23 déc. 2020 à 10:20
-- Version du serveur :  5.7.31
-- Version de PHP : 7.3.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `libreizhrie`
--

-- --------------------------------------------------------

--
-- Structure de la table `mediabdd`
--

DROP TABLE IF EXISTS `mediabdd`;
CREATE TABLE IF NOT EXISTS `mediabdd` (
  `type` int(11) NOT NULL,
  `nom` text NOT NULL,
  `dispo` tinyint(1) NOT NULL,
  `lieu` text NOT NULL,
  `tempMaxEmprunt` date NOT NULL,
  `limiteAge` int(11) NOT NULL,
  `idMedia` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `personnelbdd`
--

DROP TABLE IF EXISTS `personnelbdd`;
CREATE TABLE IF NOT EXISTS `personnelbdd` (
  `nom` text NOT NULL,
  `prenom` text NOT NULL,
  `idPerso` int(11) NOT NULL,
  `mdp` text NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `usagerbdd`
--

DROP TABLE IF EXISTS `usagerbdd`;
CREATE TABLE IF NOT EXISTS `usagerbdd` (
  `nom` text NOT NULL,
  `prenom` text NOT NULL,
  `age` int(11) NOT NULL,
  `idUsager` int(11) NOT NULL,
  `mdp` text NOT NULL,
  `adresse` text NOT NULL,
  `tel` int(11) NOT NULL,
  `dateInscription` date NOT NULL,
  `compteurEmpruntLivre` int(11) NOT NULL,
  `compteurEmpruntDVD` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1 COMMENT='table contenant les infos sur les clients de la médiathèque';
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
