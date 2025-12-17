package se.yrgo.libraryapp.validators;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;

public class UtilsTest {
    @Disabled
    @ParameterizedTest
    @CsvSource ({"...bRa4v3e mAn came TO DIE@!, brave man came to die", "heLLo -_123therE!!!, hello there"})
    void onlyLetAndSpaTest(String sentence, String expected){
        assertEquals(expected, Utils.onlyLettersAndWhitespace(sentence));
        }
    @Disabled
    @ParameterizedTest
    @CsvSource ({"6055 i5 h3r3, boss is here", "f4110u7, fallout"})
    void unLeetTest(String sentence, String expected){
        assertEquals(expected, Utils.cleanAndUnLeet(sentence));
    }
}