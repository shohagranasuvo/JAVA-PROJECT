package repositories;
import java.io.*;
import java.util.*;

public class FileIO{

public void createFile (String fileLocation)
    {try{
        
        File stdFile = new File(fileLocation);
        if(stdFile.createNewFile())
        { 

            System.out.println("New File Crteate ");


        }
        else{

            System.out.println("File Already Exist");
        }


     }

    //String location = "repositories/Data/InfoOfStudent";
    catch(Exception e ){

        e.printStackTrace();
    }
}









public List readFile (String FileLocation){
   List<String>  Data = new ArrayList();


    try {

        FileReader frc=new FileReader(FileLocation);
        BufferedReader brc = new BufferedReader(frc);

        String tem="";
        int i=0;
        while ((tem =brc.readLine())!=null) 
        {
            Data.add(tem);
            i++;
            
            
            
        }


        
    } 
    
    
    catch (Exception e) {
        e.printStackTrace();
    }



return Data ;

}

public void writeClass(String fileLocation ,List <String>Data)

{
    

    try {
        FileWriter frc =new FileWriter(fileLocation);

        for(int i=0 ; i<Data.size();i++)
        {
            if(Data.get(i)!=null)
            {
                frc.write(Data.get(i));


            }

            frc.flush();
            frc.close();





        }

        
    } catch (Exception e) {

        e.printStackTrace();
    }
    










}


  


















}