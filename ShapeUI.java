import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 

public class ShapeUI extends JFrame{
    /*
    JPanel scrollPanel;
    JPanel showPanel;
    JLabel label;
    */
    
    public ShapeUI() {
        ReadFromFile read = new ReadFromFile();
        this.setSize(600, 400);
        this.setLayout(new GridLayout(1, 2, 1, 10));

        JPanel scrollPanel = new JPanel();
        //scrollPanel.setBackground(Color.yellow);
        JPanel showPanel = new JPanel();
        JLabel label = new JLabel(read.getShape(0).getDetailString());
        showPanel.add(label);

        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        //create button arrays
        JButton buttonArray[] = new JButton[read.getSize()];
        //buttonHandler handler = new buttonHandler();

        scrollPanel.setLayout(new BoxLayout(scrollPanel, BoxLayout.Y_AXIS));

        for(int i=0; i<read.getSize(); i++) {
            buttonArray[i] = new JButton(read.getShape(i).toString());
            //buttonArray[i].addActionListener(handler);
            String s = read.getShape(i).getDetailString();
            buttonArray[i].addActionListener(new ActionListener() {
               public void actionPerformed(ActionEvent e) {
                   //String text = read.getShape(i).getDetailString();
                   label.setText(s);
               } 
            });
            scrollPanel.add(buttonArray[i]);
        }

        JScrollPane jsPane = new JScrollPane(scrollPanel, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        this.add(jsPane);
        this.add(showPanel);
    }

    
}