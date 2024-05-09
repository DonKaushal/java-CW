package lk.ijse.dto;

public class Owner {

    private String firstName, lastName;

    private String address;
    private String contact;


    public Owner( String firstName, String lastName, String address,String contact) {


        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.contact = contact;

    }
public String setContact(String text){ this.contact= contact;
    return text;
}

  //  public String getContact(){ return  contact;}
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






    @Override
    public String toString() {
        return firstName + ' ' + lastName;
    }

    public String getContact() {
        String contact = null;
        return contact; }

    public void setId(int newId) {
    }

    public int getId() {
        return 0;
    }

    public Location getPlaceOfResidence() {
        return null;
    }
}

