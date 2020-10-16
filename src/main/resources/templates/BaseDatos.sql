####   PRIMERA  VERSION.  
####      Se debe verificar la compatibilidad con los objetos de Hibernate


CREATE TABLE `democreds`.`clientes` 
( `id_cliente` NUMERIC(19,0) NOT NULL, 
  `n_cliente` VARCHAR(100) NOT NULL , 
  `rfc` VARCHAR(13) NOT NULL , 
PRIMARY KEY (`id_cliente`)) 
ENGINE = InnoDB;

INSERT INTO `clientes` (`id_cliente`,`n_cliente`,`rfc`) VALUES (1,`Bruce Wynne`,`WYBB380510BTM`)
INSERT INTO `clientes` (`id_cliente`,`n_cliente`,`rfc`) VALUES (2,`Hall Jordan`,`JOHN450712GLH`)

CREATE TABLE `democreds`.`creditos` 
( `id_credito` INT NOT NULL ,
  `id_cliente` INT NOT NULL , 

  `tp_credito` VARCHAR(2) NOT NULL,
  `estado` VARCHAR(2) NOT NULL,
  `fch_solc' DATE NOT NULL,
  `fch_inic' DATE NOT NULL,
  `fch_fin' DATE NOT NULL,

  `plazo` INT NOT NULL ,
  `tasa` INT NOT NULL ,
  `monto_solc` NUMERIC(16,2) NOT NULL ,
  `monto_capt` NUMERIC(16,2) NOT NULL ,
  `monto_intrs` NUMERIC(16,2) NOT NULL ,

  `saldo_capt` NUMERIC(16,2) NOT NULL ,
  `saldo_intrs` NUMERIC(16,2) NOT NULL ,
  `saldo_penal` NUMERIC(16,2) NOT NULL ,

PRIMARY KEY (`id_credito`)) 
ENGINE = InnoDB;


CREATE TABLE `democreds`.`cuentas` 
( `id_cuenta` INT NOT NULL ,
`tp_cuenta` VARCHAR(2) NOT NULL ,
`id_cliente` INT NOT NULL ,
`estado` VARCHAR(2) NOT NULL ,
`fch_alta` DATE NOT NULL ,
`Saldo` NUMERIC(16,2) NOT NULL ,
PRIMARY KEY (`id_cuenta`)) 
ENGINE = InnoDB;


CREATE TABLE `democreds`.`movimientos` 
(
`folio` VARCHAR(100) NOT NULL ,
`id_cuenta` INT NOT NULL ,
`id_credito` INT NOT NULL ,
`tp_movimiento` VARCHAR(2) NOT NULL ,
`monto_capt` NUMERIC(16,2) NOT NULL ,
`monto_ints` NUMERIC(16,2) NOT NULL ,
`fch_movimiento` DATE NOT NULL ,
`estado` VARCHAR(2) NOT NULL ,
`id_motivo` VARCHAR(2) NOT NULL ,
PRIMARY KEY (`folio`)) 
ENGINE = InnoDB;


INSERT INTO `movimientos` (`folio`, `id_cuenta`, `id_credito`, `tp_movimiento`, `monto_capt`, `monto_ints`, `fch_movimiento`, `estado`, `id_motivo`) 
VALUES ('1010000002', '1012501235', '0', 'DB', '120000', '12', '2020-10-05', '01', '00');

INSERT INTO `movimientos` (`folio`, `id_cuenta`, `id_credito`, `tp_movimiento`, `monto_capt`, `monto_ints`, `fch_movimiento`, `estado`, `id_motivo`) 
VALUES ('1010000003', '1012501235', '0', 'HB', '12000', '1.2', '2020-10-07', '02', '01');