// Luis Gustavo Godoy Camargo
public class UsaCalculadora {
    public static void main(String[] args){
        Calculadora calc = new Calculadora();
        //
        calc.setNum1(1336);
		calc.setNum2(1);
        //
		System.out.println(calc.getNum1());
		System.out.println(calc.getNum2());
        //
       //
		System.out.println(calc.soma());
		System.out.println(calc.subtrair());
        System.out.println(calc.multiplicar());
		System.out.println(calc.dividir());

    }

}
