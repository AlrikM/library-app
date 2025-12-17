package se.yrgo.libraryapp.validators;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;

public class UtilsTest {

    @ParameterizedTest
    @CsvSource ({"...bRa4v3e mAn came TO DIE@!, brave man came to die", "heLLo -_123therE!!!, hello there"})
    void onlyLetAndSpaTest(String sentence, String expected){
        assertEquals(expected, Utils.onlyLettersAndWhitespace(sentence));
    }

    @ParameterizedTest
    @CsvSource ({"6055 i5 2h3r39, boss is here", "f4110u72, fallout"})
    void unLeetTest(String sentence, String expected){
        assertEquals(expected, Utils.cleanAndUnLeet(sentence));
    }
}