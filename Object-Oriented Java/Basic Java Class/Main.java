public class Main{
  public static void main(String[] args) {
    Store Obj1 = new Store("lemonade", 42, .99);
    Store Obj2 = new Store("cookies", 12, 3.75);
    
    System.out.println("Our first shop sells " + Obj1.productType + " at " + Obj1.inventoryPrice + " per unit.");
    
    System.out.println("Our second shop has " + Obj2.inventoryCount + " units remaining.");
  }
}
