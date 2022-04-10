package HashMaplab1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import Cap15.Produto;
import javax.swing.JOptionPane;

public class HaspMap {

	public static void main(String[] args) {
		
		HashMap<String, Integer> pessoaMap = new HashMap<>();
	        pessoaMap.put("Roberto", 35);
	        pessoaMap.put("Carla", 26);
	        pessoaMap.put("Gabriel", 18);
	        pessoaMap.put("Bruno", 17);

	        System.out.println(" -- Pessoas --");        
	        pessoaMap.forEach((k, v) -> System.out.println(k + ": " + v));
	        
	        int resp=0;
	        do
	        {
	        	Pessoa p = new Pessoa(
	        			JOptionPane.showInputDialog("Digite o nome: "), 
	        			Integer.parseInt(JOptionPane.showInputDialog("Digite a idade: ")));
	     
	        	resp=JOptionPane.showConfirmDialog(null, "Cadastrar Outro?");
	        }while(resp==0);        
	        pessoaMap.forEach((k, v) -> System.out.println(k + ": " + v));        
	    }
	}
