package com.diary;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;

public class FileHandler {

    public static void saveEntry(
            DiaryEntry entry) {

        try {

            BufferedWriter writer =
                    new BufferedWriter(
                            new FileWriter(
                                    "diary.txt",
                                    true));

            writer.write(
                    "Date: "
                            + entry.getDate());

            writer.newLine();

            writer.write(
                    "Content: "
                            + entry.getContent());

            writer.newLine();

            writer.write(
                    "Important: "
                            + entry.isImportant());

            writer.newLine();

            writer.write(
                    "------------------------");

            writer.newLine();

            writer.close();

        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    public static void overwriteFile(
            ArrayList<String> lines) {

        try {

            BufferedWriter writer =
                    new BufferedWriter(
                            new FileWriter(
                                    "diary.txt"));

            for (String line : lines) {

                writer.write(line);

                writer.newLine();
            }

            writer.close();

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}