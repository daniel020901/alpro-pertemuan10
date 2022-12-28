package com.percabangan;

import java.util.Scanner;

public class Nilai {

	public static void main(String[] args) {
	   int nilai;
	   System.out.println("masukan nilai anda:");
	   Scanner inputan = new Scanner (System.in);
	   nilai = inputan.nextInt();
	   
	   if ( nilai >= 80) {
		   System.out.println("nilai A");  
	   }
	   if (nilai >= 70 && nilai < 80) {
		   System.out.println("nilai b");
	   }
	   if (nilai >= 59 && nilai < 70 ) {
		   System.out.println("nilai c");
		   
	   }
	   if (nilai  >= 45 && nilai < 59) {
		   System.out.println("nilai d");
		   
	   }
	   if ( nilai < 45) {
		   System.out.println("nilai e");
	   }

	}

}
