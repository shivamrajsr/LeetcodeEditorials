package Editorials;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
class EditorialLinks{

    public static final URL gameOfLife;

    static{
        try {
            gameOfLife = new URI("https://leetcode.com/problems/game-of-life/solutions/5278189/game-of-life-fastest-beats-100").toURL();
            
        } catch (URISyntaxException | MalformedURLException e) {
           throw new ExceptionInInitializerError(e);
        }
    }

}