package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

    @NotBlank(message = "Invalid location. Cannot be blank.")
    @Size(min = 3, max = 50, message = "Invalid location. Must be between 3 and 50 characters.")
    private String location;

    @OneToMany()
    @JoinColumn(name = "employer_id")
    public List<Job> jobs = new ArrayList<>();

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Employer(String location) {
        this.location = location;
    }

    public Employer(){

    }
}
