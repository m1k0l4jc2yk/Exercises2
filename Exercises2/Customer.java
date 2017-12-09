
public class Customer {

    public int customerID = 0;
    public String name = "-name required-";
    public String address = "-address required-";
    public String phoneNumber = "-phone required-";
    public String eMail = "-email required-";

    public void setCustomerInfo (int Id, String nm, String addr, String ph){
        customerID = Id;
        name = nm;
        address = addr;
        phoneNumber = ph;
    }
    public void setCustomerInfo (int Id, String nm, String addr, String ph, String Mail){
        customerID = Id;
        name = nm;
        address = addr;
        phoneNumber = ph;
        eMail = Mail;
    }
    public void display(){
        System.out.println("Customer ID: " +customerID);
        System.out.println("Name: " +name);
        System.out.println("Address: " +address);
        System.out.println("Phone Number: " +phoneNumber);
        System.out.println("Email: "+eMail);

    }


}
