public class App {
    public static void main(String[] args) throws Exception {
        Funcionario giovana = new Gerente();
        giovana.setNome("Giovana");
        System.out.println(giovana.getNome());

        Gerente stefany = new Gerente();
        stefany.setSalario(20000);
        stefany.setSenha(2222);

        SistemaInterno sistemaInterno = new SistemaInterno();
        sistemaInterno.autentica(stefany);

        EditorVideo otavio = new EditorVideo();
        otavio.setSalario(1000);

        ControleBonificacao controle = new ControleBonificacao();
        System.out.println(controle.registra(giovana));
        System.out.println(controle.registra(stefany));
        System.out.println(controle.registra(otavio));
    }
}
