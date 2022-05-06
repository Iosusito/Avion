/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pedro.ieslaencanta.com.dawairtemplate.model.sprites;

import java.util.ArrayList;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import pedro.ieslaencanta.com.dawairtemplate.model.Coordenada;
import pedro.ieslaencanta.com.dawairtemplate.model.Rectangle;
import pedro.ieslaencanta.com.dawairtemplate.model.Size;

/**
 *
 * @author DAM
 */
public abstract class Enemy extends SpriteMove {

    protected Image imagen;
    protected ArrayList<Bullet> bullets;

    public Enemy(Size size, Coordenada posicion, Rectangle board) {
        super(3, size, posicion, true, true, board);
       
    }

    public void TicTac() {
        this.move(Direction.LEFT);
        this.shoot();
    }

    public void shoot() {
        if ((int) (Math.random() * 50) == 0) {
            Bullet b = new Bullet(new Size(12, 3), new Coordenada(this.posicion.getX(), this.posicion.getY()), board, Direction.LEFT);
            this.bullets.add(b);
        }
    }

    @Override
    public void draw(GraphicsContext gc) {
        int x = this.posicion.getX();
        int y = this.posicion.getY();
        gc.drawImage(this.imagen, 0, 0, 31, 14, x, y, 62, 28);
    }
    
    public void setBullets(ArrayList<Bullet> balas) {
        this.bullets = balas;
    }
}
