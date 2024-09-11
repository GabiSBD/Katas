package CodeWars;

public class WhoLikesIt {
    public static String whoLikesIt(String... names) {
        int size = names.length;
        String [] phrases = new String[]{
                "%s likes this",
                "%s and %s like this",
                "%s, %s and %s like this",
                "%s, %s and %d others like this"
        };

        switch (size){
            case 0:
                return "no one likes this";
            case 1:
                return String.format(phrases[0], names[0]);
            case 2:
                return String.format(phrases[1], names[0], names[1]);
            case 3:
                return String.format(phrases[2], names[0], names[1], names[2]);
            default:
                return String.format(phrases[3], names[0], names[1], names.length-2);
        }
    }
}
