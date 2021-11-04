package example.AnimalTest;

import com.example.Animal;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AnimalGetFamily {
    String expected = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";

    @Test
    public void getFood() throws Exception {
        Animal animal = new Animal();
        assertEquals(expected, animal.getFamily());
    }
}