package com.yunusbagriyanik.mongodbaggregationpipelines.dto;

import lombok.Data;

@Data
public class TopVoted {
    private String id;
    private String name;
    private String categoryId;
    private int totalVotes;
}
