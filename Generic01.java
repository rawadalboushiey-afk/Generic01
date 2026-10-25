
package generic01;
class GenericBox<T> {
private T item;

public void setItem(T item) {
this.item = item;
}

public T getItem() {
return item;
}

public void displayInfo() {
if (item != null) {
System.out.println("Stored Value: " + item);
System.out.println("Data Type: " + item.getClass().getName());
} else {
System.out.println("The box is currently empty.");
}
}
}


public class Generic01 {

  
    public static void main(String[] args) {

System.out.println("=== Advanced  Generics Demonstration ==\n");

GenericBox<String> courseBox = new GenericBox<>();
courseBox.setItem("java programming-Final project");
courseBox.displayInfo();

System.out.println("-----------------------------------");

GenericBox<Integer> idBox = new GenericBox<>();
idBox.setItem(3169061);
idBox.displayInfo();
}
}       
    

