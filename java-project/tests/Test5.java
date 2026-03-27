
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Test5 {
@Test void t5(){
Animal a=new Animal(50);
a.move();
assertTrue(a.getEnergy()<=50);
}
}
