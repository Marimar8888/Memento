public class Main {
    public static void main(String[] args) {
        //Creo un objeto tipo Originator para crear los puntos de restauración
        Originator originator = new Originator();
        //Creo un ojbeto tipo CareTaker para guardar el histoiral
        Caretaker careTaker = new Caretaker();

        //Modifico el estado
        originator.setState("State #1");
        originator.setState("State #2");
        //Creo un punto de restauración (0)
        careTaker.add(originator.saveStateToMemento());

        //Modifico el estado
        originator.setState("State #3");
        //Creo un punto de restauración (1)
        careTaker.add(originator.saveStateToMemento());

        //Modifico el estado
        originator.setState("State #4");

        //Imprimo el número de estado que tengo

        System.out.println("Current state: " + originator.getState());

        //Recupera el estado del primer punto de restauración
        originator.getStateFromMemento(careTaker.get(0));
        //Imprimo el número de estado que tengo
        System.out.println("First saved state: " + originator.getState());

        //Recupera el estado del primer punto de restauración
        originator.getStateFromMemento(careTaker.get(1));
        //Imprimo el número de estado que tengo
        System.out.println("Second saved state: " + originator.getState());




    }
}