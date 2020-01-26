
public class StringManipulator {

    public String trimAndConcat(String word1, String word2) {
        return word1.trim() + word2.trim();
    }

    public Integer getIndexOrNull(String text, char character) {
        Integer index = null;
        int idx = text.indexOf(character);
        if (idx != -1)
            index = idx;
        return index;
    }

    public Integer getIndexOrNull(String text, String substring) {
        Integer index = null;
        int idx = text.indexOf(substring);
        if (idx != -1)
            index = idx;
        return index;
    }

    public String concatSubstring(String text, int from, int until, String concatWith) {
        String substring = text.substring(from, until);
        return substring + concatWith;
    }
}