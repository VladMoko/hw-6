class NameParser {
    public String parse(String[] names) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < names.length; i++) {
            str.append(names[i].split(" ")[0]);
            if (i != names.length - 1) {
                str.append(", ");
            }
        }

        return String.valueOf(str);
    }
}

class NameParserTest {
    public static void main(String[] args) {
        String[] names = {"John Doe", "Bill Mask", "Nigua Joshua"};

        //John, Bill, Nigua
        System.out.println(new NameParser().parse(names));
    }
}
