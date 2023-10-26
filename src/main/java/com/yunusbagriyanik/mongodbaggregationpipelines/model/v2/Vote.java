package com.yunusbagriyanik.mongodbaggregationpipelines.model.v2;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@Document(collection = "votes")
public class Vote {
    private String id;
    private String userId;
    private String topicId;
    private int voteValue;
}
