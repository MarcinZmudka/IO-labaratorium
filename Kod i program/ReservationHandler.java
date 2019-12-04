public class ReservationHandler{
	
	private User user;
    private ReservationView reservationView;
    privete ReservationFinder reservationFinder;
	public searchReservationClick(){
        String arrival = reservationView.getArrival();
        String departure = reservationView.getDeparture();
        Int numberOfGueasts = reservationView.getNumberOfGueasts();
        String city = reservationView.getCity();
        ReservationInfo reservationInfo = new ReservationInfo(arrival, departure, numberOfGueasts, city);

        List reservationsList = reservationFinder.LookForReservations(reservationInfo);
        reservationView.ShowReservation(reservationsList); 
    }
	public showMyReservationClick(){
        List reservationList = user.getReservationList();
        reservationView.showMyReservation(reservationList);
    }
	public cancelRerservationClick();
    public makeReservationClick(Reservation reservation){
        reservationFinder.makeReservation(reservation);
    }
	public setUser(User)
}