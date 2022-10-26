
public class ErrorLogger implements LoggerService{
        public void CreateLog(String ErrorDetail, String LogReceiver){
            //logic to write error details to file
            System.out.println("Error details written to "+LogReceiver+ " with Message="+ErrorDetail);
        }}
