import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
		}finally {
            terminal.close();  // Fechar o scanner após o uso
        }
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        if (parametroUm >= parametroDois){
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro")
        }

		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		
        
		//realizar o for para imprimir os números com base na variável contagem
        int contagem = parametroDois - parametroUm;
        for (int i = parametroUm +1; i < parametroDois; i++) {
            System.out.println("Imprimindo o número " + i);
        }    
    }
            
}

