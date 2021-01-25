public final class Drink implements Commodity {
    private String name;
    private int value;
    private int id;
    private int capacity;
    private String container;
    private Boolean alchol;

    public Drink(String name, int value, int id, int capacity, String container, Boolean alchol) {
        this.name = name;
        this.value = value;
        this.id = id;
        this.capacity = capacity;
        this.container = container;
        this.alchol = alchol;
    }

    public final String getName() {
        return this.name;
    }

    public final int getValue() {
        return this.value;
    }

    public final int getId() {
        return this.id;
    }

    public final int getCapacity() {
        return this.capacity;
    }

    public final String getContainer() {
        return this.container;
    }

    public final boolean getAlchol() {
        return this.alchol;
    }

    // public void setName(String name) {
    // this.name = name;
    // }

    // public final void setValue(int value) {
    // this.value = value;
    // }

    // public final void setCapacity(int capacity) {
    // this.capacity = capacity;
    // }

    // public final void setContainer(String container) {
    // this.container = container;
    // }

    // public final void setAlchol(boolean alchol) {
    // this.alchol = alchol;
    // }

}
