/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pedro.ieslaencanta.com.dawairtemplate.model.sprites;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import pedro.ieslaencanta.com.dawairtemplate.model.Coordenada;
import pedro.ieslaencanta.com.dawairtemplate.model.Rectangle;
import pedro.ieslaencanta.com.dawairtemplate.model.Size;

/**
 *
 * @author DAM
 */
public class Enemy extends SpriteMove {

    private Image imagen;
    private static String pathImagen = "bullets/bullet_rigth.png";

    public Enemy(Size size, Coordenada posicion, Rectangle board) {
        super(3, size, posicion, true, true, board);
        this.imagen = new Image(getClass().getResourceAsStream("/" + this.pathImagen));
    }

    public void TicTac() {
        this.move(Direction.LEFT);
    }

    @Override
    public void draw(GraphicsContext gc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
