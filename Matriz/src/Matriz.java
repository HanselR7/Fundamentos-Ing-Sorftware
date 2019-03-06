import java.util.Scanner;
public class Matriz {
    Scanner teclado;
    Object [][] matriz = new Object[4][4];
    int opcion=0, opcion1=0;
    public static void main(String[] args) {
        Matriz m=new Matriz();
        int a=0, b=0;
        m.teclado=new Scanner(System.in);
        m.matriz[0][0]="XY25";     m.matriz[0][1]="A3BC";     m.matriz[0][2]="3ATZ";     m.matriz[0][3]="3ITZ";
        m.matriz[1][0]=00;         m.matriz[1][1]=99;         m.matriz[1][2]=01;         m.matriz[1][3]=10;
        m.matriz[2][0]="A";        m.matriz[2][1]="A";        m.matriz[2][2]="C";        m.matriz[2][3]="B";
        m.matriz[3][0]=80;         m.matriz[3][1]=90;         m.matriz[3][2]=450;        m.matriz[3][3]=500;

        System.out.println("La matriz inicialmente");
        m.imprimir();
        do {
            System.out.println("Selecciona Columna\n1. Clave\t2. Cantidad\t3. Departamento\t4. Precio");
            m.opcion1 = m.teclado.nextInt();
            switch (m.opcion1) {
                case 1:
                    System.out.println("1. Ascendente\t2. Descendente");
                    b=m.teclado.nextInt();
                    switch (b){
                        case 1: m.ascendenteClave();
                            break;
                        case 2: m.descendenteClave();
                            break;
                        default:
                            System.out.println("Opcion no definida");
                    }
                    break;
                case 2:
                    System.out.println("1. Ascendente\t2. Descendente");
                    b=m.teclado.nextInt();
                    switch (b){
                        case 1: m.ascendenteNumeroCantidad();
                            break;
                        case 2: m.descendenteNumeroCantidad();
                            break;
                        default:
                            System.out.println("Opcion no definida");
                    }
                    break;
                case 3:
                    System.out.println("1. Ascendente\t2. Descendente");
                    b=m.teclado.nextInt();
                    switch (b){
                        case 1: m.ascendenteDepartamento();
                            break;
                        case 2: m.descendenteDepartamento();
                            break;
                        default:
                            System.out.println("Opcion no definida");
                    }
                    break;
                case 4:
                    System.out.println("1. Ascendente\t2. Descendente");
                    b=m.teclado.nextInt();
                    switch (b){
                        case 1: m.ascendenteNumeroPrecio();
                            break;
                        case 2: m.descendenteNumeroPrecio();
                            break;
                        default:
                            System.out.println("Opcion no definida");
                    }
                    break;
                default:
                    System.out.println("Opcion no definida");
            }
            System.out.println("Press 1 para exit");
            a=m.teclado.nextInt();
        }while (a!=1);
    }

    public void descendenteNumeroCantidad(){
        int aux=0, num=0, num1;
        String aux1="", val="", val1="";
        for (int j = 0; j < matriz.length; j++) {
            for (int i = 0; i < matriz[0].length-1; i++) {
                num=Integer.parseInt(String.valueOf(matriz[1][i]));
                num1=Integer.parseInt(String.valueOf(matriz[1][i+1]));
                if(num<num1){
                    aux=num;
                    matriz[1][i]=num1;
                    matriz[1][i+1]=aux;

                    val=String.valueOf(matriz[0][i]);
                    val1=String.valueOf(matriz[0][i+1]);

                    aux1=val;
                    matriz[0][i]=val1;
                    matriz[0][i+1]=aux1;

                    val=String.valueOf(matriz[2][i]);
                    val1=String.valueOf(matriz[2][i+1]);

                    aux1=val;
                    matriz[2][i]=val1;
                    matriz[2][i+1]=aux1;

                    num=Integer.parseInt(String.valueOf(matriz[3][i]));
                    num1=Integer.parseInt(String.valueOf(matriz[3][i+1]));
                    aux=num;
                    matriz[3][i]=num1;
                    matriz[3][i+1]=aux;
                }
            }
        }
        System.out.println("Ascendiente");
        imprimir();
    }

