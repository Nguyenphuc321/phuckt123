package Day10;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Film4DQueue <E> {
    private List<Integer> numberSeat = new ArrayList<>();
    private Queue<E> seatesInRoom;
    public List<Integer> getNumberSeat(){
        return numberSeat;
    }
    public void setNumberSeat(List<Integer> numberSeat) {
        this.numberSeat = numberSeat;
    }
    public Queue<E> getSeatesInRoom() {
        if (seatesInRoom ==null){
            seatesInRoom = new LinkedList<>();
        }
        return seatesInRoom;

    }
    public void setSeatesInRoom(Queue<E>seatesInRoom) {
        this.seatesInRoom = seatesInRoom;
    }
    public void printSeatByQueue() {
        System.out.println("Element are");
        for (E elementInQueue : seatesInRoom) {
            System.out.println(elementInQueue.toString());
        }
    }
    @Override
    public String toString() {
        return seatesInRoom.toString();
    }
}
