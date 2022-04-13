package arenas;

public class Downtown extends Arena {
    
    private int spawnFactor[] = {0,0,0,1,2,3,3,3,4,5,5,5}; //relates to index position of characterSpawn
    private String location = "Downtown";

    public Downtown() {
        super();
        SetSpawnFactor(spawnFactor);
        SetCharacter();
        SetLocation(location);
    }
} // Downtown
