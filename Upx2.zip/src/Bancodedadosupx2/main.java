package Bancodedadosupx2;

import java.util.Date;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BancoDeDados bancoDeDados = new BancoDeDados();
        MoradorDAO moradorDAO = new MoradorDAO(bancoDeDados);

        System.out.print("Digite o nome do morador: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o email do morador: ");
        String email = scanner.nextLine();

        System.out.print("Digite o telefone do morador: ");
        String telefone = scanner.nextLine();

        System.out.print("Digite o endereço do morador: ");
        String endereco = scanner.nextLine();

        Date dataRegistro = new Date();

        System.out.print("Digite o histórico de denúncias (separado por ponto e vírgula): ");
        String historicoDenuncias = scanner.nextLine();

        Morador novoMorador = new Morador(0, nome, email, telefone, endereco, dataRegistro, historicoDenuncias);
        
        moradorDAO.inserirMorador(novoMorador);

        scanner.close();
    }
}
