-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema paintrackerdb
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `paintrackerdb` ;

-- -----------------------------------------------------
-- Schema paintrackerdb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `paintrackerdb` DEFAULT CHARACTER SET utf8 ;
USE `paintrackerdb` ;

-- -----------------------------------------------------
-- Table `pain`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `pain` ;

CREATE TABLE IF NOT EXISTS `pain` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `pain_location` VARCHAR(100) NOT NULL,
  `intensity` INT(11) NOT NULL,
  `pain_start_date` VARCHAR(10) NOT NULL,
  `pain_end_date` VARCHAR(10) NULL DEFAULT NULL,
  `pain_trigger` VARCHAR(200) NULL DEFAULT NULL,
  `type_of_pain` VARCHAR(200) NULL DEFAULT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

-- -----------------------------------------------------
-- Data for table `pain`
-- -----------------------------------------------------
START TRANSACTION;
USE `paintrackerdb`;
INSERT INTO `pain` (`id`, `pain_location`, `intensity`, `pain_start_date`, `pain_end_date`, `pain_trigger`, `type_of_pain`) VALUES (1, 'back', 3, '2019-03-23', '2019-03-23', 'sitting', 'sharp pain');
INSERT INTO `pain` (`id`, `pain_location`, `intensity`, `pain_start_date`, `pain_end_date`, `pain_trigger`, `type_of_pain`) VALUES (2, 'back', 4, '2019-03-23', '2019-03-24', 'sitting', 'sharp pain');
INSERT INTO `pain` (`id`, `pain_location`, `intensity`, `pain_start_date`, `pain_end_date`, `pain_trigger`, `type_of_pain`) VALUES (3, 'knee', 2, '2019-04-02', '2019-04-05', 'weather', 'dull pain');
INSERT INTO `pain` (`id`, `pain_location`, `intensity`, `pain_start_date`, `pain_end_date`, `pain_trigger`, `type_of_pain`) VALUES (4, 'stomach', 4, '2019-04-07', '2019-04-07', 'food poisining', 'dull pain');
INSERT INTO `pain` (`id`, `pain_location`, `intensity`, `pain_start_date`, `pain_end_date`, `pain_trigger`, `type_of_pain`) VALUES (5, 'head', 3, '2019-06-01', '2019-06-01', 'dehydration', 'sharp pain');

COMMIT;

