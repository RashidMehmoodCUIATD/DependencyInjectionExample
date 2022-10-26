public class ErrorSenderInjector implements LoggerServiceInjector{
    @Override
    public Consumer getConsumer() {
        return new MyApplication(new ErrorSender());
    }
}
