package .vscode;

public class Vacation
    {
private double price;  
private double doj;  
public void setprice(double p)   
{   
price = p;   
}  
public void setdoj(double d)   
{   
doj= d;   
}  
    }
public class Journey extends Vacation  
    {  
    public void setprice(double p)   
    {  
    super.setprice(p);  
    super.setdoj(d);  
    }  
    public void setdoj(double d)   
    {  
    super.setprice(p);  
    super.setdoj(d);  
    }  
    }  