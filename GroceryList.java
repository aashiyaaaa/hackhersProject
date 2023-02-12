import java.util.ArrayList;

public class GroceryList{
  ArrayList<Item> standardList = new ArrayList<>();
  ArrayList<Item> tempList = new ArrayList<>();


  public GroceryList(){
    
  }

  public void addToStandard(Item i){
    
    standardList.add(returnIndexItem(i));
    
  }
  public void addToToday(Item i){
    tempList.add(returnIndexItem(i));

  }

  public void removeFromStandard(Item i){
    standardList.remove(returnIndexItem(i));
  }

  public void removeFromTemp(Item i){
    tempList.remove(returnIndexItem(i));
  }

  public int returnIndexItem(Item q, ArrayList<Item> a){
    for(int i = 0; i<a.size(); i++){
      if(a[i].equals(q))
        return i;
    }
    return -1;
  }

  
}