package SingleColor;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;

import java.io.IOException;
import java.net.URL;
import java.util.HashMap;

public class PaneController {
    private final HashMap<String, FXMLLoader> fxmlLoaderHashMap = new HashMap<>();
    private final HashMap<String, Pane> paneHashMap = new HashMap<>();
    private final HashMap<String, Object> objectHashMap = new HashMap<>();

    private final Scene scene;
//    private Pane currentPane = null;
//    private Object currentObject = null;

    public PaneController(Scene scene) {
        this.scene = scene;
    }

//    protected void addPane(String name, URL url) throws IOException {
//        fxmlLoaderHashMap.put(name, new FXMLLoader(url));
//        paneHashMap.put(name, fxmlLoaderHashMap.get(name).load());
//    }

    protected void addPane(String name, URL url, Object o) throws IOException {
        fxmlLoaderHashMap.put(name, new FXMLLoader(url));
        fxmlLoaderHashMap.get(name).setController(o);
        paneHashMap.put(name, fxmlLoaderHashMap.get(name).load());
        objectHashMap.put(name, o);
    }

    protected void removePane(String name) {
        fxmlLoaderHashMap.remove(name);
        paneHashMap.remove(name);
        objectHashMap.remove(name);
    }

    protected FXMLLoader getReference(String name) {
//        return currentObject;
        return fxmlLoaderHashMap.get(name);
    }

    protected void activate(String name){
        scene.setRoot(paneHashMap.get(name));
//        currentPane = paneHashMap.get(name);
//        currentObject = objectHashMap.get(name);
    }
}
