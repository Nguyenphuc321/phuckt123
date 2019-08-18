package service;

public interface LibraryService <E> {
    void add(E e);

    void remove(int index);

    void display();

}
