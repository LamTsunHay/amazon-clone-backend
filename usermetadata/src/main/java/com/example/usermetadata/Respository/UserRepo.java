package com.example.usermetadata.Respository;

import com.example.usermetadata.Entity.UserMetaData;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface UserRepo extends CrudRepository<UserMetaData, Long> {

    UserMetaData save(UserMetaData userMetaData);

    UserMetaData findAllByUniqueId(UUID uniqueId);
}
