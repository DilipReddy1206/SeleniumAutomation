public class Child {
    public void output()
    {
        System.out.println("I am child");
    }

    public static void main(String[] args) {
        Child c=new Child();
        c.output();
        Parent.input();
    }
}
