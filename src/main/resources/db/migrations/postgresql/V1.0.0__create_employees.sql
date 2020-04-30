
drop table if exists employees cascade;
CREATE TABLE employees (
  id bigserial NOT NULL,
  name varchar(50) NOT NULL,
  name_kana varchar(100) NOT NULL,
  sex char(1) NOT NULL,
  birthday date NULL,
  tel char(13) NULL,
  mail varchar(50) NULL,
  postal_code char(8) NOT NULL,
  address varchar(100) NOT NULL,
  department_id bigint NULL, -- 後にdepartmentテーブルを追加する
  PRIMARY KEY (id)
);
