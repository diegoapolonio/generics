import generics.hotel.Funcionario;
import generics.hotel.FuncionarioService;
import generics.hotel.FuncionarioServiceImpl;

public class Main {
    public static void main(String[] args) {
      FuncionarioService funcionarioService = new FuncionarioServiceImpl();
      Funcionario funcionario = new Funcionario();
      funcionario.setId(12);
      funcionario.setName("diego");
      funcionario.setEmail("diegoapoloniodasilva@gmail.com");
      funcionarioService.salvar(funcionario);
    }
}