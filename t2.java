import java.util.*;
public class t2 {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Deposit\n2. Withdrawal\n3. Check balance\n4. Exit\n\n");
        double balance = 0;
        int ch; 
        do
        {
            System.out.println("Enter choice : ");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                {
                    System.out.println("Enter amount to deposit : ");
                    double deposit = sc.nextDouble();
                    balance += deposit;
                    System.out.println(deposit+" is deposited");
                    break;
                }
                case 2:
                {
                    System.out.println("Enter amount to deposit : ");
                    double Withdrawal = sc.nextDouble();
                    if(Withdrawal > balance)
                    {
                        System.out.println("Insufficent funds");

                    }
                    else
                    {
                        balance -= Withdrawal;
                        System.out.println(Withdrawal+" is withdrawed");
                        System.out.println("Do you want to check your balance (y/n) :");
                        char x = sc.next().charAt(0);
                        if( x == 'y' || x== 'Y')
                        {
                            System.out.println("Your balance : "+balance);
                        }
                    }                    
                    break;
                }
                case 3:
                {
                    System.out.println("Balance : "+balance);
                    break;
                }
                case 4:
                {
                    System.out.println("Terminatted");
                    break;
                }
                default:
                    System.out.println("Invalid choice");
                    break;
            }

        }while(ch!=4);
        sc.close();
    }
}
