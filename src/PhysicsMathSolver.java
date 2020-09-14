
public class PhysicsMathSolver extends Physics{
    
    public static double WMG(double W, double m, double g) throws Exception{
        if(W==0) return m*g;
        else if(m==0) return W/g;
        else if(g==0)return W/m;
        else throw new Exception("Wrong Input !!");
    }
    
    public static double VIR(double V, double I, double R) throws Exception{
        if(V==0) return I*R;
        else if(I==0) return V/R;
        else if(R==0) return V/I;
        else throw new Exception("Wrong Input !!");
    }
    
    public static double VUAT(double v, double u, double a, double t) throws Exception{
        if(v==0) return (u+(a*t));
        else if(u==0) return (v-(a*t));
        else if(a==0) return ((v-u)/t);
        else if(t==0) return ((v-u)/a);
        else throw new Exception("Wrong Input !!");
    }
    
    public static double PWT(double P, double W, double t) throws Exception{
        if(P==0) return W/t;
        else if(W==0) return P*t;
        else if(t==0) return W/P;
        else throw new Exception("Wrong Input !!");
    }
    
    public static double WMGH(double W, double m, double g, double h) throws Exception{
        if(W==0) return (m*g*h);
        else if(m==0) return (W/(g*h));
        else if(g==0) return ((W)/(m*h));
        else if(h==0) return ((W)/(m*g));
        else throw new Exception("Wrong Input !!");
    }
}
