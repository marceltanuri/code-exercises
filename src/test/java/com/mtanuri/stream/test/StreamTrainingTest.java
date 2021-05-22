package com.mtanuri.stream.test;

import org.junit.Test;

import java.util.List;

import static com.mtanuri.stream.StreamTraining.*;
import static java.util.Arrays.asList;
import static java.util.Collections.singletonList;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class StreamTrainingTest {

    @Test
    public void testUppercase() {
        System.out.println("Testing if [aaron, frank, william, gilliam] returns [AARON, FRANK, WILLIAM, GILLIAM]");
        assertTrue(mapToUppercase("aaron", "frank", "william", "gilliam")
                .containsAll(asList("AARON", "FRANK", "WILLIAM", "GILLIAM")));

        System.out.println("Testing if [cegeka] returns [CEGEKA]");
        assertTrue(mapToUppercase("cegeka")
                .containsAll(singletonList("CEGEKA")));
    }

    @Test
    public void testLettersCount() {
        System.out.println("Testing if [william, jones, aaron, seppe, frank, gilliam] returns 14");
        assertEquals(getTotalNumberOfLettersOfNamesLongerThanFive("william", "jones", "aaron", "seppe", "frank", "gilliam"), 14);

        System.out.println("Testing if [aaron] returns 0");
        assertEquals(getTotalNumberOfLettersOfNamesLongerThanFive("aaron"), 0);
    }

    @Test
    public void transformShouldFlattenCollection() {
        List<List<String>> collection = asList(asList("Viktor", "Farcic"), asList("John", "Doe", "Third"));
        List<String> expected = asList("Viktor", "Farcic", "John", "Doe", "Third");
        assertThat(transform(collection)).hasSameElementsAs(expected);
    }

}
