
package utils;
import arenas.*;
import characters.Character; 

public class Printer {
    
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static final String BLACK_BOLD_BRIGHT = "\033[1;90m"; // BLACK
    public static final String RED_BOLD_BRIGHT = "\033[1;91m";   // RED
    public static final String GREEN_BOLD_BRIGHT = "\033[1;92m"; // GREEN
    public static final String YELLOW_BOLD_BRIGHT = "\033[1;93m";// YELLOW
    public static final String BLUE_BOLD_BRIGHT = "\033[1;94m";  // BLUE
    public static final String PURPLE_BOLD_BRIGHT = "\033[1;95m";// PURPLE
    public static final String CYAN_BOLD_BRIGHT = "\033[1;96m";  // CYAN
    public static final String WHITE_BOLD_BRIGHT = "\033[1;97m"; // WHITE

    public Printer () {}

    public void Welcome() {
        System.out.printf("\n%46s",GREEN_BOLD_BRIGHT + "Welcome To:\n\n");
        System.out.printf("\n%20s",BLUE_BOLD_BRIGHT +"=" + RED_BOLD_BRIGHT + "=" + CYAN_BOLD_BRIGHT +"=" + GREEN_BOLD_BRIGHT + "=" +
            BLUE_BOLD_BRIGHT + "=" + RED_BOLD_BRIGHT + "=" + CYAN_BOLD_BRIGHT +"=" + GREEN_BOLD_BRIGHT + "=" +BLUE_BOLD_BRIGHT +"=" + 
            RED_BOLD_BRIGHT + "=" + CYAN_BOLD_BRIGHT + "=" + GREEN_BOLD_BRIGHT + "=" + BLUE_BOLD_BRIGHT +"=" + RED_BOLD_BRIGHT + "=" + 
            CYAN_BOLD_BRIGHT +"=" + GREEN_BOLD_BRIGHT + "=" +BLUE_BOLD_BRIGHT +"=" + RED_BOLD_BRIGHT + "=" + CYAN_BOLD_BRIGHT +"=" + 
            GREEN_BOLD_BRIGHT + "=" + BLUE_BOLD_BRIGHT + "=" + ANSI_RESET);
        System.out.printf("%20s", ANSI_CYAN + "Toronto" + ANSI_PURPLE + "Apocalypse" + GREEN_BOLD_BRIGHT + "2045" + ANSI_RESET);
        System.out.printf("%20s", BLUE_BOLD_BRIGHT +"=" + RED_BOLD_BRIGHT + "=" + CYAN_BOLD_BRIGHT +"=" + GREEN_BOLD_BRIGHT + "=" +
            BLUE_BOLD_BRIGHT + "=" + RED_BOLD_BRIGHT + "=" + CYAN_BOLD_BRIGHT +"=" + GREEN_BOLD_BRIGHT + "=" +BLUE_BOLD_BRIGHT +"=" + 
            RED_BOLD_BRIGHT + "=" + CYAN_BOLD_BRIGHT + "=" + GREEN_BOLD_BRIGHT + "=" +BLUE_BOLD_BRIGHT +"=" + RED_BOLD_BRIGHT + "=" + 
            CYAN_BOLD_BRIGHT +"=" + GREEN_BOLD_BRIGHT + "=" +BLUE_BOLD_BRIGHT +"=" + RED_BOLD_BRIGHT + "=" + CYAN_BOLD_BRIGHT +"=" + 
            GREEN_BOLD_BRIGHT + "=" + BLUE_BOLD_BRIGHT + "=" + ANSI_RESET);
    }
    
    public void ChooseCharacter() {
        System.out.printf("\n\n%65s" , YELLOW_BOLD_BRIGHT + "please enter your character selection..." + ANSI_RESET);
        System.out.println(RED_BOLD_BRIGHT + "\n\n1) "+ ANSI_RESET + "Chad  " + RED_BOLD_BRIGHT + "2) " + ANSI_RESET + 
            "Hipster  " + RED_BOLD_BRIGHT + "3) " + ANSI_RESET + "Hoodman  " + RED_BOLD_BRIGHT + "4) " + 
        ANSI_RESET + "Karen  " + RED_BOLD_BRIGHT + "5) " + ANSI_RESET + "Racoon  " +  RED_BOLD_BRIGHT + 
            "6) " + ANSI_RESET + "Bay Street Scum  ");
    }

