FEIplay

Um dos primeiros passos que eu fiz foi implementar as classes de objetos e a interface:
-A classe Usuario possui nome, usuario e senha.;
-A classe abstrata Video possui titulo, genero, ano e diretor;
-A classe Filme é uma extensão do Video que adiciona o atributo duracao;
-A classe Serie é uma extensão alternativa do Video que adiciona episodios, temporadas e situação;
-A classe Playlist possui os atributos Usuario, Filme e Serie;
-A interface Situção possui uma função que implementa na classe Video.

Grande parte do meu código se baseia no ExemploBD da disciplina de Arquitetura e Progração Orientada a Objetos.

Para acessar o gerenciamento do banco de dados PostgreeSQL, eu utilizei um software chamado DBeaver na qual me permite conectar com vários tipos de gerenciamento de banco de dados. A interface e a funcionalidade do DBeaver é bem semelhante a do pgAdmin dos computadores da FEI e não tinha nenhuma diferença quando eu usava esses dois programas diferentes na execução do meu código. O motivo de ter escolhido DBeaver foi por causa do meu sistema operacional do meu PC que utiliza Linux Mint (baseado no Ubuntu), logo eu segui um tutorial de instalação que utiliza o software que eu utilizei. Eu podia instalar pgAdmin no meu PC com Linux mas, em minha opinião, achei o processo mais complicado de seguir, também eu já tava com DBeaver instalado primeiro. Eu utilizei este video como referência: https://youtu.be/uQT3_M4mUqs

Eu estruturei meu banco de dados na seguinte forma:

Tabela usuarios:
-nome                //chave primaria
-usuario
-senha

Tabela videos:
-titulo
-ano
-diretor
-genero
-tipo                 //se tipo == “1”, é considerada como Filme; se tipo = “2”, é considerada como Serie
-duracao          // exclusivo para tipo 1
-episodios       //exclusivo para tipo 2
-temporadas   //exclusivo para tipo 2
-situacao        //exclusivo para tipo 2

Eu inicialmente queria separar a tabela em dois mas não sabia como fazer isso ou utilizar a FOREIGN KEY no banco de dados, logo optei fazer com que a tabela videos compartilha os atributos da classe Filme e da classe Serie, tambem implementei o atributo tipo para diferencia entre Filme e Serie. A um certo ponto, eu queria implementar uma descricao para videos mas seria muito complicado para eu colocar todo texto em um só lugar. 

Todos os atributos do banco de dados são do tipo varchar com limite de 255 caracteres.
