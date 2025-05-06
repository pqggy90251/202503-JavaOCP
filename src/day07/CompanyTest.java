package day07;

import java.nio.channels.Pipe.SourceChannel;
import java.util.stream.Stream;

public class CompanyTest {

	public static void main(String[] args) {

		Employee employee = new Employee();
		System.out.println(employee.salary);

		Manager manager = new Manager();
		System.out.println(manager.salary);
		System.out.println(manager.budget);

		Supervisor supervisor = new Supervisor();
		System.out.println(supervisor.salary);
		System.out.println(supervisor.budget);
		System.out.println(supervisor.stock);

		Employee[] employees = { employee, manager, supervisor };

		System.out.println(employees[0].salary);
		System.out.println(employees[1].salary);
		System.out.println(employees[2].salary);

		for (int i = 0; i < employees.length; i++) {
			System.out.println(employees[i].salary);

		}
		for (Employee emp : employees) {
			System.out.println(emp.salary);
		}
		
		Manager[] managers= {manager,supervisor};
		for(Manager man:managers) {
			System.out.println(man.salary);
			System.out.println(man.budget);
		}
		Stream.of(managers).forEach(
				mgr->{
					System.out.println(mgr.salary);
					System.out.println(mgr.budget);}
				);
	}

}
