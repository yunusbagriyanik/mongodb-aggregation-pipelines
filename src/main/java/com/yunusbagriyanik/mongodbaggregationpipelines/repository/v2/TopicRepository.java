package com.yunusbagriyanik.mongodbaggregationpipelines.repository.v2;

import com.yunusbagriyanik.mongodbaggregationpipelines.dto.TopVoted;
import com.yunusbagriyanik.mongodbaggregationpipelines.model.v2.Topic;
import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TopicRepository extends MongoRepository<Topic, String> {

    @Aggregation(pipeline = {
            "{$lookup: {from: 'votes', localField: '_id', foreignField: 'topicId', as: 'votes'}}",
            "{$unwind: '$votes'}",
            "{$group: {_id: '$_id', name: {$first: '$name'}, totalVotes: {$sum: '$votes.voteValue'}, categoryId: {$first: '$categoryId'}}}",
            "{$sort: {totalVotes: -1}}",
            "{$limit: 1}"
    })
    TopVoted findTopVotedTopic();
}
