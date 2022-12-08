/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Work;

/**
 *
 * @author hrushithaputtala
 */
public class Funding extends Request{
    private int id;

   
    private String applicant;
    private String request;
    private String status;
    static int counter=0;
    
    
    public Funding() {
        counter++;
        this.id = counter;
        
    }
    
  public int getId() {
        return id;
    }

    public String getApplicant() {
        return applicant;
    }

    public void setApplicant(String applicant) {
        this.applicant = applicant;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
    

    
    
    @Override 
    public String toString(){
    return request;
}
    
}
