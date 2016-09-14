import java.util.Scanner;
import java.util.regex.Pattern;

public class IntoSegments {
	public static void main(String args[]){
		Scanner read=new Scanner(System.in);//soon to be replaced by file streaming
		String input=read.nextLine();
		read.close();
		String[] individualInputs=input.split(" ");
		String output;
		if(individualInputs.length%2==0){
			int ind=1;
			for(int count=0;count<individualInputs.length;count++){
				if(Pattern.matches("[0-9]+",individualInputs[count])){
					continue;
				}
				else{
					ind=0;
					break;
				}				
			}
			if(ind==1){
				output=new String();
				for(int count=0;count<individualInputs.length-1;count=count+2){
				//	if((Integer.parseInt(individualInputs[count]>0 && Integer.parseInt(individualInputs[count])<301)&&((Integer.parseInt(individualInputs[count+1]>0 && Integer.parseInt(individualInputs[count+1])<301))){
				//		output="Invalid input";
				//		break;
				//	}	
				//      If you are checking out for guvi, above condition is invalid
					output=output.concat(findMinCuts(Integer.parseInt(individualInputs[count]), Integer.parseInt(individualInputs[count+1]))+"\n");
				}
				output=output.trim();
				System.out.println(output);
			}
			else{
				System.out.println("Invalid input");
			}
		}
		else{
			System.out.println("Invalid input");
		}
	}
	public static int findMinCuts(int m, int n){
		if(m==1){
			return n-1;
		}
		else if(n==1){
			return m-1;
		}
		else{
			return m-1+(m*findMinCuts(1, n));
			//=m-1+(m*(n-1))
			//=m-1+mn-m
			//=mn-1  Much easier way
		}		
	}
}
