package agilesoftwaredevelopment.designpattern.templatemethod;

public abstract class BubbleSorter {
	private int opereations;
	protected int length = 0;

	protected int doSort() {
		opereations = 0;
		if (length <= 1) {
			return opereations;
		}
		for (int i = length - 2; i >= 0; i--) {
			for (int j = 0; j <= i; j++) {
				if (outOfOrder(i)) {
					swap(i);
				}
				opereations++;
			}
		}
		return opereations;
	}

	protected abstract void swap(int index);

	protected abstract boolean outOfOrder(int index);
}
