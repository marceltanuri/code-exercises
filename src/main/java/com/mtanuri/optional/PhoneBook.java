package com.mtanuri.optional;

import java.util.HashMap;
import java.util.Optional;

public class PhoneBook {

    private static final HashMap<String, String> PHONE_NUMBERS = new HashMap<String, String>() {
        {
            put("Jos de Vos", "016/161616");
            put("An de Toekan", "016/161617");
            put("Kris de Vis", "016/161618");
        }
    };

    private HashMap<String, String> phoneBookEntries = PHONE_NUMBERS;

    public PhoneBook() { }

    public HashMap<String, String> getPhoneBookEntries() {
        return phoneBookEntries;
    }

    public Optional<String> findPhoneNumberByName(String name){

        return PHONE_NUMBERS.entrySet().stream().filter(x->x.getKey().equals(name)).map(x-> x.getValue()).findFirst();


    }

    public Optional<String> findNameByPhoneNumber(String phoneNumber){
        return PHONE_NUMBERS.entrySet().stream().filter(x->x.getValue().equals(phoneNumber)).map(x-> x.getKey()).findFirst();
    }

    @Override
    public String toString() {
        System.out.println("Hello from PhoneBook's toString method");
        return "PhoneBook{" +
                "phoneBookEntries=" + phoneBookEntries +
                '}';
    }
}
