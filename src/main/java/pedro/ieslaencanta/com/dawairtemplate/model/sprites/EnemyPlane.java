/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pedro.ieslaencanta.com.dawairtemplate.model.sprites;

import java.util.ArrayList;
import javafx.scene.image.Image;
import pedro.ieslaencanta.com.dawairtemplate.model.Coordenada;
import pedro.ieslaencanta.com.dawairtemplate.model.Rectangle;
import pedro.ieslaencanta.com.dawairtemplate.model.Size;

/**
 *
 * @author DAM
 */
public class EnemyPlane extends Enemy {
    
    private static String pathImagen = "enemigos/e1.png";
    
    public EnemyPlane(Size size, Coordenada posicion, Rectangle board) {
        super(size, posicion, board);
        this.imagen = new Image(getClass().getResourceAsStream("/" + this.pathImagen));
    }
}
