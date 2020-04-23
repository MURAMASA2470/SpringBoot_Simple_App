# SpringBoot_Simple_App

SpringBootを使ってシンプルなアプリを作る

## Usage

プロジェクトのルートディレクトリにて以下を実行し， Mysqlにデータをインポートします。

※ [ ]に自分の環境の情報を入れる([ ]も取り除く) 

```
mysqldump -u[USER_NAME] -p -r ./src/main/resources/sql/test.sql [DB_NAME]
```

コピペして直接データを入れたい場合はこちら↓

```sql
-- /src/main/resources/sql/test.sql

CREATE TABLE `users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
);

INSERT INTO users(name, age) VALUES("太郎", 22);
INSERT INTO users(name, age) VALUES("花子", 21);
```

次に`application.properties`にDBへの接続情報を追加

```properties
# /src/main/resources/application.properties

spring.datasource.url=jdbc:mysql://[HOST]:[PORT]/[DB_NAME]?serverTimezone=JST
spring.datasource.username=[USER_NAME]
spring.datasource.password=[PASSWORD]
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
```

あとは実行😄
