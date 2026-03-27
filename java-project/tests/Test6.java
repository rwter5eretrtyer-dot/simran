
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Test6 {
@Test void t6(){
Animal a=new Animal(50);
a.move();
assertTrue(a.getEnergy()<=50);
}
}
