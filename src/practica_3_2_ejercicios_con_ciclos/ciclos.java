package practica_3_2_ejercicios_con_ciclos;
import java.util.Scanner;
/**
 *
 * @author rafael
 */
public class ciclos {
    /*
     atributos que serviran como multiplos
     */
    private int mul1,mul2,mul3,mul4;
    /*
    metodos constructores, simple y por parametros
    */
    public ciclos(){
        this.mul1=0;
        this.mul2=0;
        this.mul3=0;
        this.mul4=0;
    }
    public ciclos(int num1,int num2,int num3,int num4){
        this.mul1=num1;
        this.mul2=num2;
        this.mul3=num3;
        this.mul4=num4;
    }
    /*
    seters y geters de los atributos
    */
    public void setmul1(int num1){
        this.mul1=num1;
    }
    public int getmul1(){
        return this.mul1;
    }
    public void setmul2(int num1){
        this.mul2=num1;
    }
    public int getmul2(){
        return this.mul2;
    }
    public void setmul3(int num1){
        this.mul3=num1;
    }
    public int getmul3(){
        return this.mul3;
    }
    public void setmul4(int num1){
        this.mul4=num1;
    }
    public int getmul4(){
        return this.mul4;
    }
    public int entrada(){
        Scanner sc=new Scanner(System.in);
        return sc.nextInt();
    }
    public void for_ciclo(){
        for (this.mul1=0; this.mul1 <= 100; this.mul1++) {
            if(this.mul1<100){
                System.out.print(this.mul1+",");
            }
            else System.out.println(this.mul1);
        }
    }
    public void while_ciclo(){
        this.mul2=0;
        while (this.mul2<=100) {            
            if(this.mul2<100){
                System.out.print(this.mul2+",");
            }
            else System.out.println(this.mul2);
            this.mul2+=2;
        }
    }
    public void do_while_ciclo(){
        this.mul3=0;
        do {            
            if(this.mul3<99){
                System.out.print(this.mul3+",");
            }
            else System.out.println(this.mul3);
            this.mul3+=3;
        } while (this.mul3<=100);
    }
    public void for_ciclo4(){
        for (this.mul4=0; this.mul4 <= 100; this.mul4+=4) {
            if(this.mul4<100){
                System.out.print(this.mul4+",");
            }
            else System.out.println(this.mul4);
        }
    }
    public int menu(){
        System.out.println("Ingresa una opcion");
        System.out.println("'1' multiplos de uno");
        System.out.println("'2' multiplos de dos");
        System.out.println("'3' multiplos de tres");
        System.out.println("'4' multiplos de cuatro");
        System.out.println("'5' Salir");
        int opc=entrada();
        switch(opc){
            case 1:
                for_ciclo();
                break;
            case 2:
                while_ciclo();
                break;
            case 3:
                do_while_ciclo();
                break;
            case 4:
                for_ciclo4();
                break;
            case 5:
                System.out.println("------Fin del programa-------");
                return 5;
        }
        return opc;
    }
}
