
using NUnit.Framework;
public class Test1 {
[Test]
public void t(){
Assert.AreEqual(3,new Calc().Add(1,2));
}
}
