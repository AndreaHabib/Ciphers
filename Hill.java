import java.util.Scanner;
public class Hill {
    public static int[] matMult(int[] matRes, int[][] key, int[][] mes, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matRes[i] += key[i][j] * mes[j][0];
            }
            matRes[i] %= 26;
        }
        return matRes;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Enter String To Be Encrypted");
        String Message;
        Scanner scan = new Scanner(System.in);
        Message = scan.nextLine();
        int messageSize;
        messageSize = Message.length();
        System.out.println("Enter Key");
        int[][] key = new int[messageSize][messageSize];
        int[][] message = new int[messageSize][1];
        for(int i = 0; i < messageSize; i++) {
            message[i][0] = (Message.charAt(i)) % 65;
        }
        for (int i = 0; i < messageSize; i++) {
            for (int j = 0; j < messageSize; j++) {
                key[i][j] = (scan.nextLine().charAt(0)) % 65;
            }
        }
        int[] matRes = new int[messageSize];
        matMult(matRes, key, message, messageSize);
        String CipherText="";
        for (int i = 0; i < messageSize; i++)
            CipherText += (char)(matRes[i] + 65);
        System.out.print(" Ciphertext:" + CipherText);
    }
}
