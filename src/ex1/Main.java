package ex1;

public class Main {
    public static void main(String[] args) {
        String[] sir1 = {"java","test","university"};
        String[] sir2 = {"car","university","plane"};
        for(int i = 0; i < sir1.length; i++){
            for(int j = 0; j < sir2.length; j++){
                if(sir1[i] == sir2[j]) System.out.println(sir1[i]);
            }
        }
    }
}