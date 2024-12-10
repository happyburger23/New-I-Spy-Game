import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        JFrame window = new JFrame("Test I Spy Game");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);

        GamePanel gp = new GamePanel();
        window.add(gp);

        window.pack();

        window.setLocationRelativeTo(null);
        window.setVisible(true);

        // SAVE/LOAD SYSTEM THINGS
        SaveLoadSystem saveLoadSystem = new SaveLoadSystem();
        Map<String, Object> dataToSave = new HashMap<>();
        dataToSave.put("playerName", "Alex");
        dataToSave.put("level", 5);
        dataToSave.put("score", 12345);

        saveLoadSystem.saveGame(dataToSave);
        Map<String, Object> loadedData = saveLoadSystem.loadGame();
        System.err.println("Loaded Data: " + loadedData);
    }
}