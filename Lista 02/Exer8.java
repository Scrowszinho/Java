/* Luis Gustavo Godoy Camargo */

public class Exer8 {
    public static int[] ve = new int[6];
  
    public static void main(String[] args) {
        for(int i = 0; i < 6;i++){ve[i] = 0;}
        dado();
        for(int i = 0; i < 6;i++){
        System.out.println((ve[i]*100)/1000000 + "%");
        }
        
    }

    //
    static void dado() {
        double a;
        for (int i = 0; i < 1000000; i++) {
            a = Math.floor(Math.random() * 6) + 1;
            if (a == 1) {
                ve[0]++;
            } else if (a == 2) {
                ve[1]++;
            } else if (a == 3) {
                ve[2]++;
            } else if (a == 4) {
                ve[3]++;
            } else if (a == 5) {
                ve[4]++;
            } else if (a == 6) {
                ve[5]++;
            }

        }
    }

}