    public void InvalidInputChooseCharacter() {
        System.out.printf("\n%73s", "please enter a whole number between" + RED_BOLD_BRIGHT + 
            " 1 " + ANSI_RESET + "and" + RED_BOLD_BRIGHT + " 6 " + ANSI_RESET);
    }

    public void InvalidInputChooseAttackTypeAbility() {
        System.out.printf("\n%73s", "please enter a whole number between" + RED_BOLD_BRIGHT +
            " 1 " + ANSI_RESET + "and" + RED_BOLD_BRIGHT + " 3 " + ANSI_RESET);
    }

    public void InvalidInputChooseAttackType() {
        System.out.printf("\n%73s", "please enter a whole number between" + RED_BOLD_BRIGHT +
            " 1 " + ANSI_RESET + "and" + RED_BOLD_BRIGHT + " 2 " + ANSI_RESET);
    }
    
    public void InvalidInputPlayAgain() {
        System.out.printf("\n%73s", "please enter a whole number between" + RED_BOLD_BRIGHT + 
            " 1 " + ANSI_RESET + "and" + RED_BOLD_BRIGHT + " 2 " + ANSI_RESET);
    }
    public void NamePrompt() {
        System.out.println("Please enter your" + BLUE_BOLD_BRIGHT + " name" + ANSI_RESET);
    }
    
    public void PrintArena(Arena arena) {
        System.out.println("\t\tWelcome to " +
        RED_BOLD_BRIGHT + arena.GetLocation() + ANSI_RESET);
    } 
    
    public void GameBegins() {
        System.out.printf( ANSI_PURPLE + "\t\tLet the Battle Begin!");
    }
    
    public void AttackTypePromptAbility(String ability) {
        System.out.println("\n\n\tWhat type of attack?");
        System.out.printf(RED_BOLD_BRIGHT + "\t1)" + ANSI_RESET + " Light " + RED_BOLD_BRIGHT + 
            "2)" + ANSI_RESET + " Heavy " + RED_BOLD_BRIGHT + "3)" + ANSI_RESET + " %s\n", ability);
    }

    public void AttackTypePrompt() {
        System.out.println("\n\n\tWhat type of attack?");
        System.out.printf(RED_BOLD_BRIGHT + "\t1)" + ANSI_RESET + " Light " + RED_BOLD_BRIGHT + 
        "2)" + ANSI_RESET + " Heavy\n");
    }

    public void PrintStrikeOutcome(int damage, String name) {
        
        if(damage > 0) { //hit
            System.out.println(BLACK_BOLD_BRIGHT + "\n\n\t\t=====================" + ANSI_RESET);
            System.out.printf(YELLOW_BOLD_BRIGHT + "\t\t%s" + ANSI_RESET + " hit for " + 
            ANSI_PURPLE + damage + " points!\n" + ANSI_RESET, name);
            System.out.printf(BLACK_BOLD_BRIGHT + "\t\t=====================" + ANSI_RESET);
        }
        else { // miss
            System.out.println(BLACK_BOLD_BRIGHT + "\n\n\t\t====================" + ANSI_RESET);
            System.out.printf( YELLOW_BOLD_BRIGHT + "\t\t%5s" + ANSI_RESET + " missed!\n", name);
            System.out.println(BLACK_BOLD_BRIGHT + "\t\t====================" + ANSI_RESET);
        }
    }
    
    public void PrintAbility(String name, String ability, String abilityFunction) {
        System.out.printf( YELLOW_BOLD_BRIGHT + "\n\n%s" + ANSI_CYAN + " used " + "ability: " + RED_BOLD_BRIGHT + 
            "%s\n" + ANSI_CYAN + "ability function: " + RED_BOLD_BRIGHT + "%s" + 
            ANSI_RESET, name, ability, abilityFunction);
    }
    
    public void ShowWinner(String name) {
        System.out.printf(YELLOW_BOLD_BRIGHT + "\n\t\t%s" + GREEN_BOLD_BRIGHT + " is victorious" +
            ANSI_RESET, name);
    }

