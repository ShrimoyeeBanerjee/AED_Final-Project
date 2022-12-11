/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Work;

import UserAcc.useracc;
import java.util.Date;

/**
 *
 * @author Shrimoyee
 */
public abstract class Request {

    private String message;
    private useracc sender;
    private useracc receiver;
    private String status;
    private String answer;
    private Date requestDate;
    private Date resolveDate;
    
    public Request(){
        requestDate = new Date();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public useracc getSender() {
        return sender;
    }

    public void setSender(useracc sender) {
        this.sender = sender;
    }

    public useracc getReceiver() {
        return receiver;
    }

    public void setReceiver(useracc receiver) {
        this.receiver = receiver;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public Date getResolveDate() {
        return resolveDate;
    }

    public void setResolveDate(Date resolveDate) {
        this.resolveDate = resolveDate;
    }
    
    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
    
    @Override
    public String toString(){
      return message;
    }
}
