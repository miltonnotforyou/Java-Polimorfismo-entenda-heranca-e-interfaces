public class Funcionario {
   private String nome;
   private String cpf;
    private double salario;

   //public Funcionario(){ -> se não for criado o compilador insere automaticamente }

    public double getBonificacao() {
        return this.salario * 0.05;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
