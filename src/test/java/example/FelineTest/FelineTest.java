package example.FelineTest;

import com.example.Feline;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTest {

    @Test
    public void eatMeat() throws Exception {
        List<String> actual = List.of("Животные", "Птицы", "Рыба");
        Feline feline = new Feline();
        assertEquals(actual, feline.eatMeat());
    }

    @Test
    public void getFamily() {
        String expected = "Кошачьи";
        Feline feline = new Feline();
        assertEquals(expected, feline.getFamily());
    }

    @Test
    public void getKittens() {
        Feline feline = new Feline();
        int expected = 1;
        assertEquals(expected, feline.getKittens());
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 0})
    public void getKittensEntranceInt(int expected) {
        Feline feline = new Feline();
        feline.getKittens();
        assertEquals(expected, feline.getKittens(expected));
    }
}