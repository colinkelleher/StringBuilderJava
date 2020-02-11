public class Main {
    /**
     * This is the Main which creates an instance of the {@code Builder}class,
     * appends the strings "hello " and "world" and converts the current representation
     * of the {@code Builder}instance to {@code String}, and prints the resulting {@code String}
     *
     * @author Colin Kelleher_117303363
     *
     */
    public static void main(String[] args) {
        Builder builder = new Builder();
        builder.append("Hello ");
        builder.append("world");
        String output = builder.toString();
        System.out.println(output);

    }
}
