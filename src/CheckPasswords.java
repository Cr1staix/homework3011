public class CheckPasswords {
    final Integer MIN_SYMBOLS = 8;
    final Integer MAX_SYMBOLS = 20;
    StringBuilder sb = new StringBuilder();

    /**
     * Метод для проверки паролей на соответствие всем требованиям.
     *
     * @param arr В качестве параметра принимает массив String с паролями.
     * @return Возвращает информацию о соответствии или несоответствии пароля требованиям.
     */
    public String checkPasswords(String[] arr) {
        String message;
        for (String el : arr) {
            boolean isCondition = false;
            if (!isCheckLength(el)) {
                isCondition = true;
                sb.append(el + " - Пароль должен быть не меньше 8 и не больше 20 символов\n");
            }
            if (!isCheckUpperLetter(el)) {
                isCondition = true;
                sb.append(el + " - Пароль должен содержать хотя бы одну заглавную букву\n");
            }
            if (!isCheckLowerLetter(el)) {
                isCondition = true;
                sb.append(el + " - Пароль должен содержать хотя бы одну строчную букву\n");
            }
            if (!isCheckDigit(el)) {
                isCondition = true;
                sb.append(el + " - Пароль должен содержать хотя бы одну цифру\n");
            }
            if (isCheckTrim(el)) {
                isCondition = true;
                sb.append(el + " - Пароль не должен содержать пробелы\n");
            }
            if (!isCondition) {
                sb.append(el + " - Пароль соответствует всем требованиям\n");
            }
        }
        message = sb.toString();
        return message;
    }

    /**
     * Метод проверяет пароль на длину.
     *
     * @param pas В качестве параметра принимает String.
     * @return Возвращает boolean результат проверки.
     */
    public boolean isCheckLength(String pas) {
        for (int length = pas.length(); length > 0; length--) {
            if (pas.length() < MIN_SYMBOLS || pas.length() > MAX_SYMBOLS) {
                return false;
            }
        }
        return true;
    }

    /**
     * Метод проверяет пароль на наличие букв верхнего регистра.
     *
     * @param pas В качестве параметра принимает String.
     * @return Возвращает boolean результат проверки.
     */
    public boolean isCheckUpperLetter(String pas) {
        for (int i = 0; i < pas.length(); i++) {
            if (Character.isUpperCase(pas.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    /**
     * Метод проверяет пароль на наличие букв нижнего регистра.
     *
     * @param pas В качестве параметра принимает String.
     * @return Возвращает boolean результат проверки.
     */
    public boolean isCheckLowerLetter(String pas) {
        for (int i = 0; i < pas.length(); i++) {
            if (Character.isLowerCase(pas.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    /**
     * Метод проверяет пароль на наличие цифры.
     *
     * @param pas В качестве параметра принимает String.
     * @return Возвращает boolean результат проверки.
     */
    public boolean isCheckDigit(String pas) {
        for (int i = 0; i < pas.length(); i++) {
            if (Character.isDigit(pas.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    /**
     * Метод проверяет пароль на наличие пробелов.
     *
     * @param pas В качестве параметра принимает String.
     * @return Возвращает boolean результат проверки.
     */
    public boolean isCheckTrim(String pas) {
        for (int i = 0; i < pas.length(); i++) {
            if (pas.charAt(i) == ' ') {
                return true;
            }
        }
        return false;
    }
}
