package com.example.usermetadata.Respository;

import com.example.usermetadata.Entity.UserMetaData;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<UserMetaData, Long> {

    UserMetaData save(UserMetaData userMetaData);

    UserMetaData findAllByUniqueId(String uniqueId);
}
