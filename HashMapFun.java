import java.util.HashMap;
import java.util.Set;
public class HashMapFun{
    public static void main(String[] args){
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("Thick as a Brick", "Fucking Hostile");
        trackList.put("Cut the Shit", "Lich King");
        trackList.put("Devourer", "Fucking Hostile");
        trackList.put("Combat Mosh", "Lich King");
        String songname = trackList.get("Cut the Shit");
        System.out.println(songname);

        Set<String> keys = trackList.keySet();
        for(String key : keys) {
            System.out.println(key);
            System.out.println(trackList.get(key));
        }
    }
}