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

        System.out.println("\nAquests són els exercicis voluntaris de l'unitat 1");
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

        System.out.println("\nExercicis voluntaris unitat 2");
        System.out.println("20. Calcula l'àrea d'un triangle, comprobant que no s'han introduït valors negatius");
        System.out.println("21. Calcula el valor absolut d'un nombre amb operadors ternaris");
        System.out.println("22. Calcula si hi suficient pinso pels animals");
        System.out.println("23. Mostra la lletra del DNI");
        System.out.println("24. Mira si un nombre és capicua");

        System.out.println("\nAquí comença l'unitat 3 (Loops)");
        System.out.println("25. Mira si és parell, positiu i el seu quadrat");
        System.out.println("26. Mira l¡edat total, edat mitja, nombre d'alumnes i nombre d'alumnes adults");
        System.out.println("27. Joc del nombre secret");
        System.out.println("28. Apren a comptar");

        System.out.println("\nExercicis voluntaris unitat 3");
        System.out.println("34. Incrementar la hora n segons");
        System.out.println("35. Calcular els nombres primers entre 1 i n");
        System.out.println("36. Cerca el MCD de dos nombres");
        System.out.println("37. Cerca el MCM de dos nombres");
        System.out.println("38. Calcula l'arrel quadrada d'un nombre sense Math.sqrt()");
        System.out.println("39. Converteix un nombre decimal en binari");

        System.out.println("\nAquí comença el bloc 4 (Funcions)");
        System.out.println("40. Mostra ECO n vegades");
        System.out.println("41. Mostra de major a menor tots els nombres entre dos nombres");
        System.out.println("42. Calcular l'àrea o el volum d'un cilindre");
        System.out.println("43. Calcular el valor màxim de dos nombres");
        System.out.println("44. Mira si l'hora introduïda és correcte");
        System.out.println("45. Mirar una aplicació que determini el màxim entre 2 o 3 nombres");

        System.out.println("\n0. Surt de l'aplicació");

    }

    private static void eco() {

        System.out.println("Eco");

    }

    private static void ordenarnombres(int valor1, int valor2) {

        int major, menor;

        if (valor1 >= valor2) {
            major = valor1;
            menor = valor2;

        } else {

            major = valor2;
            menor = valor1;

        }

        for (int i = major; i >= menor; i--) {

            System.out.println(i);

        }

    }

    static void calcular(int radi, int altura, int opcio) {

        switch (opcio) {

            case 1:
                System.out.println("Has triat calcular l'àrea del cilindre");
                System.out.println("L'àrea del cilindre és " + (2 * Math.PI * radi * (radi + altura)));
                break;

            case 2:
                System.out.println("Has triat calcular el volum d'un cilindre");
                System.out.println("El volum del cilindre és " + (Math.PI * radi * radi * altura));
                break;

            default:

                System.out.println("Opció no vàlida");

        }

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

                    System.out.println(sortir);

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

                case 20:
                    System.out.println("Has triat calcular l'àrea d'un triangle mirant si els valors d'entrada "
                            + "no siguin negatius");

                    System.out.println("Introdueix el valor de la base");

                    float base20 = sc.nextFloat();
                    System.out.println("Introdueix el valor de l'altura");
                    float altura20 = sc.nextFloat();

                    if (altura20 > 0 && base20 > 0) {

                        System.out.println("El valor de l'àrea és " + (altura20 * base20 / 2));
                    } else {
                        System.out.println("Un dels valors insertats és incorrecte");

                    }

                    break;

                case 21:

                    System.out.println("Heu triat calcular el valor absolut d’un nombre");
                    System.out.println("Introdui el nombre");

                    int nombre21 = sc.nextInt();
                    int valorabsolut = nombre21 > 0 ? nombre21 : -nombre21;

                    System.out.println("El valor absolut de " + nombre21 + " és " + valorabsolut);

                    break;
                case 22:

                    System.out.println("Heu triat calcular si hi ha prou pinso en es magatzem per alimentar els animals");

                    System.out.println("Introdui els kilos de pinso que hi ha en es magatzem");
                    float pinso = sc.nextFloat();
                    System.out.println("Introdui el nombre d'animals");
                    int animals = sc.nextInt();
                    System.out.println("Introdui el nombre de kilos de pinso per animal");
                    int pinsoanimal = sc.nextInt();

                    if (animals > 0) {

                        pinso /= (float) animals;

                        if (pinso >= pinsoanimal) {
                            System.out.println("Hi ha suficient menjar per cada animal");

                        } else {
                            System.out.println("Només hi ha disponibles " + pinso + "Kg de pinso per animal");
                        }

                    } else {

                        System.out.println("No hi ha animals, així que no els hem d'alimentar");
                    }

                    break;

                case 23:

                    System.out.println("Heu triat calcular la lletra del DNI");
                    System.out.println("Introdui el nombre de DNI");

                    int dni = sc.nextInt();
                    int lletra = dni % 23;
                    char lletradni = '0';

                    switch (lletra) {

                        case 0 ->
                            lletradni = 'T';
                        case 1 ->
                            lletradni = 'R';
                        case 2 ->
                            lletradni = 'W';
                        case 3 ->
                            lletradni = 'A';
                        case 4 ->
                            lletradni = 'G';
                        case 5 ->
                            lletradni = 'M';
                        case 6 ->
                            lletradni = 'Y';
                        case 7 ->
                            lletradni = 'F';
                        case 8 ->
                            lletradni = 'P';
                        case 9 ->
                            lletradni = 'D';
                        case 10 ->
                            lletradni = 'X';
                        case 11 ->
                            lletradni = 'B';
                        case 12 ->
                            lletradni = 'N';
                        case 13 ->
                            lletradni = 'J';
                        case 14 ->
                            lletradni = 'Z';
                        case 15 ->
                            lletradni = 'S';
                        case 16 ->
                            lletradni = 'Q';
                        case 17 ->
                            lletradni = 'V';
                        case 18 ->
                            lletradni = 'H';
                        case 19 ->
                            lletradni = 'L';
                        case 20 ->
                            lletradni = 'C';
                        case 21 ->
                            lletradni = 'K';
                        case 22 ->
                            lletradni = 'E';

                    }

                    System.out.println("La lletra corresponent pel DNI " + dni + " és " + lletradni);

                    break;

                case 24:

                    System.out.println("Has triat mirar si un nombre és capicua");
                    System.out.println("Introdueix un nombre");
                    int numero24;
                    int unidades,
                     decenas,
                     centenas,
                     millares;

                    numero24 = sc.nextInt();

                    if (numero24 >= 0 && numero24 < 10) {
                        System.out.println("El nombre és capicua");

                    } else if (numero24 >= 10 && numero24 < 100) {
                        decenas = (int) numero24 / 10;
                        unidades = numero24 % 10;
                        if (unidades == decenas) {
                            System.out.println("El nombre és capicua");
                        } else {
                            System.out.println("El nombre no és capicua");
                        }

                    } else if (numero24 >= 100 && numero24 < 1000) {
                        centenas = (int) numero24 / 100;
                        decenas = numero24 % 100;
                        unidades = decenas % 10;
                        if (unidades == centenas) {
                            System.out.println("El nombre és capicua");
                        } else {
                            System.out.println("El nombre no és capicua");
                        }

                    } else if (numero24 >= 1000 && numero24 < 10000) {
                        millares = (int) numero24 / 1000;
                        centenas = numero24 % 1000;
                        decenas = centenas % 100;
                        centenas = (int) centenas / 100;
                        unidades = decenas % 10;
                        decenas = (int) decenas / 10;
                        if (unidades == millares && decenas == centenas) {
                            System.out.println("El nombre és capicua");
                        } else {
                            System.out.println("El nombre no és capicua");
                        }
                    } else {
                        System.out.println("Entrada incorrecta");
                    }
                    break;

                case 25:

                    System.out.println("Has triat mirar si el valor és parell, positiu i el seu quadrat");

                    //Primer comentari de l'script :O, com estic vago ho faig tot en una sola línea.
                    boolean end25 = false;

                    int opcio25;

                    while (!end25) {

                        opcio25 = sc.nextInt();

                        if (opcio25 != 0) {

                            System.out.println((opcio25 % 2 == 0 ? "El valor és parell, " : "El valor és senar, ")
                                    + (opcio25 > 0 ? "positiu" : "negatiu") + " i el seu quadrat és "
                                    + Math.pow(opcio25, 2));
                        } else {
                            end25 = true;
                        }

                    }

                    break;

                case 26:

                    System.out.println("Has triat mirar l'edat total, edat mitja, nombre d'alumnes i nombre d'alumnes adults");

                    int edat = sc.nextInt();

                    int edattotal = 0;
                    int totalalumnes = 0;
                    int totalalumnesadults = 0;

                    while (edat >= 0) {

                        edattotal += edat;
                        totalalumnes++;

                        totalalumnesadults += edat >= 18 ? 1 : 0;
                        edat = sc.nextInt();

                    }

                    System.out.println("La suma total de les edats és " + edattotal + ", la mitja d'edats és " + ((float) edattotal / (float) totalalumnes)
                            + ", el total d'alumnes és " + totalalumnes + " i el total d'alumnes aduts " + "és " + totalalumnesadults);

                    break;

                case 27:

                    System.out.println("Trobar el nombre secret entre 1 i 100");

                    int numSecret = (int) (Math.random() * 100 + 1);
                    int nombre27;

                    System.out.println("Introdueix un nombre");
                    nombre27 = sc.nextInt();

                    while (nombre27 != numSecret) {

                        if (nombre27 > numSecret) {
                            System.out.println("El nombre secret és menor.");
                        } else {
                            System.out.println("El nombre secret és major");
                        }
                        System.out.println("Introdueix un nombre");
                        nombre27 = sc.nextInt();
                    }

                    System.out.println("HAS ENCERTAT EL NOMBRE SECRET!!!");

                    break;

                case 28:

                    System.out.println("Has triat aprendrer a comptar");

                    System.out.println("Introdueix el nombre final");
                    int nombrefinal = sc.nextInt();

                    for (int i = 1; i <= nombrefinal; i++) {

                        System.out.println(i);
                    }

                    break;

                case 29:

                    System.out.println("Has triat mostrar els múltiples de 7 menors de 100");

                    for (int i = 7; i < 100; i += 7) {

                        System.out.println(i);
                    }

                    break;

                case 30:

                    System.out.println("Introdueix 10 nombres sencers");

                    float mitja30 = 0;

                    for (int i = 0; i < 10; i++) {

                        mitja30 += sc.nextFloat();

                    }

                    System.out.println("La mitja és " + mitja30 / 10);

                    break;

                case 31:
                    System.out.println("Has triat calcular el factorial d'un nombre.");
                    System.out.println("Introdueix un nombre.");
                    int factorial = sc.nextInt();

                    for (int i = factorial - 1; i > 1; i--) {

                        factorial *= i;
                    }

                    System.out.println("El factorial del nombre és " + factorial);

                    break;

                case 32:

                    System.out.println("Has triat calcular les estadístiques de les notes d'una classe");

                    System.out.println("Introdueix el nombre d'alumnes");

                    int alumnes = sc.nextInt();
                    float nota32;
                    float mitja = 0;
                    int aprovats = 0;

                    for (int i = 0; i < alumnes; i++) {

                        System.out.println("Introdueix la nota de l'alumnes");
                        nota32 = sc.nextFloat();
                        aprovats += nota32 >= 5 ? 1 : 0;
                        mitja += nota32;

                    }

                    System.out.println("El nombre d'aprovats és " + aprovats + ", el nombre de suspesos és " + (alumnes - aprovats) + " i la mitja de les notes és "
                            + mitja / alumnes);

                    break;

                case 33:

                    System.out.println("Heu triat mostrar totes les taules de l'1 al 10");

                    for (int i = 1; i <= 10; i++) {

                        for (int j = 1; j <= 10; j++) {

                            System.out.println("El valor de " + i + " x " + "j = " + i * j);

                        }

                    }

                    break;

                case 34:

                    //com són exercicis de loops, ho farem amb un llaç for, incrementant els segons, i modificant
                    // els segons, minuts i hores en cas de que sigui necessari
                    System.out.println("Has triat aumentar l'hora n segons");

                    System.out.println("Introdueix l'hora");
                    int hora34 = sc.nextInt();
                    System.out.println("Introdueix els minuts");
                    int minuts34 = sc.nextInt();
                    System.out.println("Introdueix els segons");
                    int segons34 = sc.nextInt();

                    System.out.println("Introdueix els segons a incrementar");
                    int segonsincr34 = sc.nextInt();

                    for (int i = 0; i < segonsincr34; i++) {

                        segons34++;
                        if (segons34 == 60) {

                            segons34 = 0;
                            minuts34++;
                            if (minuts34 == 60) {

                                minuts34 = 0;
                                hora34++;
                                if (hora34 == 24) {
                                    hora34 = 0;

                                }
                            }

                        }

                    }

                    System.out.println("La nova hora és " + hora34 + ":" + minuts34 + ":" + segons34);

                    break;

                case 35:

                    //Per mirar si un nombre és primer, cercam es seu modul (%) entre tots els 
                    //seus anteriors fins 1 (no inclós), si colque mòdul dona 0, llavors no és primer
                    System.out.println("Has triat calcular el nombre de nombres primers entre 1 i n (n inclós)");
                    System.out.println("Introdueix el valor de n");
                    int nombreprimer35 = sc.nextInt();
                    int totalnombresprimers = 0;

                    boolean esprimer = true;

                    for (int i = nombreprimer35; i > 0; i--) {

                        for (int j = i - 1; j > 1; j--) {

                            if (i % j == 0) {
                                esprimer = false;
                                break;
                            }

                        }

                        if (esprimer) {

                            totalnombresprimers++;
                        } else {
                            esprimer = true;
                        }

                    }

                    System.out.println("El total de nombres primers entre 1 i " + nombreprimer35 + " és de " + totalnombresprimers);

                    break;

                case 36:

                    //Per cercar el mcd de dos nombres, cercam el menor de tot dos, i llavors, desde aquest nombre fins 1,
                    //miram es mòdul amb els dos nombres inicials, si és modul és 0, llavors és el mcd
                    //En el pitjor dels caso el mcd serà 1
                    System.out.println("Has triat cercar el MCD de dos nombres");
                    System.out.println("Introdueix el primer nombre");
                    int valor136 = sc.nextInt();
                    System.out.println("Introdueix el segon nombre");
                    int valor236 = sc.nextInt();

                    int menor = valor136 >= valor236 ? valor236 : valor136;

                    int mcd = 1;

                    for (int i = menor; i >= 1; i--) {

                        if (valor136 % i == 0 && valor236 % i == 0) {

                            mcd = i;
                            break;
                        }

                    }

                    System.out.println("El MCD de " + valor136 + " i " + valor236 + " és " + mcd);

                    break;

                case 37:

                    //Per el mcm, és lo mateix que el cas anterior pero cap adalt, cercam el major i miram modul %
                    //en el pitjor dels casos el mcm és valor1 * valor2
                    System.out.println("Has triat cercar el MCM de dos nombres");
                    System.out.println("Introdueix el primer nombre");
                    int valor137 = sc.nextInt();
                    System.out.println("Introdueix el segon nombre");
                    int valor237 = sc.nextInt();

                    int major = valor137 >= valor237 ? valor137 : valor237;
                    int mcm = 0;

                    for (int i = major;; i++) {

                        if (i % valor137 == 0 && i % valor237 == 0) {

                            mcm = i;

                            break;
                        }

                    }

                    System.out.println("El MCM de " + valor137 + " i " + valor237 + " és " + mcm);

                    break;

                case 38:

                    //Per calcular l'àrrel quadrada d'un nombre sense Math.sqrt(), ho feim per aproximació
                    //cercam els quadrats de tots els valors fins que ens passem, llavors feim la resta per aproximarnos
                    System.out.println("Has triat cercar l'arrel quadrada d'un nombre per aproximació, sense Math.sqrt()");
                    System.out.println("Introdueix el valor del que vols sebre l'arrel quadrada");
                    int arrel = sc.nextInt();

                    int i38 = 1;

                    while (i38 * i38 <= arrel) {
                        i38++;
                    }

                    i38--;

                    System.out.println("El valor de l'arrel quadrada de " + arrel + " és " + i38 + " amb un resta de " + (arrel - i38 * i38));

                    break;

                case 39:

                    //Podriem fer-ho amb binari39%2 i mostrant bit per bit per pantalla, pero si ho feim
                    //d'aquella manera, el nombre en binari apareixeria girat, aixi que ho feim aixi, fent que un nombre
                    //en decimal, estiguis només compost per 0s i 1s per a que pareixqui que és un nombre en binari
                    System.out.println("Has triat convertir un nombre decimal en binari");

                    System.out.println("Introdueix el nombre en decimal");

                    int decimal39 = sc.nextInt();
                    int binari39 = 0;
                    int index39 = 0;

                    while (decimal39 != 1) {
                        binari39 += (decimal39 % 2) * Math.pow(10, index39);
                        decimal39 /= 2;
                        index39++;
                    }

                    binari39 += Math.pow(10, index39);

                    System.out.println(binari39);

                    break;

                case 40:

                    System.out.println("Has triat introduïr el valor Eco n vegades");

                    System.out.println("Introdueix el nombre de vegades que apareixerà Eco");

                    int ecoVegades = sc.nextInt();

                    for (int i = 0; i < ecoVegades; i++) {

                        eco();

                    }

                    break;

                case 41:

                    System.out.println("Has triat mostrar tots els nombres entre dos sencers de major a menor");
                    System.out.println("Introdueix el primer nombre");
                    int valor135 = sc.nextInt();
                    System.out.println("Introdueix el segon nombre");
                    int valor235 = sc.nextInt();

                    ordenarnombres(valor135, valor235);

                    break;

                case 42:

                    System.out.println("Has triat calcular l'àrea o el volum d'un cilindre");

                    System.out.println("Tria que vols calcular l'àrea (1) o el volum (2)");

                    int opcio36 = sc.nextInt();

                    System.out.println("Introdueix el valor del radi de la base");

                    int radi36 = sc.nextInt();

                    System.out.println("Introdueix el valor de l'altura");

                    int altura36 = sc.nextInt();

                    calcular(radi36, altura36, opcio36);

                    break;

                case 43:

                    System.out.println("Has triat mostrar el valor màxim de dos valors");

                    System.out.println("Introdueix el primer valor");
                    int valor143 = sc.nextInt();
                    System.out.println("Introdueix el segon valor");
                    int valor243 = sc.nextInt();

                    int major43 = major(valor143, valor243);

                    System.out.println("El major dels dos nombres és " + major43);

                    break;

                case 44:

                    System.out.println("Has triat comprovar si l'hora introduïda és correcte");

                    System.out.println("Introdueix les hores");
                    int hora44 = sc.nextInt();
                    System.out.println("Introdueix els minuts");
                    int minuts44 = sc.nextInt();
                    System.out.println("Introdueix els segons");
                    int segons44 = sc.nextInt();

                    if (esCorrecte(hora44, minuts44, segons44)) {

                        System.out.println("L'hora és correcte");

                    } else {

                        System.out.println("L'hora és incorrecte");
                    }

                    break;

                case 45:

                    System.out.println("Has triat mirar quin és el nombre major de 2 o 3 nombres");

                    System.out.println("Quants de nombres vols comparar?");

                    int opcio45 = sc.nextInt();
                    int valor145, valor245, valor345; 
                    switch (opcio45) {

                        case 2:

                            System.out.println("Introdueix el primer valor");
                            valor145 = sc.nextInt();
                            System.out.println("Introdueix el segon valor");
                            valor245 = sc.nextInt();
                            
                            System.out.println(major(valor145, valor245));
                            
                            break;
                            
                        case 3:
                            
                            System.out.println("Introdueix el primer valor");
                            valor145 = sc.nextInt();
                            System.out.println("Introdueix el segon valor");
                            valor245 = sc.nextInt();
                            System.out.println("Introdueix el tercer valor");
                            valor345 = sc.nextInt();
                            
                            System.out.println(major(valor145, valor245, valor345));
                            
                            break;
                         
                        default:
                            
                            System.out.println("Valor incorrecte");

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

    static int major(int valor1, int valor2) {

        return valor1 >= valor2 ? valor1 : valor2;

    }

    static int major(int valor1, int valor2, int valor3) {

        return major(major(valor1, valor2), valor3);

    }

    static boolean esCorrecte(int hora, int minuts, int segons) {

        if (hora >= 0 && hora < 24 && minuts >= 0 && minuts < 60 && segons >= 0 && segons < 60) {

            return true;
        }

        return false;
    }
}
