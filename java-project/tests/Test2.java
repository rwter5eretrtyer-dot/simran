
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Test2 {
@Test void t2(){
Animal a=new Animal(50);
a.move();
assertTrue(a.getEnergy()<=50);
}
}
