package Controler;

public class LoggerService{
	
	private Logger logger;
	private LoggerView loggerView;
	public SignInClick()
	public SignUpClick()
}

package Controler;

public class ReservationHandler{
	
	private User user;
	public searchReservationClick()
	public showMyReservationClick()
	public cancelRerservationClick()
	public setUser(User)
}

package View;

public class LoggerView{
	
	public showSignIn()
	public showSignUp()
	public hideSignIn()
	public hideSignUp()
}

package View;

public class Reservation View{
	
	public showReservations(Reservation reservationArray)
	public showMyReservations(Reservation reservationArray)
	public showConfirmationOfMyReservation(Reservation reservation)
}

package Model;

public class Logger{
	
	public User signIn(String userName, String password)
	public User signUp(String userName, String password, String country, String language)
}

package Model;

public class ReservationFinder{
	
	private attribute;
	public Reservation LookForResservations()
	public Reservation LookForReservationOfUser()
	public cancelReservarion()
	public operation()
}

package Model;

public class Reservation{
	
	private id;
	private arrival;
	private departure;
	private room;
	private price;
	private numberOfGuests;
	public getId()
	public void setId(id)
	public getArrival()
	public void setArrival(arrival)
	public getDeparture()
	public void setDeparture(departure)
	public getRoomName()
	public void setRoomName(roomName)
	public getPrice()
	public void setPrice(price)
	public getNumberOfGuests()
	public void setNumberOfGuests(numberOfGuests)
}

package Model;

public class User{
	
	private reservationArray;
	private name;
	private surname;
	public getReservationArray()
	public void setReservationArray(reservationArray)
	public getName()
	public void setName(name)
	public getSurname()
	public void setSurname(surname)
}

package Model;

public class Room{
	
	private name;
	private price;
	private hotelName;
	public getName()
	public void setName(name)
	public getPrice()
	public void setPrice(price)
}

package Model;

public class ReservationInfo{
	
	private arrival;
	private departure;
	private numberOfGuests;
	private city;
	public getArrival()
	public void setArrival(arrival)
	public getDeparture()
	public void setDeparture(departure)
	public getNumberOfGuests()
	public void setNumberOfGuests(numberOfGuests)
	public getCity()
	public void setCity(city)
}
