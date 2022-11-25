/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pegawaii.mainclass;

/**
 *
 * @author User
 */
public class Programmer extends Pegawaii {
    double bonus;

	// Setter
	public Programmer(String nama, double gajiPokok, double bonus) {
		super(nama, gajiPokok);
		this.bonus = bonus;
	}

	public double getBonus() {
		return this.bonus; }

	// Cetak
        @Override
	public void cetakInfo() {
		System.out.println("Programmer");
		super.cetakInfo();
		System.out.println("Bonus 		: " + getBonus() + "\n");
	}
}

