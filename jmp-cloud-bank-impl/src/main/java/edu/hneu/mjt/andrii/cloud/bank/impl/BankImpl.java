package edu.hneu.mjt.andrii.cloud.bank.impl;

import edu.hneu.mjt.andrii.bank.api.Bank;
import edu.hneu.mjt.andrii.dto.BankCard;
import edu.hneu.mjt.andrii.dto.BankCardType;
import edu.hneu.mjt.andrii.dto.User;

public class BankImpl implements Bank {
    public BankImpl() {
        // Порожній конструктор для ініціалізації
    }

    @Override
    public BankCard createCard(User user, BankCardType type) {
        return new BankCard("1234-5678-9012-3456", type, user);
    }
}