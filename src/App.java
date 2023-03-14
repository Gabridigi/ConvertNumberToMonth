import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci il numero a cui far corrsispondere il mese");
        int numero= input.nextInt();
        String mesi= " January February  March    April     May      June     July    August  September October November December ";
        System.out.println(mesi.substring(numero*9-9, numero*9));
        
        
        /*String gennaio= mesi.substring(0, 9);
        String febbraio= mesi.substring(9, 18);
        String marzo= mesi.substring(18, 27);
        String aprile= mesi.substring(27, 36);
        String maggio= mesi.substring(36, 45);
        String giugno= mesi.substring(45, 54);
        String luglio= mesi.substring(54, 63);
        String agosto= mesi.substring(63, 72);
        String settembre= mesi.substring(72, 81);
        String ottobre= mesi.substring(81, 90);
        String novembre= mesi.substring(90, 99);
        String dicembre= mesi.substring(99, 108);*/ 
    }
}
