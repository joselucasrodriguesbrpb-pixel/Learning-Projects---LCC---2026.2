package atividadesLP;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestaPessoa {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        List<Pessoa> pessoas = new ArrayList<>();
        Pessoa pessoa;

        int i = 0;
        while(i < 5) {
            i ++;
            System.out.println("Digite o nome da pessoa: ");
            String nome = input.nextLine();
            System.out.println("Digite a idade da pessoa: ");
            int idade = Integer.parseInt(input.nextLine());
            pessoa = new Pessoa(nome, idade);
            pessoas.add(pessoa);
        }
        for (int k = 0; k< pessoas.length; k++) {

        }
    }
}
