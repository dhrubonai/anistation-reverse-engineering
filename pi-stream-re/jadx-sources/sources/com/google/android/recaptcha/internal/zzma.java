package com.google.android.recaptcha.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzma {
    private static final zzlx zza;

    static {
        if (zzlv.zzx() && zzlv.zzy()) {
            int i10 = zzgi.zza;
        }
        zza = new zzly();
    }

    public static /* bridge */ /* synthetic */ int zza(byte[] bArr, int i10, int i11) {
        int i12 = i11 - i10;
        byte b10 = bArr[i10 - 1];
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 == 2) {
                    byte b11 = bArr[i10];
                    byte b12 = bArr[i10 + 1];
                    if (b10 <= -12 && b11 <= -65 && b12 <= -65) {
                        return (b12 << 16) ^ ((b11 << 8) ^ b10);
                    }
                    return -1;
                }
                throw new AssertionError();
            }
            byte b13 = bArr[i10];
            if (b10 <= -12 && b13 <= -65) {
                return (b13 << 8) ^ b10;
            }
            return -1;
        }
        if (b10 <= -12) {
            return b10;
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00fe, code lost:
    
        return r10 + r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int zzb(java.lang.CharSequence r8, byte[] r9, int r10, int r11) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzma.zzb(java.lang.CharSequence, byte[], int, int):int");
    }

    public static int zzc(CharSequence charSequence) {
        int length = charSequence.length();
        int i10 = 0;
        int i11 = 0;
        while (i11 < length && charSequence.charAt(i11) < 128) {
            i11++;
        }
        int i12 = length;
        while (true) {
            if (i11 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i11);
            if (charAt < 2048) {
                i12 += (127 - charAt) >>> 31;
                i11++;
            } else {
                int length2 = charSequence.length();
                while (i11 < length2) {
                    char charAt2 = charSequence.charAt(i11);
                    if (charAt2 < 2048) {
                        i10 += (127 - charAt2) >>> 31;
                    } else {
                        i10 += 2;
                        if (charAt2 >= 55296 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i11) >= 65536) {
                                i11++;
                            } else {
                                throw new zzlz(i11, length2);
                            }
                        }
                    }
                    i11++;
                }
                i12 += i10;
            }
        }
        if (i12 >= length) {
            return i12;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i12 + 4294967296L));
    }

    public static String zzd(byte[] bArr, int i10, int i11) {
        int length = bArr.length;
        if ((((length - i10) - i11) | i10 | i11) >= 0) {
            int i12 = i10 + i11;
            char[] cArr = new char[i11];
            int i13 = 0;
            while (i10 < i12) {
                byte b10 = bArr[i10];
                if (!zzlw.zzd(b10)) {
                    break;
                }
                i10++;
                cArr[i13] = (char) b10;
                i13++;
            }
            while (i10 < i12) {
                int i14 = i10 + 1;
                byte b11 = bArr[i10];
                if (zzlw.zzd(b11)) {
                    int i15 = i13 + 1;
                    cArr[i13] = (char) b11;
                    i10 = i14;
                    while (true) {
                        i13 = i15;
                        if (i10 < i12) {
                            byte b12 = bArr[i10];
                            if (zzlw.zzd(b12)) {
                                i10++;
                                i15 = i13 + 1;
                                cArr[i13] = (char) b12;
                            }
                        }
                    }
                } else if (b11 < -32) {
                    if (i14 < i12) {
                        zzlw.zzc(b11, bArr[i14], cArr, i13);
                        i13++;
                        i10 = i14 + 1;
                    } else {
                        throw zzje.zzd();
                    }
                } else if (b11 < -16) {
                    if (i14 < i12 - 1) {
                        int i16 = i14 + 1;
                        zzlw.zzb(b11, bArr[i14], bArr[i16], cArr, i13);
                        i13++;
                        i10 = i16 + 1;
                    } else {
                        throw zzje.zzd();
                    }
                } else if (i14 < i12 - 2) {
                    int i17 = i14 + 1;
                    byte b13 = bArr[i14];
                    int i18 = i17 + 1;
                    zzlw.zza(b11, b13, bArr[i17], bArr[i18], cArr, i13);
                    i13 += 2;
                    i10 = i18 + 1;
                } else {
                    throw zzje.zzd();
                }
            }
            return new String(cArr, 0, i13);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i10), Integer.valueOf(i11)));
    }

    public static boolean zze(byte[] bArr) {
        return zza.zzb(bArr, 0, bArr.length);
    }

    public static boolean zzf(byte[] bArr, int i10, int i11) {
        return zza.zzb(bArr, i10, i11);
    }
}
