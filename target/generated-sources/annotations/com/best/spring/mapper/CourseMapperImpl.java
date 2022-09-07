package com.best.spring.mapper;

import com.best.spring.domain.Course;
import com.best.spring.dto.CourseDTO;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-09-06T22:24:58+0100",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 18.0.2 (Homebrew)"
)
@Component
public class CourseMapperImpl implements CourseMapper {

    @Override
    public Course toCourse(CourseDTO courseDTO) {
        if ( courseDTO == null ) {
            return null;
        }

        Course course = new Course();

        course.setId( courseDTO.getId() );
        course.setName( courseDTO.getName() );
        course.setCode( courseDTO.getCode() );

        return course;
    }

    @Override
    public CourseDTO fromCourse(Course course) {
        if ( course == null ) {
            return null;
        }

        CourseDTO courseDTO = new CourseDTO();

        courseDTO.setId( course.getId() );
        courseDTO.setName( course.getName() );
        courseDTO.setCode( course.getCode() );

        return courseDTO;
    }
}
