
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Test9 {
@Test void t9(){
Animal a=new Animal(50);
a.move();
assertTrue(a.getEnergy()<=50);
}
}
