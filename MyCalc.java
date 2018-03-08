public class MyCalc implements Calculator{
    private double num1;
    private double num2;
    private String operator;
    private double result;

    public void setOperandOne(double num1){
        this.num1 = num1;
    }

    public void setOperation(String operation){
        this.operator = operation;
    }

    public void setOperandTwo(double num2){
        this.num2 = num2;
    }

    public MyCalc(){
        
    }

    public double getResults(){
        if(this.operator.equals("+")){
            this.result = this.num1+this.num2;
        }
        else if(this.operator.equals("-")){
            this.result = this.num1-this.num2;
        }
        else{
            System.out.println("Wrong operator!");
            return 0.0;
        }
        return this.result;
    }
}