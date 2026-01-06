import java.util.*;
class account//Inheritance program
{
  String name;
  long accNo;
  double balance;
  public void accountDetails()
  {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter account Holder Name");
      name=sc.nextLine();
      System.out.println("enter the account number");
      accNo=sc.nextLong();
      System.out.println("Enter the initial balance");
      balance=sc.nextDouble();
  }
  public void deposit(double amt)
  {
      balance=balance + amt;
      System.out.println("\nAmount Deposited    "+amt+"\nbalance after deposition    "+balance);
  }
  public void withdrawl(double amt)
  {
      if(amt<=balance)
      {
          balance=balance-amt;
          System.out.println("\nAmount Withdrawl   "+amt+"\nbalance after withdrawl    "+balance);
      }
      else
      {
          System.out.println("Insufficient Balance");
      }
  }
  public void display()
  {
      System.out.println("\nName  "+name+"\nAccount Number   "+accNo+"\nBalance    "+balance);
  }
}
class SavingAccount extends account
{
    double rate=7.2;
    public void compoundInterest(int time)
    {
      balance=balance*Math.pow((1+rate/100),time);
      System.out.println("balance after includin Compound Interest"+balance);
    }
}
class CurrentAccount extends account
{
   double minBalance=5000;
   double penalty=150;
   public void chequeBook()
   {
     System.out.println("cheque Book facility available"); 
   }
   double rate=5;
   public void simpleInterest(int time)
   {
      double bal; 
      bal=(balance*rate*time)/100;
      System.out.println("Simple Interest:  "+bal); 
      balance=balance+bal;
      System.out.println("balance after including simple interest    "+balance);
   }
   public void minBalance()
   {
       if(balance<minBalance)
       {
           balance=balance-penalty;
           System.out.println("minimum balance not maintained");
           System.out.println("Penalty of"+penalty+"deducted");
       }
       else
       System.out.println("Minimum balance maintained");
   }
}
class FixDeposit extends account
{
    long adno;
    int age;
    String add;
    double fdamt;
    public void extraDetails()
    {
      Scanner sc=new Scanner(System.in);   
      Scanner sc1=new Scanner(System.in); 
      System.out.println("Enter the Adhaar Number");
      adno=sc.nextLong();
      System.out.println("Enter the age");
      age=sc.nextInt();
      System.out.println("Enter the address");
      add=sc1.nextLine();
      System.out.println("Enter the fix deposit amount");
      fdamt=sc.nextDouble();
    }
    public void Display()
    {
      System.out.println("\nAdhaar Number  "+adno+"\nage   "+age+"\naddress    "+add+"\nFix Deposit amount   "
                             +fdamt);  
    }
    double rate=6;
    public void fd(int time)
    { 
      double si;  
      si=(fdamt*rate*time)/100;
      System.out.println("Simple Interest:  "+si); 
      fdamt=fdamt+si;
      System.out.println("Fix deposit amount after including interest    "+fdamt);
    }
}
public class bank
{
    public static void main(String args[])
    { 
       Scanner sc=new Scanner(System.in);
       char ch;
       do
       {
       System.out.println("1 for Saving Account");
       System.out.println("2 for Current Account");
       System.out.println("3 for Fix Deposit");
       System.out.println("Enter the choice");
       int x=sc.nextInt();
       if(x==1)
       {
         SavingAccount obj1=new SavingAccount();
        obj1.accountDetails();
        System.out.println("1 for deposite");
        System.out.println("2 for withdrawl");
        System.out.println("Enter the choice");
        int t=sc.nextInt();
         if(t==1)
         {
          System.out.println("Enter the amount to deposit ");
          obj1.deposit(sc.nextDouble());
         }
         else if(t==2)
         {
          System.out.println("Enter the amount to withdrawl ");
          obj1.withdrawl(sc.nextDouble());
         }
         else
         {
             System.out.println("Invalid choice");
         }
        System.out.println("Enter the time");
        obj1.compoundInterest(sc.nextInt());
        obj1.display();
       }
       else if(x==2)
       {
        CurrentAccount obj2=new CurrentAccount();
        obj2.accountDetails();
        System.out.println("1 for deposite");
        System.out.println("2 for withdrawl");
        System.out.println("Enter the choice");
        int t=sc.nextInt();
         if(t==1)
         {
          System.out.println("Enter the amount to deposit ");
          obj2.deposit(sc.nextDouble());
         }
         else if(t==2)
         {
          System.out.println("Enter the amount to withdrawl ");
          obj2.withdrawl(sc.nextDouble());
         }
         else
         {
             System.out.println("Invalid choice");
         }
        obj2.chequeBook();
        obj2.minBalance();
        obj2.display();
        System.out.println("Enter the time");
        obj2.simpleInterest(sc.nextInt());
       }
       else if(x==3)
       { 
         FixDeposit obj3=new FixDeposit(); 
         obj3.accountDetails();
         obj3.display();
         obj3.extraDetails();
         obj3.Display();
         System.out.println("Enter the time");
         obj3.fd(sc.nextInt());
       }
       else
       {
          System.out.println("Invalid choice");
        }
        System.out.println("do u want to continue if 'yes' choose y if 'no' choose n(y/n)");
        ch=sc.next().charAt(0);
     }
     while(ch=='y'||ch=='Y');
    }
}
