package com.education;

import java.util.ArrayList;

public class User {
    private static int id = 0;
    private String firstName;
    private String lastName;
    private String fullName;
    private String email;
    private String phoneNumber;
    private Address billingAddress;
    private Address deliveryAddress;
    private ArrayList<Card> cards = new ArrayList<>();
    //  private Role roleType;
    private Role role;
    private String manager;


    public User(String fullName, String email, String roleType) {
        if (RoleType.ADMIN.equals(RoleType.ADMIN)){
        role = new Role(true, true, true, true);}
        else if (RoleType.MainCustomer.equals(RoleType.MainCustomer)){
            role = new Role(true, true, true, false);}
        else if (RoleType.Customer.equals(RoleType.Customer)){
            role = new Role(true, false, true, false);}
        else if (RoleType.Viewer.equals(RoleType.Viewer)){
            role = new Role(true, false, false, false);}
        this.fullName = fullName ;
        this.email = email;
        id++;
    }

    public User (String firstName, String lastName, String email, String roleType) {
        if (roleType.equals("Admin")) {
            role = new Role(true, true, true, true);
        } else if (roleType.equals("Main Customer")) {
            role = new Role(true, true, true, false);
        } else if (roleType.equals("Customer")) {
            role = new Role(true, false, true, false);
        } else if (roleType.equals("Viewer")) {
            role = new Role(true, false, false, false);
        }
        this.firstName = fullName.substring(1, fullName.length());
        this.lastName = lastName;
        this.email = email;
        id++;
    }

    public void printUser() {
        System.out.println("firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' +
                ", fullName='" + fullName + '\'' + ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' + ", billingAddress='" + billingAddress + '\'' +
                ", deliveryAddress='" + deliveryAddress + '\'' + ", role='" + role);
    }

    public void setPhoneNumber(String phoneNumber) {
        boolean a = phoneNumber.startsWith("+");
        if (a == true) {
            this.phoneNumber = phoneNumber;
        } else
            System.out.println("Error, please, fill in your phone number starting with +");
    }

    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }

    public void setDeliveryAddress(Address deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public void setCards(Card cards) {
        this.cards.add(cards);
    }

    public String getFirstName() {
        return fullName.substring(1, fullName.length());
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return (firstName + " " + lastName);
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }


    public Address getBillingAddress() {
        return billingAddress;
    }

    public Address getDeliveryAddress() {
        return deliveryAddress;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public Role getRole() {
        return role;
    }

    public String getManager() {
        return manager;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", billingAddress='" + billingAddress + '\'' +
                ", deliveryAddress='" + deliveryAddress + '\'' +
                ", cards=" + cards +
                ", role='" + role + '\'' +
                ", manager='" + manager + '\'' +
                '}';
    }
}