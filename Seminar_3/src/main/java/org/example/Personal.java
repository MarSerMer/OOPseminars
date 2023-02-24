package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Personal implements Iterable<User> {
    List<User> listOfUsers = new ArrayList<>();

    public Personal(List<User> listOfUsers) {
        this.listOfUsers = listOfUsers;
    }
    public Personal(){

    }

    @Override
    public Iterator<User> iterator(){
        return new Iterator<User>() {
            private int count = 0;
            @Override
            public boolean hasNext() {
                return count<listOfUsers.size();
            }
            @Override
            public User next() {
                return listOfUsers.get(count++);
            }
        };
    }

    public List<User> toList(){
        List<User> users = new ArrayList<>();
        for (User u:this) {
            users.add(u);
        }
        return users;
    }

}
