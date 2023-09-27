package exams;

import java.util.Scanner;

public class Transcript {

	public static void main(String[] args) {
		
		
		Scanner input=new Scanner(System.in);
		
		String[]unitcodes=new String[4];
		String[]unitName=new String[4];
		int[]unitScore=new int[4];
		
		for(int i=0;i<4;i++) {
			System.out.println("Enter the unit code for units"+(i+1)+":");
			unitcodes[i]=input.next();
			
			System.out.println("enter the unit name"+(i+1)+":");
			unitName[i]=input.next();
			
			System.out.println("enter the score"+(i+1)+":");
		unitScore[i]=input.nextInt();
			
				
		}
		
		
		System.out.println("\t\t\t\t\tDepartment of Computer Science");
		System.out.println("\t\t\t\t\t      End Semester results");
		System.out.println("-----------------------------------------------------------------------------------------------------------");
		System.out.print("|Name:- Ochieng Risper Atieno");
		System.out.print("\t\t|Roll_No:C026-01-0983/2022");
		System.out.println("\t\t\t|Semester:2");
		System.out.println("_______________________________________________________________________________________________________________");
		System.out.print("|Unit Code");
		System.out.print("\t\t\t\t|Unit Name");
		System.out.println("\t\t\t\t\tScore");
		System.out.println("------------------------------------------------------------------------------------------------------------------");
		
		
		for(int i=0;i<4;i++) {
		System.out.println(unitcodes[i] +"\t\t\t\t\t|"+ unitName[i]+"\t\t\t\t\t"+unitScore[i]);
		System.out.println("");
		}
	
		double total=0;
		double average;
		average=total/4;
		
		for(int j=0;j<unitScore.length;j++){
			total+=unitScore[j];
			average=total/4;
		}
		
		System.out.println("------------------------------------------------------------------------------------------------------------------------");

		
		System.out.println("total\t\t\t\t\t\t\t\t\t\t\t|"+total);
		System.out.println("------------------------------------------------------------------------------------------------------------------------");

		
		System.out.println("average\t\t\t\t\t\t\t\t\t\t\t|"+average);
		System.out.println("------------------------------------------------------------------------------------------------------------------------");

		if(average>=70 && average<=100){
		 
System.out.println("grade                                                                                    | A");}
		else if(average>=60&&average <=69){
		System.out.println("grade                                                               B");}
		
		else if(average>=50&&average <=59){
			System.out.println("grade                                                            C");}
		
		else if(average>=40&&average <=49){                     
			System.out.println("grade                                                               D");}
		             
		else if(average>=0&&average <=39){
			System.out.println("grade                                                             E");}
		
		else {
			 System.out.println("marks out of range");
		}
			
		System.out.println("------------------------------------------------------------------------------------------------------------------------");
		
		
		System.out.println("\t\t\t\t\t\t\t\t\t Recommendation |"); 
		
		System.out.println("------------------------------------------------------------------------------------------------------------------------");
		System.out.print("grading criteria");
		System.out.print("\t\t\t\toverall grade(A-D)");
		System.out.println("\t\t\t recommend Pass");

		
		System.out.println("70-100             A");
		System.out.println("60-70              B");
		System.out.println("50-60              C");
		System.out.println("40-50              D");
		System.out.println("Below 40           E");
		
		System.out.println("------------------------------------------------------------------------------------------------------------------------");
		
	}}
