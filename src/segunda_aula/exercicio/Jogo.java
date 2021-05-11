package segunda_aula.exercicio;

import quinta_sexta_aula.exercicio.Guerreiro;

public class Jogo {
    public static void main(String[] args) {
        Jogador player = new Guerreiro();
        player.setXp(100);
        player.setHp(100);
        System.out.println("O XP do Jogador: " + player.getNome() + " é: " + player.getXp());
        System.out.println("O HP do Jogador: " + player.getNome() + " é: " + player.getHp());
        player.ganharXp(20);
        System.out.println("Você derrotou um monstro e por isso seu xp subiu para = " + player.getXp());
        player.receberDano(50);
        System.out.println("Você sofreu muito na batalha e por isso seu hp agora é de = " + player.getHp());
    }
}
