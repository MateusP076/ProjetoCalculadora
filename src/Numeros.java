public class Numeros {
    private double num1;
    private double num2;
    private double media;

    public Numeros() {
    }

    public Numeros(double num1, double num2, double media) {
        this.num1 = num1;
        this.num2 = num2;
        this.media = media;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }
    public void Calcmedia(){
        media = (num1 + num2*2) / 3;
    }
    public void Exibemedia(){
        if (media<3){
            System.out.println("Reprovado chefe");
        } else if(media>=3.5 && media<=4.9){
            System.out.println("Você esta de exame");
        }  else if (media>=4.9){
            System.out.println("Você esta aprovado");
        }
    }
}
