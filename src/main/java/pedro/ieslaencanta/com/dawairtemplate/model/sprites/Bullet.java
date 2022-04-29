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
public class Bullet extends SpriteMove {

    private Image imagen;
    private static String pathImagen = "bullets/bullet_rigth.png";
    private Direction direction;

    public Bullet(Size size, Coordenada posicion, Rectangle board, Direction d) {
        super(5, size, posicion, true, true, board);
        this.imagen = new Image(getClass().getResourceAsStream("/" + this.pathImagen));
        this.direction = d;
    }

    @Override
    public void draw(GraphicsContext gc) {
        int x = this.posicion.getX() + 70;
        int y = this.posicion.getY() + 16;
        gc.drawImage(this.imagen, 0, 0, 17, 3, x, y, 17, 3);
    }

    public void move() {
        this.move(this.direction);
    }
}
