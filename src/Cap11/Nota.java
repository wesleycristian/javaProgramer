package Cap11;

import java.io.NotActiveException;

public class Nota {

	private String Aluno;
	private int nota;

	public Nota(String aluno, int nota) throws NotaInvalidaExeption, NotaInvalidaExeption, notaInvalidaExecepition {
		this.setAluno(aluno);
		this.setNota(nota);

	}

	public void setAluno(String aluno) {
		this.Aluno = aluno;
	}

	public String getAluno() {
		return this.Aluno;
	}

	public void setNota(int nota) throws NotaInvalidaExeption, notaInvalidaExecepition {
		if (nota < 0 || nota > 10) {
			NotaInvalidaExeption e = new NotaInvalidaExeption();
			throw e;

		} else {
			this.nota = nota;
		}

	}

	public int getNota() {
		return this.nota;
	}

}
