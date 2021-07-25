import java.awt.*;  
import java.awt.event.*;  
public class ChoiceExample2  
{
   
public static void main(String args[])  
{  
 
        Frame f= new Frame();  
      Label label = new Label(); 
Label l1 = new Label();             
        label.setAlignment(Label.CENTER);
l1.setText("The selected language is ");  
        label.setSize(400,100);  
      Choice c=new Choice();  
        c.setBounds(50,50, 75,75);
label.setBounds(100,100,200,200);  
l1.setBounds(120,120,220,220);  
        c.add("C");  
        c.add("CPP");  
        c.add("Java");  
        c.add("Python");  
        f.add(c); f.add(label); f.add(l1);
        f.setSize(400,400);  
        f.setLayout(new FlowLayout());
      
        f.setVisible(true);  
       c.addItemListener(new ItemListener() {
public void itemStateChanged(ItemEvent e){

label.setText("You have selected "+ c.getSelectedItem());
}
});
f.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent){
            System.exit(0);