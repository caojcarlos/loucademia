package br.com.loucademia.application.util;

public class Validation {
	public static void AssertNotEmpty(Object obj) {
		if (obj instanceof String) {
			String s = (String) obj;
			if(StringUtils.isEmpty(s)) {
				throw new ValidationException("Valor do texto nao pode ser nulo");
				
			}
		}	
		if (obj == null) {
			throw new ValidationException ("Valor nao pode ser nulo");
		}	

	}

}
