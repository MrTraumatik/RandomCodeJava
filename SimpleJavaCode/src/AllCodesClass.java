
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author dedec
 */
public class AllCodesClass {

    /**
     * Addition
     * @param nbr1
     * @param nbr2
     * @return addition of nbr1 and nbr2
     */
    public static int somme(int nbr1, int nbr2) {
        return nbr1 + nbr2;
    }

    /**
     * Addition
     * @param nbr1
     * @param nbr2
     * @return addition of nbr1 and nbr2
     */
    public static double somme(double nbr1, double nbr2) {
        return nbr1 + nbr2;
    }

    /**
     * Surface of a triangle
     * @param base
     * @param hauteur
     * @return the surface of a triangle
     */
    public static int surfaceTriangle(int base, int hauteur) {
        return (base * hauteur) / 2;
    }

    /**
     * Average between 2 numbers
     * @param nombre1
     * @param nombre2
     * @return average
     */
    public static double moyenne(double nombre1, double nombre2) {
        return (nombre1 + nombre2) / 2;
    }

    /**
     * Conversion of time in seconds
     * @param heures
     * @param minutes
     * @param secondes
     * @return the full time in seconds
     */
    public static int conversionHMS(int heures, int minutes, int secondes) {
        return (heures * 3600) + (minutes * 60) + secondes;
    }

    /**
     * Surface of a triangle
     * @param base
     * @param hauteur
     * @return the surface of a triangle
     */
    public static double surfaceTriangle(double base, double hauteur) {
        return (base * hauteur) / 2;  //crÃ©ation mÃ©thode
    }

    /**
     * Perimetre of a circle
     * @param rayon
     * @return the perimetre
     */
    public static double PERIMETRECercle(double rayon) {
        return 2 * Math.PI * rayon;
    }

    /**
     * Surface of a circle
     * @param rayon
     * @return the surface
     */
    public static double surfaceCercle(double rayon) {
        return Math.PI * rayon * rayon;
    }

    /**
     * Calcul of the price including taxe
     * @param prix
     * @param taxe
     * @return the full price
     */
    public static double prixTTC(double prix, double taxe) {
        return prix + (prix * (taxe / 100));
    }

    /**
     * Calcul if interest
     * @param montant
     * @param ti
     * @return the interest
     */
    public static double interet(double montant, double ti) {
        return montant * (ti / 100);
    }

    /**
     * Calcul of benefits from a placement
     * @param capital
     * @param ti
     * @return the benefits
     */
    public static double placement(double capital, double ti) {
        return capital + (capital * (ti / 100));
    }

    /**
     * Calcul the full price
     * @param prix
     * @param tva
     * @param quantite
     * @return the full price
     */
    public static double totalTTC(double prix, double tva, double quantite) {
        return quantite * (prix + (prix * (tva / 100)));
    }

    /**
     * Calcul the speed in Km/h
     * @param distanceM distance in meter
     * @param dureeS time in seconds
     * @return the speed
     */
    public static double vitesseKMH(double distanceM, double dureeS) {
        double distanceKM;
        double dureeH;
        distanceKM = 1000 * distanceM;
        dureeH = 3600 * dureeS;
        return distanceKM / dureeH;
    }

    /**
     * Calcul for the average points
     * @param cote1
     * @param cote2
     * @param cote3
     * @param pond1
     * @param pond2
     * @param pond3
     * @return the average
     */
    public static double coteMoyenne(double cote1, double cote2, 
            double cote3, double pond1, double pond2, double pond3) {
        double numerateur = ((cote1 * pond1) + (cote2 * pond2) + (cote3 * pond3));
        double denominateur = (pond1 + pond2 + pond3);
        return numerateur / denominateur;
    }

    /**
     * Calcul of the time needed for the distance in Km, in function of the speed
     * @param vitesseMS
     * @param distanceKM
     * @return the duration 
     */
    public static double dureeTrajet(double vitesseMS, double distanceKM) {
        double distanceM = 1000 * distanceKM;
        return distanceM / vitesseMS;
    }

    private static String toDefault() {
        return "\033[0m";
    }

