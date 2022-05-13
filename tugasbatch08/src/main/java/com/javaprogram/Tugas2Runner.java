package com.javaprogram;

import java.util.Scanner;

public class Tugas2Runner {

	public static void main(String[] args) {
		//manggil class Tugas2
		Tugas2 tugasSatu = new Tugas2();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Program kalkulator sederhana");
		System.out.println("1. Operasi Pertambahan");
		System.out.println("2. Operasi Pengurangan");
		System.out.println("3. Operasi Perkalian");
		System.out.println("4. Operasi Pembagian");
		System.out.println("-----------------------------");
		
		//input angka pertama
		System.out.println("Masukkan angka pertama : ");
		double bilangan1 = input.nextDouble();
		tugasSatu.setBilangan1(bilangan1);
		
		//input angka kedua
		System.out.println("Masukkan angka kedua : ");
		double bilangan2 = input.nextDouble();
		tugasSatu.setBilangan1(bilangan2);		

		//input operasi
		System.out.println("Nomor operasi yang ingin dijalankan : ");
		int pilihan = input.nextInt();
		
		switch(pilihan) {
		
		case 1 : tugasSatu.operasiPertambahan(bilangan1, bilangan2);
		System.out.println("Hasil penjumlahan :" + tugasSatu.getHasil());
		break;
		
		case 2 : tugasSatu.operasiPengurangan(bilangan1, bilangan2);
		System.out.println("Hasil pengurangan :" + tugasSatu.getHasil());
		break;

		case 3 : tugasSatu.operasiPerkalian(bilangan1, bilangan2);
		System.out.println("Hasil perkalian :" + tugasSatu.getHasil());
		break;

		case 4 : tugasSatu.operasiPembagian(bilangan1, bilangan2);
		System.out.println("Hasil pembagian :" + tugasSatu.getHasil());
		break;
		
		default :{
			System.out.println("System Error!!!");
		}
		}
	}

}
