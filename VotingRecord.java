package Nisarga;
public class VotingRecord {
	private String VotingRights;
	private String Identity;
	
	public void setVotingRights(String VotingRights) {
		this.VotingRights=VotingRights;
	}
	public void setIdentity(String Identity) {
		this.Identity=Identity;
	}
	
	public String getVotingRights() {
		return VotingRights;
	}
	public String getIdentity() {
		return Identity;
	}
	
 
	public static void main(String[] args) {
		VotingRecord v= new VotingRecord();
		v.setVotingRights("Eligible");
		v.setIdentity("Nis");
		
		System.out.println("Voting Rights:" +v.getVotingRights());
		System.out.println("Identity:" +v.getIdentity());
 
	}
 
}

