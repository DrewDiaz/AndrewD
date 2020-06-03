import com.revatur.d3act.models.Drummer;
import com.revatur.d3act.models.Guitarist;
import com.revatur.d3act.models.FileBoy;

public class Driver {

	public static void main(String[] args) {
		Guitarist guitar1 = new Guitarist("Slash", 50000);
		Drummer drums1 = new Drummer("Slaps", 5);
		FileBoy mrsandman = new FileBoy();
		
		guitar1.playMusic();
		drums1.playMusic();
		guitar1.playMusic("Thunderstruck");
		guitar1.rankMe();
		drums1.rankMe();
		
		mrsandman.WriteFile(guitar1.getName()+" "+drums1.getName());
		mrsandman.ReadFile(mrsandman.getFile());
	}
	
}
