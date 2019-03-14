/* http://designpattern.co.il/AbstractFactory.html
Neste exemplo criaremos um Abstract Factory para gerar vilaoFactory e heroiFactory.
Estas por sua vez irão gerar herois e viloes de acordo com o seu design pattern.*/
public class Main {
    public static void main(String[] args) {
        //cria um novo Vilao factory
        AbstractFactory geraVilao= FactoryGenerator.factory("vilao");

        //create a Orc
        Vilao vilao1 = geraVilao.getVilao("orc");
        System.out.println("Orc foi criado!");

        //chama o metodo habilidadeEspecial
        vilao1.habilidadeEspecial();
        vilao1.usaHabilidade();
        System.out.println();

        //create a Troll
        Vilao vilao2 = geraVilao.getVilao("troll");
        System.out.println("Troll foi criado!");

        //chama o metodo habilidadeEspecial
        vilao2.habilidadeEspecial();
        vilao2.usaHabilidade();
        System.out.println();

        //create a Feiticeiro
        Vilao vilao3 = geraVilao.getVilao("feiticeiro");
        System.out.println("Feiticeiro foi criado!");

        //chama o metodo habilidadeEspecial
        vilao3.habilidadeEspecial();
        vilao3.usaHabilidade();

        System.out.println();

        //cria um novo Heroi factory
        AbstractFactory geraHeroi= FactoryGenerator.factory("heroi");

        //create a Paladino
        Heroi heroi1 = geraHeroi.getHeroi("paladino");
        System.out.println("Paladino foi criado!");

        //chama o metodo habilidadeEspecial
        heroi1.habilidadeEspecial();
        System.out.println();

        //create a Cavaleiro
        Heroi heroi2 = geraHeroi.getHeroi("cavaleiro");
        System.out.println("Cavaleiro foi criado!");

        //chama o metodo habilidadeEspecial
        heroi2.habilidadeEspecial();
    }
}
