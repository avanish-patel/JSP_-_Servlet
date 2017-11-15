package test.main;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Sentinaltest {
	
	 public static void main(String[] args) {


	        // Declaring the variable args
	        int score =0, student_no = 0, sum = 0;

	        Scanner obj = new Scanner(System.in);
	        System.out.println("Enter the grade of student between 0 to 100 or press -1 to quit :");

	        score = obj.nextInt();


	            // Use while loop and -1 as sentinel to exit from a loop
	            while (score != -1) {


	                if ( score > 100 || score < 0){
	                    System.out.println("Please , Enter the score between 0 and 100.");
	                    System.out.println("Enter the grade of student between 0 to 100 or press -1 to quit :");
	                    score = obj.nextInt();

	                }
	                else{

	                    sum = sum + score;
	                    student_no = student_no + 1;
	                    System.out.println("Enter the grade of student between 0 to 100 or press -1 to quit :");
	                    score = obj.nextInt();

	                }
	            }

	        // printing the values of number of students, total points, and average score

	        if (student_no != 0){

	            // function to find out the average
	            float average = (float) sum/student_no;

	            // using patter to display average up to two decimal places

	            DecimalFormat df = new DecimalFormat("0.00");

	            System.out.println("The number of students are :"+student_no);

	            System.out.println("The total points of all students :"+sum);

	            System.out.println("The average of all the Students :"+ df.format(average));
	        }
	        // if user enter nothing than display this
	        else {
	            System.out.println("Please , Enter thr grade.");
	        }

	    }


}
