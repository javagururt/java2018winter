package com.javaguru.lesson9.users;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

class UserMain {

    public static void main(String[] args) {
        User firstUser = new User("Vasya", 25, "Developer");
        User secondUser = new User("Petya", 25, "Junior Developer");

        Map<User, BigDecimal> map = new HashMap<>();

        map.put(firstUser, new BigDecimal("2800"));
        map.put(secondUser, new BigDecimal("1000"));

        User firstUserKey = new User("Vasya", 25, "Developer");
        System.out.println(map.get(firstUserKey));
        System.out.println(map.size());
    }
}
