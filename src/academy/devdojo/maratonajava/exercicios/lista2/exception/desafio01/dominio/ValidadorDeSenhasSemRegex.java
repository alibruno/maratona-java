package academy.devdojo.maratonajava.exercicios.lista2.exception.desafio01.dominio;

// Crie um metodo validarSenha(String senha) que verifica se uma senha atende a um
// conjunto de critérios de segurança. Se a senha for válida, o metodo simplesmente
// termina. Se for inválida, ele deve lançar uma exceção específica que descreve
// exatamente qual regra foi violada. Crie as seguintes exceções customizadas (podem
// herdar de Exception ou RuntimeException, a sua escolha):
//      º SenhaCurtaException: Lançada se a senha tiver menos de 8 caracteres.
//      º SenhaSemNumeroException: Lançada se a senha não contiver pelo menos um
//      dígito numérico.
//      º SenhaSemMaiusculaException: Lançada se a senha não contiver pelo menos uma
//      letra maiúscula.
//O metodo validarSenha deve verificar todas as condições. O código que chama este
// metodo deve usar blocos try-catch separados para cada tipo de exceção, permitindo
// fornecer feedback extremamente preciso ao usuário sobre como corrigir sua senha.
// Este desafio move o aluno de simplesmente tratar exceções para usá-las como uma
// ferramenta de design para comunicar erros de validação de forma clara e específica.
public class ValidadorDeSenhasSemRegex {
    public void validarSenha(String senha) {
        if (senha.length() < 8) {
            throw new SenhaCurtaException("Erro: tamanho da senha menor do que 8 caracteres.");
        }
        char[] senhaCharArray = senha.toCharArray();
        char[] letrasMaiusculas = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        char[] numeros = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        boolean temNumero = false;
        boolean temMaiuscula = false;

        for (char s : senhaCharArray) {
            for (char numero : numeros) {
                if (s == numero) {
                    temNumero = true;
                    break;
                }
            }
            for (char letraMaiuscula : letrasMaiusculas) {
                if (s == letraMaiuscula) {
                    temMaiuscula = true;
                    break;
                }
            }

            if (temNumero && temMaiuscula) {
                break;
            }
        }

        if (!temNumero) {
            throw new SenhaSemNumeroException("Erro: Senha sem número.");
        }
        if (!temMaiuscula) {
            throw new SenhaSemMaiusculaException("Erro: Senha sem letra maiúscula.");
        }
        System.out.println("Senha válida!");
    }
}