package studentmarklist;

import java.util.Scanner;

public class marklist {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		int Nostudents=4;
	
		int []rollNo =new int[4];
		String[]names=new String[4];
		int []marks1=new int[4];
		int []marks2=new int[4];
		int []marks3=new int[4];	
		int []totalmarks=new int[4];
		int []average=new int[4];
		String[]grade=new String[4];
		String[]results=new String[4];
		for(int i=0;i<4;i++) {
			
		System.out.println("enter the roll of student" +(i+1)+":")	;
		rollNo[i]=input.nextInt();
		System.out.println("enter the name of student" +(i+1)+":")	;
		names[i]=input.next();
		System.out.println("enter marks1" +(i+1)+":")	;
		marks1[i]=input.nextInt();
		
		System.out.println("enter marks2" +(i+1)+":")	;
		marks2[i]=input.nextInt();	
		System.out.println("enter marks3" +(i+1)+":")	;
		marks3[i]=input.nextInt();
			
		}
		
		for ( int i=0;i<4;i++) {
		totalmarks[i]=marks1[i]+marks2[i]+marks3[i];
		average[i]=totalmarks[i]/3;
			
			
		
		// GRADING
		
		if (average[i]>=80) {
			grade[i]="A";}
			
			
			else if(average[i]>=75)	{
				grade[i]="B+";	
				
				} 
		
			else if(average[i]>=65)	{
				grade[i]="B";	}
				
			else if(average[i]>=55)	{
				grade[i]="C+";	}
				
			else if(average[i]>=50)	{
				grade[i]="C";}
			else if(average[i]>=40)	{
				grade[i]="D";}
			else {
				grade[i]="F";
			}
			results[i]	=(average[i]>=40)?"P" : "F";
			
		}
				
		
		
		System.out.println("**************************************************************************************************************************************");
		System.out.println("                                                  STUDENT MARKLIST");
		System.out.println("***************************************************************************************************************************************");
		System.out.println("rollNO\t\tNAME\t\tMARKS1\t\tMARKS2\t\tMARKS3\t\tTOTAL\t\tRESULTS\t\tAVERAGE\t\tGRADE")	;
			
		for(int i=0;i<4;i++)	{
			
		System.out.println(rollNo[i]+"\t\t"+names[i]+"\t\t"+marks1[i]+"\t\t"+marks2[i]+"\t\t"+marks3[i] +"\t\t"+totalmarks[i] +"\t\t"+results[i]+"\t\t"  +average[i] + "\t\t" +grade[i]                   );	
			
			
			
		}
		
			
			
			
		}
			
		
		
	
		
		
		
		
		
		
	
	

}
