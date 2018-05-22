package exercicio1_2;

public class Calzonaria implements AbstractPizzaria {

	@Override
	public Pizza getFactory(DiasSemana factory) {
		switch (factory) {
		case DOMINGO:
			return null;
		case SEGUNDA_FEIRA:
			return new CalzoneCalabresa();
		case TERCA_FEIRA:
			return new CalzonePresunto();
		case QUARTA_FEIRA:
			return new CalzoneCalabresa();
		case QUINTA_FEIRA:
			return new CalzonePresunto();
		case SEXTA_FEIRA:
			return new CalzoneCalabresa();
		case SABADO:
			return new CalzonePresunto();
		}
		return null;
	}

}
