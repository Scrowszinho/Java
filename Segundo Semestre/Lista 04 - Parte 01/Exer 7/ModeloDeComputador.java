// Luis Gustavo Godoy Camargo
public class ModeloDeComputador {

    private int pm;
    private int pr[] = new int[3];
    private int mr;
    private int hd[] = new int[3];
    private int mon[] = new int[2];
    private int total;

    public ModeloDeComputador(int[] op) {
        this.pm = 800;
        this.pr[0] = 700;
        this.pr[1] = 830;
        this.pr[2] = 910;
        this.mr = 350;
        this.hd[0] = 300;
        this.hd[1] = 420;
        this.hd[2] = 500;
        this.mon[0] = 320;
        this.mon[1] = 520;
        this.total = 0;
    }

    public void calcularPreco(int[] op) {
        if (op[0] == 1) {
            this.total += this.pm;
        }
        //
        if (op[1] == 1) {
            this.total += this.pr[0];
        } else if (op[1] == 2) {
            this.total += this.pr[1];
        } else if (op[1] == 3) {
            this.total += this.pr[2];
        }
        //
        this.total += this.mr * op[2];
        //
        if (op[3] == 1) {
            this.total += this.hd[0];
        } else if (op[3] == 2) {
            this.total += this.hd[1];
        } else if (op[3] == 3) {
            this.total += this.hd[2];
        }
        //
        if (op[4] == 1) {
            this.total += this.mon[0];
        } else if (op[4] == 2) {
            this.total += this.mon[1];
        }
        //
        System.out.println("Valor total das peças: R$"+this.total);
    }

}