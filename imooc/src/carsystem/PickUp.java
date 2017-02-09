package carsystem;

public class PickUp extends Car {  
    public int pCapacity;     
    public int getpCapacity() {  
        return pCapacity;  
    }  
  
    public void setpCapacity(int pCapacity) {  
        this.pCapacity = pCapacity;  
    }  
  
    public int getrCapacity() {  
        return rCapacity;  
    }  
  
    public void setrCapacity(int rCapacity) {  
        this.rCapacity = rCapacity;  
    }  
  
    public int rCapacity;  
      
    public PickUp(  String m_name,int m_rent,int m_pCapacity,int m_rCapacity){            
        name = m_name;  
        rent = m_rent;  
        pCapacity = m_pCapacity;  
        rCapacity = m_rCapacity;  
    }  
}  