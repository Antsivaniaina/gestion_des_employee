package interfaces;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class LoginFond
        extends javax.swing.JPanel
  {
    public Color getColor1()
      {
        return color1;
      }
    public void setColor1(Color color1)
      {
        this.color1 = color1;
      }

    public Color getColor2()
      {
        return color2;
      }

    public void setColor2(Color color2)
      {
        this.color2 = color2;
      }
    
    public LoginFond(Color col1, Color col2)
      {
        this.color1 = col1;
        this.color2 = col2;
      }
    private  Color color1;
    private  Color color2;
    
    public LoginFond()
      {
        initComponents();
          setOpaque(false);
          color1 = Color.BLACK;
          color2 = Color.white;
      }
    
    
@Override
 protected void paintComponent(Graphics graphics)
      {
        Graphics2D g2 = (Graphics2D) graphics;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint g = new  GradientPaint(0, 0, color1,0,getHeight(),color2);
        g2.setPaint(g);
        g2.fillRoundRect(0,0,getWidth(),getHeight(),0,0);
        g2.setColor(new Color(255,255,255,50));
        g2.fillOval( getWidth() - (getHeight() / 2) , 10, getHeight(), getHeight());
        g2.fillOval( getWidth() - (getHeight() / 2) - 20 , getHeight()/2 + 20,getHeight(), getHeight());
        super.paintComponent(graphics);
      }
   /* protected void paintChildren(Graphics graph)
    *  {
    *    Graphics2D g2 = (Graphics2D) graph;
    *    g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    *    GradientPaint g = new  GradientPaint(0, 0, color1,0,getHeight(),color2);
    *    g2.setPaint(g);
    *    g2.fillRoundRect(0,0,getWidth(),getHeight(),0,0);
    *    super.paintChildren(graph); 
    *  }
    */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
  }
