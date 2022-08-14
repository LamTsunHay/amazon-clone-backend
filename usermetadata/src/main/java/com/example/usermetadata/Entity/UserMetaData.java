package com.example.usermetadata.Entity;


import org.hibernate.annotations.Type;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

@Entity(name="User")
public class UserMetaData {
    @Id
    @GeneratedValue
    private long id;

    private String name;
    @Type(type="org.hibernate.type.UUIDCharType")
    private UUID uniqueId;
    private String email;

    public UserMetaData() {
    }

    public UserMetaData(long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public UUID getUniqueId() {
        return uniqueId;
    }

    public String getEmail() {
        return email;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUniqueId(UUID uniqueId) {
        this.uniqueId = uniqueId;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
