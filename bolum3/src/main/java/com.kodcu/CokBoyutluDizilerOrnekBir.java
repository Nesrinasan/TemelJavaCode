public class CokBoyutluDizilerOrnekBir {

    public static void main(String args[]) {

        int ikiboyutlu[][] = new int[3][4];
        ikiboyutlu[0][0] = 45;
        ikiboyutlu[0][1] = 83;
        ikiboyutlu[0][2] = 11;
        ikiboyutlu[0][3] = 18;

        ikiboyutlu[1][0] = 17;
        ikiboyutlu[1][1] = 56;
        ikiboyutlu[1][2] = 26;
        ikiboyutlu[1][3] = 79;

        ikiboyutlu[2][0] = 3;
        ikiboyutlu[2][1] = 93;
        ikiboyutlu[2][2] = 43;
        ikiboyutlu[2][3] = 12;

        // ekrana bastiriyoruz
        for (int i = 0; i < ikiboyutlu.length; i++) {
            for (int j = 0; j < ikiboyutlu[i].length; j++) {
                System.out.println(" ikiboyutlu[" + i + "][" + j + "] =" + ikiboyutlu[i][j]);
            }
        }
    }
}
