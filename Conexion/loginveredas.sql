-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 12-12-2023 a las 04:40:17
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `loginveredas`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `datosresidentes`
--

CREATE TABLE `datosresidentes` (
  `ID` int(11) NOT NULL,
  `Nombre` varchar(20) NOT NULL,
  `Apellidos` varchar(20) NOT NULL,
  `DNI` varchar(20) NOT NULL,
  `Celular` varchar(20) NOT NULL,
  `Direccion` varchar(20) NOT NULL,
  `Referencia` varchar(20) NOT NULL,
  `Genero` varchar(10) NOT NULL,
  `Mantenimiento` varchar(20) NOT NULL,
  `Veredas` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `datosresidentes`
--

INSERT INTO `datosresidentes` (`ID`, `Nombre`, `Apellidos`, `DNI`, `Celular`, `Direccion`, `Referencia`, `Genero`, `Mantenimiento`, `Veredas`) VALUES
(1, 'Marco', 'Perez', '40178652', '956351284', 'CalleLosPinos123', 'Carabayllo', 'Masculino', 'Si', 'No'),
(2, 'Lucia', 'Jiménez', '12345678', '987654321', 'JirónHuascarán456', 'Carabayllo', 'Femenino', 'No', 'No'),
(3, 'Julio', 'Julio', '98765432', '976543210', 'AvenidaPrimavera789', 'Carabayllo', 'Masculino', 'No', 'Si'),
(4, 'Maria', 'Castillo', '87654321', '965432109', 'AvenidaEjército234', 'Carabayllo', 'Femenino', 'Si', 'No'),
(5, 'Carla', 'Vásquez', '34567890', '943210987', 'CalleLaMarina567', 'Carabayllo', 'Masculino', 'Si', 'Si'),
(6, 'Juan', 'Pérez', '56789012', '932109876', 'AvenidaDolores890', 'Carabayllo', 'Femenino', 'No', 'Si'),
(7, 'María', 'Gómez', '89012345', '921098765', 'AvenidaElSol123', 'Carabayllo', 'Masculino', 'Si', 'No'),
(8, 'Carlos', 'Rodríguez', '67890123', '910987654', 'CalleRuinas56', 'Carabayllo', 'Femenino', 'Si', 'No'),
(9, 'Ana', 'López', '45678901', '909876543', 'CalleTriunfo789', 'Carabayllo', 'Masculino', 'No', 'No'),
(10, 'Juan', 'Pérez', '90123456', '987654321', 'AvenidaAmazonas123', 'Carabayllo', 'Femenino', 'Si', 'Si');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `mantenimiento`
--

CREATE TABLE `mantenimiento` (
  `Id` int(11) NOT NULL,
  `Fecha` varchar(15) NOT NULL,
  `N°Proyecto` varchar(15) NOT NULL,
  `Estado` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `mantenimiento`
--

INSERT INTO `mantenimiento` (`Id`, `Fecha`, `N°Proyecto`, `Estado`) VALUES
(1, '23/04/2023', 'PRJ2023-001', 'En tramite'),
(2, '05/09/2022', 'PRJ2022-045', 'Completado'),
(3, '18/06/2023', 'PRJ2024-102', 'En proceso'),
(4, '07/12/2022', 'PRJ2023-078', 'En tramite'),
(5, '03/04/2023', 'PRJ2025-015', 'En tramite'),
(6, '15/08/2023', 'PRJ2022-032', 'En proceso'),
(7, '10/01/2024', 'PRJ2024-090', 'En proceso'),
(8, '22/11/2022', 'PRJ2023-055', 'En tramite'),
(9, '09/06/2023', 'PRJ2025-026', 'En proceso'),
(10, '30/03/2024', 'PRJ2022-012', 'En tramite');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proyectos`
--

CREATE TABLE `proyectos` (
  `ID` int(11) NOT NULL,
  `Nombre` varchar(20) NOT NULL,
  `Apellidos` varchar(20) NOT NULL,
  `Telefono` varchar(15) NOT NULL,
  `Inicio` varchar(15) NOT NULL,
  `Fin` varchar(15) NOT NULL,
  `Estado` varchar(10) NOT NULL,
  `DNI` varchar(8) NOT NULL,
  `Presupuesto` varchar(20) NOT NULL,
  `Genero` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `proyectos`
--

INSERT INTO `proyectos` (`ID`, `Nombre`, `Apellidos`, `Telefono`, `Inicio`, `Fin`, `Estado`, `DNI`, `Presupuesto`, `Genero`) VALUES
(1, 'Sofía', 'Rodríguez', '956351284', ' 23/04/202', '25/11/2024', 'En trami', '48520937', '76,400', 'Femenino'),
(2, 'Martín', 'Pérez', '987654321', '05/09/2022', '15/05/2023', 'Completa', '71836425', '58,900', 'Masculino'),
(3, 'Valentina', 'Gutiérrez', '976543210', '18/06/2023', '22/01/2025', 'En proce', '59281746', '92,300', 'Femenino'),
(4, 'Alejandro', 'Fernández', '965432109', '07/12/2022', '30/08/2024', 'En trami', '37654128', '41,600', 'Masculino'),
(5, 'Camila', 'López', '943210987', '03/04/2023', '10/10/2024', 'En trami', '91368204', '35,200', 'Femenino'),
(6, 'Diego', 'Martínez', '932109876', '15/08/2023', '28/02/2025', 'En proce', '24789513', '110,750', 'Masculino'),
(7, 'Isabella', 'González', '921098765', '10/01/2024', '20/09/2025', 'En proce', '63149028', '83,900', 'Femenino'),
(8, 'Lucas', 'Díaz', '910987654', ' 22/11/202', '05/07/2024', 'En trami', '80562391', '64,300', 'Masculino'),
(9, 'Gabriela', 'Sánchez', '909876543', '09/06/2023', '14/12/2024', 'En proce', '16293745', '50,600', 'Femeninoo'),
(10, 'Nicolás', 'Romero', '987654321', '30/03/2024', '08/11/2025', 'En trami', '53980476', '95,200', 'Masculino');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `residentes`
--

CREATE TABLE `residentes` (
  `ID` int(11) NOT NULL,
  `Nombre` varchar(30) NOT NULL,
  `Apellidos` varchar(30) NOT NULL,
  `Celular` varchar(15) NOT NULL,
  `Direccion` varchar(50) NOT NULL,
  `Referencia` varchar(50) NOT NULL,
  `DNI` varchar(8) NOT NULL,
  `Genero` varchar(10) NOT NULL,
  `Mantenimiento` varchar(5) NOT NULL,
  `Veredas` varchar(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `vecinos`
--

CREATE TABLE `vecinos` (
  `ID` int(11) NOT NULL,
  `nombre` varchar(25) NOT NULL,
  `pass` blob NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `vecinos`
--

INSERT INTO `vecinos` (`ID`, `nombre`, `pass`) VALUES
(2, 'Albert', 0x3132333435363738);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `datosresidentes`
--
ALTER TABLE `datosresidentes`
  ADD PRIMARY KEY (`ID`);

--
-- Indices de la tabla `mantenimiento`
--
ALTER TABLE `mantenimiento`
  ADD PRIMARY KEY (`Id`);

--
-- Indices de la tabla `proyectos`
--
ALTER TABLE `proyectos`
  ADD PRIMARY KEY (`ID`);

--
-- Indices de la tabla `residentes`
--
ALTER TABLE `residentes`
  ADD PRIMARY KEY (`ID`);

--
-- Indices de la tabla `vecinos`
--
ALTER TABLE `vecinos`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `datosresidentes`
--
ALTER TABLE `datosresidentes`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de la tabla `mantenimiento`
--
ALTER TABLE `mantenimiento`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de la tabla `proyectos`
--
ALTER TABLE `proyectos`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de la tabla `residentes`
--
ALTER TABLE `residentes`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `vecinos`
--
ALTER TABLE `vecinos`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
