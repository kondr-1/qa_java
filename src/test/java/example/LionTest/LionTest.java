package example.LionTest;

import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline feline;
  
    @Test
    public void isLionHaveMaleSexTrue() throws Exception {
        Lion lion = new Lion("Самец", feline);
        assertTrue(lion.doesHaveMane());
    }

    @Test(expected = Exception.class)
    public void lionSexHaveException() throws Exception {
        Lion lionMale = new Lion("", feline);
        lionMale.doesHaveMane();
    }

    @Test
    public void isLionHaveManeTrue() throws Exception {
        Lion lion = new Lion("Самка", feline);
        assertFalse(lion.doesHaveMane());
    }

    @Test
    public void getLionDoNotHaveKittens() throws Exception {
        Lion lion = new Lion("Самец", feline);
        int expected = 0;
        assertEquals(expected, lion.getKittens());
    }

    @Test
    public void getLionEatMeat() throws Exception {
        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getFood("Хищник")).thenReturn(Arrays.asList("Животные", "Птицы", "Рыба"));
        List<String> expected = Arrays.asList("Животные", "Птицы", "Рыба");
        assertEquals(expected, lion.getFood());
    }
}
