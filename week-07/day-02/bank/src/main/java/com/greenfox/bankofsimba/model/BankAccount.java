package com.greenfox.bankofsimba.model;

public class BankAccount {
    public String name;
    public String balance;
    public String animalType;
    public boolean isKing;
    public boolean isBad;

    public BankAccount(String name, String balance, String animalType,boolean isKing, boolean isBad) {
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
        this.isBad = isBad;
        this.isKing = isKing;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public boolean isKing() {
        return isKing;
    }

    public boolean isBad() {
        return isBad;
    }

    public void setKing(boolean king) {
        isKing = king;
    }

    public void setBad(boolean bad) {
        isBad = bad;
    }
}
