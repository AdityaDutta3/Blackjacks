/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blackjacks;

/**
 *
 * @author 14168
 */
import java.util.ArrayList;

public abstract class Game {

    private final String gameName;//the title of the game

    public Game(String givenName) {
        gameName = givenName;
    }

    public String getGameName() {
        return gameName;
    }

    public abstract void play();

}
