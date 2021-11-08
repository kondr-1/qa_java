package example.AnimalTest;

import com.example.Animal;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class AnimalExceptionTest {
    private final String notValidView;

    public AnimalExceptionTest(String notValidView) {
        this.notValidView = notValidView;
    }

    @Parameterized.Parameters
    public static Object[] getViewException() {
        return new Object[][]{
                {""},
                {"1"},
                {"а"},
                {null},
        };
    }

    @Test(expected = Exception.class)
    public void getFoodException() throws Exception {
        Animal animal = new Animal();
        animal.getFood(notValidView);
    }
}