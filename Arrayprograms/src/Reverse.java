

public class Reverse {
	
	
	
	

class SyncThread implements Runnable{	
	private Object obj1;
	public SyncThread(Object obj1, Object obj2) {
		super();
		this.obj1 = obj1;
		this.obj2 = obj2;
	}

	private Object obj2;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		String name= Thread.currentThread().getName();
		System.out.println(name+""+obj1);
		work();
	}
	
	
	private void work() {
		try {
			Thread.sleep(5000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		
	}
}

	public static void main(String[] args) throws InterruptedException {
		Object obj1= new Object();
		Object obj2= new Object();
		
		Thread t1=new Thread(new SyncThread(obj1, obj2));
		Thread t2=new Thread(new SyncThread(obj1, obj2));
		
		t1.start();
		Thread.sleep(5000);
		t2.start();
		Thread.sleep(5000);
	
	}

	}
