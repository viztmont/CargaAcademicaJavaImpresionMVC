-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 26-08-2020 a las 06:30:54
-- Versión del servidor: 10.4.6-MariaDB
-- Versión de PHP: 7.3.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `tesis`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `aula`
--

CREATE TABLE `aula` (
  `Codigo` varchar(3) NOT NULL,
  `Nombre` varchar(100) NOT NULL,
  `Tamano` varchar(7) NOT NULL,
  `Paridad` varchar(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `carrera`
--

CREATE TABLE `carrera` (
  `Codigo` varchar(6) NOT NULL,
  `Nombre` varchar(50) NOT NULL,
  `Descripcion` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `catedratico`
--

CREATE TABLE `catedratico` (
  `Codigo` varchar(7) NOT NULL,
  `Nombres` varchar(50) NOT NULL,
  `Apellidos` varchar(50) NOT NULL,
  `LibresI` int(2) NOT NULL,
  `LibresII` int(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `materia`
--

CREATE TABLE `materia` (
  `Codigo` varchar(6) NOT NULL,
  `Nombre` varchar(100) NOT NULL,
  `Carrera` varchar(100) NOT NULL,
  `Anio` varchar(7) NOT NULL,
  `Franja` varchar(4) DEFAULT NULL,
  `Grupos` int(3) NOT NULL,
  `Paridad` varchar(2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `materiagrupo`
--

CREATE TABLE `materiagrupo` (
  `Id` int(10) NOT NULL,
  `Codigo` varchar(100) NOT NULL,
  `Grupo` varchar(8) NOT NULL,
  `Asignadas` int(2) DEFAULT NULL,
  `Paridad` varchar(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `parametros`
--

CREATE TABLE `parametros` (
  `Id` int(2) NOT NULL,
  `Nombre` varchar(2) NOT NULL,
  `Descripcion` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `parametros`
--

INSERT INTO `parametros` (`Id`, `Nombre`, `Descripcion`) VALUES
(1, 'I', 'CICLO');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tiempocatedratico`
--

CREATE TABLE `tiempocatedratico` (
  `Id` int(10) NOT NULL,
  `Codigo` varchar(7) NOT NULL,
  `Jornada` varchar(4) NOT NULL,
  `Aula` varchar(10) NOT NULL,
  `Paridad` varchar(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tiempomateria`
--

CREATE TABLE `tiempomateria` (
  `Id` int(10) NOT NULL,
  `Codigo` varchar(100) NOT NULL,
  `Grupo` varchar(6) DEFAULT NULL,
  `Jornada` varchar(5) DEFAULT NULL,
  `Aula` varchar(5) NOT NULL,
  `Paridad` varchar(2) NOT NULL,
  `Carrera` varchar(200) NOT NULL,
  `Anio` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `Id` int(12) NOT NULL,
  `usuario` varchar(200) NOT NULL,
  `contrasena` varchar(200) NOT NULL,
  `Tipo` varchar(7) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`Id`, `usuario`, `contrasena`, `Tipo`) VALUES
(1, '050608442', '050608442', 'root'),
(2, 'uesocc', '1234', 'normal');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `aula`
--
ALTER TABLE `aula`
  ADD PRIMARY KEY (`Codigo`);

--
-- Indices de la tabla `carrera`
--
ALTER TABLE `carrera`
  ADD PRIMARY KEY (`Codigo`);

--
-- Indices de la tabla `catedratico`
--
ALTER TABLE `catedratico`
  ADD PRIMARY KEY (`Codigo`);

--
-- Indices de la tabla `materia`
--
ALTER TABLE `materia`
  ADD PRIMARY KEY (`Codigo`);

--
-- Indices de la tabla `materiagrupo`
--
ALTER TABLE `materiagrupo`
  ADD PRIMARY KEY (`Id`);

--
-- Indices de la tabla `parametros`
--
ALTER TABLE `parametros`
  ADD PRIMARY KEY (`Id`);

--
-- Indices de la tabla `tiempocatedratico`
--
ALTER TABLE `tiempocatedratico`
  ADD PRIMARY KEY (`Id`);

--
-- Indices de la tabla `tiempomateria`
--
ALTER TABLE `tiempomateria`
  ADD PRIMARY KEY (`Id`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`Id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `materiagrupo`
--
ALTER TABLE `materiagrupo`
  MODIFY `Id` int(10) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `tiempocatedratico`
--
ALTER TABLE `tiempocatedratico`
  MODIFY `Id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=122;

--
-- AUTO_INCREMENT de la tabla `tiempomateria`
--
ALTER TABLE `tiempomateria`
  MODIFY `Id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23;

--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `Id` int(12) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
