package ru.job4j.ex;

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User user = null;
        for (User us: users) {
            if (us.getUserName().equals(login)) {
                user = us;
                break;
            }
        }
        if (user == null) {
            throw new UserNotFoundException("User not Found");
        }
        return user;
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (user.getUserName().length() < 3) {
            throw new UserInvalidException("Less than three characters");
        }
        if (!user.isValid()) {
            throw  new UserInvalidException("The user is not valid");
        }
        return  user.isValid();
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Kolya Gorbunkov", false)
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
