package Cap15;

import java.util.HashMap;

public class ExemploHashMap {

	public static void main(String[] args) {
		   /* Cria um mapa de produtos chaveado por strings. */
        HashMap<String, Produto> map = new HashMap<>();

        /* Adiciona alguns produtos ao mapa. */
        map.put("leite",      new Produto("Leite em pó",     "Laticínios", 5.80));
        map.put("cerveja",    new Produto("Cerveja em lata", "Bebidas",    1.89));
        map.put("detergente", new Produto("Detergente",      "Limpeza",    2.49));
        map.put("manteiga",   new Produto("Manteiga",        "Laticínios", 2.90));
        map.put("pasta",      new Produto("Pasta de dente",  "Limpeza",    1.75));
        map.put("margarina",   new Produto("Manteiga",        "Laticínios", 2.90));

        System.out.println("Total de elementos do MAP: "+ map.size());//total de elementos do MAP
        /* Verifica se o mapa possui algum item com chave "cerveja" */
        System.out.println("Tem cerveja: " + map.containsKey("cerveja"));

        /* Obtem o item com chave "pasta" */
        System.out.println("Detalhes de Pasta: " + map.get("pasta"));

        /* Remove o item com chave "detergente" */
        String removido = map.remove("detergente").toString();
        System.out.println("Foi removido: " + removido);

        /* Mostra a quantidade de itens remanescentes no mapa */
        System.out.println("Total de elementos APÓS a remoção: " + map.size());

        System.out.println("===========================");

        /* Exibe todos os itens do mapa. */
        map.forEach((k, v) -> System.out.println(v));
    }
}