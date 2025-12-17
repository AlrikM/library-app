package se.yrgo.libraryapp.validators;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;

public class UsernameTest {

    @ParameterizedTest
    @ValueSource(strings = {"Bosse_man78@cool", "@-_-."})
    void correctUsername(String goodName) {
        assertTrue(Username.validate(goodName));
    }

    @ParameterizedTest
    @ValueSource(strings = {"Name with space", "tre", "*?!${"})
    @EmptySource
    void incorrectUsername(String badName) {
        assertFalse(Username.validate(badName));
    }
}