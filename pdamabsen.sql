-- phpMyAdmin SQL Dump
-- version 4.0.9
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Sep 13, 2015 at 08:36 AM
-- Server version: 5.6.14
-- PHP Version: 5.5.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `pdamabsen`
--

-- --------------------------------------------------------

--
-- Table structure for table `absen`
--

CREATE TABLE IF NOT EXISTS `absen` (
  `index` int(10) NOT NULL AUTO_INCREMENT,
  `NIP` int(20) NOT NULL,
  `tgl_absen` date NOT NULL,
  `jam_masuk` time DEFAULT NULL,
  `jam_keluar` time DEFAULT NULL,
  `jam_kerja` int(10) DEFAULT NULL,
  `status_masuk` enum('Y','N') DEFAULT NULL,
  `status_keluar` enum('Y','N') DEFAULT NULL,
  `ket` text,
  `terlambat` enum('Y','N') DEFAULT NULL,
  `pulangcepat` enum('Y','N') DEFAULT NULL,
  PRIMARY KEY (`index`),
  KEY `FK_abpeg` (`NIP`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=12 ;

--
-- Dumping data for table `absen`
--

INSERT INTO `absen` (`index`, `NIP`, `tgl_absen`, `jam_masuk`, `jam_keluar`, `jam_kerja`, `status_masuk`, `status_keluar`, `ket`, `terlambat`, `pulangcepat`) VALUES
(8, 1, '2015-09-11', '12:40:13', NULL, NULL, 'Y', NULL, 'dsadasda', 'Y', NULL),
(9, 2, '2015-09-11', '12:40:13', NULL, NULL, 'Y', NULL, 'asdasdasd', 'Y', NULL),
(10, 3, '2015-09-11', '12:40:46', NULL, NULL, 'Y', NULL, 'asdasdasd', 'N', NULL),
(11, 4, '2015-09-11', '12:40:46', NULL, NULL, 'Y', NULL, 'dasdad', 'N', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `jabatan`
--

CREATE TABLE IF NOT EXISTS `jabatan` (
  `kd_jabatan` int(10) NOT NULL DEFAULT '0',
  `jabatan` char(50) DEFAULT NULL,
  PRIMARY KEY (`kd_jabatan`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `jabatan`
--

INSERT INTO `jabatan` (`kd_jabatan`, `jabatan`) VALUES
(1, 'Kepala'),
(2, 'Admin'),
(3, 'Staff Umum'),
(4, 'Staff Lapangan');

-- --------------------------------------------------------

--
-- Table structure for table `kantor`
--

CREATE TABLE IF NOT EXISTS `kantor` (
  `kd_kantor` int(10) NOT NULL DEFAULT '0',
  `nama_kantor` char(50) DEFAULT NULL,
  `alamat_kantor` varchar(99) NOT NULL,
  `tlp_kantor` varchar(15) NOT NULL,
  PRIMARY KEY (`kd_kantor`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `kantor`
--

INSERT INTO `kantor` (`kd_kantor`, `nama_kantor`, `alamat_kantor`, `tlp_kantor`) VALUES
(1, 'PDAM Pusat Gandasari', 'Jl. Raya Bayongbong No. 123', '0262232445'),
(2, 'PDAM Cabang Nusa Indah', 'Jl. Nusa Indah No. 123', '0262222332'),
(3, 'PDAM Cabang Alun Alun Garut', 'Jl. Cimanuk No. 123123', '0262323423'),
(4, 'PDAM Cabang Karangpawitan', 'Jl. Karangpawitan No. 3213', '026232839');

-- --------------------------------------------------------

--
-- Table structure for table `pegawai`
--

CREATE TABLE IF NOT EXISTS `pegawai` (
  `NIP` int(20) NOT NULL DEFAULT '0',
  `nama_pegawai` text,
  `jeniskelamin` tinyint(4) NOT NULL,
  `alamat` varchar(99) NOT NULL,
  `nohp` varchar(20) DEFAULT NULL,
  `kd_jabatan` int(10) DEFAULT NULL,
  `kd_kantor` int(10) DEFAULT NULL,
  PRIMARY KEY (`NIP`),
  KEY `FK_pegjab` (`kd_jabatan`),
  KEY `FK_pegkan` (`kd_kantor`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pegawai`
--

INSERT INTO `pegawai` (`NIP`, `nama_pegawai`, `jeniskelamin`, `alamat`, `nohp`, `kd_jabatan`, `kd_kantor`) VALUES
(1, 'Engkit Satia R', 1, 'Jl Terusan Pembangunan', '08815752875', 1, 1),
(2, 'asd', 0, 'asdasd', '123123123', 3, 2),
(3, 'Dadang', 1, 'asdasd', '08562341', 3, 3),
(4, 'dede', 1, 'asdasd', '01398123764', 4, 4);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `absen`
--
ALTER TABLE `absen`
  ADD CONSTRAINT `FK_abpeg` FOREIGN KEY (`NIP`) REFERENCES `pegawai` (`NIP`) ON DELETE NO ACTION ON UPDATE CASCADE;

--
-- Constraints for table `pegawai`
--
ALTER TABLE `pegawai`
  ADD CONSTRAINT `FK_pegjab` FOREIGN KEY (`kd_jabatan`) REFERENCES `jabatan` (`kd_jabatan`) ON DELETE NO ACTION ON UPDATE CASCADE,
  ADD CONSTRAINT `FK_pegkan` FOREIGN KEY (`kd_kantor`) REFERENCES `kantor` (`kd_kantor`) ON DELETE NO ACTION ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
