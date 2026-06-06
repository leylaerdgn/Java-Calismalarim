
package gui;
import javax.swing.*;
import java.awt.GridLayout;

public class GradeCalculator extends JFrame{
    
    JTextField midtermField;
    JTextField finalField;
    JButton calculateButton;
    JLabel resultLabel;
    
    public GradeCalculator(){
        setTitle("Not Hesaplama Uygulaması");
        setSize(350,220);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4,2));
        
        add(new JLabel("Vize Notu: "));
        midtermField=new JTextField();
        add(midtermField);
        
        add(new JLabel("Final Notu: "));
        finalField=new JTextField();
        add(finalField);
        
        calculateButton=new JButton("Hesapla: ");
        add(calculateButton);
        
        resultLabel=new JLabel("Ortalama: ");
        add(resultLabel);
        
        calculateButton.addActionListener(e -> {
            calculateGrade(); //Kullanıcı Hesapla butonuna basarsa calculateGrade() metodunu çalıştır.
        });
              setVisible(true);  
                
    }
    public void calculateGrade(){
        try{
            double midterm=Double.parseDouble(midtermField.getText());
            double finalExam=Double.parseDouble(finalField.getText());
            
            if(midterm<0 || midterm>100 || finalExam<0 || finalExam>100){
                JOptionPane.showMessageDialog(this, "Notlar 0 ile 100 arasında olmalıdır.");
                return;
            }
            double average=midterm*0.40 + finalExam*0.60;
            
            if(average >=50){
                resultLabel.setText("Ortalama: "+average+" - Geçti");
            }else{
                resultLabel.setText("Ortalama: "+average+ " - Kaldı");
            }
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(this, "Lütfen geçerli bir sayı giriniz.");
        }
    }
    public static void main(String[] args) {
        new GradeCalculator();
    }
}
