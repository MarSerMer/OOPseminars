package org.example;

public class User implements Comparable<User>{
    private String firstName;
    private String lastName;
    private int age;
    private Personal personal = new Personal();

    public Personal getPersonal() {
        return personal;
    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
    }

    public User(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString(){
        return String.format("%s %s, %d years", firstName,lastName,age);
    }

    @Override
    public int compareTo(User o) {
        if(this.firstName.compareTo(o.firstName)==0){
            if(this.lastName.compareTo(o.lastName)==0){
                return this.age-o.age;
            }
            return lastName.compareTo(o.lastName);
        }
        return firstName.compareTo(o.firstName);
    }

}
