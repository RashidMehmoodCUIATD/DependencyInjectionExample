public class Main {
    public static void main(String[] args) {
        String errDet="Some Error Details";
        String errRecr="Error reciver";
        Consumer anyConsumer;
         //any One Who Wants to Be Consumer Of Dependency Must
        // ImplementConsumerInterface
        LoggerServiceInjector InjectorHandle; // can switch during runtime
        //to log error to File
        InjectorHandle =new ErrorLoggerInjector();
        anyConsumer= InjectorHandle.getConsumer();
        anyConsumer.processErrorLogs(errDet,errRecr);
        //to send Error by send email
        InjectorHandle =new ErrorSenderInjector();
        anyConsumer= InjectorHandle.getConsumer();
        anyConsumer.processErrorLogs(errDet,errRecr);
    }
}