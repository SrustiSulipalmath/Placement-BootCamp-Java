public class stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("Hello");
        StringBuilder sb3 = new StringBuilder(50);

        System.out.println(sb2);

        sb2.append("World!");
        System.out.println(sb2);

        StringBuffer sB = new StringBuffer();
        StringBuffer sB2 = new StringBuffer("java ");
        StringBuffer sB3 = new StringBuffer(100);

        System.out.println(sB2);
        sB2.append("programming");
        System.out.println(sB2);

        System.out.println(sb.capacity());
        System.out.println(sb2.capacity());
        System.out.println(sb3.capacity());

    }
}
