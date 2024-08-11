import java.util.Scanner;

class Atm{
String type_of_bank;
String bank_name;
private long card_no;
private String name;
String validity;
private int cvv;
private int acc_no;
private int pin_no;
private String mobile_no;
private double balance;

 public Atm(String type_of_bank,String bank_name,int pin_no,String name,String validity,long card_no,int cvv,int acc_no,String mobile_no,double balance){
this.type_of_bank=type_of_bank;
this.bank_name=bank_name;
this.name=name;
this.pin_no=pin_no;
this.validity=validity;
this.card_no=card_no;
this.cvv=cvv;
this.acc_no=acc_no;
this.mobile_no=mobile_no;
this.balance=balance;
 }
 public void setData(String type_of_bank,String bank_name,String name,int pin_no,String validity,long card_no,int cvv,int acc_no,String mobile_no,double balance){
    this.type_of_bank=type_of_bank;
    this.bank_name=bank_name;
    this.name=name;
    this.pin_no=pin_no;
    this.validity=validity;
    this.card_no=card_no;
    this.cvv=cvv;
    this.acc_no=acc_no;
    this.mobile_no=mobile_no;
    this.balance=balance;
 }
 public long getCardNo(){
    return card_no;
 }
 public int getCvv(){
     return cvv;
 }
 public int getAccNo(){
    return acc_no;
 }
 public int getPin(){
    return pin_no;
 }
 public String getMobNo(){
    return mobile_no;
 }
 public String getName(){
   return name;
 }
 public double getBalance(){
   return balance;
 }
public String gettypeofbank(){
   return type_of_bank;
}
public String getBankname(){
   return bank_name;
}
public String getvalidity(){
   return validity;
}


 public void changeContactno(String 
 Old,String New){
   if(Old.equals(mobile_no)){
      mobile_no=New;
      System.out.println("Mobile No. Successfully updated.");
   }else {
   System.out.println("You Entered Old Or Wrong Mobile No.!");
  
 }
 }
 public void withdrawcash(double amount){
    if(amount>0 && amount<=balance){
      balance-= amount;
      System.out.println("Collect The Cash!");
      System.out.println("Remaining Balance: "+balance);
    }else{
      System.out.println("Insufficient Balance!!!");
    }
 }
}
public class ATMProject{
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      Atm userName = new Atm ("Global", "State Bank Of India",5555, "Zaid Zameer", "Valid From 01/22 to 01/27",1234567890, 100,1020304050,"987654321", 70000.82);

      System.out.println("*** Welcome To ATM ***");
      System.out.println("Enter Your Account Number:");
      int enterAccNo=sc.nextInt();
      System.out.println("Enter Your Pin:");
      int enterPin=sc.nextInt();
      sc.nextLine();

      if(enterAccNo==userName.getAccNo() && enterPin== userName.getPin()){
         while(true){
            System.out.println("***Select Option***");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw Cash");
            System.out.println("3. Show User Details");
            System.out.println("4. Update Mobile No.");
            System.out.println("5. Type Of Bank");
            System.out.println("6. Bank Name");
            System.out.println("7. Validity Of ATM card");
            System.out.println("8. Card No.");
            System.out.println("9. CVV ");
            System.out.println("10. Exit");

            int choice=sc.nextInt();
            sc.nextLine();

            switch(choice){
               case 1:
               System.out.println("Your Balance is:"+userName.getBalance());
               break;
               
               case 2:System.out.println("Enter Amount:");
               double amount=sc.nextDouble();
               userName.withdrawcash(amount);
               break;

               case 3:
               System.out.println("*** User Details ***");
               System.out.println("Name:"+userName.getName());
               System.out.println("Account No:"+userName.getAccNo());
               System.out.println("Your Balance is:"+userName.getBalance());
               System.out.println("Mobile No.:"+userName.getMobNo());
               System.out.println("Type Of Bank:"+userName.gettypeofbank());
               System.out.println("Bank Name:"+userName.getBankname());
               System.out.println("Validity Of ATM card:"+userName.getvalidity());
               System.out.println("Card Number:"+userName.getCardNo());
               System.out.println("CVV:"+userName.getCvv());
               break;

               case 4:
               System.out.println("Enter Old Mobile No.:");
               String Old=sc.nextLine();
               System.out.println("Enter New Mobile No.:");
               String New=sc.nextLine();
               userName.changeContactno(Old, New);
               break;

               case 5:
               System.out.println("Type Of Bank:"+userName.gettypeofbank());
               break;

               case 6:
               System.out.println("Bank Name:"+userName.bank_name);
               break;

               case 7:
               System.out.println("Validity of ATM card:"+userName.getvalidity());
               break;

               case 8:
               System.out.println("Your Card Number is:"+userName.getCardNo());
               break;

               case 9:
               System.out.println("Your CVV is:"+userName.getCvv());
               break;

               case 10:
               System.out.println("** Exiting **");
               return;

               default:
               System.out.println("Enter valid choice!!!");
               break;
            }
         }
      } else{
         System.out.println("User Not Found!");
      }
   }
}