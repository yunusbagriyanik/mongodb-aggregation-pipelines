package com.yunusbagriyanik.mongodbaggregationpipelines.repository.v2;

import com.yunusbagriyanik.mongodbaggregationpipelines.model.v2.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}
