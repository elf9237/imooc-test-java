package carsystem;

public class PassengerCar extends Car {  
    public int pCapacity;     
      
    public int getpCapacity() {  
        return pCapacity;  
    }  
  
    public void setpCapacity(int pCapacity) {  
        this.pCapacity = pCapacity;  
    }  
  
    public PassengerCar(    String m_name,int m_rent,int m_pCapacity){        
        name = m_name;  
        rent = m_rent;  
        pCapacity = m_pCapacity;      
    }  
}  