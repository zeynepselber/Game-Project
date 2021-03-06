package gameProject;

import abstracts.CampaignService;
import entities.Campaign;

public class CampaignManager implements CampaignService{

	@Override
    public void add(Campaign campaign) {
    	System.out.println("Yeni kampanya oluşturuldu. " +campaign.getName());
    }
	
	@Override
	public void update(Campaign campaign){
    	System.out.println("Kampanyanız güncellendi." + campaign.getName());
    }
	
	@Override
	public void delete(Campaign campaign){
    	System.out.println("Kampanyanız silindi. " + campaign.getName());
    }
	
	@Override
	public void stretch(Campaign campaign){
    	System.out.println("Kampanyanızın süresi "+campaign.getDuration()+" ay süresince uzatıldı. " + campaign.getName());
    }
}
