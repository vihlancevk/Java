package stepik.JavaBasicCourse.Module3Part5.Step9;

import java.util.Locale;

abstract class KeywordAnalyzer implements TextAnalyzer {
    protected abstract String[] getKeywords();

    protected abstract Label getLabel();

    @Override
    public Label processText(String text) {
        text = text.toLowerCase();

        for (String keyword : getKeywords())
            if (text.contains(keyword))
                return getLabel();

        return Label.OK;
    }
}
