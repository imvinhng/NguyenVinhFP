/*
 * ==========================================
 * CS211, Spring 2020, 6/18
 * Vinh T. Nguyen
 * Chapter 16, pg 1027, #4
 * Create a Assasin game where all players, inputted through 
 * an external file of names, in a kill ring and killed one by one
 * by the users choice until the last player is left and declared
 * the winner.
 * printKillRing() was used to print all players concurrently in the Kill Ring, and
 * printGraveyard() was used to print all the players have been killed
 * ==========================================
*/
import java.util.*;
import java.io.*;

public class FinalProject_Test {

   public static void main(String[] args) {

      String path = "players.txt";
      Assasin game = new Assasin(path);
      game.init();
//       game.printKillRing();
//       game.printGraveyard();
   
   }
}