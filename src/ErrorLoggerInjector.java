public class ErrorLoggerInjector implements LoggerServiceInjector{
        @Override
        public Consumer getConsumer() {
            return new MyApplication(new ErrorLogger());
        }
}


