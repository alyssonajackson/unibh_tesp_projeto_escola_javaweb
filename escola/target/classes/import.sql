-- You can use this file to load seed data into the database using SQL statements
insert into Member (id, name, email, phone_number) values (0, 'John Smith', 'john.smith@mailinator.com', '2125551212')

INSERT INTO TB_PESSOA (nome,cpf) VALUES ("Betty","015.568.541-32");
INSERT INTO TB_PESSOA (nome,cpf) VALUES ("Clair","015.568.541-32");
INSERT INTO TB_PESSOA (nome,cpf) VALUES ("Daphne","015.568.641-32");
INSERT INTO TB_PESSOA (nome,cpf) VALUES ("Glover","015.555.991-32");
 
INSERT INTO TB_PROFESSOR (id,salario) VALUES (1,5000.00);
INSERT INTO TB_PROFESSOR (id,salario) VALUES (2,4000.00);
 
INSERT INTO TB_ALUNO (id,matricula,data_aniversario) VALUES (3,1133,'1990-01-02');
INSERT INTO TB_ALUNO (id,matricula,data_aniversario) VALUES (4,1134,'1991-03-04');