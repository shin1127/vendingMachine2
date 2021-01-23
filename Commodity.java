public interface Commodity{
    private String name;
    private int value;

    public final String getName(){
        return this.name;
    }
    public final int getValue(){
        return this.value;
    }
    public final String setName(String name){
        this.name = name;
    }
    public final int setValue(int value){
        this.value = value;
    }
}