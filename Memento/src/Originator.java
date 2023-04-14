//Clase para guardar el estado
public class Originator {
    private String state;

    //Metodo para modificar el estado de un memento
    public void setState(String state){
        this.state = state;
    }
    //Método devolver el estado de un memento
    public String getState(){
        return state;
    }
    //metodo para guardar el estado
    public Memento saveStateToMemento(){
        //crear un nuevo objeto memento con su estado actual
        return  new Memento(state);
    }
    //Metodo para recuperar el estado recibe el objeto memento
    public void getStateFromMemento(Memento memento){
        //modifica el estado del documento al estado del memento recibido
        state = memento.getState();
    }
}


