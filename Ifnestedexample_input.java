package com.percabangan;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Ifnestedexample_input {

	public static void main(String[] args) {
		Scanner scan1 = new Scanner (System.in);
		int umur = 0;
		String hamil;
		System.out.print("Berapa ummur Anda (hanya angka) :");
		try {
			umur = scan1.nextInt();
			if(umur>=18) {
				Scanner scan2 = new Scanner (System.in);
				System.out.print("apakah sedang hamil? (ya/tidak ):");
				hamil = scan2.nextLine();
				
				if (hamil.toLowerCase().equals("tidak")) {
					   System.out.println("vaksin jenis AstraZeneca");
				}else if (hamil.toLowerCase().equals("ya")) {
					System.out.println("vaksin jenis sinovac");
					System.out.println("vaksin jenis pfrizer");
					System.out.println("vaksin jenis moderan");
				}else {
					System.out.println("input anda tidak sesuai");
				}
			}
			
			else {
				System.out.println("vaksin jenis sinovac");
			}
		
		}
		catch (InputMismatchException a) {
			System.out.print("Anda tidak memasukan angka");
        }
	}
}


