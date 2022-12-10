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
    private String crop1;
    private String crop2;
    private String crop3;

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

    public String getCrop1() {
        return crop1;
    }

    public void setCrop1(String crop1) {
        this.crop1 = crop1;
    }

    public String getCrop2() {
        return crop2;
    }

    public void setCrop2(String crop2) {
        this.crop2 = crop2;
    }

    public String getCrop3() {
        return crop3;
    }

    public void setCrop3(String crop3) {
        this.crop3 = crop3;
    }
    
    @Override
    public String toString(){
        return season;
    }
    
}
