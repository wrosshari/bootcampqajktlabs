package com.javaprogram;

public class Tugas2 {
	
	double bilangan1;
	double bilangan2;
	double hasil;
	
	public double getBilangan1() {
		return bilangan1;
	}
	public void setBilangan1(double bilangan1) {
		this.bilangan1 = bilangan1;
	}
	public double getBilangan2() {
		return bilangan2;
	}
	public void setBilangan2(double bilangan2) {
		this.bilangan2 = bilangan2;
	}
	public double getHasil() {
		return hasil;
	}
	public void setHasil(double hasil) {
		this.hasil = hasil;
	}
	
	public void operasiPertambahan(double bilangan1, double bilangan2) {
		hasil = bilangan1 + bilangan2;
	}
	
	public void operasiPengurangan(double bilangan1, double bilangan2) {
		hasil = bilangan1 - bilangan2;
	}
	
	public void operasiPerkalian(double bilangan1, double bilangan2) {
		hasil = bilangan1 * bilangan2;
	}
	
	public void operasiPembagian(double bilangan1, double bilangan2) {
		hasil = bilangan1 / bilangan2;
	}
	
}
