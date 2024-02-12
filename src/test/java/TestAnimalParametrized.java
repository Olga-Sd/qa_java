import com.example.Animal;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;

import java.util.List;

// В данном классе тестируется метод getFood класса Animal
//  с помощью параметризованных тестов
// В классе AnimalTest находятся не параметризованные тесты для класса Animal
@RunWith(Parameterized.class)
public class TestAnimalParametrized {

    private final String animalKind;
    private final List<String> animalFood;

    public TestAnimalParametrized(String animalKind, List<String> animalFood){
        this.animalKind = animalKind;
        this.animalFood = animalFood;
    }

    @Parameterized.Parameters
    public static Object[][] animalClassTestData() {
        return new Object[][]{
                {"Травоядное", List.of("Трава", "Различные растения")},
                {"Хищник", List.of("Животные", "Птицы", "Рыба")}
        };
    }

    @Test
    public void testGetFood() throws  Exception{
        Animal animal = new Animal();
        assertEquals(animalFood, animal.getFood(animalKind));
    }
}

