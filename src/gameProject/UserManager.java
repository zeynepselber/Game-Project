package gameProject;

import abstracts.UserCheckService;
import abstracts.UserService;
import entities.User;

public class UserManager implements UserService{

	UserCheckService userCheckService ;
	
	public UserManager(UserCheckService userCheckService) {
		this.userCheckService = userCheckService ;
	}

	@Override
	public void add(User user) {
		if(userCheckService.checkIfRealPerson(user)) 
			System.out.println("Yeni üye kaydý oluþturuldu. " + user.getFirstName()+" " +user.getLastName());
		else
			System.out.println("Girilen bilgiler geçersizdir. " + user.getFirstName()+" " +user.getLastName());
		
	}

	@Override
	public void update(User user) {
		System.out.println("Bilgileriniz güncellenmiþtir. " + user.getFirstName()+" " +user.getLastName());
		
	}

	@Override
	public void delete(User user) {
		System.out.println("Üye kaydýnýz silinmiþtir. " + user.getFirstName()+" " +user.getLastName());
		
	}
	
	@Override
	public void renewAmount(User user , Double amount) {
		Double oldAmount = user.getMoney() ;
		Double newAmount = oldAmount - amount ;
		user.setMoney(newAmount);
		
		System.out.println("Hesaptaki paranýz güncellendi. ");
	}
	
}
