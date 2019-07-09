package org.lax.java8;

class Item{
    public String getCode() {
		return code;
	}



	private String code;
    private String name;

    public String getName() {
		return name;
	}

	public Item(String code, String name) {
        this.code = code;
        this.name = name;
    }

    //getters and setters
}