
import com.sun.xml.internal.ws.api.streaming.XMLStreamReaderFactory;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

import javax.swing.*;
import java.awt.*;

public class HistogramDisplay extends ApplicationFrame {

    public static void main(String[] args) {
        HistogramDisplay histo = new HistogramDisplay();
        histo.execute();
    }
    public HistogramDisplay() {
        super("Histograma");
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
        dataSet.addValue(3,"","ulpgc.es");
        dataSet.addValue(2,"","ull.com");
        dataSet.addValue(5,"","gmail.com");
        dataSet.addValue(1,"","apple.es");
        return dataSet;
    }

    public void execute(){
        setVisible(true);
    }
}
