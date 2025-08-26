package academy.devdojo.maratonajava.exercicios.lista2.exception.desafio02.dominio;

// Escreva um programa que lê um arquivo de texto (dados.txt). Cada linha deste
// arquivo deve conter um nome e uma idade, separados por vírgula (ex: "Ana,25"
// ou "Carlos,30"). O programa deve processar o arquivo linha por linha,
// calculando a soma das idades.
//O desafio é torná-lo robusto a erros no arquivo:
//    1. Se uma linha estiver mal formatada (ex: não tiver vírgula, a idade não
//    for um número como em "Pedro,vinte", ou a linha estiver vazia), o programa
//    não deve parar.
//    2. Em vez disso, ele deve lançar uma exceção customizada,
//    FormatoDeLinhaInvalidoException, que armazena o número da linha e o conteúdo
//    da linha problemática.
//    3. O laço principal no metodo main deve capturar essa exceção, registrar o
//    erro em um arquivo de log separado (erros.log) com a mensagem "Erro na
//    linha X: [conteúdo da linha]", e continuar o processamento para a próxima
//    linha do arquivo de dados.
//    Ao final, o programa deve imprimir a soma das idades das linhas que foram
//    processadas com sucesso. Este é um padrão de engenharia de software do mundo
//    real: construir sistemas tolerantes a falhas que podem processar grandes
//    volumes de dados, isolando e registrando os dados ruins sem interromper
//    todo o processo.


public class FormatoDeLinhaInvalidoException extends RuntimeException{
    public FormatoDeLinhaInvalidoException() {
        super("Formato de linha inválido.");
    }

    public FormatoDeLinhaInvalidoException(String message) {
        super(message);
    }
}
