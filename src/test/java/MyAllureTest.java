import org.junit.Test;
import ru.yandex.qatools.allure.annotations.Description;
import ru.yandex.qatools.allure.annotations.Title;

import static org.junit.Assert.assertEquals;

public class MyAllureTest {

    @Title("Text check1")
    @Description("Checking the text")
    @Test
    public void test1(){
        String title = "my text";
        assertEquals(title,"my text");
        System.out.println("String is verify");
    }

    @Title("Text check2")
    @Description("Checking the tex2t")
    @Test
    public void test2(){
        String title = "My text";
        assertEquals(title,"my text");
        System.out.println("String is verify");
    }

}