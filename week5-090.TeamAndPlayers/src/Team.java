
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author htmercury
 */
public class Team {
    private String name;
    private ArrayList<Player> players;
    private int maxSize;

    public Team(String name) {
        this.name = name;
        this.players = new ArrayList<Player>();
        this.maxSize = 16;
    }

    public String getName() {
        return name;
    }
    
    public void addPlayer(Player p) {
        if (players.size() < maxSize) {
            this.players.add(p);
        }
    }
    
    public void printPlayers() {
        for (Player p : players) {
            System.out.println(p);
        }
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public int size() {
        return players.size();
    }
    
    public int goals() {
        int total = 0;
        for (Player p : players) {
            total += p.goals();
        }
        
        return total;
    }
}
