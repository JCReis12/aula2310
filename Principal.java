package ATVS2;

public class Principal {

	public static void main(String[] args) {
		
		Medico medico = new Medico ("Lucas", "Clínico geral", 1000, "XXXX");
		medico.agendarConsulta();
		
		Fisioterapeuta fisioterapeuta = new Fisioterapeuta ("Katia", "Fisio geral", 1000, "XXXX");
		fisioterapeuta.agendarConsulta();
		
		Dentista dentista = new Dentista ("Kaique", "Dentista geral", 1000, "XXXX");
		dentista.agendarConsulta();

	}

}
