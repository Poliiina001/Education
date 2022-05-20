package com.education;

public class Card {

    private static int id = 0;
    private long number;
    private String expireDate;
    private int cvv;
    private String cardType;

    public Card (long number, String expireDate, int cvv, String cardType) {
        CardType type = CardType.VISA;
        switch (type) {
            case VISA, MASTERCARD -> this.cardType = cardType;
            default -> throw new IllegalArgumentException();
        }
//        // if (cardType.equals("Visa") || cardType.equals("MasterCard"))
//     else {
//         throw new IllegalArgumentException();
//     }
        this.number = number;
        this.expireDate = expireDate;
        this.cvv = cvv;
        id++;
    }

    @Override
    public String toString() {
        return "Card{" +
                "number=" + number +
                ", expireDate='" + expireDate + '\'' +
                ", cvv=" + cvv +
                ", cardType='" + cardType + '\'' +
                '}';
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public String getCardType() {
        return cardType;
    }
}
