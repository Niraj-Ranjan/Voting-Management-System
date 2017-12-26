/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voting.management;


class User2 {
    
    
     private String name,party_leader,sex,age,partyheadquater,partysign;
    
    
    public User2 (String name,String party_leader,String sex,String age,String partyheadquater,String partysign)
            {
            this.name=name;
            this.party_leader=party_leader;
            this.sex=sex;
            this.age=age;
            this.partyheadquater=partyheadquater;
            this.partysign=partysign;
           
            
            }
    public String getname()
    {
    return name;}
    public String getparty_leader()
    {
    return party_leader;
    }
    public String getsex()
    {
    return sex;}
    public String getage()
    {
    return age;}
    public String getpartyheadquater()
    {
    return partyheadquater;
    
    }
    public String getpartysign()
    {
    return partysign;
    }

    
    

    
}
