package gameProject;

import abstracts.SaleService;
import entities.Campaign;
import entities.Game;
import entities.User;

public class SaleManager implements SaleService{

	UserManager userManager ;
	GameManager gameManager ;
	
	public SaleManager( GameManager gameManager , UserManager userManager) {
		
		this.gameManager = gameManager ;
		this.userManager = userManager ;
	}
	
	@Override
	public void sale(Game game, User user) {
		
		if( user.getMoney() >= game.getPrice()) {
		
			System.out.println("Say�n "+user.getFirstName()+" , "+game.getName()+" isimli oyunu sat�n ald�n�z.");
			
			userManager.renewAmount(user, game.getPrice());
			gameManager.increase(game);
			
		}
		else 
			System.out.println("Bakiye yetersiz : "+ game.getName()+" isimli oyunu sat�n alamazs�n�z.");
		
	}

	@Override
	public void sale(Game game, User user, Campaign campaign) {
		
		Double campaignPrice = game.getPrice() - ( game.getPrice() * campaign.getDiscountPercent() / 100 ) ;
		
		if( user.getMoney() >= campaignPrice ) {
			
			System.out.println("Say�n "+user.getFirstName()+" , "+game.getName()+" isimli oyunu sat�n ald�n�z.");
			
			userManager.renewAmount(user, campaignPrice );
			gameManager.increase(game);
			
		}
		else 
			System.out.println("Bakiye yetersiz : "+ game.getName()+" isimli oyunu sat�n alamazs�n�z.");
	}

}
