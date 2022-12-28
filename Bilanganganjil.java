package com.percabangan;

import java.util.Scanner;

public class Bilanganganjil {

	public static void main(String args []) 
{
	int angka;
	System.out.println("Masukan Angka:");
	Scanner masukan = new Scanner (System.in);
	angka = masukan.nextInt();
	//tanpa kurawal
	//if (angka % 2 ==0)
	// Sytem.out.println("bilangan genap ");
	// else
	// System.out.println("bilagan ganjil);
       // dengan kurawal
	if ( angka % 2 == 0) {
		System.out.println("Bilangan genap");
		
	}else {
		System.out.println("Bilangan ganjil");
	}
}
}
