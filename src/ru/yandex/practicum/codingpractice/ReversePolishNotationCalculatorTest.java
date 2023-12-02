package ru.yandex.practicum.codingpractice;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReversePolishNotationCalculatorTest {

    private static ReversePolishNotationCalculator reversePolishNotationCalculator;

    @BeforeAll
    private static void makeObjectBeforeAll() {
        reversePolishNotationCalculator = new ReversePolishNotationCalculator();
    }

    @Test
    public void shouldCalculateAddition() {
        int actualResult = reversePolishNotationCalculator.calculatePolishNotation("5 4 + ");
        assertEquals(9, actualResult);
    }

    @Test
    public void shouldCalculateSubtraction() {
        int actualResult = reversePolishNotationCalculator.calculatePolishNotation("5 4 - ");
        assertEquals(1, actualResult);
    }

    @Test
    public void shouldCalculateMultiplication() {
        int actualResult = reversePolishNotationCalculator.calculatePolishNotation("5 4 * ");
        assertEquals(20, actualResult);
    }

    @Test
    public void shouldNotBreakIfMeetBlankChar() {

    }

    @Test
    public void shouldCalculateAdditionWithNegativeNumbers() {
        int actualResult = reversePolishNotationCalculator.calculatePolishNotation("-5 -4 + ");
        assertEquals(-9, actualResult);
    }

    @Test
    public void shouldCalculateSubtractionWithNegativeNumbers() {
        int actualResult = reversePolishNotationCalculator.calculatePolishNotation("-5 -4 - ");
        assertEquals(-1, actualResult);
    }

    @Test
    public void shouldCalculateMultiplicationWithNegativeNumbers() {
        int actualResult = reversePolishNotationCalculator.calculatePolishNotation("-5 -4 * ");
        assertEquals(20, actualResult);
    }
}
