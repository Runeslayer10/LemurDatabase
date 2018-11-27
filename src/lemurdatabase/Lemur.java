/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lemurdatabase;

/**
 *
 * @author blhad3491
 */
public class Lemur extends Mammal{
    
    private String gender;
    private String location;
    private String classifcation;
    private String fur;
    
    
    public void Lemur (){
        
    location = "Madagascar";
    gender = "Male";
    classifcation = "Prosimian";
    fur = "Fur";
}
    public void setGender (String male){
        gender = male;
    }
    public String getGender(){
        return gender;
    }
}
