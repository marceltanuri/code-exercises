package com.mtanuri.optional.test;

import com.mtanuri.optional.PhoneBook;
import com.mtanuri.optional.PhoneBookCrawler;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class PhoneBookCrawlerExercise2Test {
    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    private PhoneBookCrawler phoneBookCrawler = new PhoneBookCrawler(new PhoneBook());

    @Test
    public void findPhoneNumberByNameAndPunishIfNothingFound() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("No phone number found");

        phoneBookCrawler.findPhoneNumberByNameAndPunishIfNothingFound("Raf de Giraf");
    }
}
