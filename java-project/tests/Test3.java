
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Test3 {
@Test void t3(){
Animal a=new Animal(50);
a.move();
assertTrue(a.getEnergy()<=50);
}
}
