package gameProject;

import abstracts.GameService;
import entities.Game;

public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		System.out.println("Yeni oyun oluþturuldu." + game.getName());
		
	}

	@Override
	public void update(Game game) {
		System.out.println("Oyun güncellendi" + game.getName());
		
	}

	@Override
	public void delete(Game game) {
		System.out.println("Oyun silindi." + game.getName());
		
	}

	@Override
	public void increase(Game game) {
		int newStar = game.getStar() ;
		newStar ++ ;
		
		game.setStar(newStar);
		
		System.out.println("Tebrikler !! Dikkatler " + game.getName()+" isimli oyunda!");
	}
	
}
