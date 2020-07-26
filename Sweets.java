package com.epam.gift;
import java.util.*;
//Sweets class is taken as parent class which creates a gift by instantiating Sweets class 
class Sweets
{
	static int no_of_chocolates;
	static int no_of_candies;
	public Sweets() {}
	//Overloads the Sweets class constructor
	public Sweets(int choco,int candi)
	{
		no_of_chocolates=choco;
		no_of_candies=candi;
	}

}
//Sorting the chocolates data according to chocolates names 
class Chocolates extends Sweets{
	
	String choco_names[] = new String[no_of_chocolates];
//	getting names of chocolates
	public void name_choco() {
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<no_of_chocolates;i++) {
			System.out.println("Enter Chocolate name:");
			choco_names[i] = sc.next();
		}
	}
public void sort_choco_names(String order) {
		String temp;
		for(int i=0; i<no_of_chocolates; i++)
        {
            for(int j=1; j<no_of_chocolates; j++)
            {
                if(choco_names[j-1].compareTo(choco_names[i])<0)
                {
                    temp = choco_names[j-1];
                    choco_names[j-1] = choco_names[i];
                    choco_names[i]=temp;
                }
            }
        }
		if(order.compareTo("a")<0) {
			for(int i=0;i<no_of_chocolates;i++)
			    System.out.println(choco_names[i]);
		}
		else {
			 for(int i=(no_of_chocolates-1);i>=0;i--)
				    System.out.println(choco_names[i]);
		}
	}
		
}
//Defining Candies class to return the no_of_candies and particular range
class Candies extends Sweets{
	public void count_candies(){
		if(no_of_candies<=50 && no_of_candies>0)
			System.out.println("No. of candies lies in between 1 and 50 " + no_of_candies);
		else if(no_of_candies<=100 && no_of_candies>50)
			System.out.println("No. of candies lies in between 50 and 100 " + no_of_candies);
		else
			System.out.println("No. of candies" + no_of_candies);
	}
}