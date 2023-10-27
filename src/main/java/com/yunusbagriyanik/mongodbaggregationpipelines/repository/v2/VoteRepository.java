package com.yunusbagriyanik.mongodbaggregationpipelines.repository.v2;

import com.yunusbagriyanik.mongodbaggregationpipelines.model.v2.Vote;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface VoteRepository extends MongoRepository<Vote, String> {
}
