package labPrg;

public class room {

	static class RoomData{
		int roomno;
		String roomtype;
		float roomarea;
		
		void setdata(int roomno,String roomtype,float roomarea) {
			this.roomno=roomno;
			this.roomtype=roomtype;
			this.roomarea=roomarea;
		}
		void display()
		{
			System.out.println("room No: " + roomno + " roomtype: "+ roomtype + " roomarea: " + 
		roomarea + "Sq.ft");
		}
	}
	
	public static void main(String []args) {
		RoomData r1= new RoomData();
		r1.setdata(1,"Furnished",300f);
		r1.display();
		
	}
}
