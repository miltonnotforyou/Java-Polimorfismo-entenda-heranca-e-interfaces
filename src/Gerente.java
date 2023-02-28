//gerente é Funcionario, Gerente herda da class funcionario, assina contrato autenticavel, é um autenticavel
public class Gerente extends Funcionario implements Autenticavel {

        private int senha;

        public double getBonificacao() {
        System.out.println("Chamando o metodo de bonificação do Gerente!");
        return super.getSalario();
    }

    @Override
    public void setSenha(int senha) {
            this.senha = senha;
    }

    @Override
    public boolean autentica(int senha) {
            if (this.senha == senha) {
                return true;
            } else {
                return false;
            }

    }
}
