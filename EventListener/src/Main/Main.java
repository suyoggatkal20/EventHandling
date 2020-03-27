package Main;

class net extends Thread
{
	Command c;
	
	public net(Command c) {
		this.c = c;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		c.addCommandChangedListener(new CommandChangedEvent() {
			@Override
			public void onCommandChange() {
				System.out.println("Command is changed");
				System.out.println("changed Command is "+c.getCommand());
				System.out.println(Thread.currentThread().getName());
			}
		});
	}
	
}
class get extends Thread
{
Command c;
	
	public get(Command c) {
		this.c = c;
	}
	@Override
	public void run() {
		c.setCommand("nice work");
	}
	
}
public class Main {

	public static void main(String[] args) {
		Command c=new Command();
		new net(c).start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		new get(c).start();
	}

}
