package org.hibernate5.annotations.common.test.reflection.java.generics.deep;

public class Dummy {
    protected Long id;

    private String name;


    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
