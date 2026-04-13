package com.houarizegai.spygen.global;

import java.io.File;

public class Utils {

    public static void deleteFolderContent(final File folder) {
        File[] files = folder.listFiles();
        if (files == null) return;
        for (final File fileEntry : files) {
            if (fileEntry.isDirectory()) {
                deleteFolderContent(fileEntry);
            } else {
                fileEntry.delete();
            }
        }
    }

    public static boolean isValidMail(String mail) {
        if(mail == null)
            return false;

        return mail.trim().matches("[a-zA-Z_][\\w]*[-]{0,4}[\\w]+@[a-zA-Z0-9]+.[a-zA-Z]{2,6}");
    }
}
