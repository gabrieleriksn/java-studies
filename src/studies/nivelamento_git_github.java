package studies;
/**
 * nivelamento_git_github
 */

public class nivelamento_git_github {
    public static void main(String[] args) {
        /*
        Basicamente foi u ma seção específica sobre o fluxo de funcionamento do git e do github
        
        Todavia, é algo que eu já tinha um conhecimento anterior, já que vi umas aulas de introdução do assunto.

        Em suma:
        git init
        git add .
        git branch -M main
        git commit -m "mensagem"
        // Criar repositório remoto lá no github para linkar com o github local
        git remote add <comando> (lembrar de escolher a chave ssh)
        git push -u origin main
        
        Comandos interessante:
        git log // listar todos os commits 
        git log --oneline // resumir os commits em uma única linha
        git status // status do repositório local
        git reset // tira todo mundo do stage
        git diff // dá pra usar o vscode com efeito semelhante, mas basicamente diz o que foi alteraod no arquivo
        
        git checkout <codigo do commit> // Volta o repositorio local para o estado do commit espeficado
        git checkout main // volta pra head, ou seja, o o último commit realizado
        git checkout ~<num> // volta num commits antes do head, por exemplo o  git checkout Head~1 volta para o 
        penúltimo commit.
        IMPORTANTE: Antes de voltar pra main, certifique-se de que n fez nenhuma alteração no arquivo de 
        commits anteriorres
        O ideal é usar a seguinte sequência de comandos:
        git reset // pra tirar qualquer stage feito acidentalmente
        git clean -df
        git checkout -- .

        O arquivo .gitignore 
        Lee indica tudo o que não deve ser salvo pelo git, basicamente.
        Nele instanciaremos os arquivos que n queremos que sejam salvos pelo git, por exmeplo
        
        Como atualizar o repositório local em relação ao remoto??
        git pull origin(nome do remoto) main(nome da branch)

        */
                
    }
}