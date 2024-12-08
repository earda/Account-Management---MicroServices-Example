package com.erdem.repository;

import com.erdem.document.UserProfile;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserProfileRepository extends MongoRepository<UserProfile,String> {
}
