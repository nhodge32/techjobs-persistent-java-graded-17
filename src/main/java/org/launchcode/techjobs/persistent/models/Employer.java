package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

    @OneToMany(mappedBy = "employer")
    @JoinColumn(name = "employer.id")/*not sure about this name*/
    private final List<Job> jobs = new ArrayList<>();

    @NotBlank(message = "There must be a location.")
    @Size(min = 3, max = 50, message = "Location must be between 3 and 50 characters")
    private String location;

    public Employer () {}

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
