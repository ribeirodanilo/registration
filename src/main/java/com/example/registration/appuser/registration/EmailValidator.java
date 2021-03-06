package com.example.registration.appuser.registration;

import org.springframework.stereotype.Service;

import java.util.function.Predicate;
import java.util.regex.Pattern;

@Service
public class EmailValidator implements Predicate<String> {

    @Override
    public boolean test(String email) {
        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        if (email == null)
            return false;
        return pattern.matcher(email).matches();

    }

}
