package edu.hneu.mjt.andrii.service.api;

import edu.hneu.mjt.andrii.dto.Subscription;
import edu.hneu.mjt.andrii.dto.User;
import java.util.List;
import java.util.Optional;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public interface Service {
    List<User> getAllUsers();

    default boolean isAdult(User user) {
        return ChronoUnit.YEARS.between(user.getBirthday(), LocalDate.now()) >= 18;
    }

    Optional<Subscription> getSubscription(User user);
}