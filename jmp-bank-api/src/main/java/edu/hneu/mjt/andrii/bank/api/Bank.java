package edu.hneu.mjt.andrii.bank.api;

import edu.hneu.mjt.andrii.dto.BankCard;
import edu.hneu.mjt.andrii.dto.BankCardType;
import edu.hneu.mjt.andrii.dto.User;

public interface Bank {
    BankCard createCard(User user, BankCardType type);
}