/*
 test db
*/

CREATE TABLE `users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
);

INSERT INTO users(name, age) VALUES("太郎", 22);
INSERT INTO users(name, age) VALUES("花子", 21);