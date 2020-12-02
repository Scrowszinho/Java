// Luis Gustavo Godoy Camargo
public class Calculadora {
	private int num1;
	private int num2;

	//
	public Calculadora () {
		this.num1 = 0;
		this.num2 = 0;
	}

	//
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	//

	//
	public int getNum1() {
		return num1;
	}

	public int getNum2() {
		return num2;
	}
	//
	public int soma(){
	return num1+num2;	
	}
	public int subtrair(){
	return num1-num2;	
	}
	public int multiplicar(){
		return num1*num2;	
	}
	public double dividir(){
		return num1/num2;	
	}
	

}