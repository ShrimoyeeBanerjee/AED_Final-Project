/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Work;

/**
 *
 * @author hrushithaputtala
 */
public class EventOrganizer extends Request{
    private String eventName;
    private String eventAddress;
    private String eventDate;
    private String totalSeats;
    private int remainingSeat;

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventAddress() {
        return eventAddress;
    }

    public void setEventAddress(String eventAddress) {
        this.eventAddress = eventAddress;
    }

    public String getEventDate() {
        return eventDate;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    public String getTotalSeats() {
        return totalSeats;
    }

    public void setTotalSeats(String totalSeats) {
        this.totalSeats = totalSeats;
    }

    public int getRemainingSeat() {
        return remainingSeat;
    }

    public void setRemainingSeat(int remainingSeat) {
        this.remainingSeat = remainingSeat;
    }
    
    
    
    @Override
    public String toString(){
        return eventName;
    }
    
}
