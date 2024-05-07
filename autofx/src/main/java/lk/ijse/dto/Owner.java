package lk.ijse.dto;

import java.time.LocalDate;

public class Owner {

    private int id;
    private String firstName, lastName;

    private String address;



    public Owner(int id, String firstName, String lastName,  String address) {

        this.id=id;
        this.firstName = firstName;
        this.lastName = lastName;

        this.address = address;

    }



    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }




    @Override
    public String toString() {
        return firstName + ' ' + lastName;
    }
}
