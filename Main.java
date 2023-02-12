import java.util.*;
import java.awt.*;

class Main {
  public static void main(String[] args) {
    setStores();
    getInventory();
Scanner scan = new Scanner();
    System.out.println("Hi! Enter an item name to check for a discount: ");
      String input = scan.next();
    discountCheck(findItem(input.trim()));
    
    



  }

  public static Item findItem(String i){
    ArrayList<Store> s = setStores();
    for(int i = 0; i <s.size; i++){
      if(s.get(i).getName().equals(i))
        return i;
      return null;
    }
  }
  
    public static Store getStore(){
    Scanner scan = new Scanner();
    //better: enter zip and store name(shop rite, etc) and it gives you a list of
    // stores within a radius
    System.out.println("Enter Store: ");
    int store = scan.nextInt();
    }
    
    public ArrayList<Store> setStores(){
    ArrayList<Store> stores = new ArrayList<>();
    File file = new File("storeDetails.txt");
    Scanner sc = new Scanner(file);
    
    while (sc.hasNextLine()){
    String line = file.nextLine();
    String[] arr = line.split(",");
    
    int number;
    String address;
    String city;
    String state;
    String zip;
    String phone;
    for(int i = 0; i < arr.length; i++){
    String[] a = arr[i].split(":");
    if(a[i].trim().equals("Store"))
    number = Integer.parseInt(a[i+1]);
    else if(a[i].trim().equals("Address"))
    address = (a[i+1]).trim();
    else if(a[i].trim().equals("City"))
    city = (a[i+1].trim());
    else if(a[i].trim().equals("State"))
    state = (a[i+1].trim());
    else if(a[i].trim().equals("Zipcode"))
    zip = (a[i+1].trim());
    else if(a[i].trim().equals("Phone"))
    phone = (a[i+1].trim());
    }
    stores.add(new Store(number, address, city, state, zip, phone));
    }
    return stores;
    
    }
   
  public static ArrayList<Item> getInventory(String file) {
    //last min code is very inelegant :(
    ArrayList<Item> inventory = new ArrayList<>();

    File file = new File("inventory.txt");
    Scanner sc = new Scanner(file);
    sc.next();
    
    while (sc.hasNextLine()){
    String line = file.nextLine();
    String[] arr = line.split(",");
    
     String upc; 
   String description; 
   String department;
   String price;
   double store_discount;
   double loyalty_discount;
   double digital_coupon;
      upc = arr[0];
       description = arr[1];
       price = arr[2];
       store_discount = arr[3]; 
      loyalty_discount = arr[4];
            digital_coupon = arr[5];


    
    inventory.add(new Item(upc, description, department, price, store_discount, loyalty_discount, digital_coupon));
    }
    return inventory;
    System.out.println("This reaches");
  }
  
  
    
    
  public static void discountCheck(ArrayList<Item> item) {
    
    if(!item.store_discount.equals("0.0")){
      print("discount found: ", item.getStoreDiscount());
    }
    else{
      print("no discount found :(");
    }
   
  }


}