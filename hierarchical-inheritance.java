class Parent{
    public void show()
    {
        System.out.println("Parent");
    }
}

class Son extends Parent{
    public void show()
    {
        //super.show();
        System.out.println("Son");
    }
}

class Daughter extends Parent{
    public void show()
    {
        super.show();
        System.out.println("Daughter");
    }
}

public class MyClass {
    public static void main(String args[]) {
     
     Daughter d=new Daughter();
     d.show();
     Son s=new Son();
     s.show();
     
     
    }
}