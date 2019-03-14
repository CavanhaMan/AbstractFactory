//PRODUTO CONCRETO VILAO IMPLEMENTADO PELA FABRICA CONCRETA VILAOFACTORY
public class Feiticeiro implements Vilao {
    @Override
    public void habilidadeEspecial() {
        System.out.println("Nenhum poder é maior do que a magia!");
    }
    @Override
    public void usaHabilidade() {
        System.out.println("Morra pela magia negra!");
    }
}
