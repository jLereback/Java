package se.iths.before.labbforts;

import java.util.HashMap;

public class Model {

	//Detta �r minnet d�r ber�kningarna ska lagras
	HashMap<Integer, Long> memory = new HashMap<Integer, Long>();
	
	Integer value;
	Long result;

	//Denna metod ska f� (n) som argument och returna 2^n om ber�kningen finns, annars null
	private long getValueFromMemory(Integer value) {
		return memory.get(value);
	}
	
	
	//Integer-v�rdet ska vara n
	//Long-v�rdet ska vara 2^n
	private void addValueToMemory(Integer value, Long result) {
		memory.put(value, result);
	}
	
	//Denna metod ska rensa inneh�llet av minnet.
	public void clearMemory() {
		memory.clear();
	}
	
	//Denna metod tar (n) (st�rre eller lika med 0) som parameter och returnerar (2^n)
	//Denna metod ska vara rekursiv
	public static long computePower(int power) {
		if((power == 1) || (power == 0)) {
			return 1;
		}
		else {
			return 2*computePower(power-1);
		}
	}
	
	//Denna metod anropas av Program-klassen n�r anv�ndaren skrivit in ett positivt tal.
	//Metoden ska g�ra f�ljande:


	public long compute2Power(int power) {
	//F�rst kolla om power �r mindre �n 0, d� ska den kasta en IllegalArgumentException.
		if(power < 0)
			throw new  IllegalArgumentException();
	//Om power �r st�rre �n 0, kolla om ber�kningen av 2^power finns i minnet, d� returnerar den v�rdet som finns d�r
		else if(power > 0) {
			return getValueFromMemory(value);
		}
	/*Om ber�kningen inte finns i minnet, s� ska den:
	 * 1. Utf�ra ber�kningen med hj�lp av computePower-metoden
	 * 2. L�gga den ber�kningen i minnet med hj�lp av addValueToMemory-metoden
	 * 3. Returnera ber�kningen*/
		else {
			return computePower(power);
		}
	}




}




