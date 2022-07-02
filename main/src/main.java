import java.util.ArrayList;
import java.util.List;

public class main {
    //en este ejercicio se interpreta que se deben extraer los numeros por aparte por lo que no habrían numeros de más de una cifra
    public static void main(String args[])
    {
        String myString = "asfsdalgkjerio435j342234234nh234o32rnowei23io4h324oi32423o4w.,345.,34534534ewf342rasfsdalgkjerio435j342234234nh234o32rnowei23io4h324oi32423o4w.,345.,34534534ewf342rasfsdalgkjerio435j342234234nh234o32rnowei23io4h324oi32423o4w.,345.,34534534ewf342rasfsdalgkjerio435j342234234nh234o32rnowei23io4h324oi32423o4w.,345.,34534534ewf342rasfsdalgkjerio435j342234234nh234o32rnowei23io4h324oi32423o4w.,345.,34534534ewf342r";
        extraerNumeros(myString);
    }

    static void extraerNumeros (String myString) {
        StringBuffer num = new StringBuffer();
        List <Integer> numeros1= new ArrayList<Integer>();
        List <Integer> impares= new ArrayList<Integer>();

        //recorre caracteres del string
        for (int i = 0; i <  myString.length(); i++) {
            //revisa si es numero
            if (Character.isDigit(myString.charAt(i))){
                num.append(myString.charAt(i));
                //System.out.println(num);  para imprimir los numeros que se van extrayendo
            }
        }
        //guardamos los numeros en una lista
        for (int i = 0; i <  num.length(); i++) {
            numeros1.add(Integer.parseInt(String.valueOf(num.charAt(i))));  }

        /*imprimimos los numeros de la lista
        for (int i = 0; i <  numeros1.size(); i++) {
            System.out.println(numeros1.get(i));
        }

         */

        //filtramos los numeros impares de la lista
        for(Integer i:numeros1)
            if((numeros1.get(i))%2==0){
            impares.add(i);
            }
        //sumamos todos los numeros impares
        int suma = 0;
        for(int i:impares)
            suma= suma +impares.get(i);

        System.out.println("La suma de todos los numeros encontrados en la String es: "+ suma);
    }

}
