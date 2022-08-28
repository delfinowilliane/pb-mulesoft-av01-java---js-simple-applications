
public class Funcionarios {
	String nome;
	double salario;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void bonificacao() {
		double valor = 0;
		
		if(this.salario <= 1000){
			valor = this.salario * 0.2;
			System.out.println("Bônus: " + String.format("%.2f",valor));
			
		} else if (this.salario > 1000 && this.salario < 2000){
			valor = this.salario * 0.1;
			System.out.println("Bônus: " + String.format("%.2f",valor));
		} else if (this.salario > 2000) {
			valor = (this.salario * 0.1);
			System.out.println("Desconto: " + String.format("%.2f", valor));
			valor = -1*(this.salario * 0.1);
		} 
	
	System.out.println("Salário Líquido: " + String.format("%.2f",this.salario + valor));
	} 
}
