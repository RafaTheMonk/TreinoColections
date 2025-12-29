package arrays_colections;

public class Usuario {
	String nome, email;
	
	public boolean equals(Object objeto) {
		if(objeto instanceof Usuario) {
			Usuario outro = (Usuario) objeto;
			
			return super.equals(outro);
		}else {
			return false;
		}
	}
}