    /**
     * Color the string a in black
     * @param a
     * @return the string colored
     */
    public static String toBlack(String a) {
        return "\033[30m" + a + toDefault();
    }

    /**
     * Color the string a in red
     * @param a
     * @return the string colored
     */
    public static String toRed(String a) {
        return "\033[31m" + a + toDefault();
    }

    /**
     * Color the string a in green
     * @param a
     * @return the string colored
     */
    public static String toGreen(String a) {
        return "\033[32m" + a + toDefault();
    }

    /**
     * Color the string a in yellow
     * @param a
     * @return the string colored
     */
    public static String toYellow(String a) {
        return "\033[33m" + a + toDefault();
    }

    /**
     * Color the string a in blue
     * @param a
     * @return the string colored
     */
    public static String toBlue(String a) {
        return "\033[34m" + a + toDefault();
    }

    /**
     * Color the string a in purple
     * @param a
     * @return the string colored
     */
    public static String toPurple(String a) {
        return "\033[35m" + a + toDefault();
    }

    /**
     * Color the string a in cyan
     * @param a
     * @return the string colored
     */
    public static String toCyan(String a) {
        return "\033[36m" + a + toDefault();
    }

    /**
     * Color the string a in white
     * @param a
     * @return the string colored
     */
    public static String toWhite(String a) {
        return "\033[37m" + a + toDefault();
    }

    /**
     * Print the string in argument to return the number entered
     * @param msg
     * @return the number
     */
    public static int demanderEntier(String msg) {
        Scanner sc = new Scanner(System.in);
        System.out.print(msg);
        int nb1 = sc.nextInt();
        return nb1;
    }

