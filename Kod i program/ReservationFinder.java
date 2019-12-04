public class ReservationFinder{
	
	private Reservations reservations;
	public ArrayList<Reservation> LookForResservations(ReservatonInfo reservationInfo){
		return reservations.getReservationsByInfo(reservationInfo);
	}
	public ArrayList<Reservation> LookForReservationOfUser(User user){
        ArrayList reservationsList = reservations.getReservationListByUser(user);
        return reservationsList;
    }
	public cancelReservarion(){
		reservation.setBooked(false);
	}
	public makeReservation(Reservation reservation){
		reservation.setBooked(true);
	}
}