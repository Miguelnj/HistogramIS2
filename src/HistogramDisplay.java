import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

import javax.swing.*;
import java.awt.*;

public class HistogramDisplay<T> extends ApplicationFrame {

    private final Histogram<T> histogram;

    public HistogramDisplay(Histogram<T> histogram) {
        super("Histograma");
        this.histogram = histogram;
        setContentPane(createPanel());
        pack();
    }

    private JPanel createPanel() {
        ChartPanel chartPanel = new ChartPanel(createChart(createDataset()));
        setPreferredSize(new Dimension(1500,1200));
        return chartPanel;
    }

    private JFreeChart createChart(DefaultCategoryDataset dataSet) {
        return ChartFactory.createBarChart("Histogram V1.0","e-mail domains",
                            "Nº of e-mail(s)",dataSet, PlotOrientation.VERTICAL,false,
                            true,false);
    }

    private DefaultCategoryDataset createDataset() {
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
        for (T key:histogram.keySet()){
            dataSet.addValue(histogram.get(key),"", (Comparable) key);
        }
        return dataSet;
    }

    public void execute(){
        setVisible(true);
    }
}
