// Very simple utility that can generate password for you for any case of life
import java.util.Random;
import java.util.Scanner;

class GenP{
    public static void main(String[] args){
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = "abcdefghijklmnopqrstuvwxyz";
        String num = "0123456789";
        String specials = "'`~!@#$%^&*()_-=+№;:?[]{}'";
        String combines = upper + lower + num + specials;
        
        Scanner len = new Scanner(System.in);
        System.out.println("GenP");
        System.out.println("How long should your password be?");
        int ln = len.nextInt();

        char[] password = new char[ln];
        Random r = new Random();

        for (int i = 0; i < ln; i++){
            password[i] = combines.charAt(r.nextInt(combines.length()));
        }

        System.out.println(new String(password));
    }
}