    public void ascendenteNumeroCantidad(){
        int aux=0, num=0, num1;
        String aux1="", val="", val1="";
        for (int j = 0; j < matriz.length; j++) {
            for (int i = 0; i < matriz[0].length-1; i++) {
                num=Integer.parseInt(String.valueOf(matriz[1][i]));
                num1=Integer.parseInt(String.valueOf(matriz[1][i+1]));
                if(num>num1){
                    aux=num;
                    matriz[1][i]=num1;
                    matriz[1][i+1]=aux;

                    val=String.valueOf(matriz[0][i]);
                    val1=String.valueOf(matriz[0][i+1]);

                    aux1=val;
                    matriz[0][i]=val1;
                    matriz[0][i+1]=aux1;

                    val=String.valueOf(matriz[2][i]);
                    val1=String.valueOf(matriz[2][i+1]);

                    aux1=val;
                    matriz[2][i]=val1;
                    matriz[2][i+1]=aux1;

                    num=Integer.parseInt(String.valueOf(matriz[3][i]));
                    num1=Integer.parseInt(String.valueOf(matriz[3][i+1]));
                    aux=num;
                    matriz[3][i]=num1;
                    matriz[3][i+1]=aux;
                }
            }
        }
        System.out.println("Ascendiente");
        imprimir();
    }

    public void ascendenteClave(){
        int aux=0, num=0, num1;
        String aux1="", val="", val1="";
        for (int j = 0; j < matriz.length; j++) {
            for (int i = 0; i < matriz[0].length-1; i++) {
                num=matriz[0][i].hashCode();
                num1=matriz[0][i+1].hashCode();
                if(num<num1){
                    aux1=String.valueOf(matriz[0][i]);
                    matriz[0][i]=String.valueOf(matriz[0][i+1]);
                    matriz[0][i+1]=aux1;

                    num=Integer.parseInt(String.valueOf(matriz[1][i]));
                    num1=Integer.parseInt(String.valueOf(matriz[1][i+1]));

                    aux=num;
                    matriz[1][i]=num1;
                    matriz[1][i+1]=aux;

                    val=String.valueOf(matriz[2][i]);
                    val1=String.valueOf(matriz[2][i+1]);

                    aux1=val;
                    matriz[2][i]=val1;
                    matriz[2][i+1]=aux1;

                    num=Integer.parseInt(String.valueOf(matriz[3][i]));
                    num1=Integer.parseInt(String.valueOf(matriz[3][i+1]));
                    aux=num;
                    matriz[3][i]=num1;
                    matriz[3][i+1]=aux;
                }
            }
        }
        System.out.println("Ascendiente");
        imprimir();
    }

    public void ascendenteDepartamento(){
        int aux=0, num=0, num1;
        String aux1="", val="", val1="";
        for (int j = 0; j < matriz.length; j++) {
            for (int i = 0; i < matriz[0].length-1; i++) {
                num=matriz[2][i].hashCode();
                num1=matriz[2][i+1].hashCode();
                if(num<num1){
                    aux1=String.valueOf(matriz[2][i]);
                    matriz[2][i]=String.valueOf(matriz[2][i+1]);
                    matriz[2][i+1]=aux1;

                    num=Integer.parseInt(String.valueOf(matriz[1][i]));
                    num1=Integer.parseInt(String.valueOf(matriz[1][i+1]));

                    aux=num;
                    matriz[1][i]=num1;
                    matriz[1][i+1]=aux;

                    val=String.valueOf(matriz[0][i]);
                    val1=String.valueOf(matriz[0][i+1]);

                    aux1=val;
                    matriz[0][i]=val1;
                    matriz[0][i+1]=aux1;

                    num=Integer.parseInt(String.valueOf(matriz[3][i]));
                    num1=Integer.parseInt(String.valueOf(matriz[3][i+1]));
                    aux=num;
                    matriz[3][i]=num1;
                    matriz[3][i+1]=aux;
                }
            }
        }
        System.out.println("Ascendiente");
        imprimir();
    }

    public void ascendenteNumeroPrecio(){
        int aux=0, num=0, num1;
        String aux1="", val="", val1="";
        for (int j = 0; j < matriz.length; j++) {
            for (int i = 0; i < matriz[0].length-1; i++) {
                num=Integer.parseInt(String.valueOf(matriz[3][i]));
                num1=Integer.parseInt(String.valueOf(matriz[3][i+1]));
                if(num>num1){
                    aux=num;
                    matriz[3][i]=num1;
                    matriz[3][i+1]=aux;

                    val=String.valueOf(matriz[0][i]);
                    val1=String.valueOf(matriz[0][i+1]);

                    aux1=val;
                    matriz[0][i]=val1;
                    matriz[0][i+1]=aux1;

                    val=String.valueOf(matriz[2][i]);
                    val1=String.valueOf(matriz[2][i+1]);

                    aux1=val;
                    matriz[2][i]=val1;
                    matriz[2][i+1]=aux1;

                    num=Integer.parseInt(String.valueOf(matriz[1][i]));
                    num1=Integer.parseInt(String.valueOf(matriz[1][i+1]));
                    aux=num;
                    matriz[1][i]=num1;
                    matriz[1][i+1]=aux;
                }
            }
        }
        System.out.println("Ascendiente");
        imprimir();
    }

