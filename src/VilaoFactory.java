public class VilaoFactory extends  AbstractFactory {
    @Override
    Heroi getHeroi(String s) {
        return null;
    }
    //Cria um vilao atraves do encapsulamento da criação do vilao
    public Vilao getVilao(String tipoVilao){
        switch (tipoVilao){
            case "orc":
                return new Orc();       //cria um novo orc
            case "troll":
                return new Troll();     //cria um novo troll
            case "feiticeiro":
                return new Feiticeiro();//cria um novo feiticeiro
            default:
                return null;
        }
    }
}
