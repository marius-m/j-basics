package lt.vcs;

public class NumberHandler {

    public char[] numberArray = {
            '0',
            '1',
            '2',
            '3',
            '4',
            '5',
            '6',
            '7',
            '8',
            '9',
    };

    public boolean checkNumber(String randomString) {
        for (int i = 0; i < randomString.length(); i++) {
            for (int j = 0; j < numberArray.length; j++) {
                if (randomString.charAt(i) == numberArray[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    // 1st way to do things
//    public boolean checkNumber(String randomString) {
//        for (int i = 0; i < numberArray.length; i++) {
//            if (randomString.contains(numberArray[i])) {
//                return true;
//            }
//        }
//        return false;
//    }


}
