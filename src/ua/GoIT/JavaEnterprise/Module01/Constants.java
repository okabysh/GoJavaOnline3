package ua.GoIT.JavaEnterprise.Module01;

public class Constants {
    public static final int VALUE_ITERATION = 1_000;
    public static final int VALUE_1k = 1_000;
    public static final int VALUE_10k = 10_000;
    public static final int VALUE_100k = 100_000;
    public static final int VALUE_1M = 1_000_000;
    private static String toTextStart = "Size of collections: ";
    private static String toTextMid = " qty; the number of iterations for measuring: ";
    private static String toTextFinish =  "; average time in microseconds";
    public static final String TEXT_FOR_TABLE_10k = toTextStart+VALUE_10k+toTextMid+VALUE_ITERATION+toTextFinish;
    public static final String TEXT_FOR_TABLE_100k = toTextStart+VALUE_100k+toTextMid+VALUE_ITERATION+toTextFinish;
    public static final String TEXT_FOR_TABLE_1M = toTextStart+VALUE_1M+toTextMid+VALUE_ITERATION+toTextFinish;
}
