/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pegawaii.mainclass;

/**
 *
 * @author User
 */
public class Pegawaii {
   
	String nama;
	double gajiPokok;

	// Setter
	public Pegawaii(String nama, double gajiPokok) {
		this.nama = nama;
		this.gajiPokok = gajiPokok;
	}

	// Getter
	public String getNama() {
		return this.nama;
	}

	public double getGajiPokok() {
		return this.gajiPokok;
	}

	// Cetak
	public void cetakInfo() {
		System.out.println("Nama 		: " + getNama());
		System.out.println("Gaji Pokok 	: " + getGajiPokok());
	}
}

