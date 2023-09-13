package stepik.JavaBasicCourse.Module3Part5.Step9;

class NegativeTextAnalyzer extends KeywordAnalyzer {
    private final String[] keywords;

    public NegativeTextAnalyzer() {
        this.keywords = new String[]{":(", "=(", ":|"};
    }

    @Override
    protected String[] getKeywords() {
        return keywords;
    }

    @Override
    protected Label getLabel() {
        return Label.NEGATIVE_TEXT;
    }
}
