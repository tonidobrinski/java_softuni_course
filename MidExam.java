package Fundamentals;

import java.util.*;

public class MidExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] books = scanner.nextLine().split("&");

        //System.out.println(bookList.get(i));
        List<String> bookList = new ArrayList<>(Arrays.asList(books));
        String addBook = scanner.nextLine();

        while (!Objects.equals(addBook, "Done")){
            String[] input = addBook.split("\\| ");
            if (addBook.contains("Add Book |")){
                if (bookList.indexOf(input[1])>=0){
                    bookList.add(0,input[1]);
                }
            } if (addBook.contains("Take Book |")){
                bookList.remove(input[1]);
            } if (addBook.contains("Swap Books |")){
                int firstIndex = bookList.indexOf(input[1]);
                int secondIndex = bookList.indexOf(input[2]);
                if (firstIndex<0 || secondIndex<0){

                }else {Collections.swap(bookList,secondIndex, firstIndex);}
            } if (addBook.contains("Insert Book |")){
                if (bookList.indexOf(input[1])>=0){
                    bookList.add(input[1]);
                }
            } if (addBook.contains("Check Book |")) {
                if (Integer.parseInt(input[1])<0||Integer.parseInt(input[1])>=bookList.size()){

                }else {                System.out.println(bookList.get(Integer.parseInt(input[1])));
                }
            }
                addBook = scanner.nextLine();
        }
        String output = "";
        for (String s: bookList) {
            output+=s + ", ";
        }
        System.out.println(output.substring(0,output.length()-2));
    }
 }
