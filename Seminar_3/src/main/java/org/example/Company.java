package org.example;

import java.util.*;

public class Company implements Iterable<User>{

    private User user;
    public Company(User user) {
        this.user = user;
    }

    private List<User> getSubUsersDepth(User user){
        List<User> result = new ArrayList<>();
        result.add(user);
        if (!user.getPersonal().iterator().hasNext()){
            return result;
        }
        for (User u:user.getPersonal()) {
            result.addAll(getSubUsersDepth(u));
        }
        return result;
    }
    private List<User> getSubUsersWidth(User user){
        List<User> result = new ArrayList<>();
        Queue<User> queue = new ArrayDeque<>();
        queue.offer(user);
        while(queue.size()>0){
            User userItem = queue.poll();
            result.add(userItem);
            for (User usItem:userItem.getPersonal()) {
                queue.offer(usItem);
            }
        }
        return result;
    }
  /*  @Override
    public Iterator<User> iterator() {
        List<User> users = new ArrayList<>();
        users.add(this.user);
        for (User u:this.user.getPersonal()) {
            users.add(u);
            for (User us:u.getPersonal()) {
                users.add(us);
            }
        }
        return users.iterator();
    }*/
/*  @Override
  public Iterator<User> iterator() {
      //List<User> users = new ArrayList<>();
      //users.add(this.user); добавили в методе getSubUsers
      List<User> users = getSubUsersDepth(this.user);
      return users.iterator();
  }*/
  @Override
  public Iterator<User> iterator() {
      List<User> users = getSubUsersWidth(this.user);
      return users.iterator();
  }
}
