import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Personaje personaje=new Personaje();
        boolean resquest=CreateCaharacter(personaje);
        String RespRequest=(resquest==true)?"Satisfactorio":"No se logro";
            System.out.println("\n\n\nRequest obtenido: --->" + RespRequest);
            
    }
    public static boolean CreateCaharacter(Personaje personaje)
        {
            //Titulo
            String titulo = "CREACION DE PERSONAJES";
            String tituloFinal = "ESTE ES EL RESULTADO DE TU PERSONAJE";
            //Preguntas al usuario
            String _Nombre = "Cual es el nombre?";
            Scanner sc_Nombre= new Scanner(System.in);
            String _Edad = "Cual es la edad? ";
            Scanner sc_Edad= new Scanner(System.in);
            String _Estatura = "Cual es la estatura? ";
            Scanner sc_Estatura= new Scanner(System.in);
            String _Peso = "Cual es el peso? "; 
            Scanner sc_Peso= new Scanner(System.in);
            String _Sexo = "Cual es el genero?";
            Scanner sc_Sexo= new Scanner(System.in);
            String _Contextura="Cual es la contextura?";
            Scanner sc_Contextura= new Scanner(System.in);
            String _ColorOjos="Cual es el color de ojos?"; 
            Scanner sc_ColorOjos= new Scanner(System.in);
            String _ColorCabello="Cual es el color de cabello?";
            Scanner sc_ColorCabello= new Scanner(System.in);
            String _ColorPiel="Cual es el color de Piel?";
            Scanner sc_ColorPiel= new Scanner(System.in);
            String _Raza="Cual es la Raza? ";
            Scanner sc_Raza= new Scanner(System.in);
            String _DescripcionGeneral="Describe un brevemente su biografia?";
            Scanner sc_DescripcionGeneral= new Scanner(System.in);
            String _Health="Cual seria el rango de salud?, especifica de 0 a 100";
            Scanner sc_Health= new Scanner(System.in);
            String _Power= "Cual seria el rango de poder?, especifica de 0 a 100";
            Scanner sc_Power= new Scanner(System.in);
            String _Energy= "Cual seria el rango de energia?, especifica de 0 a 100";
            Scanner sc_Energy= new Scanner(System.in);
            //Extras
            String saltoLinea = "\n";

            System.out.println(titulo);
            System.out.println("====================================");System.out.println("====================================");
            System.out.println(_Nombre);
             personaje.Nombre = sc_Nombre.nextLine();
            System.out.println("===================================="); System.out.println("====================================");
            System.out.println(_Edad);
            personaje.Edad =sc_Edad.nextLine();
            System.out.println("===================================="); System.out.println("====================================");
            System.out.println(_Estatura);
            personaje.Estatura =sc_Estatura.nextLine();
            System.out.println("===================================="); System.out.println("====================================");
            System.out.println(_Peso);
            personaje.Peso =sc_Peso.nextLine();
            System.out.println("===================================="); System.out.println("====================================");
            System.out.println(_Sexo);
            personaje.Sexo =sc_Sexo.nextLine();
            System.out.println("===================================="); System.out.println("====================================");
            System.out.println(_Contextura);
            personaje.Contextura =sc_Contextura.nextLine();
            System.out.println("===================================="); System.out.println("====================================");
            System.out.println(_ColorOjos);
            personaje.ColorOjos =sc_ColorOjos.nextLine();
            System.out.println("===================================="); System.out.println("====================================");
            System.out.println(_ColorCabello);
            personaje.ColorCabello =sc_ColorCabello.nextLine();
            System.out.println("===================================="); System.out.println("====================================");
            System.out.println(_ColorPiel);
            personaje.ColorPiel =sc_ColorPiel.nextLine();
            System.out.println("===================================="); System.out.println("====================================");
            System.out.println(_Raza);
            personaje.Raza=sc_Raza.nextLine();
            System.out.println("===================================="); System.out.println("====================================");
            System.out.println(_DescripcionGeneral);
            personaje.DescripcionGeneral =sc_DescripcionGeneral.nextLine();
            System.out.println("===================================="); System.out.println("====================================");
            System.out.println(_Health);
            personaje.Health =sc_Health.nextInt();
            System.out.println("===================================="); System.out.println("====================================");
            System.out.println(_Power);
            personaje.Power  = sc_Power.nextInt();
            System.out.println("===================================="); System.out.println("====================================");
            System.out.println(_Energy);
            personaje.Energy  = sc_Energy.nextInt();

            String Resultado =
            saltoLinea+"El nombre de tu personaje es : "+ personaje.Nombre +
            saltoLinea+"La edad que tiene es de : " + personaje.Edad +
            saltoLinea+"Mide :"    + personaje.Estatura +
            saltoLinea+"El peso es de : "  + personaje.Peso +
            saltoLinea+"Su genero es : "   + personaje.Sexo +
            saltoLinea+"Su contextura es : "  + personaje.Contextura +
            saltoLinea+"Su color de ojos es : " + personaje.ColorOjos +
            saltoLinea+"Su color de cabello es : "   + personaje.ColorCabello +
            saltoLinea+"Su color de piel es: " + personaje.ColorPiel +
            saltoLinea+"Su Raza es : "  + personaje.Raza +
            saltoLinea+"Biografia : "+ saltoLinea + personaje.DescripcionGeneral +
            saltoLinea+"Salud : "  + personaje.Health +
            saltoLinea+"Poder : "  + personaje.Power +
            saltoLinea+"Enrgia : "  + personaje.Energy;
            System.out.println("===================================="); System.out.println("====================================");
            System.out.println(tituloFinal);
            System.out.println("====================================");
            System.out.println(Resultado);
            System.out.println("====================================");
            
            return true;
        }
}
