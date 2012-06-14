public class Calculator {

    public static final String COMMA_DELIMITER = ",";
    public static final String START_DELIMITER_IDENTIFIER = "//";

    public Integer add(String numberToAdd) {
        Integer result = 0;
        String delimiter = COMMA_DELIMITER;

        if(inputIsNotEmpty(numberToAdd)){
            return result;
        }

        if (inputHasSpecifiedDelimiter(numberToAdd)) {
            delimiter = "" + numberToAdd.charAt(2);
            numberToAdd = numberToAdd.substring(4);
        }

        numberToAdd = numberToAdd.replaceAll("\n", delimiter);
        String[] tokens = numberToAdd.split(delimiter);

        for (String token : tokens){
            if (!token.equals("")){
                result += Integer.valueOf(token);
            }
        }

        return result;
    }

    private boolean inputHasSpecifiedDelimiter(String numberToAdd){
        return numberToAdd.startsWith(START_DELIMITER_IDENTIFIER);
    }

    private boolean inputIsNotEmpty(String numberToAdd) {
        return numberToAdd == null || numberToAdd.isEmpty();
    }
}
