package com.jiongbull.jlog.util;

import android.text.TextUtils;
import android.util.Log;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class FileUtils {
    public static final String ZIP_EXT = ".zip";

    private FileUtils() {
    }

    public static boolean isExist(String str) {
        return isExist(new File(str));
    }

    public static boolean isExist(File file) {
        return file.exists();
    }

    public static boolean createDir(String str) {
        File file = new File(str);
        if (!file.exists()) {
            return file.mkdirs();
        }
        return file.exists();
    }

    public static long calSize(String str) {
        return calSize(new File(str));
    }

    public static long calSize(File file) {
        long j;
        long j2 = 0;
        if (file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                if (file2.isDirectory()) {
                    j = calSize(file2);
                } else {
                    j = file2.length();
                }
                j2 += j;
            }
            return j2;
        } else if (file.isFile()) {
            return 0 + file.length();
        } else {
            return 0;
        }
    }

    public static void zip(String str, String str2, boolean z) throws IOException {
        ZipOutputStream zipOutputStream = null;
        try {
            ZipOutputStream zipOutputStream2 = new ZipOutputStream(new FileOutputStream(str2));
            try {
                File file = new File(str);
                zip(zipOutputStream2, file, (String) null);
                if (z && !delete(file)) {
                    Log.e("ContentValues", "delete file failed");
                }
                IOUtils.closeQuietly(zipOutputStream2);
            } catch (Throwable th) {
                th = th;
                zipOutputStream = zipOutputStream2;
                IOUtils.closeQuietly(zipOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            IOUtils.closeQuietly(zipOutputStream);
            throw th;
        }
    }

    private static void zip(ZipOutputStream zipOutputStream, File file, String str) throws IOException {
        String name = file.getName();
        if (!TextUtils.isEmpty(str)) {
            name = str + File.separator + file.getName();
        }
        if (file.isDirectory()) {
            for (File zip : file.listFiles()) {
                zip(zipOutputStream, zip, name);
            }
            return;
        }
        BufferedInputStream bufferedInputStream = null;
        try {
            byte[] bArr = new byte[1024];
            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(file), 1024);
            try {
                zipOutputStream.putNextEntry(new ZipEntry(name));
                while (true) {
                    int read = bufferedInputStream2.read(bArr, 0, 1024);
                    if (read != -1) {
                        zipOutputStream.write(bArr, 0, read);
                    } else {
                        zipOutputStream.closeEntry();
                        IOUtils.closeQuietly(bufferedInputStream2);
                        return;
                    }
                }
            } catch (Throwable th) {
                th = th;
                bufferedInputStream = bufferedInputStream2;
                IOUtils.closeQuietly(bufferedInputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            IOUtils.closeQuietly(bufferedInputStream);
            throw th;
        }
    }

    public static File[] getZipFiles(File file) {
        return file.listFiles(new FilenameFilter() {
            public boolean accept(File file, String str) {
                return str.endsWith(FileUtils.ZIP_EXT);
            }
        });
    }

    public static boolean delete(File file) {
        if (!file.isDirectory()) {
            return file.delete();
        }
        boolean z = true;
        for (File delete : file.listFiles()) {
            z &= delete(delete);
        }
        return z;
    }

    public static void sortByModifyDate(File[] fileArr) {
        Arrays.sort(fileArr, new Comparator<File>() {
            public int compare(File file, File file2) {
                long lastModified = file.lastModified() - file2.lastModified();
                if (lastModified > 0) {
                    return 1;
                }
                return lastModified == 0 ? 0 : -1;
            }
        });
    }

    public static void sortByModifyDateDesc(File[] fileArr) {
        Arrays.sort(fileArr, new Comparator<File>() {
            public int compare(File file, File file2) {
                long lastModified = file.lastModified() - file2.lastModified();
                if (lastModified > 0) {
                    return 1;
                }
                return lastModified == 0 ? 0 : -1;
            }
        });
    }
}
