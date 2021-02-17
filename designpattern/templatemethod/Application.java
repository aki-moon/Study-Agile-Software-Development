package agilesoftwaredevelopment.designpattern.templatemethod;

public interface Application {

	void init();

	void idle();

	boolean done();

	void cleanup();

}
