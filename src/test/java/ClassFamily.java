public class ClassFamily {
    public void fatherDetails(String fname)//method without return type with arguements
    {
        System.out.println("fathername="+fname);
    }
    public void motherDetails()//method without return type and without arguement
    {
        System.out.println("Mothername="+"nirmala");
    }
    public String myDetails(String name)//method with return type with arguement
    {
        return name;
    }
    public String sisterDetails()//method without arguements with return type
    {
        return"Vanitha";
    }

    public static void main(String[] args) {
        ClassFamily f=new ClassFamily();
        f.fatherDetails("ObulReddy");
        f.motherDetails();
        System.out.println(f.myDetails("DilipReddy"));
        System.out.println(f.sisterDetails());
    }
}
