public class PracticeProblem {

	public static void selectionSortName(String[] names, int[] ages) {
	for (int out=0; out<names.length-1; out++){
		int min = out;

		for (int in=out+1; in<names.length; in++){
			if (names[in].compareToIgnoreCase(names[min])<0){
				min = in;
			}

		}
		String temp = names[out];
		names[out]=names[min];
		names[min]= temp;

		int tempInt = ages[out];
		ages[out]=ages[min];
		ages[min]=tempInt;
	}
}

	public static void selectionSortAge(String[] names, int[] ages) {
		for (int out=0; out<names.length-1; out++){
			int min = out;
	
			for (int in=out+1; in<names.length; in++){
				if (ages[in]<ages[min]){
					min = in;
				}
	
			}
			String temp = names[out];
			names[out]=names[min];
			names[min]= temp;
	
			int tempInt = ages[out];
			ages[out]=ages[min];
			ages[min]=tempInt;
		}
}

}
