package Prueba;

import java.util.StringTokenizer;

public class testP {
	public int add (String numbers) {
		int suma = 0;
		if((numbers != "") && (numbers != null)) {
			if(numbers.contains(",")) {
				String parametros[] = numbers.split(",");
				int parametro1 = Integer.parseInt(parametros[0]);
				int parametro2 = Integer.parseInt(parametros[1]);
				suma = parametro1 + parametro2;
			}
			else {
				suma = Integer.parseInt(numbers);
			}
		}
		return suma;
	}
}
