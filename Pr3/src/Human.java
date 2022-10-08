public class Human {
    private String name;
    private int age;
    Leg newLeg = new Leg();
    Head newHead = new Head();
    Hand newHand = new Hand();
    public Human()
    {
        newHand.testHand();
        newHead.testHead();
        newLeg.testLeg();
    }
}
