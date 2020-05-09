package com.denharyo;

public abstract  class Employs {


    private String lastName;
    private String firstName;
    private Integer KTP;

    public void setLastname(String name){

        lastName = name;
    }

    public String getLastName() {

        return lastName;
    }

    public void setFirstName(String name){

        firstName = name;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setKTP(Integer ktp){

        KTP = ktp;
    }

    public Integer getKTP() {

        return KTP;
    }


}
