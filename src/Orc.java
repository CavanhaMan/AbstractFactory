//PRODUTO CONCRETO VILAO IMPLEMENTADO PELA FABRICA CONCRETA VILAOFACTORY
public class Orc implements Vilao {
    @Override
    public void habilidadeEspecial() {
        System.out.println("Orcs adoram devorar hobbits!");
    }
    @Override
    public void usaHabilidade() {
        System.out.println("Ataque especial orc!");
    }
}
