
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Functional0 {
@Test void f0(){
Animal a=new Animal(0);
a.move();
assertEquals(0,a.getEnergy());
}
}
