package abstracts;

import entities.Campaign;
import entities.Game;
import entities.User;

public interface SaleService {

	void sale(Game game , User user);
	
	void sale(Game game , User user , Campaign campaign);
}
