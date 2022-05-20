package com.education;

public class Manager extends User {
    private String position;
    private String responsibilityDistrict;
    private String workPhoneNumber;

    public Manager(String fullName, String email, String roleType, String position) {

        super(fullName, email, roleType);
        this.position=position;
    }

@Override
    public void printUser () {
    super.printUser();
    System.out.print (this);
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getResponsibilityDistrict() {
        return responsibilityDistrict;
    }

    public void setResponsibilityDistrict(String responsibilityDistrict) {
        this.responsibilityDistrict = responsibilityDistrict;
    }

    public String getWorkPhoneNumber() {
        return workPhoneNumber;
    }

    public void setWorkPhoneNumber(String workPhoneNumber) {
        this.workPhoneNumber = workPhoneNumber;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "position='" + position + '\'' +
                ", responsibilityDistrict='" + responsibilityDistrict + '\'' +
                ", workPhoneNumber='" + workPhoneNumber + '\'' +
                '}';
    }
}
