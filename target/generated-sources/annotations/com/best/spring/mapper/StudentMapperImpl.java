package com.best.spring.mapper;

import com.best.spring.domain.Student;
import com.best.spring.dto.StudentDTO;
import javax.annotation.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-09-05T13:40:23+0100",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 18.0.2 (Homebrew)"
)
@Component
public class StudentMapperImpl implements StudentMapper {

    @Autowired
    private CourseMapper courseMapper;

    @Override
    public Student toModel(StudentDTO studentDto) {
        if ( studentDto == null ) {
            return null;
        }

        Student student = new Student();

        student.setSemester( studentDto.getSemester() );
        student.setId( studentDto.getId() );
        student.setName( studentDto.getName() );
        student.setBatch( studentDto.getBatch() );
        student.setGroup( studentDto.getGroup() );
        student.setCourse( courseMapper.toCourse( studentDto.getCourse() ) );

        return student;
    }

    @Override
    public StudentDTO toDto(Student student) {
        if ( student == null ) {
            return null;
        }

        StudentDTO studentDTO = new StudentDTO();

        studentDTO.setId( student.getId() );
        studentDTO.setName( student.getName() );
        studentDTO.setSemester( student.getSemester() );
        studentDTO.setYear( student.getYear() );
        studentDTO.setBatch( student.getBatch() );
        studentDTO.setGroup( student.getGroup() );
        studentDTO.setCourse( courseMapper.fromCourse( student.getCourse() ) );

        return studentDTO;
    }
}
