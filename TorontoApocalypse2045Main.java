
import utils.*;
import arenas.*;
import characters.*;
import characters.Character;

import java.util.Scanner;
import java.util.Random;
import java.util.InputMismatchException;

class TorontoApocalypse2045Main {

    private static Scanner input = new Scanner(System.in);
    private static Random randNum = new Random();
    private static Printer printer = new Printer();

    public static Arena arena;
    private static Character player;
    private static Character enemy;
    private static String winner = ""; 
    
    private static boolean playerAbilityUsed = false;
    private static boolean enemyAbilityUsed = false;
    
    private static boolean gameOver = false;
    private static boolean roundOver = false;

    private static boolean playerTurn = true;
    private static boolean isValid = false;
    private static int choice;
    private static int damage;
    
    public static void main(String[] args) {
    
        printer.Welcome();
        
        while(!roundOver) {  // outer game loop allows user to play again
            while(!isValid) {
                try {
                    printer.ChooseCharacter();
                    choice = input.nextInt();
                    if(choice >= 1 && choice <= 6) {
                        isValid = true;
                    }
                    else {
                        printer.InvalidInputChooseCharacter();
                        isValid = false;
                    }
                } // try
                catch(InputMismatchException choice) {
                    printer.InvalidInputChooseCharacter();
                    isValid = false;
                }
                finally {
                    if(!isValid)
                        input.nextLine();
                }
            } // while !isValid loop

                // player setup

            CreateCharacter(choice, playerTurn);
            isValid = false;
            playerTurn = false;
            CreateArena();

                // enemy setup

            CreateCharacter(arena.GetCharacter(), playerTurn);
            printer.PrintArena(arena);
            playerTurn = true; 

            printer.GameBegins();

            while(!gameOver) {
                printer.PrintPlayerStats(player);
                printer.PrintEnemyStats(enemy);

                if(playerTurn) {
                    while(!isValid) {
                        if(!playerAbilityUsed) { // ensuring player cannot use ability more than once 
                            try { 
                                printer.AttackTypePromptAbility(player.GetAbility());
                                choice = input.nextInt();
                                if(choice >= 1 && choice <= 3) {
                                    isValid = true;
                                }
                                else {
                                    printer.InvalidInputChooseAttackTypeAbility();
                                    isValid = false;
                                }
                            } // try
                            catch(InputMismatchException choice) {
                                printer.InvalidInputChooseAttackTypeAbility();
                                isValid = false;
                            }
                            finally {
                                if(!isValid) {
                                    input.nextLine();
                                }
                            } 
                        } // if
                        else {
                            try {
                                printer.AttackTypePrompt();
                                choice = input.nextInt();
                                if(choice >= 1 && choice <= 2) {
                                    isValid = true;
                                }
                                else {
                                    printer.InvalidInputChooseAttackType();
                                    isValid = false;
                                }
                            } // try
                            catch(InputMismatchException choice) {
                                printer.InvalidInputChooseAttackType();
                                isValid = false;
                            }
                            finally {
                                if(!isValid) {
                                    input.nextLine();
                                }
                            }
                        } // else
                    } // while !valid   

                    if(choice == 3) {
                        playerAbilityUsed = true; // ensures ability is only used once
                        printer.PrintAbility(player.GetName(), player.GetAbility(), player.GetAbilityFunction());
                        player.Ability();

                    }
                    else {
                        damage = player.weapon.Strike(choice,
                        player.GetStrength(),
                        player.GetDexterity(), 
                        player.weapon.GetWeaponWeight(), player.GetDamageMultiplier());
                    }

                    isValid = false; // reset isValid so we do not skip any future input validation

                                        
                    if(choice != 3) {   // inflict damage and print outcome if not using ability()
                        enemy.InflictDamage(damage - enemy.armour.GetDamageReductionAmount());
                        printer.PrintStrikeOutcome(damage, player.GetName());
                    }

                    gameOver = enemy.IsDead();

                    if(gameOver) {
                        winner = player.GetName();
                        break;
                    }

                    playerTurn = false;

                } // if (player turn)
                else {
            
                    // get attack type
                    if(!enemyAbilityUsed) { 
                        choice = randNum.nextInt(3) + 1; // possible roll of 1 to 3
                    }
                    else {
                        choice = randNum.nextInt(2) + 1; // possible roll of 1 or 2
                    }
                    if(choice == 3) {
                        //abilityUsed = true;
                        enemyAbilityUsed = true; // ensure ability can only be used once
                        printer.PrintAbility( enemy.GetName(), enemy.GetAbility(), enemy.GetAbilityFunction());
                        enemy.Ability();
                    }

                    else {
                        // strike
                        damage = enemy.weapon.Strike(choice, enemy.GetStrength(),
                        enemy.GetDexterity(), 
                        enemy.weapon.GetWeaponWeight(), 
                        enemy.GetDamageMultiplier());
                        }

                        // inflict damage and print outcome
                    if(choice != 3) {
                        player.InflictDamage(damage - player.armour.GetDamageReductionAmount());
                        printer.PrintStrikeOutcome(damage, enemy.GetName());
                        }

                    //check player health
                    gameOver = player.IsDead();

                    if(gameOver) {
                        winner = enemy.GetName();
                        break;  
                        }
                    playerTurn = true;

                } // else (enemy turn)
            } // while !gameOver

            printer.ShowWinner(winner);
            while(!isValid){
                try{
                    printer.PlayAgain();
                    choice = input.nextInt();
                    if(choice >= 1 && choice <= 2) {
                            isValid = true;
                    }
                    else {
                        printer.InvalidInputPlayAgain();
                        isValid = false;
                    }
                } // try
                catch(InputMismatchException choice) {
                    printer.InvalidInputPlayAgain();
                    isValid = false;
                }
                finally {
                    if(!isValid) {
                        input.nextLine();
                    }
                } 
            } // while !valid   
            isValid = false; // reset isValid
            
            roundOver = PlayAgain(choice);  // check to see if user wants to play another round
            gameOver = false;              // reset variables for next round
            playerTurn = true;
            playerAbilityUsed = false;
            enemyAbilityUsed = false;
            damage = 0;

        } // while !roundOver
    
    printer.SeeYouNextTime(); 
    
    } // main

