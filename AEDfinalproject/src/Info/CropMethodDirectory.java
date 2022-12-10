/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Info;

import java.util.ArrayList;

/**
 *
 * @author Shrimoyee
 */
public class CropMethodDirectory {
    
     private ArrayList<CropMethod> cropMethodList;

    public CropMethodDirectory() {
        this.cropMethodList = new ArrayList<>();
    }

    public ArrayList<CropMethod> getCropMethodList() {
        return cropMethodList;
    }

    public void setCropMethodList(ArrayList<CropMethod> cropMethodList) {
        this.cropMethodList = cropMethodList;
    }
    
    public CropMethod addCropMethod(){
        CropMethod cropMethod = new CropMethod();
        cropMethodList.add(cropMethod);
        return cropMethod;
    }
}
