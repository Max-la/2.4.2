
INSERT INTO mydb.roles (id, name) VALUES (1,'USER');
INSERT INTO mydb.roles (id, name) VALUES (2,'ADMIN');
insert into mydb.users (lastName, name, password) VALUES ('admin','admin','admin');
INSERT INTO mydb.users_roles (users_id, roles_id) VALUES ( 1, 2 );