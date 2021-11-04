package example.AnimalTest;

import com.example.Animal;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AnimalGetViewTest {
    private final String view;
    private final List<String> expected;

    public AnimalGetViewTest(String view, List<String> expected) {
        this.view = view;
        this.expected = expected;
    }

    static List<String> herbivore = List.of("Трава", "Различные растения");
    static List<String> predator = List.of("Животные", "Птицы", "Рыба");

    @Parameterized.Parameters
    public static Object[] getView() {
        return new Object[][]{
                {"Травоядное", herbivore},
                {"Хищник", predator},
        };
    }

    @Test
    public void getFood() throws Exception {
        Animal animal = new Animal();
        assertEquals(expected, animal.getFood(view));
    }
}