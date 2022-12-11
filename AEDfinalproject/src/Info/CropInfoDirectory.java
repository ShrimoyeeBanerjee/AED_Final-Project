/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
        this.cropDataList = new ArrayList<CropInfo>();
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
