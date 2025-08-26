package edu.hneu.mjt.andrii.cloud.service.impl;

import edu.hneu.mjt.andrii.service.api.Service;
import edu.hneu.mjt.andrii.dto.Subscription;
import edu.hneu.mjt.andrii.dto.User;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ServiceImpl implements Service {
    @Override
    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        users.add(new User("1", "John Doe", LocalDate.of(2000, 5, 15)));
        return users;
    }

    @Override
    public Optional<Subscription> getSubscription(User user) {
        if (isAdult(user)) {
            return Optional.of(new Subscription("SUB1", user));
        }
        return Optional.empty();
    }
}