package com.example.usermetadata.Entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="User")
public class UserMetaData {
    @Id
    @GeneratedValue
    private long id;

    private String name;
    private String uniqueId;
    private String email;

    public UserMetaData() {
    }

    public UserMetaData(long id, String name, String uniqueId, String email) {
        this.id = id;
        this.name = name;
        this.uniqueId = uniqueId;
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUniqueId() {
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

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
