/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

/**
 *
 * @author HP
 */
public class Registrant2 implements MyObserver {
    @Override
    public void update(Source a) {
        System.out.println("Live Result : " +((HeadQuarter)a).getData());
    }
}
