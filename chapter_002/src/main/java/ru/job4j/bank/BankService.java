package ru.job4j.bank;

import java.util.*;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }


    public void addAccount(String passport, Account account) {
        Optional<User> user = findByPassport(passport);
        if (user.isPresent()) {
            List<Account> userAccount = users.get(user.get());
            if (!userAccount.contains(account)) {
                userAccount.add(account);
            }
        }

    }

    public Optional<User> findByPassport(String passport) {
        return users.keySet().stream()
                .filter(el -> el.getPassport().equals(passport))
                .map(Optional::of)
                .findFirst()
                .orElse(Optional.empty()
                );
    }

    public Optional<Account> findByRequisite(String passport, String requisite) {
        Optional<User> user = findByPassport(passport);
        if (user.isPresent()) {
           return users.get(user.get()).stream().filter(el -> el.getRequisite().equals(requisite)).findFirst();
        }
        return Optional.empty();
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Optional<Account> srcAccount = findByRequisite(srcPassport, srcRequisite);
        Optional<Account> desAccount = findByRequisite(destPassport, destRequisite);
        if (srcAccount.isPresent() && desAccount.isPresent() && srcAccount.get().getBalance() >= amount) {
            srcAccount.get().setBalance(srcAccount.get().getBalance() - amount);
            desAccount.get().setBalance(desAccount.get().getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }
}
