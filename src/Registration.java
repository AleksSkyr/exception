public class Registration {

    private static final String CHARS = "ABCDEFGHIGKLMNOPQRSTYUWXZ";

    public static boolean regist(String login, String password, String confirmPassword) {
        checkLogin(login);
        checkAlphavit(login);


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

    private static void checkLogin(String str) {
        if (str.length() > 20) {
            throw new WrongLoginException("Логин не должен быть больше 20 символов");
        }

    }
}

