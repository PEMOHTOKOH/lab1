package edu.hneu.mjt.andrii.dto;

public class BankCard {
    private String number;
    private BankCardType type;
    private User owner;

    public BankCard(String number, BankCardType type, User owner) {
        this.number = number;
        this.type = type;
        this.owner = owner;
    }

    public String getNumber() {
        return number;
    }

    public BankCardType getType() {
        return type;
    }

    public User getOwner() {
        return owner;
    }
}