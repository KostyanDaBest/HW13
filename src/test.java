public class test {
    public static boolean priemnik(String login, String password, String confirmPassword)
            throws WrongLogin, WrongPassword {
        if (login.length() >= 20 || login.contains(" ")) {
            throw new WrongLogin("неверный логин");
        }
        if (password.length() >= 20 || password.contains(" ") || !password.matches(".*\\d.*") || !password.equals(confirmPassword)) {
            throw new WrongPassword("неверный пароль");
        }

        return true;
    }
}
