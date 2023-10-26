package com.yunusbagriyanik.mongodbaggregationpipelines.model.v1;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
@Builder
public class Instructor {
    @Id
    private String id;
    private String instructorId;
    private String name;
    private String email;
}
