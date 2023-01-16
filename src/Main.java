public class Main {
    public static void main(String[] args) {
       LandLine l1 = new LandLine("123456789");
       LandLine l2 = new LandLine("987654321");

       l1.callNumber("123456789");
       l2.receiveCall("987654321");
        System.out.println(l2.answerCall());
    }
}