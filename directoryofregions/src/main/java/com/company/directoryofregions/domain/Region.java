package com.company.directoryofregions.domain;

import org.springframework.hateoas.RepresentationModel;

public class Region extends RepresentationModel{

    private Long id;
    private String name;
    private String shortName;

    public Region () { super(); }

    public Region(Long id, String name, String shortName) {
        super();
        this.id = id;
        this.name = name;
        this.shortName = shortName;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    @Override
    public String toString() {
        return "Region [id=" + id + ", name=" + name + ", shortName=" + shortName + "]";
    }

}
