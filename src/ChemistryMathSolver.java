
public class ChemistryMathSolver extends Chemistry{
    
    public static double pH(double H){
        return -(java.lang.Math.log10(H));
    }
    
    public static double PVNRT(double p, double V, double n, double R, double T) throws Exception{
        if(p==0) return (n*R*T)/V;
        else if(V==0) return (n*R*T)/p;
        else if(n==0) return (p*V)/(R*T);
        else if(R==0) return (p*V)/(n*T);
        else if(T==0) return (p*V)/(n*R);
        else throw new Exception("Wrong Input !!");
    }
    
    public static double CK(double C, double K) throws Exception{
        if(C==0) return K-273;
        else if(K==0) return C+273;
        else throw new Exception("Wrong Input !!");
    }
        
    public static double JC(double J, double C) throws Exception{
        if(J==0) return C/4.2;
        else if(C==0) return J*4.2;
        else throw new Exception("Wrong Input !!");
    }
    
}