    /**
     * Rolls 2 dices
     * @return true if the 2 dices are equals
     */
    public static boolean doubleDe() {
        int de1, de2;
        de1 = hasard(1, 6);
        de2 = hasard(1, 6);
        if (de1 == de2) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Gives a random number between 2 number given
     * @param min
     * @param max
     * @return a random number
     */
    public static int hasard(int min, int max) {
        Random rm = new Random();
        int randomNum;
        randomNum = rm.nextInt((max - min) + 1) + min;
        return randomNum;
    }

    /**
     * Gives the name and color of the card specified by the parameters
     * @param val
     * @param couleur
     * @return the cards
     */
    public static String carte(int val, int couleur) {
        String num = "";
        String coul = "";
        if ((val < 1) || (val > 12)) {
            throw new IllegalArgumentException("pas de carte");
        }
        if ((couleur < 1) || (couleur > 4)) {
            throw new IllegalArgumentException("pas de couleur");
        }
        switch (val) {
            case 1:
                num = "l'AS";
                break;
            case 2:
                num = "le 2";
                break;
            case 3:
                num = "le 3";
                break;
            case 4:
                num = "le 4";
                break;
            case 5:
                num = "le 5";
                break;
            case 6:
                num = "le 6";
                break;
            case 7:
                num = "le 7";
                break;
            case 8:
                num = "le 8";
                break;
            case 9:
                num = "le 9";
                break;
            case 10:
                num = "le valet";
                break;
            case 11:
                num = "la dame";
                break;
            case 12:
                num = "le roi";
                break;
        }
        switch (couleur) {
            case 1:
                coul = " de coeur.";
                break;
            case 2:
                coul = " de pique.";
                break;
            case 3:
                coul = " de trÃ¨fle.";
                break;
            case 4:
                coul = " de carreau.";
                break;
        }
        return num + coul;
    }

    /**
     * Gives the full price + taxes in function of the given price
     * @param nbr
     * @return prix HTC
     */
    public static double prix(int nbr) {
        double facture;
        if (nbr > 30) {
            facture = (nbr - 30) * 0.08 + 2.8;
        } else if (nbr <= 10) {
            facture = nbr * 0.10;
        } else {
            facture = (nbr - 10) * 0.09 + 1;
        }
        return facture;
    }

    /**
     * Prints if the numbers are pos or neg
     * @param entier1
     * @param entier2
     */
    public static void affichagePositif(int entier1, int entier2) {
        if (entier1 > 0) {
            if (entier2 > 0) {
                System.out.println(entier1 + ", " + entier2 + " positifs");
            }
        } else {
            System.out.println(entier1 + " est negatif ");
        }
    }

    /**
     * Boolean if the first number is between the 2 others
     * @param nb1
     * @param nb2
     * @param nb3
     * @return true if nb1 is between nb2 and nb3
     */
    public static boolean fourchette(int nb1, int nb2, int nb3) {
        int min, max;
        min = 0;
        max = 0;
        if (nb2 >= nb3) {
            min = nb3;
            max = nb2;
        } else if (nb3 > nb2) {
            min = nb2;
            max = nb3;
        }
        return ((min <= nb1) && (nb1 <= max));
    }

    /**
     * Gives a string saying if you passed the test given your points
     * @param nb1
     * @return the grades in a string format
     */
    public static String grade(int nb1) {
        String etat;
        if (nb1 < 50) {
            etat = "n'a pas reussi";
        } else if (nb1 < 60) {
            etat = "reussi";
        } else if (nb1 < 70) {
            etat = "satisfaction";
        } else if (nb1 < 80) {
            etat = "distinction";
        } else if (nb1 < 90) {
            etat = "grande distinction";
        } else {
            etat = "LPGD";
        }
        return etat;
    }

    /**
     * Gives the higher number between the 2 given
     * @param nb1
     * @param nb2
     * @return the higher 
     */
    public static int max(int nb1, int nb2) {
        if (nb1 > nb2) {
            return nb1;
        } else {
            return nb2;
        }
    }

    /**
     * Gives the higher number between the 3 given
     * @param nb1
     * @param nb2
     * @param nb3
     * @return the higher
     */
    public static int max(int nb1, int nb2, int nb3) {
        if ((nb1 > nb2) && (nb1 > nb3)) {
            return nb1;
        } else if ((nb2 > nb1) && (nb2 > nb3)) {
            return nb2;
        } else {
            return nb3;
        }
    }

    /**
     * Gives the number associated to the day given in param
     * @param jour
     * @return number of the day, monday = 1
     */
    public static int num(String jour) {
        int ok;
        switch (jour) {
            case "lundi":
                ok = 1;
                break;
            case "mardi":
                ok = 2;
                break;
            case "mercredi":
                ok = 3;
                break;
            case "jeudi":
                ok = 4;
                break;
            case "vendredi":
                ok = 5;
                break;
            case "samedi":
                ok = 6;
                break;
            case "dimanche":
                ok = 7;
                break;
            default:
                ok = 0;
        }
        return ok;
    }

    /**
     * Gives a string to say if the number given is pos, neg or null
     * @param nb1
     * @return the string
     */
    public static String signe(int nb1) {
        String whatSigne;
        if (nb1 > 0) {
            whatSigne = "le nombre est positif";
        } else if (nb1 == 0) {
            whatSigne = "le nombre est nul";
        } else {
            whatSigne = "le nombre est negatif";
        }
        return whatSigne;
    }

    /**
     * Says if the car is on the good side of the street depending of the day
     * @param date
     * @param maison
     * @return true if the car is on the good side
     */
    public static boolean isOk(int date, int maison) {
        boolean pair = (maison % 2) == 0;
        if ((date < 1) || (date > 31)) {
            throw new IllegalArgumentException("date incorrecte");
        }
        return ((date <= 15) && (!pair) || ((date > 15) && (pair)));
    }

    /**
     * Calcul test if given number is even or not
     * @param n
     * @return n/2 if even or 3n+1 if not
     */
    public static int test(int n) {
        if (n % 2 == 0) {
            return n / 2;
        } else {
            return 3 * n + 1;
        }
    }

    /**
     * Print the count to given number
     * @param n
     * @return the number
     */
    public static int cpt(int n) {
        int nb = 1;
        while (nb <= n) {
            System.out.println(nb);
            nb = nb + 1;
        }
        return nb;
    }

    /**
     * Calcul the addition of numbers entered with a question in boolean format
     *  every time
     * @param encore
     * @return the sum
     */
    public static int somme(boolean encore) {
        Scanner sc = new Scanner(System.in);
        int val;
        int somme = 0;
        do {
            val = sc.nextInt();
            somme = somme + val;
            encore = sc.nextBoolean();
        } while (encore);
        return somme;
    }

    /**
     * Calcul the addition of numbers entered with a question in string format
     *  every time
     * @param nb
     * @return the sum
     */
    public static int somme(int nb) {
        Scanner sc = new Scanner(System.in);
        String test;
        int val;
        int somme = 0;
        do {
            val = sc.nextInt();
            somme = somme + val;
            test = sc.next();
        } while ((test.charAt(0) == 'Y') || (test.charAt(0) == 'y') || (test.charAt(0) == 'o') || (test.charAt(0) == 'O'));
        return somme;
    }

    /**
     * Gives a random card 
     * @return the card in string format
     */
    public static String carte() {
        String laCarte, valeur, couleur;
        int numCouleur, numValeur;
        valeur = "";
        couleur = "";
        numCouleur = ThreadLocalRandom.current().nextInt(1, 4 + 1);
        numValeur = ThreadLocalRandom.current().nextInt(1, 13 + 1);
        switch (numCouleur) {
            case 1:
                couleur = "Pique";
                break;
            case 2:
                couleur = "Carreau";
                break;
            case 3:
                couleur = "Coeur";
                break;
            case 4:
                couleur = "Trefle";
                break;
        }
        switch (numValeur) {
            case 1:
                valeur = "As";
                break;
            case 2:
                valeur = "2";
                break;
            case 3:
                valeur = "3";
                break;
            case 4:
                valeur = "4";
                break;
            case 5:
                valeur = "5";
                break;
            case 6:
                valeur = "6";
                break;
            case 7:
                valeur = "7";
                break;
            case 8:
                valeur = "8";
                break;
            case 9:
                valeur = "9";
                break;
            case 10:
                valeur = "10";
                break;
            case 11:
                valeur = "Valet";
                break;
            case 12:
                valeur = "Dame";
                break;
            case 13:
                valeur = "Roi";
                break;
        }
        return laCarte = valeur + " de " + couleur;
    }

    /**
     * Print the count to n
     * @param n
     * @return the given number -1
     */
    public static int suite(int n) {
        int i ;
        for ( i = 1; i < n; i++) {
            System.out.println(i);
        }
        return i;
    }

    /**
     * Gives the factorial number of the given number
     * @param n
     * @return the factorial
     */
    public static long facto(long n) {
        long fact = 1;
        for (long i = 1; i < n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    /**
     * Gives the number of time the dice was equal the the given number
     * @param n
     * @param val
     * @return the number of equality
     */
    public static int dee(int n, int val) {
        Random rand = new Random();
        int valDe = 0;
        int nb = 0;
        for (int i = 1; i < n; i++) {
            valDe = rand.nextInt(6) + 1;
            if (valDe == val) {
                nb = nb + 1;
            }
        }
        return nb;
    }

    /**
     * Asks and return a value if it's between 1 and a given number
     * @param n
     * @return the value
     */
    public static int nbr(int n) {
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        while ((val < 1) || (val > n)) {
            System.out.println("valeur incorrecte ");
            val = sc.nextInt();
        }
        return val;
    }

    /**
     * Print the count the to given number in negativ
     * @param n
     * @return the negativ given number
     */
    public static int suiteneg(int n) {
        for (int i = 1; i < n; i++) {
            System.out.println(-i);
        }
        return -n;
    }

    /**
     * Prints the square of the every number up to the given one
     * @param n
     * @return the square of the given number
     */
    public static int carre(int n) {
        for (int i = 1; i < n; i++) {
            System.out.println(i * i);
        }
        return n * n;
    }

    /**
     * Says if the given number is a prime number
     * @param n
     * @return true if so
     */
    public static boolean premier(int n) {
        boolean isPremier = true;
        int i = 2;
        while ((i <= Math.sqrt(n)) && (isPremier)) {
            if (n % i == 0) {
                isPremier = false;
            }
            i = i + 1;
        }
        return isPremier;
    }

    /**
     * Prints all prime number up to the given one
     * @param n
     * @return the given number
     */
    public static int ok(int n) {
        for (int i = 1; i <= n; i++) {
            boolean ok = premier(i);
            if (ok) {
                System.out.println(i);
            }
        }
        System.out.print("Tous les nbrs premier avant ");
        return n;
    }

    /**
     * Reverse the order of the given number
     * @param n
     * @return the given number in reverse order
     */
    public static int miroir(int n) {
        int p = 0;
        while (n > 0) {
            p = p * 10;
            p = p + (n % 10);
            n = n / 10;
        }
        return p;
    }

    /**
     * Says if the given number is the same in normal and reverse order
     * @param n
     * @return true if so
     */
    public static boolean palindrome(int n) {
        return miroir(n) == n;
    }

    /**
     * Says if the 2 given numbers are "friends" 
     * @param n
     * @param m
     * @return true if so
     */
    public static boolean amis(int n, int m) {
        int sommeN = 0;
        int sommeM = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sommeN = sommeN + i;
            }
        }
        for (int i = 1; i < m; i++) {
            if (m % i == 0) {
                sommeM = sommeM + i;
            }
        }
        return sommeN==sommeM;
    }

    /**
     * Says if the given number is a perfect number
     * @param n
     * @return true if so
     */
    public static boolean nbrParfait(int n) {
        boolean perfect = true;
        int somme = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                somme = somme + i;
            }
        }
        if (somme != n) {
            perfect = false;
        }
        return perfect;
    }

    /**
     * Adds every single number of the given one
     * @param n
     * @return the sum
     */
    public static int addition(int n) {
        int somme = 0;
        while (n > 0) {
            somme = somme + (n % 10);
            n = n / 10;
        }
        return somme;
    }

    /**
     * Gives the number occurences of every number from 0-9 in the given one
     * @param n
     * @return a tab of the occurence
     */
    public static int[] occurrence(int n) {
        int val;
        int[] tab = new int[10];
        do {
            val = n % 10;
            tab[val] = (tab[val] + 1);
            n = n / 10;
        } while (n > 0);
        return tab;
    }

    /**
     * Gives the sum of the contents of the given tab
     * @param tab
     * @return the sum
     */
    public static int sommer(int[] tab) {
        int somme = 0;
        for (int i = 0; i < tab.length; i++) {
            somme = somme + tab[i];
        }
        return somme;
    }

    /**
     * Gives the max of the tab
     * @param tab
     * @return the max
     */
    public static int maximum(int[] tab) {
        int max = tab[0];
        for (int i = 1; i < tab.length; i++) {
            if (tab[i] > max) {
                max = tab[i];
            }
        }
        return max;
    }

    /**
     * Gives the index of the max of the given tab
     * @param tab
     * @return the index
     */
    public static int indiceMax(int[] tab) {
        int indice = 0;
        int max = tab[0];
        for (int i = 1; i < tab.length; i++) {
            if (tab[i] > max) {
                max = tab[i];
                indice = i;
            }
        }
        return indice;
    }

    /**
     * Creates a tab of the given size full of the given value
     * @param taille
     * @param val
     * @return the new tab
     */
    public static int[] creer(int taille, int val) {
        int[] tab = new int[taille];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = val;
        }
        return tab;
    }

    /**
     * Inverts the contents of the given tab
     * @param tab
     * @return the tab in reverse order
     */
    public static int[] inverser(int[] tab) {
        int varTemp;
        for (int i = 1; i < tab.length; i++) {
            varTemp = tab[tab.length];
            tab[tab.length] = tab[i];
            tab[i] = varTemp;
        }
        return tab;
    }

    /**
     * Gives a new tab with as value the indexes of the minimum value in the given tab
     * @param tab
     * @return the new tab
     */
    public static int[] positionMin(int[] tab) {
        int min = tab[0];
        int indice = 0, tailleLog = 1;
        int[] tabPos = new int[tab.length];
        for (int i = 1; i < tab.length; i++) {
            if (tab[i] < min) {
                min = tab[i];
            }
        }
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == min) {
                tabPos[tailleLog] = i;
            }
            tailleLog = tailleLog + 1;
        }
        return tabPos;
    }

    public static void main(String[] args) {
        System.out.println((Math.random() * 5) + 1);
        System.out.println(1 + 6.9);
        System.out.println(3421 + 756);
        System.out.println(34 * 78);
        System.out.println(Math.pow(2.0, 10.0));
        Scanner clavier = new Scanner(System.in);
        int nbr1, nbr2;
        int somme;
        System.out.println("calcul de la somme de 2 nombres");
        System.out.print("ecrire le premir nombre= ");
        nbr1 = clavier.nextInt();
        System.out.print("ecrire le deuxieme nombre= ");
        nbr2 = clavier.nextInt();
        System.out.print("somme= ");
        somme = nbr1 + nbr2;
        System.out.println(somme);
        int base;
        int hauteur;
        System.out.println("calcul de la surface d'un triangle");
        System.out.print("introduire la base= ");
        base = clavier.nextInt();
        System.out.print("introduire la hauteur= ");
        hauteur = clavier.nextInt();
        System.out.print("surface= ");
        int surf = surfaceTriangle(base, hauteur);
        System.out.println(surf);
        double nbrz1, nbrz2;
        double sommez;
        System.out.println("calcul de la somme de 2 nombres");
        System.out.print("ecrire le premir nombre= ");
        nbrz1 = clavier.nextDouble();
        System.out.print("ecrire le deuxieme nombre= ");
        nbrz2 = clavier.nextDouble();
        System.out.print("somme= ");
        sommez = somme(nbr1, nbr2);
        System.out.println(sommez);
        int heures, minutes, secondes;
        int conversionHMS;
        System.out.println("conversion en secondes:");
        System.out.print("heure: ");
        heures = clavier.nextInt();
        System.out.print("minutes: ");
        minutes = clavier.nextInt();
        System.out.print("secondes: ");
        secondes = clavier.nextInt();
        System.out.println("nbr de secondes depuis 00.00: ");
        conversionHMS = conversionHMS(heures, minutes, secondes);
        System.out.println(conversionHMS);
        double basez, hauteurz;  //initialisation
        double surfaceTriangle;
        System.out.println("calcul de la surface d'un triangle");
        System.out.print("introduire la base= ");
        basez = clavier.nextDouble();
        System.out.print("introduire la hauteur= ");
        hauteurz = clavier.nextDouble();
        System.out.print("surface= ");
        surfaceTriangle = surfaceTriangle(basez, hauteurz);
        System.out.println(surfaceTriangle);
        double prix;
        double taxe;
        double prixTTC;
        System.out.println("calcul du prix TTC");
        System.out.print("introduire le prix= ");
        prix = clavier.nextDouble();
        System.out.print("introduire la taxe= ");
        taxe = clavier.nextDouble();
        System.out.print("prixTTC= ");
        prixTTC = prixTTC(prix, taxe);
        System.out.println(prixTTC);
        System.out.print("introduire la distance en mÃ¨tres: ");
        double distanceM = clavier.nextDouble();
        System.out.print("introduire la durÃ©e en secondes: ");
        double dureeS = clavier.nextDouble();
        System.out.print("vitesse en km/h: ");
        System.out.println(vitesseKMH(distanceM, dureeS));
        System.out.println(vitesseKMH(1000, 3600));
        double cote1, cote2, cote3, pond1, pond2, pond3;
        double coteMoyenne;
        System.out.print("introduire la cote 1: ");
        cote1 = clavier.nextDouble();
        System.out.print("introduire la cote 2: ");
        cote2 = clavier.nextDouble();
        System.out.print("introduire la cote 3: ");
        cote3 = clavier.nextDouble();
        System.out.print("introduire la pondÃ©ration 1: ");
        pond1 = clavier.nextDouble();
        System.out.print("introduire la pondÃ©ration 2: ");
        pond2 = clavier.nextDouble();
        System.out.print("introduire la pondÃ©ration 3: ");
        pond3 = clavier.nextDouble();
        System.out.println("moyenne = ");
        System.out.println(coteMoyenne(cote1, cote2, cote3, pond1, pond2, pond3));
        double vitesseMS, distanceKM, dureeTrajet;
        System.out.print("introduire vitesse m/s: ");
        vitesseMS = clavier.nextDouble();
        System.out.print("introduir distance km: ");
        distanceKM = clavier.nextDouble();
        System.out.print("la durÃ©e du trajet en secondes = ");
        System.out.println(dureeTrajet(vitesseMS, distanceKM));
        System.out.println(dureeTrajet(0.5, 2));
        Scanner sc = new Scanner(System.in);
        int nb1, nb2;
        nb1 = demanderEntier("introduire le premier nombre: ");
        //nb1 = sc.nextInt();
        nb2 = demanderEntier("introduire le deuxiÃ¨me nombre: ");
        //nb2 = sc.nextInt();
        System.out.println(nb1 + nb2);
        System.out.println(doubleDe());
        int min, max;
        System.out.print("min: ");
        min = sc.nextInt();
        System.out.print("max: ");
        max = sc.nextInt();
        System.out.println(hasard(min, max));
        int entier1;
        int entier2;
        System.out.println("Entrez un premier nombre");
        entier1 = clavier.nextInt();
        System.out.println("Entrez un second nombre");
        entier2 = clavier.nextInt();
        affichagePositif(entier1, entier2);
        int n1, n2, n3;
        System.out.println("entrer 3 nombres : ");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n3 = sc.nextInt();
        boolean ok = fourchette(n1, n2, n3);
        System.out.print("le nombre 1 et entre le 2Ã¨me et 3Ã¨me nombre: ");
        System.out.println(ok);
        System.out.print("entrer la cote sur 100: ");
        int nbe1 = sc.nextInt();
        String oke = grade(nbe1);
        System.out.println(oke);
        int nzb1, nzb2;
        nzb1 = sc.nextInt();
        nzb2 = sc.nextInt();
        System.out.println(max(nzb1, nzb2));
        int nba1, nba2, nba3;
        System.out.print(" nb 1: ");
        nba1 = sc.nextInt();
        System.out.print(" nb2: ");
        nba2 = sc.nextInt();
        System.out.print(" nb3: ");
        nba3 = sc.nextInt();
        System.out.println(max(nba1, nba2, nba3));
        System.out.print("entrer le NOM jour: ");
        String jour = sc.next();
        int oka = num(jour);
        System.out.println(oka);
        System.out.println(" entrer un nbr: ");
        int n = sc.nextInt();
        String ozk = signe(n);
        System.out.println(ozk);
        System.out.println(" entrer numero maison: ");
        int maison = sc.nextInt();
        System.out.print(" entrer date: ");
        int date = sc.nextInt();
        boolean ork = isOk(date, maison);
        System.out.println(ork);
        int nuumm = sc.nextInt();
        System.out.println(test(nuumm));
        Random rm = new Random();
        int val = rm.nextInt(12);
        int coul = rm.nextInt(3);
        String oko = carte(val, coul);
        System.out.println(oko);
        int valo, coulo;
        try {
            System.out.print("entrer le numÃ©ro de la carte: ");
            valo = sc.nextInt();
            System.out.print("entrer le numÃ©ro de couleur: ");
            coulo = sc.nextInt();
            String okoo = carte(valo, coulo);
            System.out.println(okoo);
        } catch (IllegalArgumentException e) {
            System.out.println("dÃ©passement des valeurs possibles d'un jeu de cartes.");
        }
        System.out.print("entrer nombre de copies Ã  imprimer: ");
        int nbr = sc.nextInt();
        double odk = prix(nbr);
        System.out.print("le prix en euros = ");
        System.out.println(odk);
        int nbrt1, nbrt2, nbrt3;
        System.out.println("entrer 3 nombres : ");
        nbrt1 = sc.nextInt();
        nbrt2 = sc.nextInt();
        nbrt3 = sc.nextInt();
        boolean okrt = fourchette(nbrt1, nbrt2, nbrt3);
        System.out.print("le nombre 1 et entre le 2eme et 3eme nombre: ");
        System.out.println(okrt);
        System.out.print("entrer la cote sur 100: ");
        int nb1e = sc.nextInt();
        String okk = grade(nb1e);
        System.out.println(okk);
        int nvb1, nvb2, nvb3;
        nvb1 = sc.nextInt();
        nvb2 = sc.nextInt();
        nvb3 = sc.nextInt();
        System.out.println(max(nvb1, nvb2, nvb3));
        System.out.print("entrer le nom du jour: ");
        String jours = sc.next();
        int oks = num(jours);
        System.out.println(oks);
        System.out.print("entrer un nombre: ");
        int nbf1 = sc.nextInt();
        String okf = signe(nbf1);
        System.out.println(okf);
        int dates, maisons;
        System.out.print("entrer numÃ©ro maison: ");
        maisons = sc.nextInt();
        System.out.print("entrer date: ");
        dates = sc.nextInt();
        boolean okss = isOk(dates, maisons);
        System.out.println(okss);
        boolean encore = sc.nextBoolean();
        System.out.println(somme(encore));
        System.out.println(somme(0));
        System.out.println("Veuillez piocher une carte au hasard dans"
                + "le paquet entre 1 et 52");
        System.out.println("...");
        sc.next();
        String carteHasrd;
        carteHasrd = carte();
        System.out.println("Voici votre carte : " + carteHasrd);
        Random rand = new Random();
        int cpt = 0;;
        int de1, de2;
        do {
            cpt = cpt + 1;
            de1 = rand.nextInt(6) + 1;
            de2 = rand.nextInt(6) + 1;
        } while ((de1 != 6) || (de2 != 6));
        System.out.println(cpt);
        System.out.print("nbr de lancer: ");
        int en = sc.nextInt();
        System.out.print("la valeure voulue:  ");
        int eval = sc.nextInt();
        System.out.println(dee(en, eval));
        for (int i = 1; i <= 10; i++) {
            for (int nr = 1; nr <= 10; nr++) {
                System.out.println(i + "*" + nr + "=" + i * nr);
            }
        }
        try {
            int nn = sc.nextInt();
            System.out.println(suiteneg(nn));
        } catch (InputMismatchException e) {
            System.out.println("entrer un nbr ");
        }
        System.out.print("entrer le premier nombre: ");
        int azn = sc.nextInt();
        System.out.print("entrer le deuxieme nombre: ");
        int m = sc.nextInt();
        System.out.println(amis(azn, m));
        System.out.print("entrer un nombre: ");
        int sdn = sc.nextInt();
        if (sdn <= 0) {
            throw new IllegalArgumentException("entrer uniquement un nombre POSITIF. Try Again");
        }
        int[] tab = occurrence(sdn);
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i] + " fois un " + i);
        }

        System.out.print("entrer la taille du tableau: ");
        int taille = sc.nextInt();
        System.out.print("initialiser le tableau: ");
        int vaal = sc.nextInt();
        int[] tabo = creer(taille, vaal);
        System.out.println("remplisser le tableau: ");
        for (int i = 0; i < tabo.length; i++) {
            tabo[i] = sc.nextInt();
        }
        System.out.print("la somme des Ã©lÃ©ments du tableau: ");
        System.out.println(sommer(tabo));
        System.out.print("le plus grand Ã©lÃ©ment = ");
        System.out.println(maximum(tabo));
        System.out.print("l'indice du 1er max = ");
        System.out.println(indiceMax(tabo));
        System.out.println("Voici un tableau avec les indices des minimums:");
        int[] tabPos = positionMin(tabo);
        for (int i = 0; i < tabPos.length - 1; i++) {
            System.out.println(tabPos[i]);
        }
        System.out.println("l'inverse du tableau ressemble Ã  Ã§a:");
        int[] inverse = inverser(tabo);
        for (int i = 0; i < inverse.length - 1; i++) {
            System.out.println(inverse[i]);
        }
    }

}
