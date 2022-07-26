import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        Cliente tiago = new Cliente();
        tiago.setNome("tiago");

        Conta cc = new ContaCorrente(tiago);
        Conta cp = new ContaPoupanca(tiago);

        //Início
        int outraOp;

        do {
            int op = Conta.getOp(sc);
            if (op == 1 || op == 2 || op == 3) {
                int tipoConta = Conta.getTipoConta(sc);
                Conta.OpEscolhida(sc, cc, cp, op, tipoConta);
            } else {
                System.out.println("Opção incorreta, tente novamente");
                return;
            }

            System.out.println("=================================\nConta Corrente");
            cc.imprimirInfoComuns();
            System.out.println("=================================\nConta Poupança");
            cp.imprimirInfoComuns();
            System.out.println("=================================");

            System.out.println("Deseja realizar outra operação?\n1 - Sim\n2 - Não");
            outraOp = sc.nextInt();
        }while(outraOp != 2);

    }

}