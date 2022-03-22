/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SwimmingPool;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Hello VIỆT
 */
public class Ticket {
    public String code;
    public Date registeredDate;

    public Ticket() {
    }

    public Ticket(String code, Date registeredDate) {
        this.code = code;
        this.registeredDate = registeredDate;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Date getRegisteredDate() {
        return registeredDate;
    }

    public void setRegisteredDate(Date registeredDate) {
        this.registeredDate = registeredDate;
    }
    
   public String autoGenerateCode() {
         // length is bounded by 256 Character
         int n = 10;
        byte[] array = new byte[256];
        new Random().nextBytes(array);
  
        String randomString
            = new String(array, Charset.forName("UTF-8"));
  
        // Create a StringBuffer to store the result
        StringBuilder r = new StringBuilder();
  
        // Append first 20 alphanumeric characters
        // from the generated random String into the result
        for (int k = 0; k < randomString.length(); k++) {
  
            char ch = randomString.charAt(k);
  
            if (((ch >= 'a' && ch <= 'z')
                 || (ch >= 'A' && ch <= 'Z')
                 || (ch >= '0' && ch <= '9'))
                && (n > 0)) {
  
                r.append(ch);
                n--;
            }
        }
  
        // return the resultant string
        return r.toString();
    }
        
    
}
