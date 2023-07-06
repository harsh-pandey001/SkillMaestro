package javaapplication1;

import java.awt.Color;
import java.text.DecimalFormat;
import javax.swing.JFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.PieDataset;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.labels.PieSectionLabelGenerator;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.util.Rotation;

public class Piechart3D extends javax.swing.JFrame {

    int prog, Eng1, apti1, Gk1, Reas1;

    public Piechart3D(String appTitle, String chartTitle, int c, int cpp, int java1, int Eng, int apti, int Gk, int Reas) {
        prog = c + cpp + java1;
        Eng1 = Eng;
        apti1 = apti;
        Gk1 = Gk;
        Reas1 = Reas;
        PieDataset dataset = createDataset();
        JFreeChart chart = createChart(dataset, chartTitle);
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(1550, 800));
        setContentPane(chartPanel);
        chart.getPlot().setBackgroundPaint(Color.WHITE);

    }

    public Piechart3D(String appTitle, String chartTitle) {

        PieDataset dataset = createDataset();
        JFreeChart chart = createChart(dataset, chartTitle);
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(1550, 800));
        setContentPane(chartPanel);
        chart.getPlot().setBackgroundPaint(Color.WHITE);

    }

    Piechart3D(int c, int cpp, int java1, int Eng, int apti, int Gk, int Reas) {
        prog = c + cpp + java1;
        Eng1 = Eng;
        apti1 = apti;
        Gk1 = Gk;
        Reas1 = Reas;
    }

    private PieDataset createDataset() {

        DefaultPieDataset result = new DefaultPieDataset();
        result.setValue("Programming", prog/3);
        result.setValue("Communication", Eng1);
        result.setValue("Aptitude", apti1);
        result.setValue("General awareness", Gk1);
        result.setValue("Logical Reasoning", Reas1);
        return result;

    }

    private JFreeChart createChart(PieDataset dataset, String title) {

        JFreeChart chart = ChartFactory.createPieChart3D(title, dataset, true, true, false);

        PiePlot3D plot = (PiePlot3D) chart.getPlot();
        plot.setStartAngle(0);
        plot.setDirection(Rotation.CLOCKWISE);
        plot.setForegroundAlpha(0.5f);
        PieSectionLabelGenerator labelGenerator = new StandardPieSectionLabelGenerator(
                "{0} : ({2})", new DecimalFormat("0"), new DecimalFormat("0%"));
        ((PiePlot) chart.getPlot()).setLabelGenerator(labelGenerator);
        return chart;
    }

    public static void main(String[] args) {
        Piechart3D cc = new Piechart3D("Pie chart Test", "Analysis");
        cc.pack();
        cc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cc.setVisible(true);
    }
}
