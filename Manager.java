/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pegawaii.mainclass;

/**
 *
 * @author User
 */
public class Manager extends Pegawaii{
    double tunjangan;

	// Setter
	public Manager(String nama , double gajiPokok, double tunjangan) {
		super (nama , gajiPokok);
		this.tunjangan = tunjangan;
	}

	// Getter
	public double getTunjangan() {
		return this.tunjangan;
	}

	// Cetak
        @Override
	public void cetakInfo() {
		System.out.println("Manager");
		super.cetakInfo();
		System.out.println("Tunjangan 	: " + getTunjangan() + "\n");
	}
}
    

