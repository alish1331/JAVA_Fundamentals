import java.util.HashMap;
import java.util.Set;

public class Hashmatique {

    public static void main(String[] args) {

        // Creates a Hashmap of four songs with their titles as keys
        // and their lyrics associated with the titles
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("Radioactive", "I'm waking up to ash and dust/I wipe my brow and I sweat my rust...");
        trackList.put("Roadkill", "Partially prepped meals, ohh how tasty you are!...");
        trackList.put("Kids", "You were a child/Crawling on your knees toward him...");
        trackList.put("Mad World", "All around me are familiar faces/Worn out places, worn out faces...");

        // We first get one song's lyrics by its title
        String single = trackList.get("Roadkill");
        System.out.println(single);

        // and then we have it print title and lyric of every song in the list
        Set<String> keys = trackList.keySet();
        for (String key: keys) {
            System.out.println("Title: " + key);
            System.out.println("Lyrics: " + trackList.get(key));
        }
    }
}