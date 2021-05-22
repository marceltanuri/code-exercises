package com.mtanuri.optional;

import java.util.Optional;

public class PhoneBookCrawler {

    private PhoneBook phoneBook;

    public PhoneBookCrawler(PhoneBook phoneBook) {
        this.phoneBook = phoneBook;
    }

    public String findPhoneNumberByNameAndPunishIfNothingFound(String name){
        Optional<String> foundName = phoneBook.findPhoneNumberByName(name);
        if(foundName.isPresent()){
            return foundName.get();
        }

        throw new IllegalArgumentException("No phone number found");
    }

    public String findPhoneNumberByNameAndPrintPhoneBookIfNothingFound(String name){
        return null;
    }

    public String findPhoneNumberByNameOrNameByPhoneNumber(String name, String phoneNumber){
        return null;
    }

    public PhoneBook getPhoneBook(){
        return phoneBook;
    }

}
