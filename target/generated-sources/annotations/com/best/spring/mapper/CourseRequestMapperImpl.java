package com.best.spring.mapper;

import com.best.spring.dto.CourseDTO;
import com.best.spring.dto.CourseRequestDto;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-09-05T13:40:23+0100",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 18.0.2 (Homebrew)"
)
@Component
public class CourseRequestMapperImpl implements CourseRequestMapper {

    @Override
    public CourseDTO toCourseDto(CourseRequestDto courseRequestDto) {
        if ( courseRequestDto == null ) {
            return null;
        }

        CourseDTO courseDTO = new CourseDTO();

        courseDTO.setId( courseRequestDto.getId() );
        courseDTO.setName( courseRequestDto.getName() );
        courseDTO.setCode( courseRequestDto.getCode() );

        return courseDTO;
    }
}
