package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }


    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> userAccount = users.get(user);
            if (!userAccount.contains(account)) {
                userAccount.add(account);
            }
        }

    }

    public User findByPassport(String passport) {
        return users.keySet().stream().filter(el -> el.getPassport().equals(passport)).findFirst().orElse(null);
    }

    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        Account account = null;
        if (user != null) {
            account = users.get(user).stream().filter(el -> el.getRequisite().equals(requisite)).findFirst().orElse(null);
        }
        return account;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account srcAccount = findByRequisite(srcPassport, srcRequisite);
        Account desAccount = findByRequisite(destPassport, destRequisite);
        if (srcAccount != null && desAccount != null && srcAccount.getBalance() >= amount) {
            srcAccount.setBalance(srcAccount.getBalance() - amount);
            desAccount.setBalance(desAccount.getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }
}
