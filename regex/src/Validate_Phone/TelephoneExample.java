package Validate_Phone;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TelephoneExample {
    private static final String PHONE_REGEX = "^\\(\\d{2}\\)-\\([0-9]{10,}\\)$";

    public TelephoneExample() {
    }
    public boolean validate (String regex){
        Pattern pattern = Pattern.compile(PHONE_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
