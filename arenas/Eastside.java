package arenas;

public class Eastside extends Arena {

    private int spawnFactor[] = {0,0,0,1,2,2,3,3,3,4,4,5}; //relates to index position of characterSpawn
    private String location = "The Eastside";

    public Eastside() {
        super();
        SetSpawnFactor(spawnFactor);
        SetCharacter();
        SetLocation(location);
    }
} // Eastside
