public class Fractions{
    private int numerator = -1;
    private int denominator = 1; 
    public Fractions(){
    }
    public Fractions(int num, int den){
        if(den==0){
            System.out.println("Denominator cannot be 0");
        }else{
            numerator = num;
            denominator = den;
        }
    }
    public Fractions(String frac){
        if(frac.substring(frac.indexOf("/")+1).equals("0")){
            System.out.println("Denominator cannot be 0");
        }else{
            numerator = Integer.parseInt(frac.substring(0,frac.indexOf("/")));
            denominator = Integer.parseInt(frac.substring(frac.indexOf("/")+1));
        }
    }
    public Fractions(Fractions a){
        numerator = a.numerator;
        denominator = a.denominator;
    }
    public int getNumerator(){
        return numerator;
    }
    public int getDenominator(){
        return denominator;
    }
    public void setNumerator(int num){
        numerator = num;
    }
    public void setDenominator(int den){
        denominator = den;
    }
    public void printFraction(){
        System.out.println(numerator + "/" +denominator);
    }
}