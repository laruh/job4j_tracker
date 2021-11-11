package ru.job4j.bank;

import java.util.Objects;

/**
 * Класс описывает модель пользователя банка
 * @author Alina Sharonina
 * @version 1.0
 */
public class User {
    /**
     * Класс содержит поля {@code String passport} и {@code String username},
     * которые описывают паспорт и имя пользователя.
     */
    private String passport;
    private String username;

    public User(String passport, String username) {
        this.passport = passport;
        this.username = username;
    }

    /**
     * Метод возвращает паспорт пользователя.
     * @return passport паспорт пользователя.
     */
    public String getPassport() {
        return passport;
    }

    /**
     * Метод принимает на вход паспорт пользователя и заносит его в модель.
     * @param  passport паспорт пользователя.
     */
    public void setPassport(String passport) {
        this.passport = passport;
    }

    /**
     * Метод возвращает имя пользователя.
     * @return username имя пользователя.
     */
    public String getUsername() {
        return username;
    }

    /**
     * Метод принимает на вход имя пользователя и заносит его в модель.
     * @param  username имя пользователя.
     */
    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(passport, user.passport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passport);
    }
}
