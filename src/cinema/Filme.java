package cinema;

import java.sql.Time;

public class Filme {
	private String tituloFilme;
	private Time duracaoFilme;

	public String getTituloFilme() {
		return tituloFilme;
	}
	
	public void setTituloFilme(String tituloFilme) {
		this.tituloFilme = tituloFilme;
	}
	
	public Time getDuracaoFilme() {
		return duracaoFilme;
	}

	public void setDuracaoFilme(Time duracaoFilme) {
		this.duracaoFilme = duracaoFilme;
	}
	
	public void consultarFilme() {
		System.out.println(this.tituloFilme);
		System.out.println(this.duracaoFilme);
		Genero genero = new Genero();
		System.out.println(genero.getDescricaGenero());
	}
}
