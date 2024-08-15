package Exercicios;

public class Aluno {
	private String nome;
	private int matricula;
	private double nota1, nota2, media;
	
	public Aluno() {
		this.nome = nome;
		this.matricula = matricula;
		this.nota1 = nota1;
		this.nota2 = nota2;
	}

	public String getNome() {
		return nome;
	}	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public double getNota1() {
		return nota1;
	}
	public void setNota1(int nota1) {
		this.nota1 = nota1;
	}
	public double getNota2() {
		return nota2;
	}
	public void setNota2(int nota2) {
		this.nota2 = nota2;
	}
	public double getMedia() {
		return media;
	}

	public int compareTo(Aluno aluno) {
		int resultado = this.nome.compareToIgnoreCase(aluno.getNome());
		return resultado;
	}	
	
	private void media(){
		this.media = (this.nota1 + this.nota2) / 2;
	}
	
	@Override
	public String toString() {
		return "ex1 [nome=" + nome + ", matricula=" + matricula + ", nota1=" + nota1 + ", nota2=" + nota2 + "]";
	}
	
	

}
