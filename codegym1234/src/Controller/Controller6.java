package Controller;

import model.Book;
import model.Movie;
import model.Music;
import service.LibraryService;
import service.LibraryServiceImpl;

import java.util.Scanner;

public class Controller6 {
    Scanner scanner = new Scanner(System.in);

    public void libraryBook() {
        LibraryService<Book> libraryService = new LibraryServiceImpl();
        System.out.println("library book:");
        System.out.println("1: add book");
        System.out.println("2: remove book");
        System.out.println("3: view book");
        System.out.println("---------");
        int temp;
        do {
            System.out.println("mời bạn nhập công việc bạn muốn làm:");
            temp = scanner.nextInt();
            switch (temp) {
                case 1: {
                    Book book = new Book();
                    scanner.nextLine();
                    System.out.println("mời bạn nhập sách muốn thêm vào giỏ:");
                    System.out.println("mời bạn nhập tên sách:");
                    book.setName(scanner.nextLine());
                    libraryService.add(book);
                    break;
                }
                case 2: {
                    System.out.println("mời bạn nhập vị trí của sách mà bạn muốn xóa:");
                    int index = scanner.nextInt();
                    libraryService.remove(index);
                    break;
                }
                case 3: {
                    libraryService.display();
                    break;
                }
                default:
                    System.exit(0);
            }

        } while (temp != 0);
    }

    public void libraryMovie() {
        LibraryService<Movie> libraryService = new LibraryServiceImpl();
        System.out.println("Library movie");
        System.out.println("1: add movie");
        System.out.println("2: Remove movie");
        System.out.println("3: view movie");
        System.out.println("------");
        int temp;
        do {
            System.out.println("mời bạn nhập công việc bạn cần:");
            temp = scanner.nextInt();
            switch (temp) {
                case 1: {
                    Movie movie = new Movie();
                    scanner.nextLine();
                    System.out.println("mời bạn nhập bộ phim mà bạn muốn thêm vào:");
                    System.out.println("mời bạn nhập tên phim:");
                    movie.setName(scanner.nextLine());
                    System.out.println("mời bạn nhập nội dung chính của bộ phim:");
                    movie.setContent(scanner.nextLine());
                    libraryService.add(movie);
                    break;
                }
                case 2: {
                    System.out.println("mời bạn nhập vị trí của bộ phim mà bạn muốn xóa:");
                    int index = scanner.nextInt();
                    libraryService.remove(index);
                    break;
                }
                case 3: {
                    libraryService.display();
                    break;
                }
                default:
                    System.exit(0);
            }
        } while (temp != 0);
    }
    public void libraryMusic(){
        LibraryService libraryService = new LibraryServiceImpl();
        System.out.println("library music");
        System.out.println("1:Add music");
        System.out.println("2:Remove music");
        System.out.println("3:view music");
        System.out.println("--------");
        int temp;
        do {
            System.out.println("mời bạn nhập công việc của bạn:");
            temp = scanner.nextInt();
            switch (temp) {
                case 1: {
                    Music music = new Music();
                    scanner.nextLine();
                    System.out.println("mời bạn nhập bài hát mà bạn muốn thêm vào:");
                    System.out.println("mời bạn nhập tên của bài hát:");
                    music.setAuthor(scanner.nextLine());
                    libraryService.add(music);
                    break;
                }
                case 3: {
                    libraryService.display();
                    break;
                }
                default:
                    System.exit(0);
            }
        }while (temp !=0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Controller6 controller6 = new Controller6();
        System.out.println("library:");
        System.out.println("1:music");
        System.out.println("2:movie");
        System.out.println("3:book");
        System.out.println("-------");
        int temp;
        do {
            System.out.println("mời bạn nhập library");
            temp = scanner.nextInt();
            switch (temp) {
                case 1: {
                    controller6.libraryMusic();
                    break;
                }
                case 2: {
                    controller6.libraryMovie();
                }
                case 3: {
                    controller6.libraryBook();
                    break;
                }
                default:
                    System.exit(0);
            }

        }while (temp !=0);
    }
}




