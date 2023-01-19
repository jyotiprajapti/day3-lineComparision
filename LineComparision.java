package com.bridgelab;
import java.util.Scanner;
public class LineComparision {

	    public static void length() {
	        
	        System.out.println("Enter the co-ordinates of line:");
	        Scanner sc = new Scanner(System.in);
	        int x1 = sc.nextInt();
	        int y1 = sc.nextInt();
	        int x2 = sc.nextInt();
	        int y2 = sc.nextInt();
	        float len = (float) Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
	        System.out.println("length of the line: " +len);

	    }

	    public static void lengthEquals( ){
	        System.out.println("Enter the co-ordinates of first line: ");
	        Scanner sc = new Scanner(System.in);
	        int x1 = sc.nextInt();
	        int y1 = sc.nextInt();
	        int x2 = sc.nextInt();
	        int y2 = sc.nextInt();
	        System.out.println("Enter the co-ordinates of second line: ");
	        int x12 = sc.nextInt();
	        int y12 = sc.nextInt();
	        int x22 = sc.nextInt();
	        int y22 = sc.nextInt();
	        Double len1 = (double)Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
	        Double len2 = (double)Math.sqrt((x12-x22)*(x12-x22)+(y12-y22)*(y12-y22));
	        System.out.println("len1: "+len1);
	        System.out.println("len2: "+len2);
	        if(len1.equals(len2)){
	            System.out.println("Both lines are equal");
	        }else {
	            System.out.println("Both lines are Not equal");
	        }
	    }
	    public static void lengthCompare(){
	        System.out.println("Enter Values to check the lines: ");
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter len1 value: ");
	        double len1 = sc.nextInt();
	        System.out.println("Enter len2 value: ");
	        double len2 = sc.nextInt();
	        if(Double.compare(len1,len2) == 0){
	            System.out.println("len1=len2");
	        }else if (Double.compare(len1,len2) < 0){
	            System.out.println("len1 is less than len2");
	        }else {
	            System.out.println("len1 is greater than len2");
	        }
	    }


	    public static void main(String[] args) {
	      System.out.println("Welcome to line comparision");
	      length();
	      lengthEquals();
	      lengthCompare();
}
}