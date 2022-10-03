package com.qarout.conference.model;

import java.util.*;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "REGISTRATION")
public class Registration
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    private String name;

    @JsonManagedReference
    @OneToMany(mappedBy = "registration", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Course> courses = new ArrayList<>();

    public Long getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public List<Course> getCourses()
    {
        return courses;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public void setCourses(List<Course> courses)
    {
        this.courses = courses;
    }
}
