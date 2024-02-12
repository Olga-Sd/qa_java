import com.example.Animal;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

// В данном классе находятся тесты для класса Animal,
// тестируется работа исключения метода getFood и метод getFamily
// работа метода getFood тестируется в классе AnimalTestsParametrized

public class AnimalTests {
    Animal animal;


    @Before
    public void init(){
        animal = new Animal();
    }

    @Test
    public void testExceptionGetFood() throws Exception{
        String animalKind = "Неизвестное";
        String expectedText = "Неизвестный вид животного, используйте значение Травоядное или Хищник";
        Exception exception = assertThrows(Exception.class, () -> animal.getFood(animalKind) );
        assertEquals(expectedText,exception.getMessage());
    }

    @Test
    public void testGetFamily(){
        String expectedText = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        assertEquals(expectedText, animal.getFamily());

    }
}
