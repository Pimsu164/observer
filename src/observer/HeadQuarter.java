/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import java.util.ArrayList;
/**
 *
 * @author HP
 */
public class HeadQuarter implements Source {
    private final ArrayList<MyObserver> list;
    private String data;
    
    public HeadQuarter() {
        this.list = new ArrayList<MyObserver>();
    }
    public void setData(String aData) {
        data = aData;
        notifyObservers();
    }
    public String getData() {
        return data;
    }
    
    @Override
    public void create(MyObserver observer) {
        list.add(observer);
    }
    
    @Override
    public void notifyObservers() {
        for(int i = 0; i < list.size(); ++i) {
            list.get(i).update(this);
        }
    }
}

