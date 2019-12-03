public class Logger{
	public Users users;
	public User signIn(String userName, String password){
        User user = users.getUserByName(username, password);
        ReservationFinder reservationFinder = new ReservationFinder();
        ArrayList listOfReservation =  reservationFinder.lookForReservationOfUser(user);

        user.setReservationsList(listOfReservation);
        return User;
       
    }
	public User signUp(String userName, String password, String country, String language)
}