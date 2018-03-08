public class CalcTester{
    public static void main(String[] args){
        MyCalc mycalc = new MyCalc();
        mycalc.setOperandOne(10.5);
        mycalc.setOperation("+");
        mycalc.setOperandTwo(5.2);
        System.out.println(mycalc.getResults());
    }
}