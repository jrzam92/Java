import java.util.Scanner;

public class App {

    //Mandarlo por correo 
    public static void main(String[] args) throws Exception {
        //Iniciando variables 
        //Tipo Scanner
        Scanner sc_op= new Scanner(System.in);
        Scanner sc_num1= new Scanner(System.in);
        Scanner sc_num2= new Scanner(System.in);
        

        //Tipo int 
        int operacion=0;
        int num1=0;
        int num2=0;
        int res=0;

        
        //Menu para las operaciones basicas matematicas
        System.out.println("Las operaciones que puedes hacer son: ");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");
        
        operacion=sc_op.nextInt();
        
        System.out.println("Teclea un numero de 0 a 9 " );
        
        num1=sc_num1.nextInt();
        
        System.out.println("Teclea un numero de 0 a 9 " );
        
        num2=sc_num2.nextInt();
        

        switch(operacion)
        {

            case 1:
            res=num1+num2;
            System.out.println("El resultado de la suma es: "+res);
            Nombre();
            break;
            case 2:
            res=num1-num2;
            System.out.println("El resultado de la resta es: "+res);
            Nombre();
            break;
            case 3:
            res=num1*num2;
            System.out.println("El resultado de la multiplicacion es: "+res);
            Nombre();
            break;
            case 4:
            res=num1/num2;
            System.out.println("El resultado de la division es: "+res);
            Nombre();
            break;
            default:
            System.out.println("La opcion que elegiste no existe");
            Nombre();
            break;
        }
       
    }

    //Metodo que pide el nombre al usuario 
    public static void Nombre(){

        //Iniciando variables
        Scanner sc_name=new Scanner(System.in);
        //Tipo String
        String str_fullname="";
        String str_name="";
        String str_last_name="";

        //Pidiendo el nombre del usuario
        System.out.println("Escribe tu nombre: ");
        str_name=sc_name.nextLine();
        System.out.println("Escribe tu Apellido: ");
        str_last_name=sc_name.nextLine();

        str_fullname=str_name+" "+str_last_name;
        //Agradecimiento por su participacion
        System.out.println("\nGracias por participar ... "+str_fullname+"!!!!");
    }

    public static void Operadores_Racionales_Logicos(int num1,int num2)
    {


                if (num1<num2){
                        System.out.println("numero 1 es menor a numero 2");
                }
                else if (num1>num2){
                    System.out.println("numero 1 es mayor a numero 2");
                }
                 else if(num1==num2){
                    System.out.println("ambos numeros son iguales ");
                }
                 else if(num1!=num2){
                    System.out.println("numero 1 es diferente a numero 2");
                }
                 else if(num1<=num2){
                    System.out.println("numero 1 es menor o igual ");
                }
                 else if (num1>=num2){
                    System.out.println("numero 1 es mayor o igual");
                }
    }
}
