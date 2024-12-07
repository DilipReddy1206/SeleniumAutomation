public class Split {
    public static void main(String[] args) {
        String msg="happy sankranthi to all";
        String words[]=msg.split(" ");
        for (String s:words)
        {
            System.out.println(s);
        }
    }
}
