package entities;

public class user  {
    private String ID;
    private String Name ;
   
    

    public user ()
    {   this.ID="23-54897-3";
        this.Name="Shohag";
 
    }
    
    public user(String ID ,String Name)
    {
        this.ID=ID;
        this.Name=Name;



    }


    public void setName(String Name){

        this.Name=Name;
    }
    public String  getName()
    {

        return this.Name;
    }

    public void showDetails()
    {
        System.out.println("Name :  "+ this.Name+"/n ID : "+this.ID);




    }











}