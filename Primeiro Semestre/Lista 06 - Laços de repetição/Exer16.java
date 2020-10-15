public class Exer16 {
    public static void main(String[] args) {
    int n = 0, m = 15, me = 0;
    do{
    me += m;
    n++;
    m++;
        }while(m<100);
        System.out.println("Média aritmética: "+me/n);
    }
}