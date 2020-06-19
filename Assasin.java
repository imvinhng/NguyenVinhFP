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

class Assasin {
      LinkedList<String> killRing = new LinkedList <String>();
      Queue<String> graveyard = new LinkedList<String>();

      
      public Assasin(String path){
         File f = new File(path);
         Scanner sc = new Scanner(f);
         while (sc.hasNextLine()) {
            killRing.add(sc.nextLine());
         }
      }
      
      public void init() {

         // print out the initial Kill Ring
         printKillRing();
         Scanner s = new Scanner(System.in);
         while(killRing.size() > 1 ) {
            System.out.print("Please enter a player's name to kill: ");
            String player = s.next();
            if(killRing.contains(player)) {
               kill(player);
               graveyard.add(player);
               printKillRing();      
            } else {
               System.out.println("The player you asked is not in the kill Ring. Try again.");
            }
         }
         // Print the winner
         System.out.println("The winner is: " + killRing);

      }
      
      public void printGraveyard() {
         System.out.println("Graveyard: "+graveyard);
      }
      
      public void printKillRing() {
         System.out.println("KillRing: " + killRing);
      }
      
      private void kill(String player) {
         killRing.remove(player);
      }

}