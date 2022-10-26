DROP DATABASE IF EXISTS dnd_characters;
CREATE DATABASE IF NOT EXISTS dnd_characters CHARACTER SET = 'utf8' COLLATE = 'utf8_general_ci';

CREATE TABLE IF NOT EXISTS dnd_characters.dnd_characters (
    `id` INT NOT NULL AUTO_INCREMENT,
    `char_type` VARCHAR(30) NOT NULL,
    `strength` DOUBLE NOT NULL DEFAULT 0,
    `dextery` DOUBLE NOT NULL DEFAULT 0,
    `constitution` DOUBLE NOT NULL DEFAULT 0,
    `intelligence` DOUBLE NOT NULL DEFAULT 0,
    `wisdom` DOUBLE NOT NULL DEFAULT 0,
    `charisma` DOUBLE NOT NULL DEFAULT 0,
    `path` VARCHAR(256) NOT NULL, 
    PRIMARY KEY(id)
);

INSERT INTO dnd_characters.dnd_characters (char_type, strength, dextery, constitution, intelligence, wisdom, charisma, path)
VALUES ('Monk', 12, 15, 14, 10, 13, 8, 'images/monk.jpg'),
('Artificer', 8, 14, 13, 15, 12, 10, 'images/artificer.jpg'),
('Fighter', 15, 10, 15, 10, 12, 9, 'images/fighter.jpg');