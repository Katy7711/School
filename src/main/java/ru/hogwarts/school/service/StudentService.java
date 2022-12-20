package ru.hogwarts.school.service;

import org.springframework.stereotype.Service;
import ru.hogwarts.school.model.AmountStudents;
import ru.hogwarts.school.model.AverageAgeStudent;
import ru.hogwarts.school.model.LastValues;
import ru.hogwarts.school.model.Student;
import ru.hogwarts.school.repositories.StudentRepository;

import java.util.Collection;
import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    public Student findStudent(Long id) {
        return studentRepository.findById(id).get();
    }

    public Student editStudent(Student student) {
        return studentRepository.save(student);

    }

    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }

    public Collection<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Collection<Student> findByAge(int age) {
        return studentRepository.findByAge(age);
    }

    public Collection<Student> findByAgeBetweenMinMax (int min, int max) {
        return studentRepository.findByAgeBetween(min,max);
    }

    public List<AmountStudents> getAmountStudents () {
        return studentRepository.getAmountStudents();
    }
    public List<AverageAgeStudent> getAverageAgeStudent () {
        return studentRepository.getAverageAgeStudent();
    }

    public List<LastValues> get5LastValues () {
        return studentRepository.get5LastValues();
    }

}

