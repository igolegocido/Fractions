public class Fraction{
    private int numerator = -1;
    private int denominator = 1; 
    public Fraction(){
    }
    public Fraction(int num, int den){
        if(den==0){
            System.out.println("Denominator cannot be 0");
        }else{
            numerator = num;
            denominator = den;
        }
    }
    public Fraction(String frac){
        if(frac.substring(frac.indexOf("/")+1).equals("0")){
            System.out.println("Denominator cannot be 0");
        }else{
            numerator = Integer.parseInt(frac.substring(0,frac.indexOf("/")));
            denominator = Integer.parseInt(frac.substring(frac.indexOf("/")+1));
        }
    }
    public Fraction(Fraction a){
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
    public String toString(){
        return numerator + "/" +denominator;
    }
    private void reciprocal(){
        int a = numerator;
        numerator=denominator;
        denominator = a;
    }
    private int GCF(int a, int b){
        if(a==b){
            return a;
        }else{
            return GCF(Math.max(a,b)-Math.min(a,b),Math.min(a,b));
        }
    }
    public void reduce(){
        int a = GCF(numerator,denominator);
        numerator/=a;
        denominator/=a;
    }
    public static Fraction mult(Fraction a, Fraction b){
        Fraction ans = new Fraction(a.numerator*b.numerator, a.denominator*b.denominator);
        ans.reduce();
        return ans;
        
    }
    public void multi(Fraction a){
        numerator *=a.numerator;
        denominator*=a.denominator;
        reduce();
    }
    public static Fraction div(Fraction a, Fraction b){
        Fraction ans = new Fraction(b);
        if(b.numerator==0){
            System.out.println("CANNOT DIVIDE BY ZERO");
        }else{
            ans.reciprocal();
            ans.multi(a);
        }
        return ans;
    }
    public static Fraction add(Fraction a, Fraction b){
        Fraction ans = new Fraction(a.numerator*b.denominator+b.numerator*a.numerator,a.denominator*b.denominator);
        ans.reduce();
        return ans;
    }
    public static Fraction sub(Fraction a, Fraction b){
        Fraction ans = new Fraction(a.numerator*b.denominator-b.numerator*a.numerator,a.denominator*b.denominator);
        ans.reduce();
        return ans;
    }
}