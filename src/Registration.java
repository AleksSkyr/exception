public class Registration {

    private static final String CHARS = "abcdefghijklmnopqrstuywxz_";

    public static boolean regist(String login, String password, String confirmPassword) {

        if (login.length() > 20) {
            throw new WrongLoginException("Логин не должен быть больше 20 символов");
        }
        if (checkAlphavit(login)) {
            throw new WrongLoginException("В строке недопустимые символы");
        }
        if (password.length() > 20) {
            throw new WrongPasswordException("Пароль не должен быть больше 20 символов");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароли не совпадают");
        }

        checkAlphavit(password);

        return true;
    }

    private static boolean checkAlphavit(String str) {
        var lowercase = str.toLowerCase();
        for (int i = 0; i < lowercase.length(); i++) {
            var al = lowercase.charAt(i);
            for (int j = 0; j < CHARS.length(); j++) {
                if (CHARS.charAt(j) == al) {
                    return false;
                }
            }
        }
        return true;
    }
}

