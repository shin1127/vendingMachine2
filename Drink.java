public final class Drink extends Commodity{
    private int capacity;
    private String container;
    private Boolean alchol;

    public final String getCapacity(){
        return this.capacity;
    }
    public final int getContainer(){
        return this.container;
    }
    public final boolean alchol(){
    return this.alchol;
    }
    public final int setCapacity(int capacity){
        this.capacity = capacity;
    }
    public final String setContainer(String container){
        this.container = container;
    }
    public boolean setAlchol(boolean alchol){
        this.alchol = alchol;
    }

}