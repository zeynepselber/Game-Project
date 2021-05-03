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
			System.out.println("Yeni �ye kayd� olu�turuldu. " + user.getFirstName()+" " +user.getLastName());
		else
			System.out.println("Girilen bilgiler ge�ersizdir. " + user.getFirstName()+" " +user.getLastName());
		
	}

	@Override
	public void update(User user) {
		System.out.println("Bilgileriniz g�ncellenmi�tir. " + user.getFirstName()+" " +user.getLastName());
		
	}

	@Override
	public void delete(User user) {
		System.out.println("�ye kayd�n�z silinmi�tir. " + user.getFirstName()+" " +user.getLastName());
		
	}
	
	@Override
	public void renewAmount(User user , Double amount) {
		Double oldAmount = user.getMoney() ;
		Double newAmount = oldAmount - amount ;
		user.setMoney(newAmount);
		
		System.out.println("Hesaptaki paran�z g�ncellendi. ");
	}
	
}
