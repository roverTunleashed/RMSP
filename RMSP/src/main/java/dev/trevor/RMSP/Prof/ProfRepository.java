package dev.trevor.RMSP.Prof;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfRepository extends MongoRepository<Prof, ObjectId> {

}
