package ATVS2;

public class Medico extends ProfissionalSaude{

	protected String crm;

	public Medico(String nome, String especialidade, int valorConsulta, String crm) {
		super(nome, especialidade, valorConsulta);
		this.crm = crm;
	}

	public void agendarConsulta() {
		System.out.println("Agendar consulta médica");
	}
	
	
	
	
	
	
	
	
	
}
