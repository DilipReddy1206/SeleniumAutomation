public class BankSbi {
    String name,bankaccount,bankNumber,accounts;
    int amount;
    static int totalamount,count;
    BankSbi(){
        count++;
        accounts = "SBI : "+Integer.toString(count);
    }
    public void getBankDetails(String name, String bankaccount, String bankNumber, int amount) {
        this.name = name;
        this.bankaccount = bankaccount;
        this.bankNumber = bankNumber;
        this.amount = amount;
        totalamount=totalamount+this.amount;
    }
    public void putdetails(){
        System.out.println("Name = "+name);
        if(bankaccount.equalsIgnoreCase("savings")) {
            System.out.println("Your Bank Account = " + bankaccount);
        }else if (bankaccount.equalsIgnoreCase("current")){
            System.out.println("Your Bank Account = "+bankaccount);
        }else {
            System.out.println("Please Enter (Current) or (Savings).  ");
        }
        System.out.println("Bank Number = "+bankNumber);
        System.out.println("Amount Deposit  = "+amount);
        System.out.println("SBI Bank Account id Created = "+accounts);

    }
    public static void totalamounts(){
        System.out.println("Total Amount added = "+totalamount);
        System.out.println("No of Accounts Created = "+count);
    }

    public static void main(String[] args) {
        BankSbi bank = new BankSbi();
        BankSbi bank1 =new BankSbi();
        bank.getBankDetails("Dilip Reddy","Savings","45616316546",500);
        bank.putdetails();
        totalamounts();
        System.out.println("                ");
        bank1.getBankDetails("Virat","Current","2457846416",1000);
        bank1.putdetails();
        totalamounts();
    }
}

