package com.carportal;

import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class A {
    public static void main(String[] args){
//
        String password = BCrypt.hashpw("testing", BCrypt.gensalt(12));
        System.out.println(password);
    }
}
