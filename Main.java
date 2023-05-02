import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        while(true) {
            Arquivo arquivo = new Arquivo("arquivo.txt");
            ApiViaCep apiViaCep = new ApiViaCep();
            Scanner input = new Scanner(System.in);
            String cep;
            String result;

            System.out.println("Digite o cep: ");
            cep = input.nextLine();
            
            result = apiViaCep.consultarCep(cep);
            
            arquivo.writerFile(result);
        }
    }
}