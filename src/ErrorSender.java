public class ErrorSender implements LoggerService{
        @Override
        public void CreateLog(String ErrorDetail, String LogReceiver) {
            //logic to send email to Log receiver
            System.out.println("Email sent with "+ErrorDetail+"As body to: "+  LogReceiver);
        }}
