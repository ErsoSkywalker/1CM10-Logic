
package logicaprogramacion;

import java.util.Scanner;

public class LogicaProgramacion {

    public static void main(String[] args) {
        
        //                    0   X   (1    +   1)
        //                 0 x 1 + 0 x 1 = 0 + 0 = 0
        //boolean resultado = !(false && (true || true));
        
        //System.out.println(resultado);
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserta tu usuario");
        String usuario = sc.nextLine();
        System.out.println("Inserta tu contraseña");
        String password = sc.nextLine();
        
        System.out.println("Intentaste con usuario " + usuario);
        System.out.println("Intentaste con password " + password);
        
        if(usuario.equals("Christian") //F
                && password.equals("holaMundo")){//F
            System.out.println("Iniciaste sesión :D");
        }else{
            System.out.println("No iniciaste sesión");
        }
        
        /*
        if(!(false && (true || true))){
            System.out.println("Fue true :D");
        }else{
            System.out.println("No fue true :D");
        }*/
        
    }
    
}
