package stepik.JavaBasicCourse.Module3Part5.Step8;

import java.lang.CharSequence;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;

public class AsciiCharSequence implements CharSequence {
    private final byte[] sequence;

    public AsciiCharSequence(byte[] sequence) {
        this.sequence = Arrays.copyOf(sequence, sequence.length);
    }

    @Override
    public int length() {
        return sequence.length;
    }

    @Override
    public char charAt(int index) {
        return (char) sequence[index];
    }

    @Override
    public AsciiCharSequence subSequence(int start, int end) {
        return new AsciiCharSequence(
                Arrays.copyOfRange(sequence, start, end)
        );
    }

    @Override
    public String toString() {
        return new String(sequence, StandardCharsets.US_ASCII);
    }
}
