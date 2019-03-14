/*
Neste exemplo criaremos um Abstract Factory
para gerar vilaoFactory e heroiFactory.
Estas por sua vez irão gerar herois e viloes
de acordo com o seu design pattern. 
*/
//AbstractFactory
public abstract class AbstractFactory {
    //Classes abstratas para Vilao e Heroi
    abstract Vilao getVilao(String s);
    abstract Heroi getHeroi(String s);
}
