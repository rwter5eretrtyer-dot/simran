
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Test4 {
@Test void t4(){
Animal a=new Animal(50);
a.move();
assertTrue(a.getEnergy()<=50);
}
}
