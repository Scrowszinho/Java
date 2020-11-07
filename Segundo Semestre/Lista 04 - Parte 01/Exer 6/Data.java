// Luis Gustavo Godoy Camargo
public class Data {
    int dia, dia1;
    int mes, mes1;
    int ano, ano1;
    int d;
    public Data(int dia, int mes, int ano, int dia1, int mes1, int ano1) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        //
        this.dia1 = dia1;
        this.mes1 = mes1;
        this.ano1 = ano1;
    }

public void dataMostrar(){
    if(dia == dia1 && mes == mes1 && ano == ano1){
    System.out.println("Datas iguais.");
    }
    if(ano1>ano){
        d = ((ano1 - ano)*365)+((mes1 - mes)*31)+(dia1 - dia);
        System.out.println("Primeira data foi maior: "+this.dia+"/"+this.mes+"/"+this.ano+
        "\nDias de diferença : "+ d);
    }
    if(ano>ano1){
        d = ((ano - ano1)*365)+((mes - mes1)*31)+((dia - dia1)*1);
        System.out.println("Segunda data foi maior: "+this.dia1+"/"+this.mes1+"/"+this.ano1+
        "\nDias de diferença : "+ d);
        
    }
}

}