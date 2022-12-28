package com.percabangan;

public class Ifnestedexample {

	public static void main(String[] args) {
		int umur = 17;
		boolean hamil = false;
		if (umur >=18) {
			if (hamil==false) {
				System.out.println("vaksin AstraZeneca");
			}else {
				System.out.println("vaksin Sinnovac");
				System.out.println("vaksin pfrizer");
				System.out.println("vaksin moderna");
				}
		}else {
			System.out.println("vaksin sinovac");
		}

	}

}
