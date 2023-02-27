public class TesteFuncionario {
    public static void main(String[] args) {

        Gerente nico = new Gerente();
        nico.setNome("Nico Sphert");
        nico.setCpf("225.654.587-78");
        nico.setSalario(2600.00);

        System.out.println(nico.getNome());
        System.out.println(nico.getBonificacao());

    }
}
