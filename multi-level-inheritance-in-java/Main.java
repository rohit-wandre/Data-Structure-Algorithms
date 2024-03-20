class GrandParent{
    public void show()
    {
        System.out.println("GrandParent");
    }
}

class Parent extends GrandParent{
   
    public void show()
    {
         super.show();
        System.out.println("Parent");
    }
}
class Child extends Parent{
    
    public void show()
    {
        super.show();
        System.out.println("Child");
    }
}

public class MyClass {
    public static void main(String args[]) {
     Child ob=new Child();
     ob.show();
    }
}