    public void descendenteClave(){
        int aux=0, num=0, num1;
        String aux1="", val="", val1="";
        for (int j = 0; j < matriz.length; j++) {
            for (int i = 0; i < matriz[0].length-1; i++) {
                num=matriz[0][i].hashCode();
                num1=matriz[0][i+1].hashCode();
                if(num>num1){
                    aux1=String.valueOf(matriz[0][i]);
                    matriz[0][i]=String.valueOf(matriz[0][i+1]);
                    matriz[0][i+1]=aux1;

                    num=Integer.parseInt(String.valueOf(matriz[1][i]));
                    num1=Integer.parseInt(String.valueOf(matriz[1][i+1]));

                    aux=num;
                    matriz[1][i]=num1;
                    matriz[1][i+1]=aux;

                    val=String.valueOf(matriz[2][i]);
                    val1=String.valueOf(matriz[2][i+1]);

                    aux1=val;
                    matriz[2][i]=val1;
                    matriz[2][i+1]=aux1;

                    num=Integer.parseInt(String.valueOf(matriz[3][i]));
                    num1=Integer.parseInt(String.valueOf(matriz[3][i+1]));
                    aux=num;
                    matriz[3][i]=num1;
                    matriz[3][i+1]=aux;
                }
            }
        }
        System.out.println("Ascendiente");
        imprimir();
    }

    public void descendenteNumeroPrecio(){
        int aux=0, num=0, num1;
        String aux1="", val="", val1="";
        for (int j = 0; j < matriz.length; j++) {
            for (int i = 0; i < matriz[0].length-1; i++) {
                num=Integer.parseInt(String.valueOf(matriz[3][i]));
                num1=Integer.parseInt(String.valueOf(matriz[3][i+1]));
                if(num<num1){
                    aux=num;
                    matriz[3][i]=num1;
                    matriz[3][i+1]=aux;

                    val=String.valueOf(matriz[0][i]);
                    val1=String.valueOf(matriz[0][i+1]);

                    aux1=val;
                    matriz[0][i]=val1;
                    matriz[0][i+1]=aux1;

                    val=String.valueOf(matriz[2][i]);
                    val1=String.valueOf(matriz[2][i+1]);

                    aux1=val;
                    matriz[2][i]=val1;
                    matriz[2][i+1]=aux1;

                    num=Integer.parseInt(String.valueOf(matriz[1][i]));
                    num1=Integer.parseInt(String.valueOf(matriz[1][i+1]));
                    aux=num;
                    matriz[1][i]=num1;
                    matriz[1][i+1]=aux;
                }
            }
        }
        System.out.println("Ascendiente");
        imprimir();
    }

    public void descendenteDepartamento(){
        int aux=0, num=0, num1;
        String aux1="", val="", val1="";
        for (int j = 0; j < matriz.length; j++) {
            for (int i = 0; i < matriz[0].length-1; i++) {
                num=matriz[2][i].hashCode();
                num1=matriz[2][i+1].hashCode();
                if(num>num1){
                    aux1=String.valueOf(matriz[2][i]);
                    matriz[2][i]=String.valueOf(matriz[2][i+1]);
                    matriz[2][i+1]=aux1;

                    num=Integer.parseInt(String.valueOf(matriz[1][i]));
                    num1=Integer.parseInt(String.valueOf(matriz[1][i+1]));

                    aux=num;
                    matriz[1][i]=num1;
                    matriz[1][i+1]=aux;

                    val=String.valueOf(matriz[0][i]);
                    val1=String.valueOf(matriz[0][i+1]);

                    aux1=val;
                    matriz[0][i]=val1;
                    matriz[0][i+1]=aux1;

                    num=Integer.parseInt(String.valueOf(matriz[3][i]));
                    num1=Integer.parseInt(String.valueOf(matriz[3][i+1]));
                    aux=num;
                    matriz[3][i]=num1;
                    matriz[3][i+1]=aux;
                }
            }
        }
        System.out.println("Ascendiente");
        imprimir();
    }

    public void imprimir(){
        System.out.println("Clave\tC\tD\tprecio");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[j][i]+"\t");
            }
            System.out.println();
        }
    }
}
