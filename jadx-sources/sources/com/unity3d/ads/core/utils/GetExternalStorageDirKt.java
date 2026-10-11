package com.unity3d.ads.core.utils;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.storage.StorageManager;
import android.os.storage.StorageVolume;
import defpackage.a34;
import java.io.File;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class GetExternalStorageDirKt {
    public static final File getExternalStorageDir(Context context) {
        context.getClass();
        if (Build.VERSION.SDK_INT >= 30) {
            return primaryStorageVolumeDir(context);
        }
        return legacyExternalStorageDir();
    }

    public static final File legacyExternalStorageDir() {
        String externalStorageState = Environment.getExternalStorageState();
        if (!a34.i(externalStorageState, "mounted") && !a34.i(externalStorageState, "mounted_ro")) {
            return null;
        }
        return Environment.getExternalStorageDirectory();
    }

    public static final File primaryStorageVolumeDir(Context context) {
        StorageVolume primaryStorageVolume;
        File directory;
        context.getClass();
        StorageManager storageManager = (StorageManager) context.getSystemService(StorageManager.class);
        if (storageManager != null && (primaryStorageVolume = storageManager.getPrimaryStorageVolume()) != null) {
            directory = primaryStorageVolume.getDirectory();
            return directory;
        }
        return null;
    }
}
