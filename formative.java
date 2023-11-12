import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class formative extends JFrame {

  private static final long serialVersionUID = 1L;
  private JPanel contentPane;
  private JTextField employeeName;
  private JTextField textField;
  public JTextField wednesday;
  public JTextField Monday;
  public JTextField Sunday;
  public JTextField Saturday;
  public JTextField Friday;
  public JTextField Thursday;
  public JTextField Tuesday;
  public JTextField Monday2;
  public JTextField Tuesday2;
  public JTextField Wednesday2;
  public JTextField Thursday2;
  public JTextField Friday2;
  public JTextField Saturday2;
  public JTextField Sunaday2;
  public JTextField textField_15;
  public JTextField textField_16;
  public JTextField textField_18;
  public JTextField textField_17;
  public JTextField textField_19;

  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          formative frame = new formative();
          frame.setVisible(true);
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    });
  }

  /**
   * Create the frame.
   */
  public formative() {
    setTitle("Georgetown Cleaning Service -Employee Payroll");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(100, 100, 550, 274);
    contentPane = new JPanel();
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

    setContentPane(contentPane);
    contentPane.setLayout(null);

    JLabel lblNewLabel = new JLabel("Employee Identification");
    lblNewLabel.setBounds(0, 10, 119, 13);
    contentPane.add(lblNewLabel);

    JLabel lblNewLabel_1 = new JLabel("Employee Name");
    lblNewLabel_1.setBounds(0, 24, 83, 13);
    contentPane.add(lblNewLabel_1);

    employeeName = new JTextField();
    employeeName.setBounds(76, 21, 96, 19);
    contentPane.add(employeeName);
    employeeName.setColumns(10);

    JLabel lblNewLabel_2 = new JLabel("Hourly Salary");
    lblNewLabel_2.setBounds(198, 24, 69, 13);
    contentPane.add(lblNewLabel_2);

    textField = new JTextField();
    textField.setText("10.00");
    textField.setBounds(266, 21, 96, 19);
    contentPane.add(textField);
    textField.setColumns(10);

    JLabel lblNewLabel_3 = new JLabel("Time Sheet");
    lblNewLabel_3.setBounds(10, 47, 73, 13);
    contentPane.add(lblNewLabel_3);

    JLabel lblNewLabel_4 = new JLabel("First Week");
    lblNewLabel_4.setBounds(0, 76, 58, 13);
    contentPane.add(lblNewLabel_4);

    JLabel lblNewLabel_5 = new JLabel("Monday");
    lblNewLabel_5.setBounds(59, 59, 45, 13);
    contentPane.add(lblNewLabel_5);

    JLabel lblNewLabel_6 = new JLabel("Tuesday");
    lblNewLabel_6.setBounds(127, 59, 45, 13);
    contentPane.add(lblNewLabel_6);

    JLabel lblNewLabel_7 = new JLabel("Wednesday");
    lblNewLabel_7.setBounds(198, 59, 58, 13);
    contentPane.add(lblNewLabel_7);

    JLabel lblNewLabel_8 = new JLabel("Thursday");
    lblNewLabel_8.setBounds(266, 59, 45, 13);
    contentPane.add(lblNewLabel_8);

    JLabel lblNewLabel_9 = new JLabel("Friday");
    lblNewLabel_9.setBounds(331, 59, 45, 13);
    contentPane.add(lblNewLabel_9);

    JLabel lblNewLabel_10 = new JLabel("Saturday");
    lblNewLabel_10.setBounds(386, 59, 45, 13);
    contentPane.add(lblNewLabel_10);

    JLabel lblNewLabel_11 = new JLabel("Sunday");
    lblNewLabel_11.setBounds(467, 59, 45, 13);
    contentPane.add(lblNewLabel_11);

    wednesday = new JTextField();
    wednesday.setText("0.00");
    wednesday.setBounds(198, 73, 58, 19);
    contentPane.add(wednesday);
    wednesday.setColumns(10);

    JLabel lblNewLabel_12 = new JLabel("Second Week");
    lblNewLabel_12.setBounds(0, 99, 58, 13);
    contentPane.add(lblNewLabel_12);

    Monday = new JTextField();
    Monday.setText("0.00");
    Monday.setColumns(10);
    Monday.setBounds(59, 73, 58, 19);
    contentPane.add(Monday);

    Sunday = new JTextField();
    Sunday.setText("0.00");
    Sunday.setColumns(10);
    Sunday.setBounds(467, 73, 58, 19);
    contentPane.add(Sunday);

    Saturday = new JTextField();
    Saturday.setText("0.00");
    Saturday.setColumns(10);
    Saturday.setBounds(396, 73, 58, 19);
    contentPane.add(Saturday);

    Friday = new JTextField();
    Friday.setText("0.00");
    Friday.setColumns(10);
    Friday.setBounds(328, 73, 58, 19);
    contentPane.add(Friday);

    Thursday = new JTextField();
    Thursday.setText("0.00");
    Thursday.setColumns(10);
    Thursday.setBounds(266, 73, 58, 19);
    contentPane.add(Thursday);

    Tuesday = new JTextField();
    Tuesday.setText("0.00");
    Tuesday.setColumns(10);
    Tuesday.setBounds(127, 73, 58, 19);
    contentPane.add(Tuesday);

    Monday2 = new JTextField();
    Monday2.setText("0.00");
    Monday2.setColumns(10);
    Monday2.setBounds(59, 96, 58, 19);
    contentPane.add(Monday2);

    Tuesday2 = new JTextField();
    Tuesday2.setText("0.00");
    Tuesday2.setColumns(10);
    Tuesday2.setBounds(127, 96, 58, 19);
    contentPane.add(Tuesday2);

    Wednesday2 = new JTextField();
    Wednesday2.setText("0.00");
    Wednesday2.setColumns(10);
    Wednesday2.setBounds(198, 96, 58, 19);
    contentPane.add(Wednesday2);

    Thursday2 = new JTextField();
    Thursday2.setText("0.00");
    Thursday2.setColumns(10);
    Thursday2.setBounds(266, 96, 58, 19);
    contentPane.add(Thursday2);

    Friday2 = new JTextField();
    Friday2.setText("0.00");
    Friday2.setColumns(10);
    Friday2.setBounds(331, 96, 58, 19);
    contentPane.add(Friday2);

    Saturday2 = new JTextField();
    Saturday2.setText("0.00");
    Saturday2.setColumns(10);
    Saturday2.setBounds(406, 96, 58, 19);
    contentPane.add(Saturday2);

    Sunaday2 = new JTextField();
    Sunaday2.setText("0.00");
    Sunaday2.setColumns(10);
    Sunaday2.setBounds(467, 96, 58, 19);
    contentPane.add(Sunaday2);

    JLabel lblNewLabel_13 = new JLabel("Payroll Processing");
    lblNewLabel_13.setBounds(0, 132, 96, 13);
    contentPane.add(lblNewLabel_13);

    int[] hours=new int[7];
    int[] overtime=new int[7];
    JButton btnNewButton = new JButton("Process it");
    btnNewButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
    	  int perhour=Integer.parseInt(textField.getText());
        if(Integer.parseInt(Monday.getText())<9) {
          hours[0] = Integer.parseInt(Monday.getText());
        }
        else if(Integer.parseInt(Monday.getText())>8) {
          overtime[0] = Integer.parseInt(Monday.getText())-8;
          hours[0]=8;
        }
        if(Integer.parseInt(Tuesday.getText())<9) {
          hours[1] = Integer.parseInt(Tuesday.getText());
        }
        else if(Integer.parseInt(Tuesday.getText())>8) {
          overtime[1] = Integer.parseInt(Tuesday.getText())-8;
          hours[1]=8;
        }
        if(Integer.parseInt(wednesday.getText())<9) {
          hours[2] = Integer.parseInt(wednesday.getText());
        }
        else if(Integer.parseInt(wednesday.getText())<8) {
          overtime[2] = Integer.parseInt(wednesday.getText())-8;
          hours[2]=8;
        }

        if(Integer.parseInt(Thursday.getText())<9) {
          hours[3] = Integer.parseInt(Thursday.getText());
        }
        else if(Integer.parseInt(Thursday.getText())>8) {
          overtime[3] = Integer.parseInt(Thursday.getText())-8;
          hours[3]=8;

        }

        if(Integer.parseInt(Friday.getText())<9) {
          hours[4] = Integer.parseInt(Friday.getText());
        }
        else if(Integer.parseInt(Friday.getText())>8){
          overtime[4] = Integer.parseInt(Friday.getText())-8;
          hours[4]=8;

        }

        if( Integer.parseInt(Saturday.getText())<9) {
          hours[5] = Integer.parseInt(Saturday.getText());
        }
        else if( Integer.parseInt(Saturday.getText())>8) {
          overtime[5] = Integer.parseInt(Saturday.getText())-8;
          hours[5]=8;
        }

        if(Integer.parseInt(Sunday.getText())<9) {
          hours[6] = Integer.parseInt(Sunday.getText());
        }
        else if(Integer.parseInt(Sunday.getText())>8) {
          overtime[6] = Integer.parseInt(Sunday.getText())-8;
          hours[6]=8;

        }
        else {}
        for(int i=0;i<7;i++) {
        	int regular;
        	regular+=hours[i];
        	textField_15.setText(String.valueOf(regular));
        	
        	int ovtime;
        	ovtime+=overtime[i];
        	textField_16.setText(String.valueOf(ovtime));
        	
        	int netpay=(regular*perhour)+(ovtime*perhour);
        	textField_17.setText(String.valueOf(netpay));
        	
        	
        }

      }






});
        btnNewButton.setBounds(0, 155, 83, 53);
        contentPane.add(btnNewButton);

        JLabel lblNewLabel_14 = new JLabel("Regular");
        lblNewLabel_14.setBounds(93, 175, 45, 13);
        contentPane.add(lblNewLabel_14);

        JLabel lblNewLabel_15 = new JLabel("Overtime");
        lblNewLabel_15.setBounds(93, 195, 45, 13);
        contentPane.add(lblNewLabel_15);

        JLabel lblNewLabel_16 = new JLabel("Hours");
        lblNewLabel_16.setBounds(152, 155, 45, 13);
        contentPane.add(lblNewLabel_16);

        JLabel lblNewLabel_17 = new JLabel("Amount");
        lblNewLabel_17.setBounds(222, 155, 45, 13);
        contentPane.add(lblNewLabel_17);

        textField_15 = new JTextField();
        textField_15.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {

        }
        });

        textField_15.setText("0.00");
        textField_15.setColumns(10);
        textField_15.setBounds(148, 172, 58, 19);
        contentPane.add(textField_15);

        textField_16 = new JTextField();
        textField_16.setText("0.00");
        textField_16.setColumns(10);
        textField_16.setBounds(222, 172, 58, 19);
        contentPane.add(textField_16);

        textField_18 = new JTextField();
        textField_18.setText("0.00");
        textField_18.setColumns(10);
        textField_18.setBounds(222, 192, 58, 19);
        contentPane.add(textField_18);

        textField_17 = new JTextField();
        textField_17.setText("0.00");
        textField_17.setColumns(10);
        textField_17.setBounds(148, 192, 58, 19);
        contentPane.add(textField_17);

        JLabel lblNewLabel_18 = new JLabel("Net Pay");
        lblNewLabel_18.setBounds(300, 175, 45, 13);
        contentPane.add(lblNewLabel_18);

        textField_19 = new JTextField();
        textField_19.setText("0.00");
        textField_19.setBounds(358, 172, 69, 19);
        contentPane.add(textField_19);
        textField_19.setColumns(10);

        JButton btnNewButton_1 = new JButton("Close");
        btnNewButton_1.setBounds(456, 155, 69, 53);
        contentPane.add(btnNewButton_1);
        }

        }
