
package day08;

public class TicketTest {

	public static void main(String[] args) {
		String name = "Alice";
		int balance = 2000;
		Ticket ticket = new NonReservedTicket();
		// Alice 要花費多少 ? 剩餘多少 ?
		balance = balance - ticket.getPrice();
		ticket.ticketInfo();
		System.out.printf("%s 花費票價 $%,d 剩餘 $%,d%n", name, ticket.getPrice(), balance);
		// -------------------------------------------------------------------------------
		String name2 = "Bob";
		int balance2 = 1000;
		Ticket ticket2 = new ReservedTicket();
		balance2 = balance2 - ticket2.getPrice();
		ticket2.ticketInfo();
		System.out.printf("%s 花費票價 $%,d 剩餘 $%,d%n", name2, ticket2.getPrice(), balance2);
		
		String name3 = "Andy";
		int balance3 = 700;
		Ticket ticket3 = new NonReservedTicket();
		// Alice 要花費多少 ? 剩餘多少 ?
		balance3 = balance3 - ticket3.getPrice();
		ticket3.ticketInfo();
		System.out.printf("%s 花費票價 $%,d 剩餘 $%,d%n", name3, ticket3.getPrice(), balance3);
		
		

		
	}

}
