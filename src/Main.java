import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

public class Main {
    public static void main(String[] args){
        //GUI app =new GUI();
        //app.setVisible(true);
        JFrame jFrame =new JFrame();//окно
        jFrame.setVisible(true);//делаем видимым
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// даём возможность закрыть приложение
        //jFrame.setSize(500,300);//размер окна
        //jFrame.setLocation(700,400);//устанавливаем позицию окна
        //jFrame.setBounds(700,400,500,300);//заменяет строки выше
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension =toolkit.getScreenSize();
        jFrame.setBounds(dimension.width/2-500,dimension.height/2-400,1000,800);//так можно отцентровать по середине
        jFrame.setTitle("str");

        jFrame.add(new MyComp());
    }
    static class MyComp extends JComponent{
        @Override
        protected void paintComponent(Graphics g) {
            Font font = new Font("Traffic Light",Font.BOLD,20);
            Graphics2D g2=(Graphics2D)g;
            g2.setFont(font);
            g2.drawString("Traffic Light",450,20);
            //шапка
            Ellipse2D shap = new Ellipse2D.Double(435,50,130,90);
            g2.setPaint(Color.black);
            g2.draw(shap);
            g2.fill(shap);

            Rectangle2D shapRes= new Rectangle2D.Double(435,80,130,10);
            g2.setPaint(Color.white);
            g2.draw(shapRes);
            g2.fill(shapRes);
            //тело светофора
            Rectangle2D res1= new Rectangle2D.Double(425,100,151,420);
            g2.setPaint(Color.black);
            g2.draw(res1);
            g2.fill(res1);

            Rectangle2D res2= new Rectangle2D.Double(435,90,130,10);
            g2.setPaint(Color.black);
            g2.draw(res2);
            g2.fill(res2);

            Rectangle2D res3= new Rectangle2D.Double(435,520,130,10);
            g2.setPaint(Color.black);
            g2.draw(res3);
            g2.fill(res3);

            Ellipse2D el1 = new Ellipse2D.Double(425,90,20,20);
            g2.setPaint(Color.black);
            g2.draw(el1);
            g2.fill(el1);

            Ellipse2D el2 = new Ellipse2D.Double(555,90,20,20);
            g2.setPaint(Color.black);
            g2.draw(el2);
            g2.fill(el2);

            Ellipse2D el3 = new Ellipse2D.Double(425,510,20,20);
            g2.setPaint(Color.black);
            g2.draw(el3);
            g2.fill(el3);

            Ellipse2D el4 = new Ellipse2D.Double(555,510,20,20);
            g2.setPaint(Color.black);
            g2.draw(el4);
            g2.fill(el4);
            //фанари красный
            Ellipse2D elWHITE1 = new Ellipse2D.Double(435,100,130,130);
            g2.setPaint(Color.WHITE);
            g2.draw(elWHITE1);
            g2.fill(elWHITE1);

            Ellipse2D elBlack1 = new Ellipse2D.Double(435,110,130,130);
            g2.setPaint(Color.black);
            g2.draw(elBlack1);
            g2.fill(elBlack1);

            Rectangle2D resRed= new Rectangle2D.Double(425,165,150,75);
            g2.setPaint(Color.black);
            g2.draw(resRed);
            g2.fill(resRed);

            Ellipse2D elRed = new Ellipse2D.Double(446,118,108,108);
            g2.setPaint(Color.red);
            g2.draw(elRed);
            g2.fill(elRed);

            //фанари yellow
            Ellipse2D elWHITE2 = new Ellipse2D.Double(435,240,130,130);
            g2.setPaint(Color.WHITE);
            g2.draw(elWHITE2);
            g2.fill(elWHITE2);

            Ellipse2D elBlack2 = new Ellipse2D.Double(435,250,130,130);
            g2.setPaint(Color.black);
            g2.draw(elBlack2);
            g2.fill(elBlack2);

            Rectangle2D resYellow= new Rectangle2D.Double(425,305,150,75);
            g2.setPaint(Color.black);
            g2.draw(resYellow);
            g2.fill(resYellow);

            Ellipse2D elYellow = new Ellipse2D.Double(446,258,108,108);
            g2.setPaint(Color.yellow);
            g2.draw(elYellow);
            g2.fill(elYellow);
            //фанари green
            Ellipse2D elWHITE3 = new Ellipse2D.Double(435,380,130,130);
            g2.setPaint(Color.WHITE);
            g2.draw(elWHITE3);
            g2.fill(elWHITE3);

            Ellipse2D elBlack3 = new Ellipse2D.Double(435,390,130,130);
            g2.setPaint(Color.black);
            g2.draw(elBlack3);
            g2.fill(elBlack3);

            Rectangle2D resGreen= new Rectangle2D.Double(425,445,150,75);
            g2.setPaint(Color.black);
            g2.draw(resGreen);
            g2.fill(resGreen);

            Ellipse2D elGreen = new Ellipse2D.Double(446,398,108,108);
            g2.setPaint(Color.green);
            g2.draw(elGreen);
            g2.fill(elGreen);

            //тело ноги
            Rectangle2D Hres1= new Rectangle2D.Double(480,540,40,60);
            g2.setPaint(Color.black);
            g2.draw(Hres1);
            g2.fill(Hres1);

            Rectangle2D Hres2= new Rectangle2D.Double(485,535,30,5);
            g2.setPaint(Color.black);
            g2.draw(Hres2);
            g2.fill(Hres2);

            Rectangle2D Hres3= new Rectangle2D.Double(485,600,30,5);
            g2.setPaint(Color.black);
            g2.draw(Hres3);
            g2.fill(Hres3);

            Ellipse2D Hel1 = new Ellipse2D.Double(480,535,10,10);
            g2.setPaint(Color.black);
            g2.draw(Hel1);
            g2.fill(Hel1);

            Ellipse2D Hel2 = new Ellipse2D.Double(510,535,10,10);
            g2.setPaint(Color.black);
            g2.draw(Hel2);
            g2.fill(Hel2);

            Ellipse2D Hel3 = new Ellipse2D.Double(480,595,10,10);
            g2.setPaint(Color.black);
            g2.draw(Hel3);
            g2.fill(Hel3);

            Ellipse2D Hel4 = new Ellipse2D.Double(510,595,10,10);
            g2.setPaint(Color.black);
            g2.draw(Hel4);
            g2.fill(Hel4);

            //треугольники
            g.fillRoundRect(330,118, 90, 10, 10, 10);
            g.fillRoundRect(410,118, 10, 108, 10, 10);
            int[] xPointsL1 = {333, 410, 410};
            int[] yPointsL1 = {128, 128, 222};
            g.fillPolygon(xPointsL1,yPointsL1,3);

            g.fillRoundRect(330,258, 90, 10, 10, 10);
            g.fillRoundRect(410,258, 10, 108, 10, 10);
            int[] xPointsL2 = {333, 410, 410};
            int[] yPointsL2 = {268, 268, 361};
            g.fillPolygon(xPointsL2,yPointsL2,3);

            g.fillRoundRect(330,398, 90, 10, 10, 10);
            g.fillRoundRect(410,398, 10, 108, 10, 10);
            int[] xPointsL3 = {333, 410, 410};
            int[] yPointsL3 = {408, 408, 501};
            g.fillPolygon(xPointsL3,yPointsL3,3);

            g.fillRoundRect(580,118, 90, 10, 10, 10);
            g.fillRoundRect(580,118, 10, 108, 10, 10);
            int[] xPointsR1 = {667, 590, 590};
            int[] yPointsR1 = {128, 128, 222};
            g.fillPolygon(xPointsR1,yPointsR1,3);

            g.fillRoundRect(580,258, 90, 10, 10, 10);
            g.fillRoundRect(580,258, 10, 108, 10, 10);
            int[] xPointsR2 = {667, 590, 590};
            int[] yPointsR2 = {268, 268, 361};
            g.fillPolygon(xPointsR2,yPointsR2,3);

            g.fillRoundRect(580,398, 90, 10, 10, 10);
            g.fillRoundRect(580,398, 10, 108, 10, 10);
            int[] xPointsR3 = {667, 590, 590};
            int[] yPointsR3 = {408, 408, 501};
            g.fillPolygon(xPointsR3,yPointsR3,3);
        }
    }
}
