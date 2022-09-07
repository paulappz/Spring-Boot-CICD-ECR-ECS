package com.best.spring.mapper;

import com.best.spring.domain.StudentCourseView;
import com.best.spring.dto.StudentCourseViewDTO;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-09-06T22:24:58+0100",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 18.0.2 (Homebrew)"
)
@Component
public class StudentCourseViewMapperImpl implements StudentCourseViewMapper {

    @Override
    public StudentCourseViewDTO toDto(StudentCourseView studentCourseView) {
        if ( studentCourseView == null ) {
            return null;
        }

        StudentCourseViewDTO studentCourseViewDTO = new StudentCourseViewDTO();

        studentCourseViewDTO.setStudentId( studentCourseView.getStudentId() );
        studentCourseViewDTO.setName( studentCourseView.getName() );
        studentCourseViewDTO.setCourseCode( studentCourseView.getCourseCode() );
        studentCourseViewDTO.setCourseName( studentCourseView.getCourseName() );

        return studentCourseViewDTO;
    }
}
