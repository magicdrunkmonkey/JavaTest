public class PasswordValidator {
    public static boolean validatePassword(String s){
        if (s.length() > 5 ) {
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if( !Character.isLetter(c) ){

                }
            }
            return true;
        }
        return false;
    }
}
