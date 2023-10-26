package com.yunusbagriyanik.mongodbaggregationpipelines.model.v2;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "categories")
@Builder
public class Category {
    private String id;
    private String name;
}
