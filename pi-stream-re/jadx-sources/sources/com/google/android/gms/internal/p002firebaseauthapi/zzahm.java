package com.google.android.gms.internal.p002firebaseauthapi;

import a3.g;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class zzahm implements Serializable, Iterable<Byte> {
    public static final zzahm zza = new zzahw(zzajc.zzb);
    private static final zzaht zzb = new zzahz();
    private static final Comparator<zzahm> zzc = new zzaho();
    private int zzd = 0;

    public static /* synthetic */ int zza(byte b10) {
        return b10 & 255;
    }

    public static zzahm zzb(byte[] bArr) {
        return new zzahw(bArr);
    }

    public static zzahv zzc(int i10) {
        return new zzahv(i10);
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i10 = this.zzd;
        if (i10 == 0) {
            int zzb2 = zzb();
            i10 = zzb(zzb2, 0, zzb2);
            if (i10 == 0) {
                i10 = 1;
            }
            this.zzd = i10;
        }
        return i10;
    }

    @Override // java.lang.Iterable
    public /* synthetic */ Iterator<Byte> iterator() {
        return new zzahp(this);
    }

    public final String toString() {
        String s9;
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(zzb());
        if (zzb() <= 50) {
            s9 = zzalx.zza(this);
        } else {
            s9 = g.s(zzalx.zza(zza(0, 47)), "...");
        }
        objArr[2] = s9;
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    public abstract byte zza(int i10);

    public abstract zzahm zza(int i10, int i11);

    public abstract String zza(Charset charset);

    public abstract void zza(zzahn zzahnVar);

    public abstract void zza(byte[] bArr, int i10, int i11, int i12);

    public abstract byte zzb(int i10);

    public abstract int zzb();

    public abstract int zzb(int i10, int i11, int i12);

    public abstract zzaib zzc();

    public final String zzd() {
        Charset charset = zzajc.zza;
        if (zzb() == 0) {
            return "";
        }
        return zza(charset);
    }

    public final boolean zze() {
        if (zzb() == 0) {
            return true;
        }
        return false;
    }

    public abstract boolean zzf();

    public final byte[] zzg() {
        int zzb2 = zzb();
        if (zzb2 == 0) {
            return zzajc.zzb;
        }
        byte[] bArr = new byte[zzb2];
        zza(bArr, 0, 0, zzb2);
        return bArr;
    }

    public static int zza(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            throw new IndexOutOfBoundsException(g.o("Beginning index: ", i10, " < 0"));
        }
        if (i11 < i10) {
            throw new IndexOutOfBoundsException(g.p("Beginning index larger than ending index: ", i10, ", ", i11));
        }
        throw new IndexOutOfBoundsException(g.p("End index: ", i11, " >= ", i12));
    }

    public final int zza() {
        return this.zzd;
    }

    public static zzahm zza(byte[] bArr) {
        return zza(bArr, 0, bArr.length);
    }

    public static zzahm zza(byte[] bArr, int i10, int i11) {
        zza(i10, i10 + i11, bArr.length);
        return new zzahw(zzb.zza(bArr, i10, i11));
    }

    public static zzahm zza(String str) {
        return new zzahw(str.getBytes(zzajc.zza));
    }
}
