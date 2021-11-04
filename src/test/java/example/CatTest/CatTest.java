package example.CatTest;

import com.example.Cat;
import com.example.Feline;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CatTest {
    private Feline feline;

    @Test
    public void getSound() {
        String actual = "Мяу";
        Cat cat = new Cat(feline);
        assertEquals(actual, cat.getSound());
    }

    @Test(expected = NullPointerException.class)
    public void getFood() throws Exception {
        Cat cat = new Cat(feline);
        cat.getFood();
        }
}