/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Work;

/**
 *
 * @author hrushithaputtala
 */
public class SellingLand extends Request{
    private String testResult;
     private String area;
     private String pricePerMonth;
     private int contact; 

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getPricePerMonth() {
        return pricePerMonth;
    }

    public void setPricePerMonth(String pricePerMonth) {
        this.pricePerMonth = pricePerMonth;
    }

    public int getContact() {
        return contact;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }

    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }
    
}
