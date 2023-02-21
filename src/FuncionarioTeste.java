public class FuncionarioTeste {
   private String nome;
   private String cpf;
   private double salario;
   private int tipo = 0; //0 - funcionario comun, 1 - gerente, 2 - diretor

   //public Funcionario(){ -> se não for criado o compilador insere automaticamente }

    public double getBonificacao() {
        if(this.tipo == 0) {// funcionario comun
            return this.salario * 0.1;
        } else if (this.tipo == 1) {//1 - gerente
            return this.salario;
        } else { // diretor
            return this.salario + 1000.0;
        }


    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getTipo() {
        return tipo;
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
