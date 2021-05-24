package testdome;

public class UserInput {

    public static class TextInput {
        private final StringBuilder sb = new StringBuilder();

        public void add(final char ch) {
            sb.append(ch);
        }
        public String getValue() {
            return sb.toString();
        }
    }

    public static class NumericInput extends TextInput {
        @Override
        public void add(final char ch) {
            // 숫자인 문자인 경우에만 StringBuilder 로 append
            if (Character.isDigit(ch)) {
                super.add(ch); // TextInput 의 add() 호출하여 해당 문자를 append
            }
        }
    }

    public static void main(String[] args) {
        TextInput input = new NumericInput();
        input.add('1');
        input.add('a');
        input.add('0');
        System.out.println("[] : " + input.getValue());
    }
}
