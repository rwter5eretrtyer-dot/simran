
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Test8 {
@Test void t8(){
Animal a=new Animal(50);
a.move();
assertTrue(a.getEnergy()<=50);
}
}
