package edu.hneu.mjt.andrii;

import edu.hneu.mjt.andrii.bank.api.Bank;
import edu.hneu.mjt.andrii.cloud.bank.impl.BankImpl;
import edu.hneu.mjt.andrii.dto.BankCard;
import edu.hneu.mjt.andrii.dto.BankCardType;
import edu.hneu.mjt.andrii.dto.User;
import edu.hneu.mjt.andrii.service.api.Service;
import edu.hneu.mjt.andrii.cloud.service.impl.ServiceImpl;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        User user = new User("1", "John Doe", LocalDate.of(2000, 5, 15));
        Bank bank = new BankImpl();
        Service service = new ServiceImpl();

        BankCard card = bank.createCard(user, BankCardType.DEBIT);
        System.out.println("Created card: " + card.getNumber() + " for " + user.getName());

        boolean isAdult = service.isAdult(user);
        System.out.println(user.getName() + " is adult: " + isAdult);

        service.getSubscription(user).ifPresent(sub ->
                System.out.println("Subscription ID: " + sub.getId())
        );
    }
}