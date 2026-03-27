
using Xunit;
public class Test1 {
[Fact]
public void t(){
Assert.Equal(3,new Calc().Add(1,2));
}
}
