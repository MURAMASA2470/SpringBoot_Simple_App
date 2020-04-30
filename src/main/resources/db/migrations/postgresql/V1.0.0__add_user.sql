/*
 test db
*/

drop table if exists public.users cascade;
CREATE TABLE users (
  id bigserial NOT NULL,
  name varchar(50) DEFAULT NULL,
  age integer DEFAULT NULL,
  PRIMARY KEY (id)
);


INSERT INTO users(name, age) VALUES('太郎', 22);
INSERT INTO users(name, age) VALUES('花子', 21);
INSERT INTO users(name, age) VALUES('次郎', 20);
INSERT INTO users(name, age) VALUES('夏美', 18);