/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pedro.ieslaencanta.com.dawairtemplate.model.sprites;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.function.Supplier;

/**
 *
 * @author DAM
 */
public class EnemyFactory {

    private static HashMap<String, Supplier<Enemy>> enemigos;
    private static ArrayList<String> names;

    static {
        enemigos = new HashMap();
        names = new ArrayList();
    }

    public static void addEnemy(String name, Supplier< Enemy> s) {
        EnemyFactory.enemigos.put(name, s);
        EnemyFactory.names.add(name);
    }

    public static Enemy get(Supplier<? extends Enemy> s) {
        return s.get();
    }

    public static List<String> getKeyNames() {
        return EnemyFactory.names;
    //return new ArrayList<String>(FactoryEnemigos.enemigos.keySet());
    }

    public static Enemy create(String nombre) {
        if (EnemyFactory.enemigos.get(nombre) != null) {
            return EnemyFactory.enemigos.get(nombre).get();
        } else {
            return null;
        }
    }
}
