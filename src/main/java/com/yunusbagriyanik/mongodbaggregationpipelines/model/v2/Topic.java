package com.yunusbagriyanik.mongodbaggregationpipelines.model.v2;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "topics")
@Builder
public class Topic {
    private String id;
    private String name;
    private String categoryId;
}
