public final class Drink implements Commodity {
    private String name;
    private int value;
    private int capacity;
    private String container;
    private Boolean alchol;

    public final String getName() {
        return this.name;
    }

    public final int getValue() {
        return this.value;
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

    public void setName(String name) {
        this.name = name;
    }

    public final void setValue(int value) {
        this.value = value;
    }

    public final void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public final void setContainer(String container) {
        this.container = container;
    }

    public final void setAlchol(boolean alchol) {
        this.alchol = alchol;
    }

}