    public void PrintPlayerStats(Character player) {
        System.out.println(BLACK_BOLD_BRIGHT + "\n\n>< >< >< >< >< >< >< >< >< >< >< >< >< >< >< >< >< >< >< ><"
             + ANSI_RESET);
        System.out.printf(YELLOW_BOLD_BRIGHT + "\nPlayer Name(%s)\n" + ANSI_RESET, player.GetName());
        System.out.printf(ANSI_CYAN + "Player Type(%s)" + ANSI_RESET , player.GetType());
        System.out.printf(ANSI_WHITE + "\n\tHealth: %d" + ANSI_RESET + ANSI_GREEN + "\n\tDexterity: %d" +  
            ANSI_RESET + ANSI_PURPLE +"\n\tStrength: %d" + 
            ANSI_RESET, player.GetHealth(), player.GetDexterity(), player.GetStrength());
        
        System.out.printf(ANSI_BLUE + "\n\t\tPlayer is wearing: " + RED_BOLD_BRIGHT + "%s" + WHITE_BOLD_BRIGHT + 
            "\n\t\t\tDamage reduction: " + ANSI_PURPLE + "%d" + ANSI_BLUE + "\n\t\tPlayer weapon is: " + 
            RED_BOLD_BRIGHT + "%s" + WHITE_BOLD_BRIGHT + "\n\t\t\tBase damage: " + ANSI_PURPLE + "%d" + 
            ANSI_RESET, player.armour.GetType(), player.armour.GetDamageReductionAmount(), player.weapon.GetType(), 
            player.weapon.GetBaseDamage(), player.GetDamageMultiplier());
    }

    public void PrintEnemyStats(Character enemy) {
        System.out.println(BLACK_BOLD_BRIGHT + "\n\n>< >< >< >< >< >< >< >< >< >< >< >< >< >< >< >< >< >< >< ><" + ANSI_RESET);
        System.out.printf(YELLOW_BOLD_BRIGHT + "\nEnemy Name(%s)\n" + ANSI_RESET, enemy.GetName());
        System.out.printf(ANSI_CYAN + "Enemy Type(%s)" + ANSI_RESET, enemy.GetType());
        System.out.printf(ANSI_WHITE + "\n\tHealth: %d" + ANSI_RESET + ANSI_GREEN + "\n\tDexterity: %d" + ANSI_RESET + ANSI_PURPLE +
            "\n\tStrength: %d" + ANSI_RESET, enemy.GetHealth(), enemy.GetDexterity(), enemy.GetStrength());
        
        System.out.printf(ANSI_BLUE + "\n\t\tEnemy is wearing: " + RED_BOLD_BRIGHT + "%s" + WHITE_BOLD_BRIGHT + 
            "\n\t\t\tDamage reduction: " + ANSI_PURPLE + "%d" + ANSI_BLUE + "\n\t\tEnemy weapon is: " + RED_BOLD_BRIGHT + 
            "%s" + WHITE_BOLD_BRIGHT + "\n\t\t\tBase damage: " + ANSI_PURPLE + "%d" + 
            ANSI_RESET, enemy.armour.GetType(), enemy.armour.GetDamageReductionAmount(), enemy.weapon.GetType(), enemy.weapon.GetBaseDamage());
    }

    public void PlayAgain() {
        System.out.println(BLACK_BOLD_BRIGHT + 
        "\n\n>< >< >< >< >< >< >< >< >< >< >< >< >< >< >< >< >< >< >< ><" + ANSI_RESET);
        System.out.println("\n\tWould you like to play again?"); 
        System.out.println( RED_BOLD_BRIGHT + "\t1)" + ANSI_RESET + " yes " + RED_BOLD_BRIGHT + 
            "2)" + ANSI_RESET + " no ");
    }

    public void SeeYouNextTime() {
        System.out.println(BLACK_BOLD_BRIGHT + 
        "\n\n>< >< >< >< >< >< >< >< >< >< >< >< >< >< >< >< >< >< >< ><" + ANSI_RESET);
        System.out.printf(BLACK_BOLD_BRIGHT + "\n%59s", "See you next time!\n" + ANSI_RESET);
    }
} // printer
