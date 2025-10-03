package br.com.etec.biblioteca.cadastro;

public class ClassePrincipal {

	public static void main(String[] args) {
		
		ClasseInformacoes Info_obj = new ClasseInformacoes();
		
		ClasseInformacoes Info_obj2 = new ClasseInformacoes("Dom Casmurro", "Machado de Assis");
		
		Info_obj.mostrarDados();
		Info_obj2.mostrarDados();

	}

}
