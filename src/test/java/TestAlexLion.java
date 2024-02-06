import com.example.AlexLion;
import com.example.Feline;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class TestAlexLion {

    AlexLion alex;

    @Mock
    Feline feline = new Feline();

    @Before
    public void init() throws Exception{
        MockitoAnnotations.initMocks(Feline.class);
        alex = new AlexLion(feline);
    }

    @Test
    public void testNewAlexLionIsMale() {
        boolean alexHasMane = true;
        assertEquals(alexHasMane, alex.doesHaveMane());
    }
    @Test
    public void testAlexLionHasNoKittens() {
        int expectedCountOfKittens = 0;
        assertEquals(expectedCountOfKittens, alex.getKittens());
    }
    @Test
    public void testAlexLionGetFriends() {
        List<String> expectedFriends = List.of("Марти","Глория", "Мелман");
        assertEquals(expectedFriends, alex.getFriends());
    }
    @Test
    public void testAlexLionGetPlaceOfLiving() {
        String expectedPlaceOfLiving = "New York Zoo";
        assertEquals(expectedPlaceOfLiving, alex.getPlaceOfLiving());
    }

}
