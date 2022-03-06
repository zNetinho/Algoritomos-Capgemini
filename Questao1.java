package mediana;
import java.util.*;  
import java.util.stream.*; 
public class mediana {

	public static void main(String[] args) {
		
	    List<Integer> lista = Arrays.asList(4,5,1,2,8,9,6); // Inicializando lista não ordenada com 7 itens(numero Ímpar de elementos).  
	    lista.sort(Comparator.naturalOrder());  //ordenando lista
        System.out.println("Lista Ordenada: "+ lista); //Printando lista  ordenada
        int mediana = lista.size()/2;
        System.out.println("Valor Mediano da Lista: "+ lista.get(mediana)); //Printando lista  ordenada