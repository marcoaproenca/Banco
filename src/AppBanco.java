import model.ContaBancaria;
import java.util.Scanner;
public class AppBanco {
    public static void main(String args[]){
    	ContaBancaria[] contas; 
    	contas = new ContaBancaria[10];
    	Scanner teclado = new Scanner(System.in);
    	int contaBusca, contaRet;
        Boolean res, achei = false;

        for(int pos = 0; pos < contas.length; pos++) {
        	contas[pos] = new ContaBancaria("111.111.111-1"+pos,1000+pos, pos);
        	contas[pos].creditar(pos*100);
        }
        System.out.println("Insira o número da conta: ");
        do {
        	contaBusca = teclado.nextInt();
        	for(int i = 0; i < contas.length && !achei; i++) {
        		contaRet = contas[i].getNumero();
        		if(contaRet == contaBusca) {
        			System.out.println(contaRet);
        			System.out.println("A posição da conta é: "+i);
        			System.out.println("CPF  : "+contas[i].getCpf());
        			System.out.println("Conta: "+contaRet+"/"+contas[i].getDv());
        			System.out.println("Saldo: R$ "+contas[i].getSaldo());
        			achei = true;
        		}
        	}
        	if(!achei) {
        		System.out.println("Conta não encontrada!");
        	}
        }while(contaBusca != 0);
        System.out.println("Fim da Busca!");
        
        /*
        c1.setSaldo(2500.0);
        c2.setSaldo(5500.0);
        c3.setSaldo(6500.0);

        System.out.println("O saldo atual da conta " + c1.getNumero() +": "+c1.getSaldo());
        c1.creditar(1250.0);
        res = c2.debitar(22250.0);

        if(res == true){
            System.out.println("Debito realizado!");
        }else{
            System.out.println("Debito nao foi relaizado!");
        }

        System.out.println("O saldo atual da conta " + c1.getNumero() +": "+c1.getSaldo());
        System.out.println("O saldo atual da conta " + c2.getNumero() +": "+c2.getSaldo());
		*/

    }
}
