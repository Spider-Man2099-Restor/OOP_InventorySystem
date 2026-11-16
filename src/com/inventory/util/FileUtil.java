package com.inventory.util;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FileUtil {

    //CreateFile
    public static void createStartupFile(String fileName) {
        File file = new File(fileName);
    }

    /**
     *
     * @param fileName
     * @return
     * @throws java.io.IOException
     */
    //Reader
    public static List<String> readLines(String fileName) throws IOException {
        return Files.readAllLines(Path.of(fileName));
    }

    //Write to user file
    public static void appendLine(String fileName, String line) throws IOException {
        Files.writeString(
                Path.of(fileName),
                line + System.lineSeparator(),
                StandardOpenOption.CREATE,
                StandardOpenOption.APPEND
        );
    }

    public static void writeAllLines(String fileName, List<String> lines) throws IOException {
        java.nio.file.Files.write(
                java.nio.file.Path.of(fileName),
                lines,
                java.nio.file.StandardOpenOption.CREATE,
                java.nio.file.StandardOpenOption.TRUNCATE_EXISTING
        );
    } 
}
