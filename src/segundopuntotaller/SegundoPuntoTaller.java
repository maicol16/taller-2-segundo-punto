package segundopuntotaller;



public class SegundoPuntoTaller {


public static void main(String[] args) {



int a[] = {4, 5, 4, 5, 6, 8, 6, 8, 9,9,9,10};

int cont = 0;

for (int i = 0; i < a.length; i++) {

for (int j = 0; j < a.length; j++) {

if (a[i] == a[j]) {

cont++;

}

}

if (cont == 1) {

System.out.println("El numero que no se repite es " + a[i]);

}

cont = 0;

}

}

}
