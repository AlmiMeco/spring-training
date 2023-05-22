package com.cydeo.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourseDTO {

    @JsonIgnore // << Ignores JACKSON/GSON from converting to && from (JSON -> JAVA)
    private Long id;
    private String name;
    private String category;
    private int rating;
    private String description;

}