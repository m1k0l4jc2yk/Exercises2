
public class Order {
  public double totalPrice = 0.0;
  
  public double addShirt (Shirt shirt) {
    totalPrice = totalPrice + shirt.price;
    return totalPrice;
  }
}



