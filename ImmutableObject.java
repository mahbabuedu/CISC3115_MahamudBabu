import java.util.ArrayList;

public class ImmutableObject {


    public static void main(String[] args) {
        float farenheit = 98.6f;
        float centigrade = 5/9f * (farenheit - 32);
        System.out.println("Centigrade: " + centigrade);
        
        for(float i = 0;i<41;i+=2){
            System.out.println("Farenheit: " + i + " Centigrade: " + (5/9f * (i - 32)));
        }
        float f = 0;
        while(f < 41 ){
            System.out.println("Farenheit: " + f + " Centigrade: " + (5/9f * (f - 32)));
            f+=2;
        }

    }

    static boolean checkInside(String[][] myArray,String inputwords){
        boolean isin = false; //assume not inside
        for(int i = 0;i<myArray.length;i++){
            for(int j = 0;j<myArray[i].length;j++){ 
                if(myArray[i][j].equals(inputwords)){
                    isin = true; //if inside
                }
            }
        }
        return isin;
    }


    static void StopChecking(){
        //2d string array
    
        String[] cars = {"BMW","Ferrari","Lamborghini"};
        String[] food = {"Pizza","Burger","Dumpling"};
        String[][] myArray = {cars,food};
        String isin,inputwords;
        
        

    }



    
}
