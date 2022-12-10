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
public class CropInfoDirectory {
    
    private ArrayList<CropInfo> cropDataList;

    public CropInfoDirectory() {
        this.cropDataList = new ArrayList<>();
    }

    public ArrayList<CropInfo> getCropDataList() {
        return cropDataList;
    }

    public void setCropDataList(ArrayList<CropInfo> cropDataList) {
        this.cropDataList = cropDataList;
    }
    
    
    public CropInfo addCropData(){
        CropInfo cropData = new CropInfo();
        cropDataList.add(cropData);
        return cropData;
    }
    
}
