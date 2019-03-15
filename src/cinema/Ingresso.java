package cinema;

import java.sql.Time;

public class Ingresso {
	private String codigoAssentoIngresso;
	private int tipoIngresso;

	public String getCodigoAssentoIngresso() {
		return codigoAssentoIngresso;
	}
	
	public void setCodigoAssentoIngresso(String codigoAssentoIngresso) {
		this.codigoAssentoIngresso = codigoAssentoIngresso;
	}
	
	public int getTipoIngresso() {
		return tipoIngresso;
	}
	
	public void setTipoIngresso(int tipoIngresso) {
		this.tipoIngresso = tipoIngresso;
	}
	
	public void gerarIngresso(int n_sala, String n_assento, Time hora) {
		Sessao sessao = new Sessao();
		Filme filme = new Filme();
		
		System.out.println(sessao.getDataSessao() + " " +  hora);
		System.out.println(filme.getTituloFilme());
		System.out.println(n_sala);
		System.out.println(this.consultarAssentoIngresso(n_assento));
	}
	
	public String consultarAssentoIngresso(String n_assento) {
		return n_assento;
	}
	
}
