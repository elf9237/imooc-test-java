package carsystem;
import java.util.Scanner;
public class Test {  
	  
    /** 
     * @param args 
     */  
    public static void main(String[] args) {  
        // TODO Auto-generated method stub  
        System.out.println("欢迎使用答答租车系统");  
        System.out.println("您是否需要租车 1:是，0：否");  
        Scanner scan =new Scanner(System.in);  
        String input=scan.next();  
          
          
        if(input.equals("1"))  
        {  
            System.out.println("您可租车的类型及其价目表");  
            System.out.println("序号"+"\t汽车名称"+"\t租金"+"\t容量");  
            Car[] cars={new PassengerCar("奥迪A4",500,4),new PassengerCar("马自达6",400,4),new PickUp("皮卡雪6",450,4,2),new PassengerCar("金龙",800,20),  
                    new TruckCar("松花江",400,4),new TruckCar("依维柯",1000,20)};  
            int index=1;  
            for(Car car:cars){  
                if(car instanceof PassengerCar){  
                    System.out.println(" "+index+"\t"+car.getName()+"\t"+car.getRent()+"\t载客："+((PassengerCar)car).getpCapacity() );                      
                }else if(car instanceof PickUp){  
                    System.out.println(" "+index+"\t"+car.getName()+"\t"+car.getRent()+"\t载客："+((PickUp)car).getpCapacity() +"\t载货："+((PickUp)car).getrCapacity());                   
                }else {  
                    System.out.println(" "+index+"\t"+car.getName()+"\t"+car.getRent()+"\t载货："+((TruckCar)car).getrCapacity());                   
                }  
                index++;  
            }  
            System.out.println("请输入您要租汽车的数量");  
            int rentNums = scan.nextInt();  
            int rentdays;  
            int rentFare=0;  
            String passCarName=new String();  
            String truckCarName=new String();  
            int indexCar;  
            int pCap=0;  
            int rCap=0;  
              
            for(int i=0;i<rentNums;i++){  
                System.out.println("请输入第"+(i+1)+"辆车的序号");  
                indexCar=scan.nextInt()-1;  
                ;     
                if(cars[indexCar] instanceof PassengerCar){  
                    passCarName +=cars[indexCar].name+"\t";  
                    pCap +=((PassengerCar)(cars[indexCar])).getpCapacity();  
                }  
                else if(cars[indexCar] instanceof PickUp){  
                    passCarName +=cars[indexCar].name+"\t";  
                    truckCarName +=cars[indexCar].name+"\t";  
                    pCap +=((PickUp)(cars[indexCar])).getpCapacity();  
                    rCap +=((PickUp)(cars[indexCar])).getrCapacity();  
                }else{  
                    pCap +=((TruckCar)(cars[indexCar])).getrCapacity();  
                    truckCarName +=cars[indexCar].name+"\t";  
                }  
                rentFare +=cars[indexCar].rent;  
                      
            }  
            System.out.println("请输入租车天数");  
            rentdays=scan.nextInt();  
              
            System.out.println("您的账单");  
            System.out.println("****可载人的车有：");  
            System.out.println(passCarName +"共载人为："+pCap);  
            System.out.println("****可载货的车有：");  
            System.out.println(truckCarName +"共载货为："+rCap);  
            System.out.println("****租车总价格为：");  
            System.out.println(rentFare*rentdays);        
        }             
    }  
  
}  