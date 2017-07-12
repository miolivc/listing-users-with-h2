CREATE TABLE IF NOT EXISTS USUARIO (
	ID SERIAL PRIMARY KEY,
	NAME VARCHAR(30) NOT NULL,
	EMAIL VARCHAR(45) NOT NULL UNIQUE 
);

INSERT INTO USUARIO(NAME, EMAIL) VALUES('João', 'joao@gmail.com');
INSERT INTO USUARIO(NAME, EMAIL) VALUES('Maria', 'maria@gmail.com');
INSERT INTO USUARIO(NAME, EMAIL) VALUES('Lucas', 'lucas@gmail.com');