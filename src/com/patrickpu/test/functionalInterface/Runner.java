package com.patrickpu.test.functionalInterface;

public class Runner {
	
	private int id;
	
	public Runner() {
		super();
	}

	public Runner(int id) {
		super();
		this.id = id;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void run() {
		
		Executor<Runner> e = new Executor<Runner>();
		
		e.execute(this, new Tranformer<Runner>(){

			@Override
			public Runner transform(Runner r) {
				System.out.println("Runner id is " + r.getId());
				return null;
			}
		});
		
	}
}
