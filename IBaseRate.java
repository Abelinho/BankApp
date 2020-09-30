package bankaccountapp;

public interface IBaseRate {

	//write a method that returns the base rate
	default double setBaseRate() { 
		//System.out.println("Are you seeing this?");
		return 2.5;
	}
	/*
	 * the default keyword, is a java8 feature that allows an interface to have an implementation
	 * i.e when put b4 a method definition, it allows the method to have a body,
	 * even though it's in an interface*/ 
}
