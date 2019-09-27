package packageIntroduccionAJava;

import java.util.ArrayList;

public class Counter {

	private  ArrayList<Integer> arrayList = new ArrayList<Integer>(); 	
	
	
	// Getter and  Setters
	public ArrayList<Integer> getArrayList() {
		return arrayList;
	}

	public void setArrayList(ArrayList<Integer> arrayList) {
		this.arrayList = arrayList;
	}

	//Constructor
	public Counter(ArrayList<Integer> arrayList) {
		super();
		this.arrayList = arrayList;
	}
	
	//Method
	
	public void addNumber(Integer num) {
		arrayList.add(num);
	}
	
	
	public Integer getCantPares() {
		Integer cantNumerosPares = 0;
		
		for( Integer num: arrayList) {
			if ( num%2==0) {
				cantNumerosPares+= 1;
			}
		}
		return cantNumerosPares;
	}
	

	public Integer getCantImpares() {
		 Integer cantNumerosImpares = 0;
		
		for( Integer num: arrayList) {
			if ( num%2!=0) {
				cantNumerosImpares+= 1;
			}
		}
		return cantNumerosImpares;
	}
	
	public Integer getCantMultiplosNumero(Integer num) {
		return null;
	}

}
