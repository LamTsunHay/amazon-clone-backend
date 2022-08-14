package com.example.usermetadata.Services;

import com.example.usermetadata.Entity.UserMetaData;
import com.example.usermetadata.Respository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserService {

    @Autowired
    UserRepo userRepo;
    public UserMetaData saveUserMetaDataToDB(UserMetaData metaData){
        metaData.setUniqueId(UUID.randomUUID());
        return userRepo.save(metaData);
    }

    public UserMetaData getUserMetaDataToDB(UUID userId){
        return userRepo.findAllByUniqueId(userId);
    }

}
