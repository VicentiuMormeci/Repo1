package org.example;

import java.io.IOException;
import java.util.Scanner;

import static org.example.DataLoaderUtils.COURSE_FILE_PATH;

public class Main {
    public static void main(String[] args) throws IOException {

        //incarca date din fisier
        DataLoader dl = new DataLoader();
        dl.loadData();
//        System.out.println(DataLoaderUtils.readFile(COURSE_FILE_PATH));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Puteti introduce urmatoarele optiuni:\n" +
                "0 – Ies din program.\n" +
                "1 – Afiseaza cursuri\n" +
                "2 – Introduceti un curs nou\n" +
                "3 – Introduceti un student nou si inrolati-l la curs\n" +
                "4 – Cautati un student dupa nume (OPTIONAL)\n" +
                "5 – Afiseaza studentii si cursul la care participa. (OPTIONAL)");

        while(true) {
            System.out.println("Va rugam sa introduceti o optiune: ");
            int optiune = Integer.parseInt(scanner.nextLine());


            switch (optiune) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    System.out.println("Afiseaza cursuri");
                    //
                    break;
                case 2:
                    System.out.println("Introduceti un curs nou: ");
                    //
                    break;
                case 3:
                    System.out.println("Introduceti un student nou si inrolati-l la curs");
                    //
                    break;
                case 4:
                    System.out.println("Cautati un student dupa nume");
                    //
                    break;
                case 5:
                    System.out.println("Afiseaza studentii si cursul la care participa");
                    //
                    break;
                default:
                    System.out.println("Aceasta optiune nu exista!");
            }
        }

    }
}