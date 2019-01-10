package codewars;

public class Troll {
    public static void main(String[] args) {
   //  prościej można użyć str.replaceAll();
    }


        public static String disemvowel(String str) {
            // Code away...

            String temp = "";          //tworzymy nowy string
            int l = str.length();

            for(int i = 0 ; i < l ; i++)
            {
                char ch = str.charAt(i);        // sprawdzamy chary z podanego stringa
                         // charAt to metoda wyjmująca chary ze stringa

                if(ch != 'a' && ch != 'e' &&
                        ch != 'i' && ch != 'o' &&
                        ch != 'u' && ch != 'A' &&
                        ch != 'E' && ch != 'O' &&
                        ch != 'U'&&ch != 'I')

                    temp = temp + ch;                 // jeżeli nie spełnia warunku to dodajemy do stringa temp
            }

            return temp;






        }
}
