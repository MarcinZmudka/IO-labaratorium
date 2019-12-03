public class Reservations{
	
	private ArrayList<Reservation> reservationList;
    getReservationListByUser(User user){
        ArrayList reservationsOfUser = ArrayList<Reservation>();
        Iterator<Reservation> iterator = reservationList.iterator();
        while (iterator.hasNext()) {
            Reservation reservation = iterator.next();
            if (reservation.getUserName().equals(user.getName)) {
                reservationsOfUser.add(reservation);
            }
        }
        return reservationsOfUser;
    }
}