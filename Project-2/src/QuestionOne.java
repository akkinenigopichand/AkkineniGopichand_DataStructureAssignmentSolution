import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;
import java.util.Scanner;

public class QuestionOne {

	Scanner sc = new Scanner(System.in);
	
	int inp[],sorted[];
	int size,i,j,k,temp,temp2,pointer,itr;
	boolean flag;
	
	
	void SetSize()
	{
		System.out.println("enter the total no of floors in the building ");
		size = sc.nextInt();
		inp = new int[size];
		sorted=new int[size];
	}
	
	void TakeInput()
	{
		for(i=0;i<size;i++)
		{
			System.out.println("enter the floor size given on day : "+(i+1));
			inp[i]=sc.nextInt();
		}
		
	}
	
	void Copy()
	{
		for(i=0;i<size;i++)
		{
			sorted[i]=inp[i];
		}
		
	}
	
	void Sort()
	{
		for( i=0; i < size; i++)
		{  
            for( j=1; j < (size-i); j++)
            {  
                     if(sorted[j-1] < sorted[j])
                     {  
                            //swap elements  
                            temp = sorted[j-1];  
                            sorted[j-1] = sorted[j];  
                            sorted[j] = temp;  
                    }  
            }
		}
	}
	
	
	void Solution()
	{
		System.out.println("The order of construction is as follows ");
		
		itr=0;
		int counter = size;
		
		while(counter > 0) {
			List<Integer> floors = new ArrayList<Integer>();
			floors = new ArrayList<Integer>();
			int count =0;
			for(int i=0; i<size; i++) {

				if(inp[i] == counter) {
					floors.add(counter);
					for(int j=i; j>=0;j--) {
						if(inp[j] < counter ) {
							floors.add(inp[j]);
						}
					}
					System.out.print("Day : ");
					System.out.println(i + 1);
					System.out.print(" ");
					 count =0;
					for (int k= inp[i] ; k >0 ; k--) {
						if(floors.contains(k)) {
							System.out.print(" "+k+" ");
							count ++;
						} else {
							break;
						}
						
					}
					break;
				}
				
				for (Integer k : floors) {
					System.out.print(" "+k+" ");
				}
				
			}
			System.out.println();
			counter = counter - count;
		}
		
		
		
	}
	
	

	
	
	public static void main(String args[])
	{
		QuestionOne obj = new QuestionOne();
		
		obj.SetSize();
		obj.TakeInput();
		// obj.Copy();
		// obj.Sort();
		obj.Solution();
	}
	
}
