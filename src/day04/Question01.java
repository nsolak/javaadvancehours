package day04;

public class Question01 {
	/*
	 * Bir array'deki en buyuk ve en kucuk sayiyi iki ayri methodda Arrays.sort() methodu 
	 * kullanmadan yapiniz
	 */



	public static void main(String[] args) {
		System.out.println(Integer.MAX_VALUE);
       int arr[]= {5, 20, 18, -2, -30, 156};
       int arr2[]= {5, 20, 18, -2, -30, 156, 12893, 23};
       
       enKucuk(arr);
       System.out.println();
       enBuyuk(arr2);
	}
     public static void enKucuk(int arr[]) {
	     int temp= Integer.MAX_VALUE;//72147483647
	     
	     for(int each:arr) {
	    	if(each<temp) {
	    		temp=each;
	    		
	    	}
	     }
	     System.out.println(temp +" ");
}
 public static void enBuyuk(int arr[]) {
	 int temp= Integer.MIN_VALUE;
 }
     
     
}
