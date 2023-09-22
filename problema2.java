import java.util.Scanner;
public class problema2 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int totalPuntos = 0;
        System.out.println("los puntos en toda la temporada");
        System.out.println("-1 es para finalizar el conteo");
        while(true){
            try{
             System.out.println("Introducir puntos  o -1 para finalizar");
             String input=scanner.nextLine();
             
             if (input.equals("-1")) {
                break;
            }

            int puntos = Integer.parseInt(input);
            totalPuntos += puntos;
        } catch (NumberFormatException e) {
            System.out.println("error poner codigo que sea valido");
            System.exit(0);
        }
    }

    System.out.println("Los puntos totales son " + totalPuntos + ".");
    scanner.close();
    }
    
}