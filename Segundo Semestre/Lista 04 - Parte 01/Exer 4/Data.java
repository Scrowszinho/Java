// Luis Gustavo Godoy Camargo
public class Data {
    int dia;
    int mes;
    int ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

public boolean dataDat () {
    if(this.dia > 31 ||  this.mes > 12 || this.ano > 2020){
        return false;
    }
    else{
        return true;
    }
}

public void dataMostrar(){
    if(dataDat() == true){
    System.out.println("Data correta:\n"+this.dia+"/"+this.mes+"/"+this.ano);
    }
    else{
        System.out.println("Data Invalida");
    }
}

}