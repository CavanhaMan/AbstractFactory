//FABRICA ABSTRATA PRODUZINDO 2 PRODUTOS
public abstract class AbstractFactory {
    //Classes abstratas para Vilao e Heroi
    abstract Vilao getVilao(String s);
    abstract Heroi getHeroi(String s);
}
