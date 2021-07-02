package com.toDel.DAO;

import com.toDel.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public interface UserDao extends JpaRepository<User, Integer> {

}

/*

    private static Map<Integer, User> users;

    static {
        users = new HashMap<Integer, User>(){
            {
                put(1, new User(1, "van", "jade", "Vanjade", "vanjade@mgail.com"));
                put(2, new User(2, "pan", "made", "Panmade", "panmade@mgail.com"));
                put(3, new User(3, "can", "wake", "Canwake", "canwake@mgail.com"));
            }

        };
    }

    public Collection <User> getAllUser(){
        return this.users.values();
    }

    public User getUserById(int id){
        return this.users.get(id);
    }

    public void deleteById(int id){
         this.users.remove(id);
    }

    public void saveUser(User user){
        this.users.put(user.getId(), user);
    }

    public void updateUSer(User user){
        this.users.put(user.getId(), user);
    }
*/


