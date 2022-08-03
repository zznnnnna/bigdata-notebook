import org.junit.Test;

/**
 * @Author z
 * @create 2022/8/3 22:15
 * 需求：
 */
public class TestHello {

    public void testHello(){
        System.out.println("Test hello");
//        assert (1==2);
    }
    @Test
    public void sayHello(){
        System.out.println("Say Hello ");
        assert (1==2);
    }
}
