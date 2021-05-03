package gameProject;

import java.util.Date;

import adapters.MernisServiceAdapters;
import entities.Campaign;
import entities.Game;
import entities.User;

public class Main {

	public static void main(String[] args) {
		
		User userReal = new User(1 , "Zeynep" , "SELBER" , new Date(1993 , 07 , 01) ,"25928471862" , "zselber" , "1234" , 10000);
		User userFake = new User(2 , "Zeynep" , "SELBER" , new Date(1992 , 07 , 01) ,"11111111111" , "zs" , "1554" , 5000);

		UserManager userManager = new UserManager(new MernisServiceAdapters());
		
		userManager.add(userFake);
		userManager.add(userReal);
		
		Game game = new Game(1 , "Snack Games" , 50 , 1 , 1 );
		GameManager gameManager = new GameManager();
		
		gameManager.add(game);
		
		Campaign campaign = new Campaign(1 , "Bahar Kampanyasý" , 10 , 3);
		CampaignManager campaignManager = new CampaignManager();
		
		campaignManager.add(campaign);
		
		SaleManager saleManager = new SaleManager(gameManager , userManager);
		
		saleManager.sale(game , userReal);		
		
		System.out.println("Hesabýnýzda " + userReal.getMoney() +" pay bulunmaktadýr. ");
		
		saleManager.sale(game, userReal , campaign);

		System.out.println("Hesabýnýzda " + userReal.getMoney() +" pay bulunmaktadýr. ");
		
		campaignManager.stretch(campaign);
		
		
	}
}
