package com.example.SpringFunction.SpringCloudFunction.payload;

public class RequestData {
    private String name;
    private String contact;

    public RequestData() {
    }

    public RequestData(String name, String contact) {
        this.name = name;
        this.contact = contact;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}
