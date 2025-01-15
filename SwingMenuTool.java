import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;

class MyFrame extends JFrame implements ActionListener {
    JToolBar tb;
    JButton b1, b2, b3, b4, b5, b6, b7;
    JTextArea ta;

    public MyFrame() {
        super("ToolBar Demo");
        tb = new JToolBar();

        // Resize images and initialize buttons
        b1 = new JButton(resizeIcon("C:\\Users\\HP\\OneDrive\\Desktop\\java\\Images\\new.jpg", 30, 30));
        b2 = new JButton(resizeIcon("C:\\Users\\HP\\OneDrive\\Desktop\\java\\Images\\open.png", 30, 30));
        b3 = new JButton(resizeIcon("C:\\Users\\HP\\OneDrive\\Desktop\\java\\Images\\save.png", 30, 30));
        b4 = new JButton(resizeIcon("C:\\Users\\HP\\OneDrive\\Desktop\\java\\Images\\copy.jpg", 30, 30));
        b5 = new JButton(resizeIcon("C:\\Users\\HP\\OneDrive\\Desktop\\java\\Images\\cut.png", 30, 30));
        b6 = new JButton(resizeIcon("C:\\Users\\HP\\OneDrive\\Desktop\\java\\Images\\spilt.png", 30, 30));
        b7 = new JButton(resizeIcon("C:\\Users\\HP\\OneDrive\\Desktop\\java\\Images\\close.png", 30, 30));

        // Add buttons to the toolbar
        tb.add(b1);
        tb.add(b2);
        tb.add(b3);
        tb.add(b4);
        tb.addSeparator();
        tb.add(b5);
        tb.add(b6);
        tb.add(b7);

        // Initialize text area
        ta = new JTextArea();

        // Add components to frame
        JScrollPane sp = new JScrollPane(ta);
        add(tb, BorderLayout.NORTH);
        add(sp, BorderLayout.CENTER);

        // Add menu bar
        JMenuBar mb = new JMenuBar();
        JMenu file = new JMenu("File");
        JMenuItem m1 = new JMenuItem("Save");
        JMenuItem m2 = new JMenuItem("Open");
        m2.setMnemonic(KeyEvent.VK_O); // Set mnemonic for 'Open'

        file.add(m1);
        file.addSeparator();
        file.add(m2);
        mb.add(file);
        setJMenuBar(mb);

        // Set action commands and listeners
        b2.setActionCommand("Open");
        b2.addActionListener(this);
        m2.addActionListener(this);
        b1.addActionListener(this);
        m1.addActionListener(this);

        // Set frame properties
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // Helper method to resize icons
    private Icon resizeIcon(String path, int width, int height) {
        ImageIcon icon = new ImageIcon(path);
        Image img = icon.getImage();
        Image resizedImg = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new ImageIcon(resizedImg);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if ("Open".equals(e.getActionCommand())) {
            JFileChooser fc = new JFileChooser();
            int result = fc.showOpenDialog(this);
            if (result == JFileChooser.APPROVE_OPTION) {
                File f = fc.getSelectedFile();
                if (f != null && f.isFile() && f.canRead()) {
                    try (FileInputStream fi = new FileInputStream(f)) {
                        byte[] b = new byte[fi.available()];
                        fi.read(b);
                        String str = new String(b);
                        ta.setText(str);
                    } catch (Exception ex) {
                        ex.printStackTrace(); // Log exception for debugging
                        JOptionPane.showMessageDialog(this, "Error reading file: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Invalid file selection", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        else{
            Color col= JColorChooser.showDialog(this,"Font Color",Color.red);
            ta.setForeground(col);
        }
    }
}

public class SwingMenuTool {
    public static void main(String[] args) {
        MyFrame f = new MyFrame();
        f.setSize(600, 600);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
