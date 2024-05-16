public class ParametrosInvalidosException extends RuntimeException {

    public void validacaoDeparametros(int parametroUm, int parametroDois) {
        if (parametroUm > parametroDois) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }

    }
}
