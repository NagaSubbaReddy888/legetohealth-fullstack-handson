package com.org;

public class ExceptionEx {
	 
		 public static void main(String[] args)
	        {
	                int a = 445, b = 45, c = 34;
	                int result;
	                try
	                {
	                        result = a / (b-c);
	                }
	                catch (ArithmeticException ae)
	                {
	                        System.out.println("Cannot divided by zero."+ae);
	                }
	                finally
	                {
	                        System.out.println("finally block");
	                }
	                result = a / (b+c);
	                System.out.println("Result: "+result);
	        }   
  }  
 
