package com.studikasus;
import java.util.Scanner;
public class StudiKasusNestedIF {

	public static void main(String[] args) {
		//deklarasi variabel dan Scanner
		int belanjaan, diskon, bayar ;
		String kartu;
		Scanner scan = new Scanner (System.in);
		
		//mengambil input
		System.out.print("Apakah ada kartu member (ya/tidak) :");
		kartu = scan.nextLine();
		System.out.print("total belanjaan (nominal):");
		belanjaan = scan.nextInt();
		
		//proses
		if (kartu.equalsIgnoreCase("ya")) {
			if(belanjaan > 500000) {
				diskon = 50000;
			} else if (belanjaan > 100000) {
				diskon = 15000;
			}else {
				diskon = 0;
			}
		}else {
			if (belanjaan > 100000) {
				diskon = 5000;
			}else {
				   diskon = 0;
			}
		}
		//total yang harus dibayar
		bayar = belanjaan - diskon;
		
		//ouput
		System.out.println("total bayar :RP" + bayar);
		}
	}


