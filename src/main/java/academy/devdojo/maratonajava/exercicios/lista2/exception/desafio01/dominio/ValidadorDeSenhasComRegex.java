package academy.devdojo.maratonajava.exercicios.lista2.exception.desafio01.dominio;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
public class ValidadorDeSenhasComRegex {
    public void validarSenha(String senha) {
        if (senha.length() < 8) {
            throw new SenhaCurtaException("Erro: tamanho da senha menor do que 8 caracteres.");
        }
        String regexNumeros = "[0-9]";
        String regexMaiusc = "[A-Z]";

        Pattern patternNumeros = Pattern.compile(regexNumeros);
        Matcher matcherNumeros = patternNumeros.matcher(senha);

        if (!matcherNumeros.find()) {
            throw new SenhaSemNumeroException("Erro: Senha sem número.");
        }

        Pattern patternMaiusc = Pattern.compile(regexMaiusc);
        Matcher matcherMaiusc = patternMaiusc.matcher(senha);

        if (!matcherMaiusc.find()) {
            throw new SenhaSemMaiusculaException("Erro: Senha sem letra maiúscula.");
        }

        System.out.println("Senha válida!");
    }
}