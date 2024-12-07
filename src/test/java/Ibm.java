public class Ibm {
    String name,job,id;
    int sal;
    static int totalsal,count=100;
    Ibm()
    {
        count++;
        id="Ibm-"+Integer.toString(count);
    }
    public void getDetails(String name,String job,int sal)
    {
        this.name=name;
        this.job=job;
        this.sal=sal;
        totalsal=totalsal+sal;
    }
    public void putDetails()
    {
        System.out.println(id+name+job+sal);
    }
    public static void allsal()
    {
        System.out.println("totalsalary="+totalsal);
    }

    public static void main(String[] args) {
        Ibm n=new Ibm();
        Ibm d=new Ibm();
        n.getDetails("naveen","testing",30000);
        d.getDetails("dilip","automation",40000);
        n.putDetails();
        d.putDetails();
        Ibm.allsal();
        Ibm a=new Ibm();
        a.getDetails("anil","developer",70000);
        a.putDetails();
        Ibm.allsal();
    }
}
