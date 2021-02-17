package agilesoftwaredevelopment.designpattern.templatemethod;

public class ApplicationRunner {
	private Application itsApplication = null;

	public ApplicationRunner(Application application) {
		itsApplication = application;
	}

	public void run() {
		itsApplication.init();
		while (!itsApplication.done()) {
			itsApplication.idle();
		}
		itsApplication.cleanup();
	}
}
