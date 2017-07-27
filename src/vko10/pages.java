/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vko10;

import java.util.ArrayList;

/**
 *
 * @author Qnaerhi
 */
public class pages {
    ArrayList<String> lista = new ArrayList<>(21);
    public String getPrev(int i) {
            return lista.get(i-1);
        }
    public String getNext(int i) {
            return lista.get(i+1);
    }
    public void deleteFwd(int i) {
            while (i<lista.size()) {
                lista.remove(i+1);
                i++;
            }
    }
}
