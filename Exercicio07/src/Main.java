import tipofuncionarios.*;

public class Main {

    public static void main(String[] args) {

        float custoTotal, custoBasico, custoMedio, custoGraduacao;
        custoTotal = custoBasico = custoMedio = custoGraduacao = 0;

        Funcionario[] funcionarios = {

                new FuncionarioG("João", "10234", "Nossa Senhora da luz", "Ensino Médio", "Ensino Superior"),
                new FuncionarioG("Gabriel", "102345", "Nossa Senhora da paz", "Ensino Médio", "Ensino Superior"),

                new FuncionarioM("João", "10234", "Nossa Senhora da luz", "Ensino Médio"),
                new FuncionarioM("Gabriel", "102345", "Nossa Senhora da paz", "Ensino Médio"),
                new FuncionarioM("Eduardo", "4567", "Nossa Senhora da conceição", "Ensino Médio"),
                new FuncionarioM("Severino", "425234", "Universal", "Ensino Médio"),

                new FuncionarioB("João", "10234", "Nossa Senhora da luz"),
                new FuncionarioB("Gabriel", "102345", "Nossa Senhora da paz"),
                new FuncionarioB("Eduardo", "4567", "Nossa Senhora da conceição"),
                new FuncionarioB("Severino", "425234", "Universal")

        };

        for(Funcionario funcionario : funcionarios) {

            custoTotal += funcionario.getRendaTotal();

            if (funcionario instanceof FuncionarioG) {
                custoGraduacao += funcionario.getRendaTotal();
                continue;
            }
            if (funcionario instanceof FuncionarioM) {
                custoMedio += funcionario.getRendaTotal();
                continue;
            }

            custoBasico += funcionario.getRendaTotal();

        }

        System.out.println("Custo total: " + custoTotal);
        System.out.println("Custo por ensino basico: " + custoBasico);
        System.out.println("Custo por ensino medio: " + custoMedio);
        System.out.println("Custo por graduacao: " + custoGraduacao);
    }
}
