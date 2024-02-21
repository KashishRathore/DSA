public class String_Builder {
    public static void main(String[] args) {
        //Strings are immutable
        StringBuilder sb = new StringBuilder("Kashish");
        System.out.println(sb);

        //Char at index
        System.out.println("Char at index 0 : " + sb.charAt(0));

        //set char at index 0
        sb.setCharAt(0, 'K');
        System.out.println(sb);

        //insert char
        sb.insert(7, 'h');
        System.out.println(sb);

        //Delete char
        sb.delete(6, 7);
        System.out.println(sb);

        //append -> Adding char at last
        sb.append(" ");
        sb.append("Rathore");
        System.out.println(sb);

        //Length
        System.out.println(sb.length());

    }
}
