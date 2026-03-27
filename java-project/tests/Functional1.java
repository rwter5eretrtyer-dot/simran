
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Functional1 {
@Test void f1(){
Animal a=new Animal(0);
a.move();
assertEquals(0,a.getEnergy());
}
}
