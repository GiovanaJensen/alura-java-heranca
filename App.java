public class App {
    public static void main(String[] args) throws Exception {
        Funcionario giovana = new Funcionario();
        giovana.setNome("Giovana");
        System.out.println(giovana.getNome());

        Gerente stefany = new Gerente();
        stefany.setSalario(20000);

        EditorVideo otavio = new EditorVideo();
        otavio.setSalario(1000);

        ControleBonificacao controle = new ControleBonificacao();
        System.out.println(controle.registra(giovana));
        System.out.println(controle.registra(stefany));
        System.out.println(controle.registra(otavio));
    }
}
