package packageIntroduccionAJava;

import java.util.ArrayList;

public class Multioperador {

	private  ArrayList<Integer> arrayList = new ArrayList<Integer>();
	
	
	public ArrayList<Integer> getArrayList() {
		return arrayList;
	}

	public void setArrayList(ArrayList<Integer> arrayList) {
		this.arrayList = arrayList;
	}

	public Multioperador(ArrayList<Integer> arrayList) {
		super();
		this.arrayList = arrayList;
	}

	public void addNumber(Integer num) {
		arrayList.add(num);
	}
	public Integer getSumaTotal() {
		Integer sumaTotal = 0;
		
		for( Integer num: arrayList) {
			sumaTotal += num;
		}
		return sumaTotal;
	}
	
	public Integer getRestaTotal() {
		Integer restaTotal = 0; 
		
		for (Integer num: arrayList) {
			restaTotal -= num; 
		}
		
		return	restaTotal;
	}
	
	public Integer getMultiplicacionTotal() {
		Integer multiplicacionTotal = 1;
		
		for( Integer num : arrayList) {
			multiplicacionTotal *= num;
		}
		return multiplicacionTotal;
	}


}
