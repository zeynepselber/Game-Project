package gameProject;

import abstracts.CampaignService;
import entities.Campaign;

public class CampaignManager implements CampaignService{

	@Override
    public void add(Campaign campaign) {
    	System.out.println("Yeni kampanya oluþturuldu. " +campaign.getName());
    }
	
	@Override
	public void update(Campaign campaign){
    	System.out.println("Kampanyanýz güncellendi." + campaign.getName());
    }
	
	@Override
	public void delete(Campaign campaign){
    	System.out.println("Kampanyanýz silindi. " + campaign.getName());
    }
	
	@Override
	public void stretch(Campaign campaign){
    	System.out.println("Kampanyanýzýn süresi "+campaign.getDuration()+" ay süresince uzatýldý. " + campaign.getName());
    }
}
