package .vscode;

public class TravelInfo 
{
    public double ticketNumber(Ticket tck)
    { 
        //functionality   
    }  
}  
public class Train extends TravelInfo
{
    public double ticketNumber()
    {
        return this.getNumber();
    }
}
public class Bus extends TravelInfo
        {
            public double ticketNumber()
            {
                return this.getNumber();
            }
        }