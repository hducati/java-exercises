package cinema;
import java.sql.Time;
import java.util.Scanner;

public class ControleCinema {

	public static void main(String[] args) {
		controle();
	}

	public static void controle() {
		if (listarSessoes() == true) {
			Sessao sessao = new Sessao();
			Time hora = sessao.consultarSessao();
			
			listarSalas();
			Scanner sc_info = new Scanner(System.in);
				
			System.out.println("Escolha uma sala: ");
			int n_sala = sc_info.nextInt();
			System.out.println("Escolha um assento: ");
			String n_assento = sc_info.next();
				
			Sala sala = new Sala();
			Assento assento = new Assento();

			if(sala.consultarSala(n_sala, n_assento)) {
				Ingresso ingresso = new Ingresso();
				ingresso.gerarIngresso(n_sala, n_assento, hora);
			} else {
				System.out.println("Sessão não encontrada.");
				System.exit(0);
			}
			
		}
	}

	
	public static boolean listarSessoes() {
		Sessao sessao = new Sessao();
		Genero genero = new Genero();
		Filme filme = new Filme();
		Ator ator = new Ator();
		System.out.println("Sessões e filmes disponíveis: ");

		System.out.println("Data sessão: " + sessao.getDataSessao());
		System.out.println("Hora sessão: " + sessao.getHoraSessao());
		System.out.println("Filme: " + filme.getTituloFilme());
		System.out.println("Genero: " + genero.getDescricaGenero());
		System.out.println("Ator: " + ator.getNomeAtor());
		
		return true;
	}
	
	public static void listarSalas() {
		Sala sala = new Sala();
		Assento assento = new Assento();
		System.out.println("Salas e assentos disponíveis: ");
		System.out.println("Sala: " + sala.getNumeroSala());
		System.out.println("Assentos: " + assento.getCodigoAssento());
	}

}
