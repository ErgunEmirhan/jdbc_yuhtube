# Creating tables

```sql
CREATE TABLE Schools(
    school_id serial PRIMARY KEY,
    school_name varchar(100),
    address varchar(255),
    phone_number varchar(13),
    established_year int
);
CREATE TABLE Classes(
	class_id serial PRIMARY KEY,
	class_name varchar(50) NOT NULL,
	school_id int NOT NULL,
	teacher_id int
);
CREATE TABLE Students(
	student_id serial PRIMARY KEY,
	first_name varchar(50) NOT NULL,
	last_name varchar(50) NOT NULL,
	birth_date date NOT NULL,
	class_id int NOT NULL,
	enrollment_date bigint DEFAULT EXTRACT(EPOCH FROM now())
);
CREATE TABLE Teachers(
	teacher_id serial PRIMARY KEY,
	first_name varchar(50) NOT NULL,
	last_name varchar(50) NOT NULL,
	hire_date date NOT NULL,
	subject varchar(50) NOT NULL
);
CREATE TABLE Courses(
	course_id serial PRIMARY KEY,
	course_name varchar(100) NOT NULL,
	class_id varchar(50) NOT NULL,
	teacher_id date NOT NULL,
	credit_hours  int NOT NULL
);
```
# Connecting tables

```sql
ALTER TABLE public.classes
    ADD FOREIGN KEY (teacher_id)
    REFERENCES public.teachers (teacher_id)
    ON UPDATE CASCADE
    ON DELETE CASCADE;

ALTER TABLE public.classes
    ADD FOREIGN KEY (school_id)
    REFERENCES public.schools (school_id)
    ON UPDATE CASCADE
    ON DELETE CASCADE;
   
ALTER TABLE public.students
    ADD FOREIGN KEY (class_id)
    REFERENCES public.classes (class_id)
    ON UPDATE CASCADE
    ON DELETE CASCADE;

ALTER TABLE public.students
    ADD FOREIGN KEY (class_id)
    REFERENCES public.classes (class_id)
    ON UPDATE CASCADE
    ON DELETE CASCADE;

ALTER TABLE public.courses
    ADD FOREIGN KEY (teacher_id)
    REFERENCES public.teachers (teacher_id)
    ON UPDATE CASCADE
    ON DELETE CASCADE;

ALTER TABLE public.courses
    ADD FOREIGN KEY (class_id)
    REFERENCES public.classes (class_id)
    ON UPDATE CASCADE
    ON DELETE CASCADE;
```
# Inserting data

```sql
INSERT INTO Schools (school_name, address, phone_number, established_year)
VALUES
('Ankara Lisesi', 'Çankaya, Ankara', '0312-123-4567', 1960),
('İzmir Anadolu Lisesi', 'Konak, İzmir', '0232-234-5678', 1975),
('İstanbul Fen Lisesi', 'Kadıköy, İstanbul', '0216-345-6789', 1985),
('Bursa Işık Lisesi', 'Osmangazi, Bursa', '0224-456-7890', 1990),
('Antalya Koleji', 'Muratpaşa, Antalya', '0242-789-0123', 2000);


 
INSERT INTO Classes (class_name, school_id, teacher_id)
VALUES
('1-A', 6, 6),
('2-B', 2, 2),
('3-C', 3, 3),
('4-D', 4, 4),
('5-E', 5, 5),
('6-F', 6, 2),
('7-G', 2, 3),
('8-H', 3, 4),
('9-I', 4, 5),
('10-J', 5, 6);

INSERT INTO Students (first_name, last_name, birth_date, class_id)
VALUES
('Ahmet', 'Yılmaz', '2010-05-15', 6),
('Ayşe', 'Kaya', '2011-09-23', 2),
('Mehmet', 'Demir', '2009-12-12', 3),
('Fatma', 'Çelik', '2008-03-10', 4),
('Emre', 'Şahin', '2007-06-05', 5),
('Elif', 'Güneş', '2010-08-18', 6),
('Mustafa', 'Taş', '2011-01-25', 7),
('Zeynep', 'Aslan', '2009-11-11', 8),
('Ali', 'Yıldırım', '2008-04-02', 9),
('Cem', 'Koç', '2007-07-19', 10);


 
INSERT INTO Teachers (first_name, last_name, hire_date, subject)
VALUES
('Ali', 'Vural', '2005-09-01', 'Matematik'),
('Fatma', 'Korkmaz', '2010-08-15', 'Fizik'),
('Emre', 'Şahin', '2012-11-20', 'Kimya'),
('Ayşe', 'Aydın', '2008-03-05', 'Biyoloji'),
('Mehmet', 'Arslan', '2015-02-28', 'Tarih');
 
INSERT INTO Courses (course_name, class_id, teacher_id, credit_hours)
VALUES
('Matematik 101', 6, 6, 5),
('Fizik 201', 2, 2, 4),
('Kimya 301', 3, 3, 3),
('Biyoloji 401', 4, 4, 2),
('Tarih 501', 5, 5, 3),
('Matematik 102', 6, 6, 5),
('Fizik 202', 7, 2, 4),
('Kimya 302', 8, 3, 3),
('Biyoloji 402', 9, 4, 2),
('Tarih 502', 10, 5, 3);
```