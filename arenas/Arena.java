package arenas;

import java.util.Random;

public abstract class Arena {

    protected int[] characterSpawn = {1, 2, 3, 4, 5, 6}; 
    protected Random randNum = new Random();
    private int[] spawnFactor;
    private int character;
    private String location;

    Arena() {} // empty constructor

    // getters
    public int GetCharacter() {
        return this.character;
    }

    public String GetLocation() {
        return location;
    }
    // setters
    public void SetCharacter() {
        character = characterSpawn[spawnFactor[randNum.nextInt(spawnFactor.length)]];  // each sublcass has different odds of character gen
    }

    public void SetSpawnFactor(int[] spawnFactor) {
        this.spawnFactor = spawnFactor;
    }

    public void SetLocation(String location) {
        this.location = location;
    }
} // Arena
