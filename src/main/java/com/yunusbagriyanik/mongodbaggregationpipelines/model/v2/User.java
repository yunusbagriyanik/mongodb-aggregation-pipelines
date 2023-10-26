package com.yunusbagriyanik.mongodbaggregationpipelines.model.v2;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "users")
@Builder
public class User {
    private String id;
    private String username;
}
