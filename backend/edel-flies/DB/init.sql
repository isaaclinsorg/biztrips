-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema edelflies
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `edelflies` ;

-- -----------------------------------------------------
-- Schema edelflies
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `edelflies` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `edelflies` ;

-- -----------------------------------------------------
-- Table `edelflies`.`city`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `edelflies`.`city` (
  `id` INT NOT NULL,
  `full_name` VARCHAR(255) NOT NULL,
  `abbreviation` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `edelflies`.`employee`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `edelflies`.`employee` (
  `id` INT NOT NULL,
  `name` VARCHAR(255) NOT NULL,
  `job_title` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `edelflies`.`flight`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `edelflies`.`flight` (
  `id` INT NOT NULL,
  `number` BIGINT NOT NULL,
  `flight_name` VARCHAR(255) NOT NULL,
  `city_From` INT NOT NULL,
  `city_To` INT NOT NULL,
  `flight_Date` DATETIME NOT NULL,
  `IDFSPlane` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `from_idx` (`city_From` ASC) VISIBLE,
  INDEX `to_idx` (`city_To` ASC) VISIBLE,
  CONSTRAINT `from`
    FOREIGN KEY (`city_From`)
    REFERENCES `edelflies`.`city` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `to`
    FOREIGN KEY (`city_To`)
    REFERENCES `edelflies`.`city` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `edelflies`.`plane`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `edelflies`.`plane` (
  `id` INT NOT NULL,
  `capacity` INT NOT NULL,
  `IDFSCity` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `city_idx` (`IDFSCity` ASC) VISIBLE,
  CONSTRAINT `city`
    FOREIGN KEY (`IDFSCity`)
    REFERENCES `edelflies`.`city` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `edelflies`.`user`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `edelflies`.`user` (
  `id` INT NOT NULL,
  `first_name` VARCHAR(255) NOT NULL,
  `last_name` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `edelflies`.`user_flight`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `edelflies`.`user_flight` (
  `id` INT NOT NULL,
  `IDUser` INT NOT NULL,
  `IDFlight` INT NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE,
  INDEX `IDFSUser_idx` (`IDUser` ASC) VISIBLE,
  INDEX `IDFSFlight_idx` (`IDFlight` ASC) VISIBLE,
  CONSTRAINT `IDFSUser`
    FOREIGN KEY (`IDUser`)
    REFERENCES `edelflies`.`user` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `IDFSFlight`
    FOREIGN KEY (`IDFlight`)
    REFERENCES `edelflies`.`flight` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;


-- Insert data into the 'city' table
INSERT INTO city (id, full_name, abbreviation) VALUES
  (1, 'Zurich', 'ZRH'),
  (2, 'Geneva', 'GVA'),
  (3, 'Munich', 'MUC');

-- Insert data into the 'employee' table
INSERT INTO employee (id, name, job_title) VALUES
  (101, 'John Smith', 'Pilot'),
  (102, 'Mary Johnson', 'Flight Attendant'),
  (103, 'Robert Brown', 'Ground Crew');

-- Insert data into the 'plane' table
INSERT INTO plane (id, capacity, IDFSCity) VALUES
  (301, 150, 1),
  (302, 200, 2),
  (303, 180, 3);

-- Insert data into the 'user' table
INSERT INTO user (id, first_name, last_name) VALUES
  (1001, 'Alice', 'Johnson'),
  (1002, 'Bob', 'Miller'),
  (1003, 'Carol', 'Lee');

-- Insert data into the 'flight' table
INSERT INTO flight (id, number, flight_name, city_From, city_To, flight_Date, IDFSPlane) VALUES
  (201, 12345, 'EF123', 1, 2, '2024-06-28 10:00:00', 301),
  (202, 67890, 'EF678', 2, 1, '2024-06-29 14:30:00', 302);

-- Insert data into the 'user_flight' table
INSERT INTO user_flight (id, IDUser, IDFlight) VALUES
  (5001, 1001, 201),
  (5002, 1002, 202),
  (5003, 1003, 201);

SELECT * FROM flight;
