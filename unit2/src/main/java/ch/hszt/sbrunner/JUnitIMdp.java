package ch.hszt.sbrunner;

class JUnitIMdp implements IMdpJunitDemo{

	
	public boolean isEmpty(String s) {
		
		if(s == null || s.length() == 0){
			return true;
		}
		
		return false;
	}

	
	public String capitalize(String s) {
		
		StringBuffer first = new StringBuffer(s.toUpperCase()).delete(1,s.length());
		StringBuffer end = new StringBuffer(s.toLowerCase().substring(1));
		
		return first.append(end).toString();
	}

	
	public String reverse(String s) throws NullPointerException {

		if(s == null){
			throw new NullPointerException();
		}
		
		return new StringBuffer(s).reverse().toString();
		
	}

	
	public String join(String... strings) {
		
		StringBuffer result = new StringBuffer();
		for (int i = 0; i < strings.length; i++) {
			result.append(strings[i] + " ");			
		}
		
		result.deleteCharAt(result.length() - 1);
		
		return result.toString();
		
	}
	
	public static void main(String[] args) {
		
	}

}
