package gameProject;

import abstracts.CampaignService;
import entities.Campaign;

public class CampaignManager implements CampaignService{

	@Override
    public void add(Campaign campaign) {
    	System.out.println("Yeni kampanya olu�turuldu. " +campaign.getName());
    }
	
	@Override
	public void update(Campaign campaign){
    	System.out.println("Kampanyan�z g�ncellendi." + campaign.getName());
    }
	
	@Override
	public void delete(Campaign campaign){
    	System.out.println("Kampanyan�z silindi. " + campaign.getName());
    }
	
	@Override
	public void stretch(Campaign campaign){
    	System.out.println("Kampanyan�z�n s�resi "+campaign.getDuration()+" ay s�resince uzat�ld�. " + campaign.getName());
    }
}
