import com.example.IFelineAnimal;
import com.example.Lion;
import com.example.Feline;
import org.junit.Before;
import org.junit.Test;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

// Тесты для класса Lion
public class LionTests {
    Lion lion;
    IFelineAnimal felineAnimal;

    @Before
    public void init(){
        felineAnimal = new Feline();
    }

// Проверяем по наличию гривы создание мужской, женской особи и ошибку при создании.
    @Test
    public void testCreateMaleLionHasMane() throws Exception {
        String sex = "Самец";
        IFelineAnimal felineAnimal = new Feline();
        lion = new Lion(sex, felineAnimal);
        assertEquals(true, lion.doesHaveMane());

    }

    @Test
    public void testCreateFemaleLionHasNotMale() throws Exception {
        String sex = "Самка";
        IFelineAnimal felineAnimal = new Feline();
        Lion lion = new Lion(sex, felineAnimal);
        assertEquals(false, lion.doesHaveMane());
    }

    @Test
    public void testCreateWrongSexLion() throws Exception {
        String sex = "Неизвестный пол";
        Exception exception = assertThrows(Exception.class, () ->
                {  // IFelineAnimal felineAnimal = new Feline();
                    lion = new Lion(sex, felineAnimal);
                } );
        assertEquals("Используйте допустимые значения пола животного - самец или самка",
                exception.getMessage());
    }
// Проверяем работу функции getKittens()
    @Test
    public void testGetKittens() throws Exception{
        int expectedKittensCount = 1;
        lion = new Lion("Самка", felineAnimal);

        assertEquals(expectedKittensCount, lion.getKittens());

    }
    // Проверяем работу функции getFood()
    @Test
    public void testGetFood() throws Exception {
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        lion = new Lion("Самец", felineAnimal);
        assertEquals(expectedFood, lion.getFood());
    }
}
