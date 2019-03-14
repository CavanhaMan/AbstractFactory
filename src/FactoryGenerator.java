//FactoryGenerator gera uma nova factory - Heroi ou Vilao
public class FactoryGenerator {
    public static AbstractFactory factory(String s){
        switch (s){
            case "heroi":
                return new HeroiFactory();
            case "vilao":
                return new VilaoFactory();
            default: return null;
        }
    }
}