package stepik.JavaBasicCourse.Module3Part5.Step9;

import java.util.Arrays;

class SpamAnalyzer extends KeywordAnalyzer {
    private final String[] keywords;

    public SpamAnalyzer(String[] keywords) {
        this.keywords = Arrays.copyOf(keywords, keywords.length);
    }

    @Override
    protected String[] getKeywords() {
        return keywords;
    }

    @Override
    protected Label getLabel() {
        return Label.SPAM;
    }
}
