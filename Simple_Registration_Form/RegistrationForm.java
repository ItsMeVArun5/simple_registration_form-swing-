import java.awt.*;
import javax.swing.*;


class RegistrationForm{

      public static void main(String args[]){

            JFrame window = new JFrame("Registration Form");
            Header header = new Header();

            //Text fields..................................
            JTextField firstName = new JTextField();
            JTextField lastName = new JTextField();
            JTextField Age = new JTextField();
            JTextField mobileNumber = new JTextField();
            JTextField emailId = new JTextField();
            JTextField Address = new JTextField();

            //Buttons................................
            JButton submit = new JButton("Submit");
            JRadioButton Male = new JRadioButton("Male");
            JRadioButton Female = new JRadioButton("Female");

            //Labels.......................................
            JLabel $Header = new JLabel("Registration Form");
            JLabel $name = new JLabel("Name");
            JLabel $firstName = new JLabel("First Name");
            JLabel $lastName = new JLabel("Last Name");
            JLabel $Age = new JLabel("Age");
            JLabel $mobileNumber = new JLabel("Mobile No.");
            JLabel $emailId = new JLabel("Email ID");
            JLabel $Address = new JLabel("Address");
            JLabel $Gender = new JLabel("Gender");

            //placing all text fields.....................
            window.getContentPane().setBackground(Color.WHITE);

            firstName.setBounds(225, 128, 206, 52);
            firstName.setBackground(new Color(233, 233, 233));
            firstName.setFont(new Font("Serif", Font.PLAIN, 20));
            firstName.setForeground(Color.BLACK);
            firstName.setBorder(null);
            window.add(firstName);

            lastName.setBounds(516, 128, 206, 52);
            lastName.setBackground(new Color(233, 233, 233));
            lastName.setFont(new Font("Serif", Font.PLAIN, 20));
            lastName.setForeground(Color.BLACK);
            lastName.setBorder(null);
            window.add(lastName);
      
            Age.setBounds(229, 222, 55, 52);
            Age.setBackground(new Color(233, 233, 233));
            Age.setFont(new Font("Serif", Font.PLAIN, 20));
            Age.setForeground(Color.BLACK);
            Age.setBorder(null);
            window.add(Age);

            mobileNumber.setBounds(227, 298, 275, 52);
            mobileNumber.setBackground(new Color(233, 233, 233));
            mobileNumber.setFont(new Font("Serif", Font.PLAIN, 20));
            mobileNumber.setForeground(Color.BLACK);
            mobileNumber.setBorder(null);
            window.add(mobileNumber);
            
            emailId.setBounds(227, 374, 275, 52);
            emailId.setBackground(new Color(233, 233, 233));
            emailId.setFont(new Font("Serif", Font.PLAIN, 20));
            emailId.setForeground(Color.BLACK);
            emailId.setBorder(null);
            window.add(emailId);

            submit.setBounds(77, 664, 176, 57);
            submit.setBackground(new Color(255, 86, 86));
            submit.setForeground(Color.white);
            submit.setFont(new Font("Serif", Font.PLAIN, 28));
            window.add(submit);

            Male.setBounds(225, 450, 100, 30);
            Male.setBackground(Color.WHITE);
            Male.setFont(new Font("Serif", Font.PLAIN, 22));
            window.add(Male);

            Female.setBounds(341, 449, 120, 30);
            Female.setBackground(Color.white);
            Female.setFont(new Font("Serif", Font.PLAIN, 22));
            window.add(Female);

            Address.setBounds(227, 486, 495, 113);
            Address.setBackground(new Color(233, 233, 233));
            Address.setFont(new Font("Serif", Font.PLAIN, 20));
            Address.setForeground(Color.BLACK);
            Address.setBorder(null);
            window.add(Address);



            //placing all labels..........................
            $Header.setOpaque(true);
            $Header.setBackground(new Color(23, 25, 58));
            $Header.setForeground(Color.white);
            $Header.setBounds(265, 8, 300, 43);
            $Header.setFont(new Font("Serif", Font.PLAIN, 32));
            window.add($Header);

            $name.setBounds(76, 139, 90, 30);
            $name.setFont(new Font("Serif", Font.BOLD, 22));
            window.add($name);

            $Age.setBounds(78, 233, 60, 30);
            $Age.setFont(new Font("Serif", Font.BOLD, 22));
            window.add($Age);

            $mobileNumber.setBounds(78, 309, 150, 30);
            $mobileNumber.setFont(new Font("Serif", Font.BOLD, 22));
            window.add($mobileNumber);

            $firstName.setBounds(225, 189, 120, 24);
            $firstName.setFont(new Font("Serif", Font.PLAIN, 18));
            window.add($firstName);

            $lastName.setBounds(516, 189, 120, 24);
            $lastName.setFont(new Font("Serif", Font.PLAIN, 18));
            window.add($lastName);

            $emailId.setBounds(78, 385, 120, 30);
            $emailId.setFont(new Font("Serif", Font.BOLD, 22));
            window.add($emailId);

            $Address.setBounds(78, 528, 100, 30);
            $Address.setFont(new Font("Serif", Font.BOLD, 22));
            window.add($Address);

            $Gender.setBounds(77, 449, 100, 30);
            $Gender.setFont(new Font("Serif", Font.BOLD, 22));
            window.add($Gender);

            window.add(header);
            window.setSize(800, 860);
            // window.setLayout(null);
            window.setVisible(true);
            window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      }
}