public class ControleBonificacao {
    private double soma;

    public double registra(Funcionario funcionario){
        double bonificacao = funcionario.getBonificacao();
        this.soma += bonificacao;
        return this.soma;
    }
}
