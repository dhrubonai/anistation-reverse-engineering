package defpackage;

import java.nio.charset.StandardCharsets;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class kh7 {
    static {
        int i = se7.a;
    }

    public static boolean a(byte[] bArr, int i, int i2) {
        while (i < i2 && bArr[i] >= 0) {
            i++;
        }
        if (i >= i2) {
            return true;
        }
        while (i < i2) {
            int i3 = i + 1;
            byte b = bArr[i];
            if (b < 0) {
                if (b < -32) {
                    if (i3 < i2 && b >= -62) {
                        i += 2;
                        if (bArr[i3] > -65) {
                        }
                    }
                    return false;
                }
                if (b < -16) {
                    if (i3 >= i2 - 1) {
                        return false;
                    }
                    int i4 = i + 2;
                    byte b2 = bArr[i3];
                    if (b2 > -65 || (b == -32 && b2 < -96)) {
                        return false;
                    }
                    if (b == -19 && b2 >= -96) {
                        return false;
                    }
                    i += 3;
                    if (bArr[i4] > -65) {
                        return false;
                    }
                } else {
                    if (i3 >= i2 - 2) {
                        return false;
                    }
                    int i5 = i + 2;
                    byte b3 = bArr[i3];
                    if (b3 <= -65) {
                        if ((((b3 + 112) + (b << 28)) >> 30) == 0) {
                            int i6 = i + 3;
                            if (bArr[i5] <= -65) {
                                i += 4;
                                if (bArr[i6] > -65) {
                                }
                            }
                        }
                    }
                    return false;
                }
            } else {
                i = i3;
            }
        }
        return true;
    }

    public static int b(String str) {
        int length = str.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && str.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = str.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                try {
                    int length2 = str.length();
                    while (i2 < length2) {
                        char charAt2 = str.charAt(i2);
                        if (charAt2 < 2048) {
                            i += (127 - charAt2) >>> 31;
                        } else {
                            i += 2;
                            if (charAt2 >= 55296 && charAt2 <= 57343) {
                                if (Character.codePointAt(str, i2) >= 65536) {
                                    i2++;
                                } else {
                                    throw new Exception(m97.b(length2, i2, (byte) 32, "Unpaired surrogate at index ", " of "));
                                }
                            }
                        }
                        i2++;
                    }
                    i3 += i;
                } catch (jh7 unused) {
                    return str.getBytes(StandardCharsets.UTF_8).length;
                }
            }
        }
        if (i3 >= length) {
            return i3;
        }
        long j = i3 + 4294967296L;
        StringBuilder sb = new StringBuilder(String.valueOf(j).length() + 34);
        sb.append("UTF-8 length does not fit in int: ");
        sb.append(j);
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001f, code lost:
    
        return r13 + r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int c(java.lang.String r11, byte[] r12, int r13, int r14) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kh7.c(java.lang.String, byte[], int, int):int");
    }

    public static String d(byte[] bArr, int i, int i2) {
        if (i2 != 0) {
            int length = bArr.length;
            if ((((length - i) - i2) | i | i2) >= 0) {
                int i3 = i + i2;
                char[] cArr = new char[i2];
                int i4 = 0;
                while (i < i3) {
                    byte b = bArr[i];
                    if (b < 0) {
                        break;
                    }
                    i++;
                    cArr[i4] = (char) b;
                    i4++;
                }
                while (i < i3) {
                    int i5 = i + 1;
                    byte b2 = bArr[i];
                    if (b2 >= 0) {
                        cArr[i4] = (char) b2;
                        i4++;
                        i = i5;
                        while (i < i3) {
                            byte b3 = bArr[i];
                            if (b3 >= 0) {
                                i++;
                                cArr[i4] = (char) b3;
                                i4++;
                            }
                        }
                    } else if (b2 < -32) {
                        if (i5 < i3) {
                            int i6 = i4 + 1;
                            i += 2;
                            byte b4 = bArr[i5];
                            if (b2 >= -62 && !xt5.k(b4)) {
                                cArr[i4] = (char) ((b4 & 63) | ((b2 & 31) << 6));
                                i4 = i6;
                            } else {
                                jz7.e("Protocol message had invalid UTF-8.");
                                return null;
                            }
                        } else {
                            jz7.e("Protocol message had invalid UTF-8.");
                            return null;
                        }
                    } else {
                        if (b2 < -16) {
                            if (i5 < i3 - 1) {
                                int i7 = i4 + 1;
                                int i8 = i + 2;
                                byte b5 = bArr[i5];
                                i += 3;
                                byte b6 = bArr[i8];
                                if (!xt5.k(b5)) {
                                    if (b2 == -32) {
                                        if (b5 >= -96) {
                                            b2 = -32;
                                        }
                                    }
                                    if (b2 == -19) {
                                        if (b5 < -96) {
                                            b2 = -19;
                                        }
                                    }
                                    if (!xt5.k(b6)) {
                                        cArr[i4] = (char) (((b5 & 63) << 6) | ((b2 & 15) << 12) | (b6 & 63));
                                        i4 = i7;
                                    }
                                }
                                jz7.e("Protocol message had invalid UTF-8.");
                                return null;
                            }
                            jz7.e("Protocol message had invalid UTF-8.");
                            return null;
                        }
                        if (i5 < i3 - 2) {
                            byte b7 = bArr[i5];
                            int i9 = i + 3;
                            byte b8 = bArr[i + 2];
                            i += 4;
                            byte b9 = bArr[i9];
                            if (!xt5.k(b7)) {
                                if ((((b7 + 112) + (b2 << 28)) >> 30) == 0 && !xt5.k(b8) && !xt5.k(b9)) {
                                    int i10 = ((b7 & 63) << 12) | ((b2 & 7) << 18) | ((b8 & 63) << 6) | (b9 & 63);
                                    cArr[i4] = (char) ((i10 >>> 10) + 55232);
                                    cArr[i4 + 1] = (char) ((i10 & 1023) + 56320);
                                    i4 += 2;
                                }
                            }
                            jz7.e("Protocol message had invalid UTF-8.");
                            return null;
                        }
                        jz7.e("Protocol message had invalid UTF-8.");
                        return null;
                    }
                }
                return new String(cArr, 0, i4);
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i), Integer.valueOf(i2)));
        }
        return "";
    }
}
