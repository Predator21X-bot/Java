package com.app.ecom;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    private java.util.List<User> userList = new ArrayList<>();
    private Long nextId=1L;

    public List<User> fetchAllUsers(){
        return userList;
    }

    public User fetchUsers(Long id){
        for(User user : userList){
            if(user.getId().equals(id)){
                return user;
            }
        }
        return null;
    }

    public java.util.List<User> addUser(User user){
        user.setId(nextId++);
        userList.add(user);
        return userList;
    }
}
