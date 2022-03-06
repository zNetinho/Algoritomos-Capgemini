import java.util.Vector;

import javax.swing.JOptionPane;

public class vetor {
  
	public static void main(String[] args) {

		Vector primeirovetor = new Vector();
		Vector segundovetor = new Vector();
		
		
		
		for(int a = 0; a < 10; a++){
			primeirovetor.add(JOptionPane.showInputDialog("Entre com os valores do primeiro vetor"));
		}
		for(int a = 0; a < 10; a++){
			segundovetor.add(JOptionPane.showInputDialog("Entre com os valores do segundo vetor"));
		}
		for(int i = 0; i < 10; i++){
			for(int j = 0; j < 10; j++){
				if(primeirovetor.get(i).equals(segundovetor.get(j))){	
				}else{
					System.out.println("Vetores diferentes:" + "PosiçãoVetorA:" + primeirovetor.get(i) + "PosiçãoVetorB:" + segundovetor.get(j));
				}	
			}
		}
	}
}