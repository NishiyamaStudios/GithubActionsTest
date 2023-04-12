package com.example.GithubTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = SpringBootTest.class)
class ValidatorTests {

    @Test
    @DisplayName("Should return false when string does not start with zero")
    void shouldReturnFalseWhenStringDoesNotStartWithZero() {
        // given
        String phoneNumber = "A73999999";

        // when
        boolean result = Validator.isPhoneNumberValid(phoneNumber);

        // then
        Assertions.assertFalse(result);
    }

    @Test
    @DisplayName("Should return false when string starts with zero but is less than siz characters long")
    void shouldReturnFalseWhenStringStartsWithZeroButLessThanSixCharacterLong() {
        // given
        String phoneNumber = "01234";

        // when
        boolean result = Validator.isPhoneNumberValid(phoneNumber);

        // then
        Assertions.assertFalse(result);
    }

    @Test
    @DisplayName("Should return false when string starts with zero but is more than 10 characters long")
    void shouldReturnFalseWhenStringStartsWithZeroButMoreThanTenCharacterLong() {
        // given
        String phoneNumber = "01234567891";

        // when
        boolean result = Validator.isPhoneNumberValid(phoneNumber);

        // then
        Assertions.assertFalse(result);
    }

    @Test
    @DisplayName("Should return true when string starts with zero and contains a total of six numerical characters")
    void shouldReturnTrueWhenStringStartsWithZeroAndContainsSixNumericalCharacters() {
        // given
        String phoneNumber = "012345";

        // when
        boolean result = Validator.isPhoneNumberValid(phoneNumber);

        // then
        Assertions.assertTrue(result);
    }

    @Test
    @DisplayName("Should return true when string starts with zero and contains a total of seven numerical characters")
    void shouldReturnTrueWhenStringStartsWithZeroAndContainsSevenNumericalCharacters() {
        // given
        String phoneNumber = "0123456";

        // when
        boolean result = Validator.isPhoneNumberValid(phoneNumber);

        // then
        Assertions.assertTrue(result);
    }

    @Test
    @DisplayName("Should return true when string starts with zero and contains a total of eight numerical characters")
    void shouldReturnTrueWhenStringStartsWithZeroAndContainsEightNumericalCharacters() {
        // given
        String phoneNumber = "01234567";

        // when
        boolean result = Validator.isPhoneNumberValid(phoneNumber);

        // then
        Assertions.assertTrue(result);
    }

    @Test
    @DisplayName("Should return true when string starts with zero and contains a total of nine numerical characters")
    void shouldReturnTrueWhenStringStartsWithZeroAndContainsNineNumericalCharacters() {
        // given
        String phoneNumber = "012345689";

        // when
        boolean result = Validator.isPhoneNumberValid(phoneNumber);

        // then
        Assertions.assertTrue(result);
    }

    @Test
    @DisplayName("Should return true when string starts with zero and contains a total of ten numerical characters")
    void shouldReturnTrueWhenStringStartsWithZeroAndContainsTenNumericalCharacters() {
        // given
        String phoneNumber = "0123456891";

        // when
        boolean result = Validator.isPhoneNumberValid(phoneNumber);

        // then
        Assertions.assertTrue(result);
    }

    @Test
    @DisplayName("Should return false when string is six characters, start with zero but contains a non numerical character")
    void shouldReturnFalseWhenStringIsSixCharactersAndStartWithZeroButContainNonNumericalCharacter() {
        // given
        String phoneNumber = "01234A";

        // when
        boolean result = Validator.isPhoneNumberValid(phoneNumber);

        // then
        Assertions.assertFalse(result);
    }

    @Test
    @DisplayName("Should return false when string is seven characters, start with zero but contains a non numerical character")
    void shouldReturnFalseWhenStringIsSevenCharactersAndStartWithZeroButContainNonNumericalCharacter() {
        // given
        String phoneNumber = "012345A";

        // when
        boolean result = Validator.isPhoneNumberValid(phoneNumber);

        // then
        Assertions.assertFalse(result);
    }

    @Test
    @DisplayName("Should return false when string is eight characters, start with zero but contains a non numerical character")
    void shouldReturnFalseWhenStringIsEightCharactersAndStartWithZeroButContainNonNumericalCharacter() {
        // given
        String phoneNumber = "0123456A";

        // when
        boolean result = Validator.isPhoneNumberValid(phoneNumber);

        // then
        Assertions.assertFalse(result);
    }

    @Test
    @DisplayName("Should return false when string is nine characters, start with zero but contains a non numerical character")
    void shouldReturnFalseWhenStringIsNineCharactersAndStartWithZeroButContainNonNumericalCharacter() {
        // given
        String phoneNumber = "01234567A";

        // when
        boolean result = Validator.isPhoneNumberValid(phoneNumber);

        // then
        Assertions.assertFalse(result);
    }

    @Test
    @DisplayName("Should return false when string is ten characters, start with zero but contains a non numerical character")
    void shouldReturnFalseWhenStringIsTenCharactersAndStartWithZeroButContainNonNumericalCharacter() {
        // given
        String phoneNumber = "01234567A9";

        // when
        boolean result = Validator.isPhoneNumberValid(phoneNumber);

        // then
        Assertions.assertFalse(result);
    }

}


