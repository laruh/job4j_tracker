package ru.job4j.bank;

import java.util.Objects;

/**
 * Класс описывает модель банковского счета
 * @author Alina Sharonina
 * @version 1.0
 */
public class Account {
    /**
     * Класс содержит поля {@code String requisite} и {@code double balance},
     * которые описывают реквизит аккаунта и баланс на нем.
     */
    private String requisite;
    private double balance;

    public Account(String requisite, double balance) {
        this.requisite = requisite;
        this.balance = balance;
    }

    /**
     * Метод возвращает реквизит аккаунта.
     * @return requisite реквизит аккаунта.
     */
    public String getRequisite() {
        return requisite;
    }

    /**
     * Метод принимает на вход название реквизита и заносит его в модель.
     * @param  requisite реквизит аккаунта.
     */
    public void setRequisite(String requisite) {
        this.requisite = requisite;
    }

    /**
     * Метод возвращает баланс аккаунта.
     * @return balance баланс аккаунта.
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Метод принимает на вход количество денег и заносит их в модель.
     * @param  balance баланс аккаунта.
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Account account = (Account) o;
        return Objects.equals(requisite, account.requisite);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requisite);
    }
}
