package com.qarout.conference.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CONF_USERS")
public class User
{
    @Id
    @GeneratedValue
    private long id;
    @Column(name = "FIRST_NAME")
    private String firstname;
    @Column(name = "LAST_NAME")
    private String lastname;
    private int age;

    public long getId()
    {
        return id;
    }

    public String getFirstname()
    {
        return firstname;
    }

    public void setFirstname(String firstName)
    {
        this.firstname = firstName;
    }

    public String getLastname()
    {
        return lastname;
    }

    public void setLastname(String lastName)
    {
        this.lastname = lastName;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public void setId(long id)
    {
        this.id = id;
    }
}
