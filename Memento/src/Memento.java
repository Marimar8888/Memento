public class Memento {
    private String state;
    //Constructor al que pasamos el estado
    public Memento (String state){
        this.state = state;
    }
    //Metodo que nos devuelve el estado cuando lo necesitamos
    public String getState(){
        return state;
    }
}
