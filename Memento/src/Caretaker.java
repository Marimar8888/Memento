import java.util.ArrayList;
import java.util.List;
//Metodo que gestiona todos los puntos de restauracion
public class Caretaker {
    //atributo List de tipo Memento para guardar los historiales de puntos de restauracion
    private List<Memento> mementoList = new ArrayList<Memento>();

    //Metodo para añadir un punto de restauración al listado
    public void add (Memento state){
        mementoList.add(state);
    }
    //recuperar y devolver el punto de restauración concreto
    public Memento get(int index){
        return mementoList.get(index);
    }
}
