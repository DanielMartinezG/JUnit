package ude.empresariales.codebreaker;

public class CodeBreaker {
    private static final int number = 1234;	
    
	public String compare(String numberToCompare) {
		String response="";
		if(validateNumber(numberToCompare, response)) {
			for(int i=0;i<4;i++) {
				if(numberToCompare.charAt(i)==Integer.toString(number).charAt(i)) {
					response = response.concat("X");
				}
			}
			for(int i=0;i<4;i++) {
				for(int j=0;j<4;j++) {
					if(numberToCompare.charAt(i)==Integer.toString(number).charAt(j) && i !=j) {
						response = response.concat("_");
					}
				}
			}
		}
		return response;
	}
	
	private boolean validateNumber(String numberToCompare, String response) {
        if (numberToCompare == null || numberToCompare.length() == 0) {
            response ="Usted debe ingresar algún valor en el campo numberToCompare";
        	return false;
        }

        for (char c : numberToCompare.toCharArray()) {
            if (!Character.isDigit(c)) {
            	response ="El sistema solo permite el ingreso de números";
            	return false;
            }
        }
        return true;
	}
}
