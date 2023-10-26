package com.yunusbagriyanik.mongodbaggregationpipelines.repository.v1;

import com.yunusbagriyanik.mongodbaggregationpipelines.model.v1.Course;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface CourseRepository extends MongoRepository<Course, String> {
    @Query(value = "{ $where: 'this.students.length > ?0' }")
    List<Course> findCoursesByStudentsSizeGreaterThan(int size);
}
