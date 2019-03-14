//FABRICA CONCRETA HEROI PRODUZINDO PRODUTO HEROI
public class HeroiFactory extends AbstractFactory {
    @Override
    Vilao getVilao(String s) {
        return null;
    }
    //Cria um heroi atraves do encapsulamento da criação do heroi
    Heroi getHeroi(String tipoHeroi) {
        switch (tipoHeroi){
            case "paladino":
                return new Paladino();  //cria um novo paladino
            case "cavaleiro":
                return new Cavaleiro(); //cria um novo cavaleiro
            default:
                return null;
        }
    }
}   
