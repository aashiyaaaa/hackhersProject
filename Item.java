import java.util.ArrayList;

public class Item{
  private String upc; 
  private String description; 
  private String department;
  private String price;
  private double store_discount;
  private double loyalty_discount;
  private double digital_coupon;

  private ArrayList<String> allItems;


  public Item(String name){
    this.description = name;
  }

  // Item name, Size, Price, Quantity in stock

  // constructor for taking inventory
  public Item(String upc, String description, String department, String price, double store_discount, double loyalty_discount, double digital_coupon
){
    this.upc = upc;
    this.description = description;
    this.department = department;
    this.price = price; 
    this.store_discount = store_discount; 
    this.loyalty_discount = loyalty_discount;
    this.digital_coupon = digital_coupon;

  }
  public Item(){
    
  }

  public String getName(){
    return description;
  }

  public String getStoreDiscount(){
    return store_discount;
  }

    public String getLoyaltyDiscount(){
      return Double.parseDouble(loyalty_discount);
  }

  // adding quantity for the customer
  
}