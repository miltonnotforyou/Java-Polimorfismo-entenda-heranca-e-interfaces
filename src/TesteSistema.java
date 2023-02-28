public class TesteSistema {
    public static void main(String[] args) {
        Gerente g = new Gerente();
        g.setSenha(2525);

        Administrador adm = new Administrador();
        adm.setSenha(3333);

        Cliente cl = new Cliente();
        cl.setSenha(2525);

        SistemaInterno si = new SistemaInterno();
        si.autentica(g);
        si.autentica(adm);
        si.autentica(cl);
    }
}
