package com.education;

public class UserInform {
    public static void main(String[] args) {
        User user = new User("Polina Holubenko", "polina@gmail.com", "Admin");
        user.setPhoneNumber("380956644333");
        user.setCards(new Card(1234567891011123L, "12/12", 123, "VISA"));

        User user2 = new User("Sergey Holubenko", "sergey@gmail.com", "Admin");
        user2.setPhoneNumber("+380956644333");
        Address address = new Address("Ukraine", "kyiv", "Ushakova", 1, 12345);
        user2.setBillingAddress(address);
        user2.printUser();

        Manager manager = new Manager("Super Man", "manager@gmail.com", "Viewer", "manager");
        manager.setPosition("manager");
        manager.setResponsibilityDistrict("controlling");
        manager.setWorkPhoneNumber("+380964433311");
        //manager.printUser();
        //
    }
}
