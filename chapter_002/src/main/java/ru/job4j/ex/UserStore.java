package ru.job4j.ex;

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User user = null;
        for (User us: users) {
            if (us.getUserName().equals(login)) {
                user = us;
            }
        }
        if (user == null) {
            throw new UserNotFoundException("User not Found");
        }
        return user;
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (user.getUserName().length() < 3 || !user.isValid()) {
            throw new UserInvalidException("The user is not valid");
        } else {
            return  user.isValid();
        }
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Kolya Gorbunkov", true)
        };
        try {
            User user = findUser(users, "Kolya Gorbunkov");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException ui) {
            ui.printStackTrace();
        } catch (UserNotFoundException un) {
            un.printStackTrace();
        }
    }
}
