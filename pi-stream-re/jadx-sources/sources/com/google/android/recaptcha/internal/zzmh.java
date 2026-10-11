package com.google.android.recaptcha.internal;

import android.util.Base64;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* loaded from: classes.dex */
public final class zzmh {
    protected static final Charset zza = StandardCharsets.UTF_16;

    public static int zza(int i10, int i11) {
        if (i10 % 2 != 0) {
            return (i10 | i11) - (i10 & i11);
        }
        return ((~i10) & i11) | ((~i11) & i10);
    }

    public static String zzb(String str, byte[] bArr, zzmi zzmiVar) {
        int i10 = 0;
        byte[] decode = Base64.decode(str, 0);
        char c6 = '\f';
        byte[] bArr2 = new byte[12];
        int length = decode.length - 12;
        byte[] bArr3 = new byte[length];
        System.arraycopy(decode, 0, bArr2, 0, 12);
        System.arraycopy(decode, 12, bArr3, 0, length);
        int[] iArr = {511133343, 1277647508, 107287496, 338123662};
        if (bArr.length == 32) {
            int i11 = 16;
            int[] iArr2 = new int[16];
            for (int i12 = 0; i12 < 4; i12++) {
                iArr2[i12] = zza(iArr[i12], 2131181306);
            }
            for (int i13 = 4; i13 < 12; i13++) {
                iArr2[i13] = zze(bArr, (i13 - 4) * 4);
            }
            iArr2[12] = 1;
            for (int i14 = 13; i14 < 16; i14++) {
                iArr2[i14] = zze(bArr2, (i14 - 13) * 4);
            }
            int[] iArr3 = new int[16];
            System.arraycopy(iArr2, 0, iArr3, 0, 16);
            byte[] bArr4 = new byte[length];
            int i15 = 1;
            int i16 = length;
            int i17 = 0;
            while (i16 > 0) {
                System.arraycopy(iArr3, i10, iArr2, i10, i11);
                iArr2[c6] = i15;
                int i18 = i10;
                while (i18 < 10) {
                    int[] iArr4 = iArr3;
                    int i19 = i15;
                    zzc(0, 4, 8, 12, iArr, bArr, bArr2, i19, iArr2, iArr4);
                    zzc(1, 5, 9, 13, iArr, bArr, bArr2, i19, iArr2, iArr4);
                    zzc(2, 6, 10, 14, iArr, bArr, bArr2, i19, iArr2, iArr4);
                    zzc(3, 7, 11, 15, iArr, bArr, bArr2, i19, iArr2, iArr4);
                    zzc(0, 5, 10, 15, iArr, bArr, bArr2, i19, iArr2, iArr4);
                    zzc(1, 6, 11, 12, iArr, bArr, bArr2, i19, iArr2, iArr4);
                    zzc(2, 7, 8, 13, iArr, bArr, bArr2, i19, iArr2, iArr4);
                    zzc(3, 4, 9, 14, iArr, bArr, bArr2, i19, iArr2, iArr4);
                    i18++;
                    i11 = i11;
                    i16 = i16;
                    bArr4 = bArr4;
                    iArr3 = iArr4;
                }
                int i20 = i16;
                byte[] bArr5 = bArr4;
                int[] iArr5 = iArr3;
                int[] iArr6 = iArr2;
                int i21 = i11;
                byte[] bArr6 = new byte[64];
                for (int i22 = 0; i22 < i21; i22++) {
                    int i23 = iArr6[i22];
                    int i24 = i22 * 4;
                    bArr6[i24] = (byte) (i23 & 255);
                    bArr6[i24 + 1] = (byte) ((i23 >> 8) & 255);
                    bArr6[i24 + 2] = (byte) ((i23 >> 16) & 255);
                    bArr6[i24 + 3] = (byte) ((i23 >> 24) & 255);
                }
                for (int i25 = 0; i25 < Math.min(64, i20); i25++) {
                    int i26 = i17 + i25;
                    bArr5[i26] = (byte) zza(bArr6[i25], bArr3[i26]);
                }
                i15++;
                i16 = i20 - 64;
                i17 += 64;
                i11 = i21;
                bArr4 = bArr5;
                iArr3 = iArr5;
                iArr2 = iArr6;
                i10 = 0;
                c6 = '\f';
            }
            return new String(bArr4, zza);
        }
        throw new IllegalArgumentException();
    }

    public static final void zzc(int i10, int i11, int i12, int i13, int[] iArr, byte[] bArr, byte[] bArr2, int i14, int[] iArr2, int[] iArr3) {
        zzd(i10, i11, i13, 16, iArr, bArr, bArr2, i14, iArr2, iArr3);
        zzd(i12, i13, i11, 12, iArr, bArr, bArr2, i14, iArr2, iArr3);
        zzd(i10, i11, i13, 8, iArr, bArr, bArr2, i14, iArr2, iArr3);
        zzd(i12, i13, i11, 7, iArr, bArr, bArr2, i14, iArr2, iArr3);
    }

    public static final void zzd(int i10, int i11, int i12, int i13, int[] iArr, byte[] bArr, byte[] bArr2, int i14, int[] iArr2, int[] iArr3) {
        int i15 = iArr2[i10] + iArr2[i11];
        iArr2[i10] = i15;
        int zza2 = zza(iArr2[i12], i15);
        iArr2[i12] = (zza2 << i13) | (zza2 >>> (32 - i13));
    }

    private static final int zze(byte[] bArr, int i10) {
        int i11 = bArr[i10] & 255;
        int i12 = bArr[i10 + 1] & 255;
        int i13 = bArr[i10 + 2] & 255;
        return ((bArr[i10 + 3] & 255) << 24) | (i12 << 8) | i11 | (i13 << 16);
    }
}