    public static void CreateArena() {
        int arenaChoice = randNum.nextInt(4) + 1;
        switch(arenaChoice) {
            
            case 1: {
                arena = new Downtown();
                break;
            }   
            case 2: {
                arena = new Eastside();
                break;
            }
            case 3: {
                arena = new Westside();
                break;
            }
            case 4: { 
                arena = new NorthYork();
                break;
            } 
        }
    } // create arena

    public static void CreateCharacter(int choice, Boolean playerTurn) {
        input.nextLine();
        String name = "";
        if(playerTurn) {
            printer.NamePrompt();
            name = input.next();
        }
        switch(choice) {
            case 1: {
                if(playerTurn) 
                    player = new Chad(name);
                else {
                    enemy = new Chad();
                } 
                break;    
            }
            case 2: {
                if(playerTurn) 
                    player = new Hipster(name);
                else {
                    enemy = new Hipster();
                }
                break;
            }
            case 3: {
                if(playerTurn)
                    player = new HoodMan(name);
                else {
                    enemy = new HoodMan();
                }
                break;
            }
            case 4: {
                if(playerTurn)
                    player = new Karen(name);
                else {
                    enemy = new Karen(); 
                }
                break;
            }
            case 5: {
                if(playerTurn)
                    player = new Racoon(name);
                else {
                    enemy = new Racoon();
                }
                break;
            }
            case 6: {
                if(playerTurn)
                    player = new BayStreetScum(name);
                else {
                    enemy = new BayStreetScum();
                }
                break;
            }
        
        } // switch
    } // Create Character

    public static boolean PlayAgain(int choice) {
        if(choice == 1 ) {
            roundOver = false;
        }
        else if(choice == 2) {
            roundOver = true;
        }
        return roundOver;
    } // PlayAgain
} // class


