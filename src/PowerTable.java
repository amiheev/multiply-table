import java.util.Random;

public class PowerTable {
    private int[] factor = {2,3,4,5,6,7,8,9};
    private int result;
    public PowerTable(){}
    public int getResult(int x, int y){
        return x*y;
    }

    public String getExpression(int x, int y){
        return x  +  " * " +  y ;
    }

    public String checkAnswer(int x, int y, int result){
        String res;
        if (x*y == result){
            res = "true";
        }else  res = "false";
        return res;
    }

    public int getFactor(){
        int number = new Random().nextInt(9);
        if (number == 0 ){
            number +=2;
        }else if (number == 1){
            number+=1;
        }
        return number;
    }

}
