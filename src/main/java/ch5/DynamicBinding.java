package ch5;

//動態綁定

    class A{
        public void hello(){
            System.out.println("This message is from class A.");
        }
    }

    class B extends A{
        @Override
        public void hello(){
            System.out.println("This message is from class B.");
        }
    }


public class DynamicBinding {
    public static void main(String[] args) {
        A obj1 = new B();
        A obj2 = new A();

        obj1.hello();
        obj2.hello();
    }
}
