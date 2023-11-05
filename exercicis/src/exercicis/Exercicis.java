/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicis;

import java.util.Scanner;
import java.lang.Math;

/**
 *
 * @author joch
 */
public class Exercicis {

    private static void menu() {
        System.out.println("\nTria una opció:");

        System.out.println("\nAqui comencen els exercicis de l'Unitat 1\n");
        System.out.println("En aquesta unitat només feim servir operadors ternaris");

        System.out.println("Aquests són els exercicis de clase");
        System.out.println("1. Calcula la mitjana de dues notes");
        System.out.println("2. Mirar si es major d'edat");
        System.out.println("3. Mira si un nombre és parell");
        System.out.println("4. Mostra si es pot sortir al pati");

        System.out.println("Aquests són els exercicis voluntaris");
        System.out.println("5. Calcula l'iva d'un producte i el preu final");
        System.out.println("6. Mirar si dos nombres són iguals");
        System.out.println("7. Calcula l'àrea d'un triangle");
        System.out.println("8. Càlcula el valor de y quan y = ax² + bx + c");
        System.out.println("9. Calcula la longitud total de tres mides en centímetres");
        System.out.println("10. Calcula el valor de les entrades de un teatre");
        System.out.println("11. Mostra un nombre de segons en hores, minuts i segons");

        System.out.println("\nAqui comencen els exercicis de l'Unitat 2\n");

        System.out.println("Aquests són els exercicis de classe");
        System.out.println("En aquesta unitat utilitzam if i switch");
        System.out.println("12. Mira si un nombre és parell o no");
        System.out.println("13. Mira quin de dos nombres és major");
        System.out.println("14. Introdueïx un nombre decimal i mira si es quasi zero, és a dir, que sigui estigui comprès"
                + " entre -1 i 1 sense incloure'ls");
        System.out.println("15. Introdueix dos nombre i mostre'ls en ordre (Operadors ternaris)");
        System.out.println("16. Mira quina nota tens");
        System.out.println("17. Mira quin dia de la setmana és");
        System.out.println("18. Mira si la data és correcta");
        System.out.println("19. Mira quin moment és, un segon més tard");

        System.out.println("\n0. Surt de l'aplicació");
    }

   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int opcio;
        Scanner sc;
        boolean end = false;

