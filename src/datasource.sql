#创建数据库表数据
CREATE DATABASE IF NOT EXISTS `db0`;
USE `db0`;
DROP TABLE IF EXISTS `book_0`;
CREATE TABLE `book_0` (
                          `id` INT ( 11 ) NOT NULL,
                          `name` VARCHAR ( 255 ) DEFAULT NULL,
                          `count` INT ( 11 ) DEFAULT NULL,
                          PRIMARY KEY ( `id` )
) ENGINE = INNODB DEFAULT CHARSET = utf8mb4;
DROP TABLE IF EXISTS `book_1`;
CREATE TABLE `book_1` (
                          `id` INT ( 11 ) NOT NULL,
                          `name` VARCHAR ( 255 ) DEFAULT NULL,
                          `count` INT ( 11 ) DEFAULT NULL,
                          PRIMARY KEY ( `id` )
) ENGINE = INNODB DEFAULT CHARSET = utf8mb4;

CREATE DATABASE IF NOT EXISTS `db1`;
USE `db1`;
DROP TABLE IF EXISTS `book_0`;
CREATE TABLE `book_0` (
                          `id` INT ( 11 ) NOT NULL,
                          `name` VARCHAR ( 255 ) DEFAULT NULL,
                          `count` INT ( 11 ) DEFAULT NULL,
                          PRIMARY KEY ( `id` )
) ENGINE = INNODB DEFAULT CHARSET = utf8mb4;
DROP TABLE IF EXISTS `book_1`;
CREATE TABLE `book_1` (
                          `id` INT ( 11 ) NOT NULL,
                          `name` VARCHAR ( 255 ) DEFAULT NULL,
                          `count` INT ( 11 ) DEFAULT NULL,
                          PRIMARY KEY ( `id` )
) ENGINE = INNODB DEFAULT CHARSET = utf8mb4;

CREATE DATABASE IF NOT EXISTS `db2`;
USE `db2`;
DROP TABLE IF EXISTS `book_0`;
CREATE TABLE `book_0` (
                          `id` INT ( 11 ) NOT NULL,
                          `name` VARCHAR ( 255 ) DEFAULT NULL,
                          `count` INT ( 11 ) DEFAULT NULL,
                          PRIMARY KEY ( `id` )
) ENGINE = INNODB DEFAULT CHARSET = utf8mb4;
DROP TABLE IF EXISTS `book_1`;
CREATE TABLE `book_1` (
                          `id` INT ( 11 ) NOT NULL,
                          `name` VARCHAR ( 255 ) DEFAULT NULL,
                          `count` INT ( 11 ) DEFAULT NULL,
                          PRIMARY KEY ( `id` )
) ENGINE = INNODB DEFAULT CHARSET = utf8mb4;