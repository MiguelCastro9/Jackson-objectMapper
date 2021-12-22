package com.jackson;

/**
 *
 * @author Miguel Castro
 */
public class Person {

    private String name;
    private String email;
    private String profession;
    
    public Person(){
        
    }

    public Person(String name, String email, String profession) {
        this.name = name;
        this.email = email;
        this.profession = profession;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

}
