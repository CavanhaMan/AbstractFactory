//PRODUTO CONCRETO VILAO IMPLEMENTADO PELA FABRICA CONCRETA VILAOFACTORY
public class Troll implements Vilao {
    @Override
    public void habilidadeEspecial() {
        System.out.println("Grande é nossa força!");
    }
    @Override
    public void usaHabilidade() {
        System.out.println("Troll ataca com fúria plena!");
    }
}
