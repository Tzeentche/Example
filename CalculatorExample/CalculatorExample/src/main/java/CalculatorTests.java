public class CalculatorTests {

    public void Sum_2Plus5_7Returned()
    {
        // arrange
        var calc = new Calculator();

        // act
        var res = calc.Sum(2,5);

        // assert
        Assert.AreEqual(7, res);
    }
}
