/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voting.management;

/**
 *
 * @author Niraj
 */
class User4 {
    
    int count;
    String partyname;
    
    public User4(String partyname,int count)
    {
        this.partyname=partyname;
        this.count=count;
    
    }
    
    
    public int getcount()
    {
    return count;}
    
    public String getpartyname()
    {
    return partyname;
    }
}
