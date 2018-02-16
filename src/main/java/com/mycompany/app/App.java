package com.mycompany.app;
import java.util.ArrayList;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
    public static boolean isEqualSum(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int sum, int k)
    {
    	
    	if(k<0) return false;
    	if(sum<0) return false;
    	if(arr1.size()==0 || arr2.size()==0 ) return false;
    	
    	
    	int sum1=0, sum2=0;
    	for (int i=0; i<k; i++ ){
    		sum1+=arr1.get(i);
    		
    	}
    	for (int i=0; i<k; i++ ){
    		sum2+=arr2.get(i);
    		
    	}
    	if((sum1+sum2)==sum)
    		return true;
    	return false;
     }

}
