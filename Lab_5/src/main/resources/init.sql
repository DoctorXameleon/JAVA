CREATE SCHEMA IF NOT EXISTS lab5;
USE lab5;

DROP TABLE IF EXISTS students;
CREATE TABLE students (id INT PRIMARY KEY AUTO_INCREMENT, name VARCHAR(50), lastName VARCHAR(50), fatherName VARCHAR(50), birthday DATE, documentNumber VARCHAR(50));

INSERT INTO students(name, lastName, fatherName, birthday, documentNumber) VALUES ('Максим','Іванов','Олегович','1995-02-10','ZK12345');
INSERT INTO students(name, lastName, fatherName, birthday, documentNumber) VALUES ('Анастасія','Соколова','Володимирівна','1992-07-22','ZK23456');
INSERT INTO students(name, lastName, fatherName, birthday, documentNumber) VALUES ('Олександр','Петренко','Сергійович','1998-11-05','ZK34567');
INSERT INTO students(name, lastName, fatherName, birthday, documentNumber) VALUES ('Юлія','Морозова','Олександрівна','1993-09-15','ZK45678');
INSERT INTO students(name, lastName, fatherName, birthday, documentNumber) VALUES ('Дмитро','Коваленко','Ігорович','1997-07-28','ZK56789');
INSERT INTO students(name, lastName, fatherName, birthday, documentNumber) VALUES ('Олена','Лисенко','Миколаївна','1994-04-03','ZK67890');
INSERT INTO students(name, lastName, fatherName, birthday, documentNumber) VALUES ('Андрій','Шевченко','Іванович','1991-12-12','ZK78901');
INSERT INTO students(name, lastName, fatherName, birthday, documentNumber) VALUES ('Ірина','Козлова','Віталіївна','1996-08-20','ZK89012');
INSERT INTO students(name, lastName, fatherName, birthday, documentNumber) VALUES ('Віталій','Мельник','Петрович','1990-03-07','ZK90123');
INSERT INTO students(name, lastName, fatherName, birthday, documentNumber) VALUES ('Марія','Василенко','Ігорівна','1999-05-18','ZK01234');
INSERT INTO students(name, lastName, fatherName, birthday, documentNumber) VALUES ('Сергій','Жуков','Михайлович','1997-09-29','ZL12345');
INSERT INTO students(name, lastName, fatherName, birthday, documentNumber) VALUES ('Наталія','Грищенко','Анатоліївна','1993-07-08','ZL23456');
INSERT INTO students(name, lastName, fatherName, birthday, documentNumber) VALUES ('Павло','Ковальов','Олександрович','1995-11-17','ZL34567');
INSERT INTO students(name, lastName, fatherName, birthday, documentNumber) VALUES ('Катерина','Литвиненко','Володимирівна','1991-03-24','ZL45678');
INSERT INTO students(name, lastName, fatherName, birthday, documentNumber) VALUES ('Артем','Бондаренко','Сергійович','1998-12-11','ZL56789');
INSERT INTO students(name, lastName, fatherName, birthday, documentNumber) VALUES ('Вікторія','Литвинова','Олегівна','1994-05-02','ZL67890');
INSERT INTO students(name, lastName, fatherName, birthday, documentNumber) VALUES ('Олег','Іваненко','Миколайович','1997-09-14','ZL78901');
INSERT INTO students(name, lastName, fatherName, birthday, documentNumber) VALUES ('Марина','Кравченко','Вікторівна','1992-08-21','ZL89012');
INSERT INTO students(name, lastName, fatherName, birthday, documentNumber) VALUES ('Антон','Олійник','Петрович','1996-03-06','ZL90123');
INSERT INTO students(name, lastName, fatherName, birthday, documentNumber) VALUES ('Юлія','Ігнатенко','Андріївна','1990-05-19','ZL01234');