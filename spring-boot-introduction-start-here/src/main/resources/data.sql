  INSERT INTO tasks(summary, description, status) VALUES('Spring Boot を学ぶ','TODOアプリを作る', 'DONE');
  INSERT INTO tasks(summary, description, status) VALUES('Spring Security を学ぶ','ログイン機能を作る', 'TODO');

-- password1234
insert into users (username, password, authority) values ('tom', '$2a$10$I221UDmy6YcSe.WqK5ykYOWnqbHsbvofy0Dfypg0VzUBZ3ZciOaVy', 'ADMIN');
insert into users (username, password, authority) values ('bob', '$2a$10$by4t2226JwXH1rFxD/yygeaRTLl6Wi1YfETQSW5/N1LdJMfOw2Qw.', 'USER');

insert into users (username, password, authority) values ('m', '$2a$10$l53zDegScHFjbo5hIfPX0eSk5JRW1MW4hC6HUVviaw8n6UktqUARe', 'ADMIN');