        while (!end) {

            menu();

            sc = new Scanner(System.in);

            opcio = sc.nextInt();

            switch (opcio) {

                case 1:
                    System.out.println("Has triat calcular la mitjana de dues notes");
                    System.out.println("Introdueix la primera nota");
                    int nota1 = sc.nextInt();
                    System.out.println("Introdueix la segona nota");
                    int nota2 = sc.nextInt();
                    float notamitja = (float) (nota1 + nota2) / 2;
                    System.out.println("La nota mitja és " + notamitja);

                    break;

                case 2:

                    System.out.println("Has triat mirar si és major d'edat");
                    System.out.println("Introdueix la teva edat");
                    int edat2 = sc.nextInt();
                    boolean majoredat = edat2 >= 18;
                    System.out.println("És major d'edat? " + majoredat);

                    break;

                case 3:

                    System.out.println("Has triat mirar si un nombre és parell");
                    System.out.println("Introdueix el nombre");
                    int nombre = sc.nextInt();
                    boolean esparell = (nombre % 2) == 0;
                    System.out.println("És el nombre parell? " + esparell);

                    break;

                case 4:

                    System.out.println("Has triat mirar si es pot sortir al pati");
                    boolean acabatact,
                     acabatclasse,
                     alarmainc;

                    String sortir;
                            
                    System.out.println("Has acabat l'activitat?");
                    acabatact = sc.nextBoolean();
                    System.out.println("S'ha acabat la classe?");
                    acabatclasse = sc.nextBoolean();
                    System.out.println("Sona l'alarma d'incendis?");
                    alarmainc = sc.nextBoolean();

                    sortir = (alarmainc || (acabatact && acabatclasse)) ? "Pots sortir al pati" : "No pots sortir al pati";

                    System.out.println( sortir);

                    break;

                case 5:
                    System.out.println("Has triat calcular l'IVA");
                    System.out.println("Introdueïx el valor del producte");
                    float preu = sc.nextFloat();
                    System.out.println("Introdueïx el % d'IVA");
                    float iva = sc.nextFloat();
                    float preufinal,
                     ivafinal;

                    ivafinal = (preu * iva) / 100;
                    preufinal = preu + ivafinal;

                    System.out.println("El valor final de l'IVA és " + ivafinal);
                    System.out.println("El preu final és " + preufinal);
                    break;

                case 6:
                    System.out.println("Has triat mirar si dos nombre són iguals");
                    System.out.println("Introdueïx el primer nombre");
                    int valor1 = sc.nextInt();
                    System.out.println("Introdueïx el segon nombre");
                    int valor2 = sc.nextInt();
                    boolean iguals = valor1 == valor2;
                    System.out.println(iguals);
                    break;

                case 7:
                    System.out.println("Has triat calcular l'àrea d'un triangle");
                    System.out.println("Introdueïx el valor de la base");
                    int base = sc.nextInt();
                    System.out.println("Introdueïx l'altura");
                    int altura = sc.nextInt();
                    float area = (float) (base * altura) / 2;
                    System.out.println("L'àrea del triangle és " + area);
                    break;

                case 8:
                    System.out.println("Ha triat calcular el valor de y");
                    System.out.println("Introdueïx el valor de a");
                    int a = sc.nextInt();
                    System.out.println("Introdueïx el valor de b");
                    int b = sc.nextInt();
                    System.out.println("Introdueïx el valor de c");
                    int c = sc.nextInt();
                    System.out.println("Introdueix el valor de x");
                    int x = sc.nextInt();

                    int y = a * (int) Math.pow(x, 2) + b * x + c;

                    System.out.println("El valor de y és " + y);
                    break;

                case 9:

                    System.out.println("Ha triat calcular una distància en cm");
                    System.out.println("Indiqui la primera distància en milímetres");
                    int mm = sc.nextInt();
                    System.out.println("Indiqui la segona distància en centímetres");
                    int cm = sc.nextInt();
                    System.out.println("Indiqui la darrera distància en metres");
                    int m = sc.nextInt();
                    float distancia = (float) mm / 10 + (float) cm + (float) m * 100;
                    System.out.println("La distància final és " + distancia + "cm");
                    break;

                case 10:
                    System.out.println("Ha decidit calcular el preu d'unes entrades");
                    System.out.println("El preu de les entrades adultes és de 18€");
                    System.out.println("El preu de les entrades infantils és de 12€");
                    System.out.println("Si el preu final és superior a 60€, obtindrà un descompte del 10%");
                    System.out.println("Introdueïxi el nombre d'entrades adultes");
                    int adults = sc.nextInt();
                    System.out.println("Introdueïxi el nombre d'entrades infantils");
                    int infantils = sc.nextInt();

                    double preuent = adults * 18 + infantils * 12;

                    preuent = preuent > 60 ? (preuent * 0.9) : preuent;

                    System.out.println("El preu final de les entrades és de " + preuent + "€");

                    break;

                case 11:
                    System.out.println("Ha decidit convertir segons en hores, minuts i segons");
                    System.out.println("Introdueïxi el nombre de segons");
                    int segons = sc.nextInt();
                    int hora = segons / 3600;
                    segons %= 3600;
                    int minuts = segons / 60;
                    segons %= 60;

                    System.out.println("El temps final és de " + hora + " hores, " + minuts + " minuts i "
                            + segons + " segons");

                    break;

                //Aquí comencen els exercicis de la segona unitat
                case 12:
                    System.out.println("Has triat mirar si un nombre és parell");
                    System.out.println("Introdueix el nombre per mirar si és parell");
                    int nombreparell = sc.nextInt();
                    int reste = nombreparell % 2;
                    if (reste == 0) {

                        System.out.println("El nombre és parell");
                    } else {

                        System.out.println("El nombre no és parell");
                    }
                    break;

                case 13:
                    System.out.println("Has triat mirar quin és el major de dos nombres");
                    System.out.println("Introdueix el primer nombre");
                    int nombre1 = sc.nextInt();
                    System.out.println("Introdueix el segon nombre");
                    int nombre2 = sc.nextInt();
                    if (nombre1 > nombre2) {
                        System.out.println("El primer nombre és major");
                    } else if (nombre1 == nombre2) {
                        System.out.println("Els nombres són iguals");
                    } else {
                        System.out.println("El segon nombre és major");
                    }
                    break;

                case 14:

                    System.out.println("Has triat mirar si un valor és quasizero");
                    System.out.println("Per favor introdueix el valor");

                    float valorquasizero = sc.nextFloat();

                    if (valorquasizero < 1 && valorquasizero > -1 && valorquasizero != 0) {
                        System.out.println("El valor es quasizero");
                    } else {
                        System.out.println("El valor no és quasizero");
                    }

                    break;

                case 15:

                    System.out.println("Has triat ordenar dos valors");
                    System.out.println("Introdueïx el primer valor");
                    int v1 = sc.nextInt();
                    System.out.println("Introdueïx el segon valor");
                    int v2 = sc.nextInt();

                    String sortida = v1 >= v2 ? "El nombre " + v1 + " és major que " + v2 : "El nombre " + v2 + " és major que " + v1;
                    System.out.println(sortida);
                    break;

                case 16:

                    System.out.println("Has triat mirar quina nota tens");
                    System.out.println("Introdueix la teva nota");
                    int nota = sc.nextInt();

                    switch (nota) {

                        case 0, 1, 2, 3, 4:
                            System.out.println("Tens un insuficient");
                            break;

                        case 5:
                            System.out.println("Tens un suficient");
                            break;

                        case 6:
                            System.out.println("Tens un bé");
                            break;

                        case 7, 8:
                            System.out.println("Tens un notable");
                            break;

                        case 9, 10:
                            System.out.println("Tens un excel·lent");
                            break;

                        default:
                            System.out.println("Aquesta nota no existeix");

                    }

                    break;

                case 17:
                    System.out.println("Has triat mirar quin dia de la setmana és");
                    System.out.println("Introdueix el dia de la setmana");

                    int dia = sc.nextInt();

                    switch (dia) {
                        case 1 ->
                            System.out.println("Avui és dilluns");
                        case 2 ->
                            System.out.println("Avui és dimarts");
                        case 3 ->
                            System.out.println("Avui és dimecres");
                        case 4 ->
                            System.out.println("Avui és dijous");
                        case 5 ->
                            System.out.println("Avui és divendres");
                        case 6 ->
                            System.out.println("Avui és dissabte");
                        case 7 ->
                            System.out.println("Avui és diumenge");
                        default ->
                            System.out.println("Aquest dia no existeix");
                    }
                    //numero entre 1 i 7 mostra dia de la setmana

                    break;

                case 18:
                    System.out.println("Has triat mirar si una data és correcta");
                    System.out.println("Introdueix el dia");
                    int diadata = sc.nextInt();
                    System.out.println("Intrdoueix el mes");
                    int mesdata = sc.nextInt();
                    System.out.println("introdueix l'any");
                    int anydata = sc.nextInt();

                    if (anydata != 0) {
                        if (mesdata > 0 && mesdata < 13) {
                            switch (mesdata) {
                                case 1, 3, 5, 7, 8, 10, 12:
                                    if (diadata > 0 && diadata < 32) {
                                        System.out.println("La data és correcta");
                                    } else {
                                        System.out.println("La data és incorrecta");
                                    }
                                    break;
                                case 4, 6, 9, 11:
                                    if (diadata > 0 && diadata < 31) {
                                        System.out.println("La data és correcta");
                                    } else {
                                        System.out.println("La data és incorrecta");
                                    }
                                    break;
                                case 2:
                                    if (diadata > 0 && diadata < 29) {
                                        System.out.println("La data és correcta");
                                    } else {
                                        System.out.println("La data és incorrecta");
                                    }
                                    break;
                            }
                        } else {
                            System.out.println("La data és incorrecta");
                        }
                    } else {
                        System.out.println("La data és incorrecta");
                    }

                    break;

                case 19:
                    System.out.println("Has triat mirar quina hora és un segon més tard");

                    System.out.println("Introdueix l'hora");
                    int hora15 = sc.nextInt();
                    System.out.println("Introdueix els minuts");
                    int min15 = sc.nextInt();
                    System.out.println("Introdueix els segons");
                    int seg15 = sc.nextInt();

                    if (hora15 >= 0 && hora15 < 24 && min15 >= 0 && min15 < 60 && seg15 >= 0 && seg15 < 60) {
                        seg15++;

                        if (seg15 == 60) {
                            seg15 = 0;
                            min15++;
                            if (min15 == 60) {
                                min15 = 0;
                                hora15++;
                                if (hora15 == 24) {
                                    hora15 = 0;
                                }
                            }
                        }
                        System.out.println("Un segon més tard siran les " + hora15 + ":" + min15 + ":" + seg15);

                    } else {
                        System.out.println("L'hora ingresada és incorrecta");
                    }

                    break;

                case 0:
                    System.out.println("Ha triat sortir de l'aplicació.");
                    end = true;
                    break;

                default:
                    System.out.println("Opció incorrecta. Triï una altra opció");
            }

        }
    }

}
