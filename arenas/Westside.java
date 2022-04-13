package arenas;

public class Westside extends Arena {

    private int spawnFactor[] = {0,1,1,1,2,2,3,3,3,4,4,5}; //relates to index position of characterSpawn
    private String location = "The Westside";

    public Westside() {
        super();
        SetSpawnFactor(spawnFactor);
        SetCharacter();
        SetLocation(location);
    }
} // Westside
