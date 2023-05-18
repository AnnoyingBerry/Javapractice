package Javapractice.dev.lpa3;

import java.util.ArrayList;
import java.util.List;
interface Player{
	String name();
}
record BaseballPlayer(String name, String position) implements Player{}
record FootballPlayer(String name, String position) implements Player{}
record VolleyballPlayer(String name, String position) implements Player{}
record Affliation(String name,String type, String countryCode){
	@Override
	public String toString(){
		return name + " (" + type + " in " + countryCode + ")";
	}
}

class Team<T extends Player,S>{
	private String teamName;
	private List<T> teamMembers = new ArrayList<>();
	
	private int totalWins = 0;
	private int totalLosses = 0;
	private int totalTies = 0;

	private S affiliation;

	public Team(String teamName) {
		this.teamName = teamName;
	}

	public void addTeamMember(T t){
		if(!teamMembers.contains(t)){
			teamMembers.add(t);
		}
	}

	
	public Team(String teamName, S affiliation) {
		this.teamName = teamName;
		this.affiliation = affiliation;
	}

	public void listTeamMembers() {
		System.out.print(teamName + " Roster:");
		System.out.println((affiliation == null ? "": "AFFLIATION " + affiliation));
		for (T t: teamMembers){
			System.out.println(t.name());
		}
		
	}

	public int ranking() {
		return (totalLosses*2) + totalTies + 1;
	}

	public String setScore(int ourScore, int theirScore){
		String message = "lost to";
		if (ourScore > theirScore) {
			totalWins++;
			message = "beat";
		}else if(ourScore == theirScore){
			totalTies++;
			message="tied";
		}else{
			totalLosses++;
		}
		return message;
	}

	@Override
	public String toString(){
		return teamName + " (Ranked " + ranking() + ")";
	}
}

class SportsTeam{
	private String teamName;
	private List<Player> teamMembers = new ArrayList<>();
	
	private int totalWins = 0;
	private int totalLosses = 0;
	private int totalTies = 0;

	public SportsTeam(String teamName) {
		this.teamName = teamName;
	}

	public void addTeamMember(Player player){
		if(!teamMembers.contains(player)){
			teamMembers.add(player);
		}
	}

	public void listTeamMembers() {
		System.out.println(teamName + " Roster:");
		System.out.println(teamMembers);
		
	}

	public int ranking() {
		return (totalLosses*2) + totalTies + 1;
	}

	public String setScore(int ourScore, int theirScore){
		String message = "lost to";
		if (ourScore > theirScore) {
			totalWins++;
			message = "beat";
		}else if(ourScore == theirScore){
			totalTies++;
			message="tied";
		}else{
			totalLosses++;
		}
		return message;
	}

	@Override
	public String toString(){
		return teamName + " (Ranked " + ranking() + ")";
	}
}
class BaseballTeam{

	private String teamName;
	private List<BaseballPlayer> teamMembers = new ArrayList<>();
	
	private int totalWins = 0;
	private int totalLosses = 0;
	private int totalTies = 0;

	public BaseballTeam(String teamName) {
		this.teamName = teamName;
	}

	public void addTeamMember(BaseballPlayer player){
		if(!teamMembers.contains(player)){
			teamMembers.add(player);
		}
	}

	public void listTeamMembers() {
		System.out.println(teamName + " Roster:");
		System.out.println(teamMembers);
		
	}

	public int ranking() {
		return (totalLosses*2) + totalTies + 1;
	}

	public String setScore(int ourScore, int theirScore){
		String message = "lost to";
		if (ourScore > theirScore) {
			totalWins++;
			message = "beat";
		}else if(ourScore == theirScore){
			totalTies++;
			message="tied";
		}else{
			totalLosses++;
		}
		return message;
	}

	@Override
	public String toString(){
		return teamName + " (Ranked " + ranking() + ")";
	}
}

public class GenericsMain {
	public static void main(String[] args) {
		
		var philly = new Affliation("city", "Philadelphia, PA", "US");

		BaseballTeam phillies1 = new BaseballTeam("Philadelphia Phillies");
		BaseballTeam astros1 = new BaseballTeam("Houston Astros");
		ScoreResult(phillies1, 3, astros1, 5);

		SportsTeam phillies2 = new SportsTeam("Philadelphia Phillies");
		SportsTeam astros2 = new SportsTeam("Houston Astros");
		ScoreResult(phillies2, 3, astros2, 5);

		Team<BaseballPlayer,Affliation> phillies = new Team<>("Philadelphia Phillies",philly);
		Team<BaseballPlayer,Affliation> astros = new Team<>("Houston Astros");
		ScoreResult(phillies, 3, astros, 5);

		var harper = new BaseballPlayer("B Harper", "Right Fielder");
		var marsh = new BaseballPlayer("B Marsh", "Right Fielder");
		phillies.addTeamMember(harper);
		phillies.addTeamMember(marsh);
		var guthrie = new BaseballPlayer("D Guthrie", "Center Fielder");
		phillies.addTeamMember(guthrie);
		phillies.listTeamMembers(); 

		SportsTeam afc1 = new SportsTeam("Adelaide Crows");
		Team<FootballPlayer,String> afc = new Team<>("Adelaide Crows",
									"City of Adelaide, South Australia, in AU");
		var tex = new FootballPlayer("Tex Walker", "Centre half forward");
		afc.addTeamMember(tex);

		// // there is not type checking, hence we can easily add another object
		// var guthrie = new BaseballPlayer("D Guthrie", "Center Fielder");
		// afc.addTeamMember(guthrie);

		var rory = new FootballPlayer("Rory Laird", "Midfield");
		afc.addTeamMember(rory);
		afc.listTeamMembers();

		Team<VolleyballPlayer,Affliation> adelaide = new Team<>("Adelaide Storm");
		adelaide.addTeamMember(new VolleyballPlayer("N Roberts", "Setter"));
		adelaide.listTeamMembers();

		var canberra = new Team<VolleyballPlayer,Affliation>("Canberra Heat");
		canberra.addTeamMember(new VolleyballPlayer("B Black", "Opposite"));
		canberra.listTeamMembers();;
		ScoreResult(canberra, 0, adelaide, 1);

		//remember generic types cannot be a primitive datatype only wrapper classes
		//this cant be use because it is upperbounded to be a Player type
		// Team<Integer> melbourneVB = new Team<>("Melbourne Vipers");
	}

	public static void ScoreResult(BaseballTeam team1,int t1_Score,
									BaseballTeam team2,int t2_Score) {
		
		String message = team1.setScore(t1_Score, t2_Score);
		team2.setScore(t2_Score, t1_Score);
		System.out.printf("%s %s %s %n", team1,message,team2);
	}
	public static void ScoreResult(SportsTeam team1,int t1_Score,
									SportsTeam team2,int t2_Score) {

		String message = team1.setScore(t1_Score, t2_Score);
		team2.setScore(t2_Score, t1_Score);
		System.out.printf("%s %s %s %n", team1,message,team2);
	}

	public static void ScoreResult(Team team1,int t1_Score,
									Team team2,int t2_Score) {

		String message = team1.setScore(t1_Score, t2_Score);
		team2.setScore(t2_Score, t1_Score);
		System.out.printf("%s %s %s %n", team1,message,team2);
	}

	
}
