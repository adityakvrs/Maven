package com.epam.gift;
public class Gift{	
	public static void main(String args[]){	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No of Gifts:");
		int no_of_gifts = sc.nextInt();
		int nchoco,ncandy,i;
		for(i=0;i<no_of_gifts;i++) {
			System.out.println("Keeping chocos and candy into gift boxes");
			System.out.println("Enter no of chocos:");
			nchoco = sc.nextInt();
			System.out.println("Enter no of candies:");
			ncandy = sc.nextInt();
			Sweets s1 = new Sweets(nchoco,ncandy);
			while(true) {
				System.out.println("1.Total weight\n2.Sorting the Choclates\n3.No. of Candies\n4.Exit");
				int ch = sc.nextInt();
				if (ch == 1) {
					System.out.println(nchoco + ncandy);
				}
				else if(ch == 2) {
					Chocolates c=new Chocolates();
				    c.name_choco();
				    System.out.println("Enter 'a' for ascending order\n enter 'd' for descending order:");
				    String a=sc.next();
				    c.sort_choco_names(a);
				}
				else if(ch == 3) {
					if(ncandy == 0)
						System.out.println("zero candies");
					else {
						Candies cd = new Candies();
						cd.count_candies();
					}
				}
				else {
					break;
				}
				
			}
			System.out.println((i+1) + "nd Gift completed");
		}
		
		 
	}
}