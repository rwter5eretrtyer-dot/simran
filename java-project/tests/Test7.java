
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Test7 {
@Test void t7(){
Animal a=new Animal(50);
a.move();
assertTrue(a.getEnergy()<=50);
}
}
