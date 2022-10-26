public class MyApplication implements Consumer{
    private final LoggerService service;
    public MyApplication(LoggerService svc){
        this.service=svc;
    }

    @Override
    public void processErrorLogs(String ErrorDetail, String LogReceiver){
        //do some  validation, manipulation logic on ErrorDetail or LogReceiver if needed
        this.service.CreateLog(ErrorDetail, LogReceiver);
    }
}