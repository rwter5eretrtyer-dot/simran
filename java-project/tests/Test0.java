
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Test0 {
@Test void t0(){
Animal a=new Animal(50);
a.move();
assertTrue(a.getEnergy()<=50);
}
}
