public class Main {
    public static void main(String[] args) {
        Histogram<String> histogram = new Histogram<>();
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("yahoo.es");
        histogram.increment("gmail.com");
        histogram.increment("gmail.com");
        histogram.increment("ull.es");
        histogram.increment("ull.es");
        histogram.increment("ull.es");
        HistogramDisplay histo = new HistogramDisplay(histogram);
        histo.execute();
    }
}
