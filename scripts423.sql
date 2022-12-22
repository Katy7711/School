SELECT student.name, student.age, faculty.color
FROM student
         JOIN faculty ON student.faculty_id = faculty_id;

SELECT student.name, student.age
FROM student
         JOIN avatar ON avatar.student_id = student_id;