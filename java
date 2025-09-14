public class Main {
    public static void main(String[] args) {
        String s = "AaBbCcDd";
        StringBuilder e = new StringBuilder();
        StringBuilder l = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                e.append(s.charAt(i)); 
            } else {
                l.append(s.charAt(i)); 
            }
        }

        System.out.println(e);
        System.out.println(l);
    }
}
