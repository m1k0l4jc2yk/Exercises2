public class CustomerTest {
   
  public static void main (String args[]) {

    Customer c1 = new Customer(),
             c2 = new Customer();
    c1.setCustomerInfo (1,"John", "123 Street", "123-456-789");
    c2.setCustomerInfo (2,"John", "987 Street", "111-444-777", "@mail.com");

    c1.display();
    c2.display();

  } 
}
