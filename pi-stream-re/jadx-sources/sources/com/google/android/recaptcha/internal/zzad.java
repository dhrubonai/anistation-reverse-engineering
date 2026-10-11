package com.google.android.recaptcha.internal;

import android.content.Context;
import g7.a;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import r6.h0;
import x6.i;

/* loaded from: classes.dex */
public final class zzad {
    private final Context zza;

    public zzad(Context context) {
        this.zza = context;
    }

    public static final byte[] zza(File file) {
        h0.u(file, "<this>");
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            long length = file.length();
            if (length <= 2147483647L) {
                int i10 = (int) length;
                byte[] bArr = new byte[i10];
                int i11 = i10;
                int i12 = 0;
                while (i11 > 0) {
                    int read = fileInputStream.read(bArr, i12, i11);
                    if (read < 0) {
                        break;
                    }
                    i11 -= read;
                    i12 += read;
                }
                if (i11 > 0) {
                    bArr = Arrays.copyOf(bArr, i12);
                    h0.s(bArr, "copyOf(...)");
                } else {
                    int read2 = fileInputStream.read();
                    if (read2 != -1) {
                        a aVar = new a();
                        aVar.write(read2);
                        byte[] bArr2 = new byte[8192];
                        for (int read3 = fileInputStream.read(bArr2); read3 >= 0; read3 = fileInputStream.read(bArr2)) {
                            aVar.write(bArr2, 0, read3);
                        }
                        int size = aVar.size() + i10;
                        if (size >= 0) {
                            byte[] a10 = aVar.a();
                            bArr = Arrays.copyOf(bArr, size);
                            h0.s(bArr, "copyOf(...)");
                            i.h1(a10, i10, bArr, 0, aVar.size());
                        } else {
                            throw new OutOfMemoryError("File " + file + " is too big to fit in memory.");
                        }
                    }
                }
                h0.A(fileInputStream, null);
                return bArr;
            }
            throw new OutOfMemoryError("File " + file + " is too big (" + length + " bytes) to fit in memory.");
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                h0.A(fileInputStream, th);
                throw th2;
            }
        }
    }

    public static final void zzb(File file, byte[] bArr) {
        if (file.exists() && !file.delete()) {
            throw new IOException("Unable to delete existing encrypted file");
        }
        h0.u(bArr, "array");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            fileOutputStream.write(bArr);
            h0.A(fileOutputStream, null);
        } finally {
        }
    }
}
