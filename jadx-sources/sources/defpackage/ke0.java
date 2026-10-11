package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class ke0 implements v11 {
    public final /* synthetic */ byte x = 1;
    public final l11 y;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, u05] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    public ke0(l11 l11Var, wc0 wc0Var, String str, Long l) {
        char c;
        boolean z;
        l11Var.getClass();
        this.y = l11Var;
        yd0 yd0Var = f34.a;
        jz0 jz0Var = hz0.a;
        boolean z2 = true;
        if (uz5.j0(str, "multipart/", true)) {
            int length = str.length();
            int i = 0;
            char c2 = 0;
            int i2 = 0;
            while (true) {
                if (i < length) {
                    char charAt = str.charAt(i);
                    if (c2 != 0) {
                        if (c2 != 1) {
                            if (c2 != 2) {
                                if (c2 != 3) {
                                    if (c2 != 4) {
                                    }
                                    c2 = 3;
                                } else {
                                    if (charAt != '\"') {
                                        if (charAt == '\\') {
                                            c2 = 4;
                                        }
                                    }
                                    c2 = 1;
                                }
                            } else {
                                if (charAt != '\"') {
                                    if (charAt != ',') {
                                        if (charAt != ';') {
                                        }
                                        c2 = 1;
                                    }
                                    c2 = 0;
                                }
                                c2 = 3;
                            }
                        } else if (charAt == '=') {
                            c2 = 2;
                        } else if (charAt != ';') {
                            if (charAt != ',') {
                                if (charAt == ' ') {
                                    continue;
                                } else {
                                    if (i2 == 0) {
                                        z = 2;
                                        c = '\"';
                                        if (uz5.b0(str, i, "boundary=", 0, 9, true)) {
                                            break;
                                        }
                                    }
                                    i2++;
                                }
                            }
                            c2 = 0;
                        }
                    } else {
                        i = charAt != ';' ? i + 1 : i;
                        c2 = 1;
                    }
                    i2 = 0;
                } else {
                    c = '\"';
                    z = 2;
                    i = -1;
                    break;
                }
            }
            if (i != -1) {
                int i3 = i + 9;
                byte[] bArr = new byte[74];
                ?? obj = new Object();
                f34.a(obj, bArr, (byte) 13);
                f34.a(obj, bArr, (byte) 10);
                f34.a(obj, bArr, (byte) 45);
                f34.a(obj, bArr, (byte) 45);
                int length2 = str.length();
                ?? r9 = 0;
                while (i3 < length2) {
                    char charAt2 = str.charAt(i3);
                    int i4 = 65535 & charAt2;
                    r9 = r9;
                    if (i4 <= 127) {
                        if (r9 != 0) {
                            if (r9 != z2) {
                                if (r9 != z) {
                                    if (r9 == 3) {
                                        f34.a(obj, bArr, (byte) i4);
                                        r9 = z;
                                    }
                                } else {
                                    if (charAt2 == c) {
                                        break;
                                    }
                                    if (charAt2 != '\\') {
                                        f34.a(obj, bArr, (byte) i4);
                                        r9 = r9;
                                    } else {
                                        r9 = 3;
                                    }
                                }
                                i3++;
                                z2 = true;
                                r9 = r9;
                            } else {
                                if (charAt2 == ' ' || charAt2 == ',' || charAt2 == ';') {
                                    break;
                                }
                                f34.a(obj, bArr, (byte) i4);
                                i3++;
                                z2 = true;
                                r9 = r9;
                            }
                        } else {
                            if (charAt2 == ' ') {
                                continue;
                            } else if (charAt2 != c) {
                                if (charAt2 == ',' || charAt2 == ';') {
                                    break;
                                }
                                f34.a(obj, bArr, (byte) i4);
                                r9 = 1;
                            } else {
                                r9 = z;
                            }
                            i3++;
                            z2 = true;
                            r9 = r9;
                        }
                    } else {
                        t80.z(16);
                        String num = Integer.toString(i4, 16);
                        num.getClass();
                        throw new IOException("Failed to parse multipart: wrong boundary byte 0x" + num + " - should be 7bit character");
                    }
                }
                int i5 = obj.x;
                if (i5 != 4) {
                    byte[] C0 = ms.C0(bArr, 0, i5);
                    n77.X(this, null, new b34(wc0Var, new yd0(C0, 0, C0.length), l, null), 3);
                    return;
                } else {
                    qi2.k("Empty multipart boundary is not allowed");
                    throw null;
                }
            }
            qi2.k("Failed to parse multipart: Content-Type's boundary parameter is missing");
            throw null;
        }
        throw new IOException("Failed to parse multipart: Content-Type should be multipart/* but it is " + ((Object) str));
    }

    @Override // defpackage.v11
    public final l11 getCoroutineContext() {
        switch (this.x) {
            case 0:
                return this.y;
            default:
                return this.y;
        }
    }

    public String toString() {
        switch (this.x) {
            case 1:
                return "CoroutineScope(coroutineContext=" + this.y + ')';
            default:
                return super.toString();
        }
    }

    public ke0(l11 l11Var) {
        this.y = l11Var;
    }
}
