
import java.util.Scanner;

//nuestro primer programa Hola Mundo,comentarios de una sola linea
/*
muchas lineas comentarios extensivo
muchas  mas 
y mas 
y mas
*/

public class Hola_Mundo {

    private static char a;
    public static void main (String args[]){
/*System.out.println("Hola Mundo desde java");
        int miVariable = 10;
        System.out.println(miVariable);
        miVariable = 5;
        System.out.println(miVariable);
        //Tipo String,con new se es con objeto
        String miVariableCadena = "Bienvenidos";
        System.out.println(miVariableCadena);
        miVariableCadena = "sigamos creciendo en programacion";
        System.out.println(miVariableCadena);
         */
        //var - inferencia de tipo en java
        /*var miVariableEntera2 = 10;
        var miVariableCadena2 = "seguimos estudiando";
        System.out.println("miVariableEntera2 = " + miVariableEntera2);
        System.out.println("miVariableCadena2 = " + miVariableCadena2);
        //soutv + tab
        //para ejecutar shif +f6 la tecla para mayuscula
        //reglas para definir una variable en java
        var usuario = "osvaldo";
        var titulo = "Ingeniero";
        var union = titulo +" "+ usuario;
        System.out.println("union = " + union );
        var a = 8;
        var b = 4;
        System.out.println(usuario + (a + b));
        //ejercisio caracteres especiales con java
        var nombre = "Natalia";
        System.out.println("nueva linea: \n" + nombre);//diagonal inversa y letra n
        System.out.println("Tabulador: \t" + nombre);//tabulador un espacio para centrar
        System.out.println("\t\t.: MENU:.");//\t para corre mass
        System.out.println("retoceso: \b"+ nombre);//caracter de troseso \b retrocede masss
        System.out.println("comillas simples: \'" + nombre + "\'");
        System.out.println("comillas dobles: \""+ nombre +"\"");*/
        //clase scanneR
        /*Scanner entrada = new Scanner (System.in);
        System.out.println("dijite su nombre:  ");
        var usuario2 = entrada.nextLine();
        System.out.println("usuario2 = " + usuario2 );
        System.out.println("escriba el titulo: ");
        var titulo2 = entrada.nextLine();
        System.out.println("resultado:  "+titulo2+" "+ usuario2);*/
        //tipos enteros:byte,short,int,long comentar .//una linea /**/multiples lineas
        /*byte numeroByte =(byte) 127;
        System.out.println("numEnteroByte = " + numeroByte);
        System.out.println("VALOR MINIMO DEL BYTE: "+ Byte.MIN_VALUE);
        System.out.println("VALOR MAXIMO DEL BYTE: "+ Byte.MAX_VALUE);
        
        short numEnteroShort = 32767;
        System.out.println("numEnteroShort: " + numEnteroShort);
        System.out.println("valor minimo del short: "+ Short.MIN_VALUE);
        System.out.println("VALOR MAXIMO DEL SHORT: "+ Short.MAX_VALUE);
        
        int numEnteroInt = (int)2147483649l;
        System.out.println("numEnteroInt = " + numEnteroInt); 
        System.out.println("VALOR MINIMO DEL INT:"+ Integer.MIN_VALUE);
        System.out.println("VALOR MAXIMO DEL INT:"+ Integer.MAX_VALUE);
        
        long numEnteroLong = (long) 10;//agregar la l mayuscula par tomar bien el resultado
        System.out.println("numEnteroLong = " + numEnteroLong); 
        System.out.println("VOR MINIMO DEL long:"+ Long.MIN_VALUE);
        System.out.println("VALOR MAXIMO DEL long:"+ Long.MAX_VALUE);*/
        
        
        //tipos primitivos y flotantes
        /*float numFloat = (float)10.0F;//copiamos el numero maximo 3.4028235E38D ()
        System.out.println("numFloat = " + numFloat);
        System.out.println("el valor minimo de float:"+ Float.MIN_VALUE);
        System.out.println("el valor maximo de float:"+ Float.MAX_VALUE);
        
         double numDouble = 10;//poner la d mayas
         System.out.println("numDouble = " + numDouble);
        System.out.println("el valor minimo de double:"+ Double.MIN_VALUE);
        System.out.println("el valor maximo de double:"+ Double.MAX_VALUE);*/
        
         //(float) wse va el error
         //Inferencia de tipos var y tipos primitivo
         /*var numEntero = 20; //las literales sin punto automaticamente son  detipo int.
         System.out.print("numEntero = " + numEntero);
         var numFloat = 10.0F;//AUTOMATICAMENTE CON EL PUNTO SE TRANSFORMA EN TIPO DOUBLE
         System.out.println("numFloat = " + numFloat);
         var numDouble = 10.0;
         System.out.println("numDouble =" +numDouble);*/
         //TIPOS PRIMITIVOS CHAR
         /*char miVariableChar = a;
         System.out.println("miVariableChar =" + miVariableChar);*/
       
         /*char varCaracter = "\u0024";//indicamos a java la asignacion  con el codigounicode
         System.out.println("varCaracter = " + varCaracter);
         char varCaracterDecimal = 36; //valor decimal del juego de caracteres unicode
         System.out.println("vaarCaracterDecimal = " + varCaracterDecimal);*/
         /*char varCaracterSimbolo = $;//un caracter especial, podemos copiar y pegar desde unicode 
         System.out.println("varCaracterSinbolo = " + varCaracterSimbolo);
         int VAReNTERO = $ ;
         System.out.println("VAReNTERO = " + VAReNTERO);
         int varenterochar = $;
         System.out.println("varenterochar = " +varenterochar);
         int caracterchar = b;
         System.out.println("caracterchar = " + varenterochar);*/
         //convercion de tipos primitivos
        var edad = Integer.parseInt("20");
        System.out.println("edad = " + (edad + 1));
        var valorPI =Double.parseDouble("3.1416");
        System.out.println("valorPI = " + valorPI);
        
        //pedir un valor
        var entrada = new Scanner(System.in);
        System.out.println("Digite su edad:");
        edad = Integer.parseInt(entrada.nextLine());
        System.out.println("edad =  " + edad);
        //convertir d tipo primitivo en java parte 2
        var edadTexto = String.valueOf(10);
        System.out.println("edadaTexto = " + edadTexto);
        
        var fraseChar = "programadorea".charAt(0);
        System.out.println("frseChar = " + fraseChar);
        
         System.out.println("digite  un caracter:  ");
         fraseChar = entrada.nextLine().charAt(0);
        System.out.println("fraseChar = " + fraseChar);
         
         
         
    }
}
