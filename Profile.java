
public class Profile{
  private String name;
  private int age;
  private String bio;
  private boolean romantic;
private boolean member;
  //should submit id
  ArrayList<Item> list;

  public void setName(String name){
    this.name = name;
  }

  public void setAge(int age){
    this.age = age;
  }

  public void setBio(String bio){
    this.bio = bio;
  }

  public void addItem(Item i){
    list.add(i);
  }
public boolean setMember(boolean b){
  member = b;
}

public boolean getMember(){
  return member;
}
  
}