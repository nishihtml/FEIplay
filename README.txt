FEIplay

Um dos primeiros passos que eu fiz foi implementar as classes de objetos e a interface:
-A classe Usuario possui nome, usuario e senha.;
-A classe abstrata Video possui titulo, genero, ano e diretor;
-A classe Filme é uma extensão do Video que adiciona o atributo duracao;
-A classe Serie é uma extensão alternativa do Video que adiciona episodios, temporadas e situação;
-A classe Playlist possui os atributos Usuario, Filme e Serie;
-A interface Situacao possui uma função que implementa na classe Video.

Grande parte do meu código se baseia no ExemploBD da disciplina de Arquitetura e Programão Orientada a Objetos.

Para acessar o gerenciamento do banco de dados PostgreeSQL, eu utilizei um software chamado DBeaver na qual me permite conectar com vários tipos de gerenciamento de banco de dados. A interface e a funcionalidade do DBeaver é bem semelhante a do pgAdmin dos computadores da FEI e não tinha nenhuma diferença quando eu usava esses dois programas diferentes na execução do meu código. O motivo de ter escolhido DBeaver foi por causa do meu sistema operacional do meu PC que utiliza Linux Mint (baseado no Ubuntu), logo eu segui um tutorial de instalação que utiliza o software que eu utilizei. Eu podia instalar pgAdmin no meu PC com Linux mas, em minha opinião, achei o processo mais complicado de seguir, também eu já estava com DBeaver instalado primeiro. Eu utilizei este vídeo como referência: https://youtu.be/uQT3_M4mUqs

Eu estruturei meu banco de dados na seguinte forma:

Tabela usuarios:
-nome                //chave primaria
-usuario
-senha

Tabela videos:
-titulo
-ano
-diretor
-gênero
-curtida         //se curtida == "1", será marcada como curtida; caso contrario, não vai estar marcado 
-tipo            //se tipo == “1”, é considerada como Filme; se tipo = “2”, é considerada como Serie
-duracao         //exclusivo para tipo 1
-episodios       //exclusivo para tipo 2
-temporadas      //exclusivo para tipo 2
-situacao        //exclusivo para tipo 2
                 //variáveis que tem proposito exclusivo é do tipo não nulo


Eu inicialmente queria separar a tabela em dois mas não sabia como fazer isso ou utilizar a FOREIGN KEY no banco de dados, logo optei fazer com que a tabela videos compartilha os atributos da classe Filme e da classe Serie, tambem implementei o atributo tipo para diferencia entre Filme e Serie. A um certo ponto, eu queria implementar uma descricao para videos mas seria muito complicado para eu colocar todo texto em um só lugar. 

Todos os atributos do banco de dados são do tipo varchar.

Na janela do Index.java, a página principal na qual o usuário vai acessar após o sucesso do login, vai se deparar com um text field com dois botões abaixo. O text field é uma barra de pesquisa onde o usuario digita o nome exato do video, na qual o conteudo do video está presente apenas no banco de dados (logo é necessário inserir os dados do vídeo para pesquisar), e vai para uma outra janela contendo as informações do video, mas para ir para essa janela, é necessario clicar em um dos botões, uma que busca apenas filmes e outra que busca apenas series. Os dois botões vão checar se o nome do video está presente, mas também vai checar se esse video é do tipo 1 para filme ou do tipo 2 para serie, dependendo do botão que clicar. A janela que exibe as informações possui duas versões para cada tipo de video, também é possível criar várias janelas o quanto que quiser, então implementei uma função que fecha a janela para evitar poluição visual ou se não se fechar a janela que está na parte de cima, vai fechar todo o programa.

A interface Situação possui um método exibirSituação na qual ela é implementada na classe Serie. O método permite retornar uma String que forma uma frase, se a situação na classe Serie estiver como "Encerrado" vai exibir como "A série está encerrada" na janela da informação do site. Se estiver como "Em produção", retorna como "A série está em produção". Se nenhuma das condições anteriores forem verdadeiras, retorna como "A série foi cancelada".

@Override
    public String exibirSituacao(String s){
        switch (s) {
            case "Encerrado":
                return "A série está encerrada";
            case "Em produção":
                return "A série está em fase de produção";
            default:
                return "A série foi cancelada";
        }
    }

OBS: Por algum motivo, quando uso o computador da FEI enquanto feito alguma alteração, os botões das janelas alteradas param de funcionar, possivelmente porque a o PC da minha casa usa a versão mais avançada do NetBeans do que da FEI. No momento em que estou escrevendo, os botões das janelas que exibem as informações dos vídeos são fora de funcionamento.

GitHub: https://github.com/nishihtml/FEIplay 
