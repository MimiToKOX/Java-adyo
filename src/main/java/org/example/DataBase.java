package org.example;

import java.util.HashMap;

public class DataBase {
    private HashMap<String, String> logins;

    public DataBase() {
        logins = new HashMap<>();
        logins.put("Mimitokox", "kcadyo");
        logins.put("Ardian", "Adyo123");
        logins.put("Jebac", "babeodpolaka");
    }

    public boolean checkLogin(String username, String password) {
        if (logins.containsKey(username)) {
            String storedPassword = logins.get(username);
            if (storedPassword.equals(password)) {
                return true;
            }
        }
        return false;
    }
}