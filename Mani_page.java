package core_javaP1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Bank{
	public double Balance=10000;
	public void Withdraw(double tamt) {
		Balance-=tamt;
	}
	public void Deposit(double tamt) {
		Balance+=tamt;
	}
}
public class Mani_page {

	public static void main(String[] args) {
		Bank bnk=new Bank();
		HashMap<Integer,String> hp1=new HashMap<Integer,String>();
		hp1.put(79265,"Manikandan");
		while(true) {
			Scanner sc=new Scanner(System.in);
			System.out.println("1. Enter Your Card No.");
			System.out.println("2. Insert New Card No.");
			System.out.println("Enter your option");
			int choice1=sc.nextInt();
			switch(choice1) {
			case 1:
				System.out.println("Compulsary 5 digits....");
				int cn1=sc.nextInt();
				for(Map.Entry m:hp1.entrySet()) {
					if(hp1.containsKey(cn1)) {
						System.out.println("Welcome "+m.getValue()+"\n");
					}
					else {
						System.out.println("		Invalid card no...\n	If new user Insert card no first..\n		Thankyou.....\n");
						break;
					}
				}
				System.out.println("1. Withdraw");
				System.out.println("2. Deposit");
				System.out.println("3. Balance Enquiry");
				System.out.println("Enter your option");
				int choice2=sc.nextInt();
				switch(choice2) {
				case 1:
					System.out.println("1. Saving Account");
					System.out.println("2. Current Account");
					System.out.println("Enter your option");
					int s2=sc.nextInt();
					System.out.println("Enter the amount");
					double amt1=sc.nextDouble();
					if(amt1==0) {
						System.out.println("Please enter amount minimum 100.");
						amt1=sc.nextDouble();
						bnk.Withdraw(amt1);
						System.out.println("		Collect your cash...\n		Transaction Completed....\n	Thankyou Visit Again....");
					}
					else {
						System.out.println("Enter the amount");
						amt1=sc.nextDouble();
						bnk.Withdraw(amt1);
						System.out.println("		Collect your cash...\n		Transaction Completed....\n	Thankyou Visit Again....");
					}
					break;
				case 2:
					System.out.println("Enter your Account no");
					long accno=sc.nextLong();
					System.out.println("Enter your Mobile no");
					long mobno=sc.nextLong();
					System.out.println("Enter the amount");
					double amt2=sc.nextDouble();
					if(amt2>0 && amt2<100) {
						System.out.println("Please enter the amount more than 100");
						amt2=sc.nextDouble();
						bnk.Deposit(amt2);
						System.out.println("Transaction completed...Thankyou Visit Again.....\n");
					}
					else {
						bnk.Deposit(amt2);
						System.out.println("Transaction completed...Thankyou Visit Again.....\n");
					}
					break;
				case 3:
					System.out.println("Enter your pin");
					int pin=sc.nextInt();
					System.out.println("Your Available Balance is "+bnk.Balance);
					break;
				}
				break;
			case 2:
				System.out.println("Enter your card no : ");
				Integer a=sc.nextInt();
				System.out.println("Enter your name : ");
				String b=sc.next();
				System.out.println("Do you want to save Y/N : ");
				String c=sc.next();
				if(c=="Y" || c=="y" && c=="Yes" || c=="yes") {
					hp1.put(a, b);
					System.out.println("Thank You Your details are saved........\n");
				}else {
					System.out.println("Invalid choice..Please enter Y/N.");
				}
				break;
				//default:	
			}
		}
	}

}
