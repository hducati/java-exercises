package cinema;

import java.sql.Time;
import java.util.Date;
import java.util.Scanner;

public class Sessao {
	private Date dataSessao;
	private Time[] horaSessao;
	private double valorInteira;
	private double valorMeia;
	private boolean sessaoEncerrada;

	public Date getDataSessao() {
		return dataSessao;
	}
	
	public void setDataSessao(Date dataSessao) {
		this.dataSessao = dataSessao;
	}
	
	public Time[] getHoraSessao() {
		return horaSessao;
	}

	public void setHoraSessao(Time[] horaSessao) {
		this.horaSessao = horaSessao;
	}

	public double getValorMeia() {
		return valorMeia;
	}
	
	public void setValorMeia(double valorMeia) {
		this.valorMeia = valorMeia;
	}
	
	public boolean isSessaoEncerrada() {
		return sessaoEncerrada;
	}
	
	public void setSessaoEncerrada(boolean sessaoEncerrada) {
		this.sessaoEncerrada = sessaoEncerrada;
	}
	
	public double getValorInteira() {
		return valorInteira;
	}
	
	public void setValorInteira(double valorInteira) {
		this.valorInteira = valorInteira;
	}
	

	public Time consultarSessao() {
		System.out.println("Escolha uma sessão: ");
		for (int i=0; i <= this.horaSessao.length; i++) {
			System.out.println(i + ") - " + this.horaSessao[i] );
		}

		Scanner sc_hora = new Scanner(System.in);
		int n_sessao = sc_hora.nextInt();
		Time hora = this.horaSessao[n_sessao];
		System.out.println(hora);
		
		return hora;
	}

}
