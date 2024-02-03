import com.example.Cat;
import com.example.Feline;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;

import static org.junit.Assert.assertEquals;

// в классе написаны тесты для простого тестирования и
// тестирование с помощью мока так как хотелось опробовать оба способа
@RunWith(MockitoJUnitRunner.class)
public class CatTests {

    @Mock
    Feline mockedFeline;
    Feline feline = new Feline();
    Cat cat;
    Cat catWithMockedFeline;
    @Before
    public void init() {
        MockitoAnnotations.initMocks(Feline.class);
        cat = new Cat(feline);
        catWithMockedFeline = new Cat(mockedFeline);
    }

// Тесты без использования моков
    @Test
    public void testGetSound() {
        String expectedSound = "Мяу";
        assertEquals(expectedSound,cat.getSound());
    }

    @Test
    public void testGetFood() throws Exception {
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expectedFood, cat.getFood());
    }
// Тест с моком.
    @Test
    public void testGetFoodWithMock() throws Exception {
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(mockedFeline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        assertEquals(expectedFood, catWithMockedFeline.getFood());
    }
}
