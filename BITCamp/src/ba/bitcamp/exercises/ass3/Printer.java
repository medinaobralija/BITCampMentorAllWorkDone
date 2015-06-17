package ba.bitcamp.exercises.ass3;

public class Printer {

	private String name;
	private int paperCapacity;
	private int tintCapacity;
	private  int printedPages;
	public static int totalPagesPrinted;

	/**
	 * Constructor1
	 */
	public Printer() {
		this.name = "DefaultPrinter";
		this.paperCapacity = 0;
		this.tintCapacity = 0;
		this.printedPages = 0;
	}

	/**
	 * Constructor 2
	 * 
	 * @param name
	 */
	public Printer(String name) {
		this.name = name;
		this.paperCapacity = 0;
		this.tintCapacity = 0;
		this.printedPages = 0;
	}

	/**
	 * Checks if printer has ink or not.
	 * 
	 * @return
	 */
	public boolean hasTint() {
		boolean isNotEmpty;
		if (tintCapacity > 2) {
			isNotEmpty = true;
		} else {
			isNotEmpty = false;
		}
		return isNotEmpty;
	}

	/**
	 * Checks if printer has paper or not.
	 * 
	 * @return
	 */
	public boolean hasPaper() {
		boolean isNotEmpty;
		if (paperCapacity > 0) {
			isNotEmpty = true;
		} else {
			isNotEmpty = false;
		}
		return isNotEmpty;
	}

	/**
	 * Gets number of printed pages.
	 * 
	 * @return Integer value.
	 */
	public int getPrintedPages() {
		return printedPages;
	}

	/**
	 * Adds paper to its current capacity.
	 * 
	 * @param paper
	 */
	public void addPaper(int paper) {
		if (paperCapacity + paper <= 100) {
			paperCapacity += paper;
		} else {
			paperCapacity = 100;
		}
	}

	/**
	 * Adds max ink capacity.
	 */
	public void addMaxTint() {
		tintCapacity = 100;
	}

	/**
	 * Prints pages.
	 * 
	 * @param pages
	 */
	public int printPage(int pages) {
		printedPages = 0;
		while (paperCapacity >= 1 && tintCapacity >= 3 && pages > 0) {
			printedPages += 1;
			totalPagesPrinted++;
			pages -= 1;
			paperCapacity -= 1;
			tintCapacity -= 3;
		}
		return pages - printedPages;
	}

	/**
	 * Gets number of total pages printed.
	 * 
	 * @return
	 */
	public static int getTotalPagesPrinted() {
		return totalPagesPrinted;
	}

	/**
	 * This method change our attributes to String so that we can print them.
	 */
	public String toString() {
		String s = "";
		s = "\nName: " + name + "\n";
		if (paperCapacity > 0 && tintCapacity > 3) {
			s += "Ready." + "\n";
		} else if (paperCapacity == 0) {
			s += "No paper." + "\n";
		} else if (tintCapacity < 3) {
			s += "No ink." + "\n";
		} else {
			s += "No paper, no ink." + "\n";
		}
		return s;
	}

}
