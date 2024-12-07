public class oopsEmployee {
    String name,id;
    int sal;
    public void input(String name,String id,int sal)
    {
       this.name=name;
        this.id=id;
        this.sal=sal;
    }
    public void output()
    {
        System.out.println(name+id+sal);
    }

    public static void main(String[] args) {
        oopsEmployee e1=new oopsEmployee();
        oopsEmployee e2=new oopsEmployee();
        e1.input("123","dilip",234);
        e2.input("456","anil",768);
        e1.output();
        e2.output();
    }
}
