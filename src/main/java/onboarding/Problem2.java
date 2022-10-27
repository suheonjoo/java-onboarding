package onboarding;

public class Problem2 {
    public static String solution(String cryptogram) {
        StringBuilder cryptogramStringBuilder = new StringBuilder(cryptogram);

        while (true) {
            int length = cryptogramStringBuilder.length();
            checkConsecutiveString(cryptogramStringBuilder);
            if (length == cryptogramStringBuilder.length()) {
                break;
            }
        }

        return cryptogramStringBuilder.toString();
    }

    private static void checkConsecutiveString(StringBuilder stringBuilder) {
        for (int i = 0; i < stringBuilder.length() - 1; i++) {
            if (stringBuilder.charAt(i) == stringBuilder.charAt(i + 1)) {
                stringBuilder.delete(i, i + 2);
                break;
            }
        }
    }

}
