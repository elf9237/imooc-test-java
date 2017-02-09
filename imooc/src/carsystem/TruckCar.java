package carsystem;

public class TruckCar extends Car {   
    public int rCapacity;  
      
    public int getrCapacity() {  
        return rCapacity;  
    }  
  
    public void setrCapacity(int rCapacity) {  
        this.rCapacity = rCapacity;  
    }  
  
    public TruckCar(    String m_name,int m_rent,int m_rCapacity){    
        name=m_name;  
        rent = m_rent;        
        rCapacity = m_rCapacity;  
    }  
      
}  