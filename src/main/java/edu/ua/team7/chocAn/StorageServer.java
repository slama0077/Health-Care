package edu.ua.team7.chocAn;

import java.io.*;
import java.util.HashMap;

public class StorageServer {

    private static final String FILE_NAME = "storage_data.ser";
    private HashMap<String, Object> storageData;

    @SuppressWarnings("unchecked")
    public StorageServer() {
        try {
            FileInputStream fis = new FileInputStream(FILE_NAME);
            ObjectInputStream ois = new ObjectInputStream(fis);
            storageData = (HashMap<String, Object>) ois.readObject();
            ois.close();
            fis.close();
        } catch (IOException | ClassNotFoundException e) {
            storageData = new HashMap<>();
        }
    }

    public void saveData() {
        try {
            FileOutputStream fos = new FileOutputStream(FILE_NAME);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(storageData);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Object getData(String key) {
        return storageData.get(key);
    }

    public void setData(String key, Object data) {
        storageData.put(key, data);
    }
}
