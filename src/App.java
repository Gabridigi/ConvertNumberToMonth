import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci il numero a cui far corrsispondere il mese");
        int numero= input.nextInt();
        String mesi= " January February  March    April     May      June     July    August  September October November December ";
        System.out.println(mesi.substring(numero*9-9, numero*9));
    }
}
