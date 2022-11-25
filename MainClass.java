/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package pegawaii.mainclass;

/**
 *
 * @author User
 */
public class MainClass {

  
	public static void main(String[] args) {
		Manager bambang = new Manager("Bambang",5000000,9000000);
		Programmer agung = new Programmer("Agung",7000000,3000000);

		// Set Pegawai
		bambang.cetakInfo();
		agung.cetakInfo();


	}
}

