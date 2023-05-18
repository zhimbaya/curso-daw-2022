-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 04-06-2017 a las 02:14:41
-- Versión del servidor: 10.1.16-MariaDB
-- Versión de PHP: 5.6.24

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `destinos`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `destinoturistico`
--

CREATE TABLE `destinoturistico` (
  `codigo` varchar(3) NOT NULL,
  `destino` varchar(20) NOT NULL,
  `pais` varchar(20) NOT NULL,
  `precio` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `destinoturistico`
--

INSERT INTO `destinoturistico` (`codigo`, `destino`, `pais`, `precio`) VALUES
('001', 'Costa del Sol', 'España', 345.9),
('002', 'Sevilla', 'España', 274),
('003', 'Madrid', 'España', 323),
('004', 'Barcelona', 'España', 340.85),
('005', 'Costa Brava', 'España', 290.25),
('006', 'Lanzarote', 'España', 315.8),
('007', 'Mallorca', 'España', 395.45),
('011', 'Roma', 'Italia', 340.25),
('012', 'Florencia', 'Italia', 375),
('013', 'Venecia', 'Italia', 405.65),
('021', 'Marrakech', 'Marruecos', 265),
('022', 'Fez', 'Marruecos', 245),
('023', 'Tanger', 'Marruecos', 195.75);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `destinoturistico`
--
ALTER TABLE `destinoturistico`
  ADD PRIMARY KEY (`codigo`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
