class Test{
	void appointment(){
		java.util.Scanner input = new java.util.Scanner(System.in);
		java.util.Scanner inputS = new java.util.Scanner(System.in);
		System.out.println("Dr Nouman Shaikh is avaiable at this time.");
		System.out.println("For Appointment Press 1");
		System.out.println("Not intreseted Press 2");
		System.out.print("Make your choice:");
		int choice=input.nextInt();
		String doctorName = "Dr Nouman Shaikh";
		String time = "11:00 AM";
		String date = "1/1/19";
		
		if(choice == 1){
			System.out.print("Enter your good name:");		
			String name = inputS.nextLine();
			System.out.println("**Receipt**");
			System.out.println("Name:"+name);
			System.out.println("Doctor:"+doctorName);
			System.out.println("Time:"+time);
			System.out.println("Date:"+date);
				
		}

}


