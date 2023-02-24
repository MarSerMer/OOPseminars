package org.example;

import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        User user1 = new User("Petr","Petrov",28);
        User user2 = new User("Ivan","Ivanov",12);
        User user3 = new User("Nikolay","Nikolaev", 25);
        User user4  = new User("Savelii","Savichev",33);
        User user5 = new User("Ivan","Ivanov", 22);
        User user6 = new User("Nikolay","Semenov", 43);


        Personal personal = new Personal(List.of(user1,user2,user3,user4,user5,user6));

        for (User u:personal){
            System.out.println(u);
        }
        System.out.println("------");
        System.out.println("Sorting:");
        List<User> users = personal.toList();
        Collections.sort(users);

        for (User u:users){
            System.out.println(u);
        }

        System.out.println("Now working with boss: ");
        User boss = new User("Will","Smith", 49);
        User cto = new User("Walter","Harrison", 29);
        User ceo = new User("Joe","Black",39);
        User manager1 = new User("Antioch", "Peverell", 32);
        User manager2 = new User("Kadm","Peverell",30);
        User manager3 = new User("Ignotus","Peverell",29);

        Personal managers1 = new Personal(List.of(manager1,manager2));
        Personal managers2 = new Personal(List.of(manager3));
        Personal chiefs = new Personal(List.of(cto,ceo));
        boss.setPersonal(chiefs);
        cto.setPersonal(managers1);
        ceo.setPersonal(managers2);
        System.out.println("------");
        System.out.println("Trying to print all people by boss: ");
        Company compBoss = new Company(boss);
        for (User c:compBoss) {
            System.out.println(c);
        }
    }
}