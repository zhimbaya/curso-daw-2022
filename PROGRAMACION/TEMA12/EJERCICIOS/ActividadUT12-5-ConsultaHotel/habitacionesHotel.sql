SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


--
-- Base de datos: `hotel`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `habitaciones`
--

CREATE TABLE `habitaciones` (
  `numero` int(11) NOT NULL,
  `precio` float NOT NULL,
  `capacidadPersonas` int(11) NOT NULL,
  `ocupada` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indices de la tabla `habitaciones`
--
ALTER TABLE `habitaciones` ADD PRIMARY KEY (`numero`);


--
-- Volcado de datos para la tabla `habitaciones`
--

INSERT INTO `habitaciones` (`numero`, `precio`, `capacidadPersonas`, `ocupada`) VALUES
(100, 68, 2, 0),
(101, 68, 2, 1),
(102, 79, 2, 0),
(103, 79, 2, 1),
(200, 54, 1, 1),
(201, 54, 1, 1),
(202, 98, 2, 0),
(203, 96, 2, 1),
(300, 96, 3, 0),
(301, 96, 3, 1),
(302, 105, 4, 1),
(303, 105, 4, 0);




