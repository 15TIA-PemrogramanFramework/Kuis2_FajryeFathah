-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: 13 Des 2017 pada 16.53
-- Versi Server: 5.7.15-log
-- PHP Version: 5.6.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `kuisfajrye1024`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `identitas_1024`
--

CREATE TABLE `identitas_1024` (
  `id` bigint(20) NOT NULL,
  `alamat` varchar(255) DEFAULT NULL,
  `name` varchar(100) NOT NULL,
  `notelp` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data untuk tabel `identitas_1024`
--

INSERT INTO `identitas_1024` (`id`, `alamat`, `name`, `notelp`) VALUES
(4, 'qwer', 'westy', '1234');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tbl_ipk_1024`
--

CREATE TABLE `tbl_ipk_1024` (
  `id` bigint(20) NOT NULL,
  `dosen` varchar(255) DEFAULT NULL,
  `matkul` varchar(255) DEFAULT NULL,
  `name` varchar(150) NOT NULL,
  `identitas_1024_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data untuk tabel `tbl_ipk_1024`
--

INSERT INTO `tbl_ipk_1024` (`id`, `dosen`, `matkul`, `name`, `identitas_1024_id`) VALUES
(2, 'tyui', 'fghj', 'cxcvbn', 4);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `identitas_1024`
--
ALTER TABLE `identitas_1024`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `UK_jv9ognpto8mqi8hbl9v9ddana` (`name`);

--
-- Indexes for table `tbl_ipk_1024`
--
ALTER TABLE `tbl_ipk_1024`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKq4lcltf213olgnvjt3kjp0yae` (`identitas_1024_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `identitas_1024`
--
ALTER TABLE `identitas_1024`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT for table `tbl_ipk_1024`
--
ALTER TABLE `tbl_ipk_1024`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `tbl_ipk_1024`
--
ALTER TABLE `tbl_ipk_1024`
  ADD CONSTRAINT `FKq4lcltf213olgnvjt3kjp0yae` FOREIGN KEY (`identitas_1024_id`) REFERENCES `identitas_1024` (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
