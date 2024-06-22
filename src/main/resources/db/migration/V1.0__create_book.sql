-- Flyway author: Mukul Jha
-- Description: Add book table

CREATE TABLE IF NOT EXISTS `book` (
     id VARCHAR(255) NOT NULL,
     name VARCHAR(255) NOT NULL,
     PRIMARY KEY(id)
);

