package Seminar_08;

public class Program {
    public static void main(String[] args) {
        VendingMachine vendy = new VendingMachine(12);
        vendy.add(new Product("Mars", 45));
        vendy.add(new Product("Snickers", 48));
        vendy.add(new Product("Bounty", 46));
        vendy.add(new Product("Twix", 40));
        vendy.add(new Product("Nuts", 39));

        try{
            System.out.println(vendy.getProductName("Mars"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try{
            System.out.println(vendy.getProductPrice(46));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
            
        System.out.println(vendy);
    }     
}
