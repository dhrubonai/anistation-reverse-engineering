package com.google.android.gms.internal.p002firebaseauthapi;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class zzajc {
    public static final byte[] zzb;
    private static final ByteBuffer zze;
    private static final zzaib zzf;
    private static final Charset zzc = Charset.forName("US-ASCII");
    static final Charset zza = Charset.forName("UTF-8");
    private static final Charset zzd = Charset.forName("ISO-8859-1");

    static {
        byte[] bArr = new byte[0];
        zzb = bArr;
        zze = ByteBuffer.wrap(bArr);
        zzf = zzaib.zza(bArr, 0, bArr.length, false);
    }

    public static int zza(long j4) {
        return (int) (j4 ^ (j4 >>> 32));
    }

    public static String zzb(byte[] bArr) {
        return new String(bArr, zza);
    }

    public static boolean zzc(byte[] bArr) {
        return zzaml.zza(bArr);
    }

    public static int zza(boolean z9) {
        return z9 ? 1231 : 1237;
    }

    public static int zza(byte[] bArr) {
        int length = bArr.length;
        int zza2 = zza(length, bArr, 0, length);
        if (zza2 == 0) {
            return 1;
        }
        return zza2;
    }

    public static int zza(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }

    public static <T> T zza(T t9) {
        t9.getClass();
        return t9;
    }

    public static <T> T zza(T t9, String str) {
        if (t9 != null) {
            return t9;
        }
        throw new NullPointerException(str);
    }

    public static boolean zza(zzakk zzakkVar) {
        if (!(zzakkVar instanceof zzahe)) {
            return false;
        }
        return false;
    }
}
