package stepik.JavaBasicCourse.Module3Part5.Step9;

public class Main {
    public static void main(String[] args) {
        TextAnalyzer[] analyzers = new TextAnalyzer[] {
                new SpamAnalyzer(new String[]{"buy", "course", "advertising"}),
                new NegativeTextAnalyzer(),
                new TooLongTextAnalyzer(100)
        };
        String text = "It was very interesting course, but I`m very bad understood :(.";

        System.out.println(new Main().checkLabels(analyzers, text));
    }

    public Label checkLabels(TextAnalyzer[] analyzers, String text) {
        for (TextAnalyzer analyzer : analyzers) {
            Label res = analyzer.processText(text);
            if (res != Label.OK)
                return res;
        }

        return Label.OK;
    }
}
