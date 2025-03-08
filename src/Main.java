public class Main {
    public static void main(String[] args) {

        System.out.println("Olá mundo");

        // Criando uma instância Java:

        Empresa empresa = new Empresa();

        System.out.println(empresa.nomeEmpresa);
        System.out.println(empresa.CnpjEmpresa);
        System.out.println(empresa.tipoEmpresa);
        System.out.println(empresa.enderecoEmpresa);

        System.out.println("O nome do funcionario é: " + empresa.nomeFuncionario);
        System.out.println("O salário do funcionario é: " + empresa.valorSalarioFuncionario);
        System.out.println("O cargo do funcionario é: " + empresa.cargoFuncionario);

        // Testando a nova Branch
        
        EmpresaSetor empresaSetor = new EmpresaSetor();
        System.out.println(empresaSetor.nomeSetorFinanca);

        // Declaração de variáveis Java:

        int aumento = 12;
        int salarioFuncionario = 1512;

        // Operações matemáticas:

        System.out.println(aumento + salarioFuncionario);
        System.out.println(aumento - salarioFuncionario);
        System.out.println(salarioFuncionario / aumento);
        System.out.println(aumento * salarioFuncionario);

    }
}