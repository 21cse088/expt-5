package demo1;
 
public class demo {
public static void main(String[]args) {
subdemo1 obj=new subdemo1();
real obj1=new real();
obj.display();
obj1.display();
   }
}
class subdemo1 {
int a = 20;
void display() {
    System.out.println("--this is subdemo content--");
   }
}
class real extends subdemo1 {
protected void display() {
System.out.println("The value of a is"+a);
   }
}