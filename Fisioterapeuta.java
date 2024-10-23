package ATVS2;

public class Fisioterapeuta extends ProfissionalSaude{

	protected String crefito;

	public Fisioterapeuta(String nome, String especialidade, int valorConsulta, String crefito) {
		super(nome, especialidade, valorConsulta);
		this.crefito = crefito;
	}
	
	public void agendarConsulta() {
		System.out.println("Agendar consulta fisioterapeutica");
	}
	
}
