public class Registration {

    private static final String CHARS = "abcdefghijklmnopqrstuywxz_";

    public static boolean regist(String login, String password, String confirmPassword) {

        if (login.length() > 20) {
            throw new WrongLoginException("Логин не должен быть больше 20 символов");
        }
        checkAlphavit(login);

        if (password.length() > 20) {
            throw new WrongPasswordException("Пароль не должен быть больше 20 символов");
        }
        checkAlphavit(password);

        if (password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароли не совпадают");
        }

        return true;
    }

    private static void checkAlphavit(String str) {
        var lowercase = str.toLowerCase();
        for (int i = 0; i < lowercase.length(); i++) {
            var al = lowercase.charAt(i);
            boolean found = false;
            for (int j = 0; j < CHARS.length(); j++) {
                if (CHARS.charAt(j) == al) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                throw new WrongLoginException("В строке недопустимые символы");
            }

        }
    }
}

