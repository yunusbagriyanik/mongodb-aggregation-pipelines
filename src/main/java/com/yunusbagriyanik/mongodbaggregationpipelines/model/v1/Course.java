package com.yunusbagriyanik.mongodbaggregationpipelines.model.v1;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "courses")
@Data
@Builder
public class Course {
    @Id
    private String id;
    private String courseId;
    private String name;
    private String description;
    private Instructor instructor;
    private List<Student> students;
}
