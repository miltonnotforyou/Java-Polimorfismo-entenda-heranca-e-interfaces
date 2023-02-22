public class TesteGerente {
    public static void main(String[] args) {
        Gerente g1 = new Gerente();
        g1.setNome("Marcos");
        g1.setCpf("225.444.888-89");
        g1.setSalario(5000.0);

        System.out.println("Nome do Gerente: "+ g1.getNome());
        System.out.println("CPF: "+ g1.getCpf());
        System.out.println("Salario: R$" + g1.getSalario());

        g1.setSenha(252525);
        boolean autenticou = g1.autentica(252525);

        System.out.println("Autenticou: " + autenticou);
        System.out.println("Bonificação: R$"+ g1.getBonificacao());
    }
}
