package com.best.spring.mapper;

import com.best.spring.dto.CourseDTO;
import com.best.spring.dto.StudentDTO;
import com.best.spring.dto.StudentRequestDto;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-09-06T22:24:58+0100",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 18.0.2 (Homebrew)"
)
@Component
public class StudentRequestMapperImpl implements StudentRequestMapper {

    @Override
    public StudentDTO toStudentDto(StudentRequestDto studentRequestDto) {
        if ( studentRequestDto == null ) {
            return null;
        }

        StudentDTO studentDTO = new StudentDTO();

        studentDTO.setCourse( studentRequestDtoToCourseDTO( studentRequestDto ) );
        studentDTO.setId( studentRequestDto.getId() );
        studentDTO.setName( studentRequestDto.getName() );
        studentDTO.setSemester( studentRequestDto.getSemester() );
        studentDTO.setBatch( studentRequestDto.getBatch() );
        studentDTO.setGroup( studentRequestDto.getGroup() );

        return studentDTO;
    }

    protected CourseDTO studentRequestDtoToCourseDTO(StudentRequestDto studentRequestDto) {
        if ( studentRequestDto == null ) {
            return null;
        }

        CourseDTO courseDTO = new CourseDTO();

        courseDTO.setId( studentRequestDto.getCourseId() );

        return courseDTO;
    }
}
