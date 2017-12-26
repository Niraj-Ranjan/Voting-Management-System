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
class User {

   private String voterid,password,name,fathername,address,sex;
    int age;
    
    public User (String voterid,String password,String name,String fathername,String address,String sex,int age)
            {
            this.voterid=voterid;
            this.password=password;
            this.address=address;
            this.name=name;
            this.fathername=fathername;
            this.sex=sex;
            this.age=age;
            
            }
    public String getvoterid()
    {
    return voterid;}
    public String getpassword()
    {
    return password;
    }
    public String getname()
    {
    return name;}
    public String getfathername()
    {
    return fathername;}
    public String getsex()
    {
    return sex;
    
    }
    public int getage()
    {
    return age;
    }
    public String getaddress()
    {
    return address;
    
    }

    
    
}
