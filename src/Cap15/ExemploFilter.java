package Cap15;

import java.util.ArrayList;
import java.util.List;

public class ExemploFilter {

	public static void main(String[] args) {
		List <Funcionario> lista = new ArrayList<>();
		
		lista.add(new Funcionario( 3018, " Joaquim " , "Desenvolvedor", 5500.0 ));
		lista.add(new Funcionario( 1045, " Maria da dores " , "Analista", 6250.0 ));
		lista.add(new Funcionario( 1780, " João Ricardo " , "Desenvolvedor", 7100.0 ));
		lista.add(new Funcionario( 5200, " Ana Maria " , " Vendedor", 4100.0 ));
		lista.add(new Funcionario( 3999, " Robson Gusmão " , "Analista", 6500.0 ));
		lista.add(new Funcionario( 2389, " Eduardo Alves " , "Desenvolvedor", 3200.0 ));
		
		lista.stream()
		.filter(f -> f.getCargo().equals("Desenvolvedor"))
		.filter(f -> f.getSalario () > 5000)
		.forEach( System.out:: println);

	}

}
