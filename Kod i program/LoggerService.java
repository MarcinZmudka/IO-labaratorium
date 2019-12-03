public class LoggerService{
	
	private Logger logger;
	private LoggerView loggerView;
    private ReservationHandler reservationHandler;
	public SignInClick(){
        String username = loggerView.getUsername();
        String password = loggerView.getPassword();
        User user = logger.SignIn(username, password);
        loggerView.hideSignIn();
        reservationHandler.setUser(user);
    }
	public SignUpClick()
}