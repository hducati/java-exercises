package cinema;

public class Sala {
	private int numeroSala;
	private int capacidadeSala;
	
	public int getNumeroSala() {
		return numeroSala;
	}
	
	public void setNumeroSala(int numeroSala) {
		this.numeroSala = numeroSala;
	}
	
	public int getCapacidadeSala() {
		return capacidadeSala;
	}
	
	public void setCapacidadeSala(int capacidadeSala) {
		this.capacidadeSala = capacidadeSala;
	}
	
	public boolean consultarSala(int n_sala, String n_assento) {
		if (this.numeroSala == n_sala) {
			Assento assento = new Assento();
			if (assento.getCodigoAssento() == n_assento) {
				return true;
			}
		}
		return false;
	}	
}
