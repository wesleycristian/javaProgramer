package Cap17;


import java.util.ArrayList;
import java.util.List;

public class ListVinteUm {
    public static void main(String[] args) {
        System.out.println(TesteMeli(8));
    }

    public static List<Integer> TesteMeli(int maxDigit) {
        List <Integer> listaSomam21 = new ArrayList();
        if (maxDigit >= 6 && maxDigit < 10) {
            for (int i = 1000; i < 10000; i++) {
                int u, d, c, m, soma;
                u = i%10;
                d = ((i-u)/10)%10;
                c = ((i - (10*d+u))/100)%10;
                m = (i -(100*c+d+u))/1000;
                if(u > maxDigit|| d > maxDigit|| c > maxDigit|| m > maxDigit){
                    continue;
                }
                soma = u + d + c + m;

                if (soma == 21) {
                    listaSomam21.add(i);
                }
            }
            return listaSomam21;
        }
        return null;
    }
}