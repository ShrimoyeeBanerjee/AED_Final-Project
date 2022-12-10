/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Info;

/**
 *
 * @author Shrimoyee
 */
public class CropInfo {
    


    private String state;
    private String city;
    private String season;
    private String crop_1;
    private String crop_2;
    private String crop_3;

    public String getStateName() {
        return state;
    }

    public void setStateName(String stateName) {
        this.state = stateName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getCrop_1() {
        return crop_1;
    }

    public void setCrop_1(String crop_1) {
        this.crop_1 = crop_1;
    }

    public String getCrop_2() {
        return crop_2;
    }

    public void setCrop_2(String crop_2) {
        this.crop_2 = crop_2;
    }

    public String getCrop_3() {
        return crop_3;
    }

    public void setCrop_3(String crop_3) {
        this.crop_3 = crop_3;
    }
    
    @Override
    public String toString(){
        return season;
    }
    
}
