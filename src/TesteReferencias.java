public class TesteReferencias {

    public static void main(String[] args) {
        Gerente g1 = new Gerente();

        g1.setNome("Marcos");
        String nome = g1.getNome();
        g1.setSalario(5000.0);

        Funcionario f = new Funcionario();
        f.setSalario(2000.0);

        EditorVideo ev = new EditorVideo();
        ev.setSalario(2500.0);

        Designer d = new Designer();
        d.setSalario(2000.0);

        ControleBonicacao controle = new ControleBonicacao();
        controle.registra(g1);
        controle.registra(f);
        controle.registra(ev);
        controle.registra(d);

        System.out.println(controle.getSoma());
    }


}
