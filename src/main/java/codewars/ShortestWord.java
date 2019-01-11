package codewars;


public class ShortestWord {
    public static void main(String[] args) {

        System.out.println(findShort("bitcoin take over the world maybe who knows perhaps"));

    }


        public static int findShort(String s) {


            int l = Integer.MAX_VALUE;         // w celu znalezienia tylko mniejszych na początku przyjmujemy największą mozliwa

            String[] words=s.split(" ");

            for (int i=0;i<words.length;i++) {

                l = Math.min(l, words[i].length());

            }

            return l;


        }

}
