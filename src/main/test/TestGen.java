import impl.GenImpl;
import intel.Gen;
import org.junit.Test;

public class TestGen {

    @Test
    public void test1(){
        Gen<Integer> num1 = new GenImpl<Integer>();
        Integer num = num1.getObj(23);
        System.out.println(num);

        Gen<String> stringGen = new GenImpl<String>();
        String name = stringGen.getObj("Linda");
        System.out.println(name);
    }
}
