package com.utn;

public class Client {

    private String name = null;
    private String phone = null;
    private String address = null;

    public Client () {

    }

    public Client(String name, String phone, String address) {
        this.name = name;
        this.phone = phone;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return
                "Client { " +
                "Name = '"      + name      + '\'' + ", " +
                "Phone = '"     + phone     + '\'' + ", " +
                "Address = '"   + address   + '\'' + " "  +
                '}';
    }

}
