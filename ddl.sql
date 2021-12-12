CREATE DATABASE IF NOT EXISTS spring_mvc;

USE spring_mvc;

DROP TABLE IF EXISTS `spring_mvc`.`tbl_student`;

CREATE TABLE `spring_mvc`.`tbl_student` (
  `StuUD` INT (PRIMARY KEY),
  `StuName` VARCHAR(200) NULL,
  `StuEmail` VARCHAR(150) NOT NULL,
  `StuAge` INT (45) NULL,
  `Dept` VARCHAR(50) NULL,
  `Year` DateTime NULL,
 );