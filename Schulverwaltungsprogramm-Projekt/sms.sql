-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 17, 2023 at 06:07 PM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.0.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `sms`
--

-- --------------------------------------------------------

--
-- Table structure for table `bericht`
--

CREATE TABLE `bericht` (
  `Id` int(255) NOT NULL,
  `name` varchar(255) NOT NULL,
  `klasse` int(255) NOT NULL,
  `math` int(255) NOT NULL,
  `phy` int(255) NOT NULL,
  `Programm` int(255) NOT NULL,
  `matrikelnummer` int(255) NOT NULL,
  `Noten` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `bericht`
--

INSERT INTO `bericht` (`Id`, `name`, `klasse`, `math`, `phy`, `Programm`, `matrikelnummer`, `Noten`) VALUES
(333, 'muhammed', 2323, 434, 2434, 24, 334, 'A+'),
(33, 'dda', 33, 44, 55, 33, 23, 'D'),
(56, 'Muhammed', 76, 90, 70, 70, 53536563, 'A');

-- --------------------------------------------------------

--
-- Table structure for table `gebuhr`
--

CREATE TABLE `gebuhr` (
  `Id` int(255) NOT NULL,
  `Schülername` varchar(255) NOT NULL,
  `monatname` varchar(255) NOT NULL,
  `Jahr` int(255) NOT NULL,
  `monat` int(255) NOT NULL,
  `sport` int(255) NOT NULL,
  `bib` int(255) NOT NULL,
  `st` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `gebuhr`
--

INSERT INTO `gebuhr` (`Id`, `Schülername`, `monatname`, `Jahr`, `monat`, `sport`, `bib`, `st`) VALUES
(1, 'ss', 'ss', 33, 44, 3443, 33, 'unpaid'),
(2, 'Sara', 'sbat', 3343, 3244, 433, 3443, 'unpaid'),
(33, 'edd', 'da', 33, 3434, 3, 44, 'unpaid');

-- --------------------------------------------------------

--
-- Table structure for table `lehrer`
--

CREATE TABLE `lehrer` (
  `Id` int(255) NOT NULL,
  `name` varchar(255) NOT NULL,
  `spec` varchar(255) NOT NULL,
  `fach` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `lehrer`
--

INSERT INTO `lehrer` (`Id`, `name`, `spec`, `fach`) VALUES
(2, 'ghjzh', 'daasdd', 'dad'),
(24, 'baraa', 'fdef', 'ffaf');

-- --------------------------------------------------------

--
-- Table structure for table `muhm`
--

CREATE TABLE `muhm` (
  `Id` int(255) NOT NULL,
  `Vname` varchar(255) NOT NULL,
  `Nname` varchar(255) NOT NULL,
  `Tnummer` int(255) NOT NULL,
  `Ftmummer` int(255) NOT NULL,
  `classe` varchar(255) NOT NULL,
  `adresse` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `muhm`
--

INSERT INTO `muhm` (`Id`, `Vname`, `Nname`, `Tnummer`, `Ftmummer`, `classe`, `adresse`) VALUES
(1705014534, 'muhammed', 'alobayd', 584380, 42141, '143431', '233');

-- --------------------------------------------------------

--
-- Table structure for table `userlogin`
--

CREATE TABLE `userlogin` (
  `Id` int(200) NOT NULL,
  `username` varchar(200) NOT NULL,
  `password` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `userlogin`
--

INSERT INTO `userlogin` (`Id`, `username`, `password`) VALUES
(1, 'admin', 'admin');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
