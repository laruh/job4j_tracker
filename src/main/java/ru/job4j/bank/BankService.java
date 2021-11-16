package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Класс описывает работу банковского сервиса
 * @author Alina Sharonina
 * @version 1.0
 */
public class BankService {
    /**
     * Хранение пользователей осуществляется в коллекции типа {@code HashMap}
     * Поле содержит всех пользователей системы с привязанными к ним счетами.
     */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод добавляет нового пользователя в систему.
     * @param user пользователь.
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    /**
     * Метод принимает на вход паспорт пользователя, его аккаунт
     * и добавляет новый счет к пользователю.
     * @param  passport паспорт пользователя.
     * @param account аккаунт пользователя.
     */
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null && !users.get(user).contains(account)) {
            users.get(user).add(account);
        }
    }

    /**
     * Метод принимает на вход паспорт пользователя и ищет пользователя по номеру паспорта.
     * @param  passport паспорт пользователя.
     * @return user пользователь.
     */
    public User findByPassport(String passport) {
        return users.keySet()
                .stream()
                .filter(user -> passport.equals(user.getPassport()))
                .findFirst()
                .orElse(null);
    }

    /**
     * Метод принимает на вход паспорт пользователя, его реквизиты
     * и ищет счет пользователя по реквизитам.
     * @param  passport паспорт пользователя.
     * @param requisite аккаунт пользователя
     * @return account аккаунт пользователя.
     */
    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user != null) {
            return users.get(user)
                    .stream()
                    .filter(account -> requisite.equals(account.getRequisite()))
                    .findFirst()
                    .orElse(null);
        }
        return null;
    }

    /**
     * Метод предназначен для перечисления денег с одного счёта на другой счёт.
     * @param  srcPassport паспорт пользователя, со счета которого будет переведена сумма.
     * @param srcRequisite реквизиты пользователя, со счета которого будет переведена сумма.
     * @param destPassport паспорт пользователя, которому будет переведена сумма.
     * @param destRequisite реквизиты пользователя, которому будет переведена сумма.
     * @param amount сумма, которую будут переводить.
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        Account srsAcc = findByRequisite(srcPassport, srcRequisite);
        Account destAcc = findByRequisite(destPassport, destRequisite);
        if (srsAcc != null && srsAcc.getBalance() >= amount && destAcc != null) {
            srsAcc.setBalance(srsAcc.getBalance() - amount);
            destAcc.setBalance(destAcc.getBalance() + amount);
            return true;
        }
        return false;
    }
}
