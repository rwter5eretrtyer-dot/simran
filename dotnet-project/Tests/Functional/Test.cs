
using NUnit.Framework;
public class Functional {
[Test]
public void full(){
var c=new Calc();
Assert.AreEqual(5,c.Add(2,3));
}
}
