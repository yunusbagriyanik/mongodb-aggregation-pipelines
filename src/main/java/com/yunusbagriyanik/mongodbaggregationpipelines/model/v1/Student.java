package com.yunusbagriyanik.mongodbaggregationpipelines.model.v1;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
@Builder
public class Student {
    @Id
    private String id;
    private String studentId;
    private String name;
    private String email;
}
