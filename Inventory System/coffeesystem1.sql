-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 13, 2022 at 08:03 AM
-- Server version: 10.1.21-MariaDB
-- PHP Version: 5.6.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `coffeesystem1`
--

-- --------------------------------------------------------

--
-- Table structure for table `sales1`
--

CREATE TABLE `sales1` (
  `id` int(11) NOT NULL,
  `subtotal` int(11) NOT NULL,
  `pay` int(11) NOT NULL,
  `balance` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `sales1`
--

INSERT INTO `sales1` (`id`, `subtotal`, `pay`, `balance`) VALUES
(1, 800, 1000, 200),
(2, 1250, 1500, 250),
(3, 1900, 2000, 100),
(4, 2800, 3000, 200),
(5, 2800, 1000, -1800),
(6, 200, 100, 0),
(7, 600, 500, 0),
(8, 1000, 1200, 200),
(9, 850, 1000, 150);

-- --------------------------------------------------------

--
-- Table structure for table `sales_product1`
--

CREATE TABLE `sales_product1` (
  `id` int(11) NOT NULL,
  `sales_id` int(11) NOT NULL,
  `product_name` varchar(255) NOT NULL,
  `price` int(11) NOT NULL,
  `qty` int(11) NOT NULL,
  `total` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `sales_product1`
--

INSERT INTO `sales_product1` (`id`, `sales_id`, `product_name`, `price`, `qty`, `total`) VALUES
(1, 1, 'Caramel', 200, 1, 200),
(2, 1, 'Butterscotch', 300, 2, 600),
(3, 2, 'Caramel', 200, 1, 200),
(4, 2, 'Butterscotch', 300, 2, 600),
(5, 2, 'Kona', 450, 1, 450),
(6, 3, 'Caramel', 200, 1, 200),
(7, 3, 'Butterscotch', 300, 1, 300),
(8, 3, 'Pumpkin spice', 400, 1, 400),
(9, 3, 'Peppermint', 500, 2, 1000),
(10, 4, 'Caramel', 200, 4, 800),
(11, 4, 'Chocalate', 500, 4, 2000),
(12, 5, 'Caramel', 200, 4, 800),
(13, 5, 'Chocalate', 500, 4, 2000),
(14, 6, 'Caramel', 200, 1, 200),
(15, 7, 'Butterscotch', 300, 2, 600),
(16, 8, 'French Vanila', 500, 1, 500),
(17, 8, 'Chocalate', 500, 1, 500),
(18, 9, 'Kona', 450, 1, 450),
(19, 9, 'Pumpkin spice', 400, 1, 400);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `sales1`
--
ALTER TABLE `sales1`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `sales_product1`
--
ALTER TABLE `sales_product1`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `sales1`
--
ALTER TABLE `sales1`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
--
-- AUTO_INCREMENT for table `sales_product1`
--
ALTER TABLE `sales_product1`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
