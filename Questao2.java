import java.util.Arrays;


public class Questao2 {

	public static void main (String[] args) {
		int [] x = {1,7,9,11,12,14,16,20};
		int [] y = {2,3,5,10,15,17,18,22};

		if(Arrays.equals(x,y)){
            System.out.println("vetor1  e vetor2 iguais");
        }else{
            System.out.print("vetor1  e vetor2 diferentes");
        }
	}
}
