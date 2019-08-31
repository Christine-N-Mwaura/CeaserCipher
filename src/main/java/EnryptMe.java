public class EnryptMe {
    private static String text = "";
    private static int shiftKey;
    private static String cipherText = "";
    private static String errorMessage = "";

    public  String encodeMethod(String text, int shiftKey){
        this.text = text;

        if (shiftKey > 26 || shiftKey < 0) {
            return errorMessage = "key must be between 1 to 25";
        }else{

        }





        return cipherText;
    }

    public int getShiftKey() {
        return shiftKey;
    }

    public String getText() {
        return text;
    }

    public void setCipherText(String cipherText) {
        this.cipherText = cipherText;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }


}