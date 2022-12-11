/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Work;

import java.util.ArrayList;

/**
 *
 * @author Shrimoyee
 */
public class queue {
    
    private ArrayList<Request> workRequestList;

    public queue() {
        workRequestList = new ArrayList<>();
    }

    public ArrayList<Request> getWorkRequestList() {
        return workRequestList;
    }
}