package defpackage;

import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.InputStream;
import java.lang.reflect.InvocationHandler;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class nu5 implements s48 {
    public static final void a(boolean z, c45 c45Var, jb6 jb6Var, kd2 kd2Var, int i) {
        int i2;
        boolean z2;
        boolean z3;
        long j;
        float f;
        cd6 d;
        int i3;
        int i4;
        int i5;
        kd2Var.f0(-1344558920);
        if ((i & 6) == 0) {
            if (kd2Var.g(z)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (kd2Var.d(c45Var.ordinal())) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            if (kd2Var.h(jb6Var)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        boolean z4 = false;
        if ((i2 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (kd2Var.V(i2 & 1, z2)) {
            int i6 = i2 & 14;
            if (i6 == 4) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean f2 = z3 | kd2Var.f(jb6Var);
            Object Q = kd2Var.Q();
            q18 q18Var = au0.a;
            if (f2 || Q == q18Var) {
                Q = new gb6(jb6Var, z);
                kd2Var.n0(Q);
            }
            k96 k96Var = (k96) Q;
            boolean h = kd2Var.h(jb6Var);
            if (i6 == 4) {
                z4 = true;
            }
            boolean z5 = h | z4;
            Object Q2 = kd2Var.Q();
            if (z5 || Q2 == q18Var) {
                Q2 = new kb6(jb6Var, z);
                kd2Var.n0(Q2);
            }
            ad4 ad4Var = (ad4) Q2;
            boolean h2 = nd6.h(jb6Var.l().b);
            if (z) {
                j = jb6Var.l().b >> 32;
            } else {
                j = jb6Var.l().b & 4294967295L;
            }
            int i7 = (int) j;
            uf3 uf3Var = jb6Var.d;
            if (uf3Var != null && (d = uf3Var.d()) != null) {
                f = ov5.b(d.a, i7);
            } else {
                f = 0.0f;
            }
            float f3 = f;
            boolean h3 = kd2Var.h(k96Var);
            Object Q3 = kd2Var.Q();
            if (h3 || Q3 == q18Var) {
                Q3 = new ec(k96Var, (byte) 9);
                kd2Var.n0(Q3);
            }
            x97.h(ad4Var, z, c45Var, h2, 0L, f3, v36.a(vz3.x, k96Var, (PointerInputEventHandler) Q3), kd2Var, (i2 << 3) & 1008, 16);
        } else {
            kd2Var.Y();
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new de2(z, c45Var, jb6Var, i);
        }
    }

    public static String d(ByteBuffer byteBuffer, int i, int i2) {
        if ((i | i2 | ((byteBuffer.limit() - i) - i2)) >= 0) {
            int i3 = i + i2;
            char[] cArr = new char[i2];
            int i4 = 0;
            while (i < i3) {
                byte b = byteBuffer.get(i);
                if (b < 0) {
                    break;
                }
                i++;
                cArr[i4] = (char) b;
                i4++;
            }
            int i5 = i4;
            while (i < i3) {
                int i6 = i + 1;
                byte b2 = byteBuffer.get(i);
                if (b2 >= 0) {
                    int i7 = i5 + 1;
                    cArr[i5] = (char) b2;
                    int i8 = i6;
                    while (i8 < i3) {
                        byte b3 = byteBuffer.get(i8);
                        if (b3 < 0) {
                            break;
                        }
                        i8++;
                        cArr[i7] = (char) b3;
                        i7++;
                    }
                    i5 = i7;
                    i = i8;
                } else if (b2 < -32) {
                    if (i6 < i3) {
                        i += 2;
                        wt5.h(b2, byteBuffer.get(i6), cArr, i5);
                        i5++;
                    } else {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                } else if (b2 < -16) {
                    if (i6 < i3 - 1) {
                        int i9 = i + 2;
                        i += 3;
                        wt5.g(b2, byteBuffer.get(i6), byteBuffer.get(i9), cArr, i5);
                        i5++;
                    } else {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                } else if (i6 < i3 - 2) {
                    byte b4 = byteBuffer.get(i6);
                    int i10 = i + 3;
                    byte b5 = byteBuffer.get(i + 2);
                    i += 4;
                    wt5.f(b2, b4, b5, byteBuffer.get(i10), cArr, i5);
                    i5 += 2;
                } else {
                    throw InvalidProtocolBufferException.invalidUtf8();
                }
            }
            return new String(cArr, 0, i5);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)));
    }

    public static void g(String str, ByteBuffer byteBuffer) {
        int i;
        int length = str.length();
        int position = byteBuffer.position();
        int i2 = 0;
        while (i2 < length) {
            try {
                char charAt = str.charAt(i2);
                if (charAt >= 128) {
                    break;
                }
                byteBuffer.put(position + i2, (byte) charAt);
                i2++;
            } catch (IndexOutOfBoundsException unused) {
                p65.c(str.charAt(i2), Math.max(i2, (position - byteBuffer.position()) + 1) + byteBuffer.position());
                return;
            }
        }
        if (i2 == length) {
            byteBuffer.position(position + i2);
            return;
        }
        position += i2;
        while (i2 < length) {
            char charAt2 = str.charAt(i2);
            if (charAt2 < 128) {
                byteBuffer.put(position, (byte) charAt2);
            } else if (charAt2 < 2048) {
                int i3 = position + 1;
                try {
                    byteBuffer.put(position, (byte) ((charAt2 >>> 6) | 192));
                    byteBuffer.put(i3, (byte) ((charAt2 & '?') | 128));
                    position = i3;
                } catch (IndexOutOfBoundsException unused2) {
                    position = i3;
                    p65.c(str.charAt(i2), Math.max(i2, (position - byteBuffer.position()) + 1) + byteBuffer.position());
                    return;
                }
            } else {
                if (charAt2 >= 55296 && 57343 >= charAt2) {
                    int i4 = i2 + 1;
                    if (i4 != length) {
                        try {
                            char charAt3 = str.charAt(i4);
                            if (Character.isSurrogatePair(charAt2, charAt3)) {
                                int codePoint = Character.toCodePoint(charAt2, charAt3);
                                int i5 = position + 1;
                                try {
                                    byteBuffer.put(position, (byte) ((codePoint >>> 18) | 240));
                                    i = position + 2;
                                } catch (IndexOutOfBoundsException unused3) {
                                    position = i5;
                                    i2 = i4;
                                    p65.c(str.charAt(i2), Math.max(i2, (position - byteBuffer.position()) + 1) + byteBuffer.position());
                                    return;
                                }
                                try {
                                    byteBuffer.put(i5, (byte) (((codePoint >>> 12) & 63) | 128));
                                    position += 3;
                                    byteBuffer.put(i, (byte) (((codePoint >>> 6) & 63) | 128));
                                    byteBuffer.put(position, (byte) ((codePoint & 63) | 128));
                                    i2 = i4;
                                } catch (IndexOutOfBoundsException unused4) {
                                    i2 = i4;
                                    position = i;
                                    p65.c(str.charAt(i2), Math.max(i2, (position - byteBuffer.position()) + 1) + byteBuffer.position());
                                    return;
                                }
                            } else {
                                i2 = i4;
                            }
                        } catch (IndexOutOfBoundsException unused5) {
                        }
                    }
                    throw new yp6(i2, length);
                }
                int i6 = position + 1;
                byteBuffer.put(position, (byte) ((charAt2 >>> '\f') | 224));
                position += 2;
                byteBuffer.put(i6, (byte) (((charAt2 >>> 6) & 63) | 128));
                byteBuffer.put(position, (byte) ((charAt2 & '?') | 128));
            }
            i2++;
            position++;
        }
        byteBuffer.position(position);
    }

    public static InvocationHandler i() {
        return (InvocationHandler) Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, jp.b()).getDeclaredMethod("createWebViewProviderFactory", null).invoke(null, null);
    }

    public static final boolean j(jb6 jb6Var, boolean z) {
        ha3 c;
        uf3 uf3Var = jb6Var.d;
        if (uf3Var != null && (c = uf3Var.c()) != null) {
            return sw0.k(jb6Var.j(z), sw0.O(c));
        }
        return false;
    }

    public static int n(ByteBuffer byteBuffer, int i, int i2, int i3) {
        byte b;
        int i4;
        byte b2;
        int i5;
        int i6 = i2;
        if (i != 0) {
            if (i6 >= i3) {
                return i;
            }
            byte b3 = (byte) i;
            if (b3 < -32) {
                if (b3 >= -62) {
                    int i7 = i6 + 1;
                    if (byteBuffer.get(i6) <= -65) {
                        i6 = i7;
                    } else {
                        return -1;
                    }
                } else {
                    return -1;
                }
            } else if (b3 < -16) {
                byte b4 = (byte) (~(i >> 8));
                if (b4 == 0) {
                    i5 = i6 + 1;
                    b2 = byteBuffer.get(i6);
                    if (i5 >= i3) {
                        return aq6.d(b3, b2);
                    }
                } else {
                    b2 = b4;
                    i5 = i6;
                }
                if (b2 <= -65) {
                    if (b3 != -32 || b2 >= -96) {
                        if (b3 != -19 || b2 < -96) {
                            i6 = i5 + 1;
                            if (byteBuffer.get(i5) > -65) {
                                return -1;
                            }
                        } else {
                            return -1;
                        }
                    } else {
                        return -1;
                    }
                } else {
                    return -1;
                }
            } else {
                byte b5 = (byte) (~(i >> 8));
                if (b5 == 0) {
                    i4 = i6 + 1;
                    b5 = byteBuffer.get(i6);
                    if (i4 >= i3) {
                        return aq6.d(b3, b5);
                    }
                    b = 0;
                } else {
                    b = (byte) (i >> 16);
                    i4 = i6;
                }
                if (b == 0) {
                    int i8 = i4 + 1;
                    byte b6 = byteBuffer.get(i4);
                    if (i8 >= i3) {
                        return aq6.e(b3, b5, b6);
                    }
                    b = b6;
                    i4 = i8;
                }
                if (b5 <= -65) {
                    if ((((b5 + 112) + (b3 << 28)) >> 30) == 0 && b <= -65) {
                        i6 = i4 + 1;
                        if (byteBuffer.get(i4) > -65) {
                            return -1;
                        }
                    } else {
                        return -1;
                    }
                } else {
                    return -1;
                }
            }
        }
        nu5 nu5Var = aq6.a;
        int i9 = i3 - 7;
        int i10 = i6;
        while (i10 < i9 && (byteBuffer.getLong(i10) & (-9187201950435737472L)) == 0) {
            i10 += 8;
        }
        int i11 = (i10 - i6) + i6;
        while (i11 < i3) {
            int i12 = i11 + 1;
            byte b7 = byteBuffer.get(i11);
            if (b7 < 0) {
                if (b7 < -32) {
                    if (i12 >= i3) {
                        return b7;
                    }
                    if (b7 >= -62 && byteBuffer.get(i12) <= -65) {
                        i11 += 2;
                    } else {
                        return -1;
                    }
                } else if (b7 < -16) {
                    if (i12 >= i3 - 1) {
                        return aq6.f(byteBuffer, b7, i12, i3 - i12);
                    }
                    int i13 = i11 + 2;
                    byte b8 = byteBuffer.get(i12);
                    if (b8 <= -65) {
                        if (b7 != -32 || b8 >= -96) {
                            if ((b7 != -19 || b8 < -96) && byteBuffer.get(i13) <= -65) {
                                i11 += 3;
                            } else {
                                return -1;
                            }
                        } else {
                            return -1;
                        }
                    } else {
                        return -1;
                    }
                } else {
                    if (i12 >= i3 - 2) {
                        return aq6.f(byteBuffer, b7, i12, i3 - i12);
                    }
                    int i14 = i11 + 2;
                    byte b9 = byteBuffer.get(i12);
                    if (b9 <= -65) {
                        if ((((b9 + 112) + (b7 << 28)) >> 30) == 0) {
                            int i15 = i11 + 3;
                            if (byteBuffer.get(i14) <= -65) {
                                i11 += 4;
                                if (byteBuffer.get(i15) > -65) {
                                    return -1;
                                }
                            } else {
                                return -1;
                            }
                        } else {
                            return -1;
                        }
                    } else {
                        return -1;
                    }
                }
            } else {
                i11 = i12;
            }
        }
        return 0;
    }

    public static void p(MediaFormat mediaFormat, LogSessionId logSessionId) {
        lr3.g();
        if (!lr3.x(logSessionId)) {
            mediaFormat.setString("log-session-id", lr3.k(logSessionId));
        }
    }

    public static final String q(String str) {
        str.getClass();
        String p0 = uz5.p0(uz5.p0(str, '?'), '#');
        if (b06.A(p0, ".sup", true)) {
            return "application/x-sup";
        }
        if (b06.A(p0, ".srt", true)) {
            return "application/x-subrip";
        }
        if (b06.A(p0, ".ttml", true)) {
            return "application/ttml+xml";
        }
        if (!b06.A(p0, ".ass", true) && !b06.A(p0, ".ssa", true)) {
            return "text/vtt";
        }
        return "text/x-ssa";
    }

    public static void r(Object[] objArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr[i2] == null) {
                qi2.m(h11.g(i2, "at index ", new StringBuilder(String.valueOf(i2).length() + 9)));
                return;
            }
        }
    }

    public static final InputStream s(q48 q48Var) {
        n48 n48Var;
        i58 a = q48Var.a.a(q48Var.d);
        ArrayList arrayList = new ArrayList();
        arrayList.add(a);
        ArrayList arrayList2 = q48Var.c;
        if (!arrayList2.isEmpty()) {
            int i = n48.y;
            ArrayList arrayList3 = new ArrayList();
            Iterator it = arrayList2.iterator();
            if (!it.hasNext()) {
                if (!arrayList3.isEmpty()) {
                    n48Var = new n48(a, arrayList3);
                } else {
                    n48Var = null;
                }
                if (n48Var != null) {
                    arrayList.add(n48Var);
                }
            } else {
                throw qx1.f(it);
            }
        }
        Iterator it2 = q48Var.b.iterator();
        if (!it2.hasNext()) {
            Collections.reverse(arrayList);
            return (InputStream) arrayList.get(0);
        }
        if (it2.next() != null) {
            ov3.d();
            return null;
        }
        throw null;
    }

    public String b(byte[] bArr, int i, int i2) {
        if ((i | i2 | ((bArr.length - i) - i2)) >= 0) {
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
            int i5 = i4;
            while (i < i3) {
                int i6 = i + 1;
                byte b2 = bArr[i];
                if (b2 >= 0) {
                    int i7 = i5 + 1;
                    cArr[i5] = (char) b2;
                    int i8 = i6;
                    while (i8 < i3) {
                        byte b3 = bArr[i8];
                        if (b3 < 0) {
                            break;
                        }
                        i8++;
                        cArr[i7] = (char) b3;
                        i7++;
                    }
                    i5 = i7;
                    i = i8;
                } else if (b2 < -32) {
                    if (i6 < i3) {
                        i += 2;
                        wt5.h(b2, bArr[i6], cArr, i5);
                        i5++;
                    } else {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                } else if (b2 < -16) {
                    if (i6 < i3 - 1) {
                        int i9 = i + 2;
                        i += 3;
                        wt5.g(b2, bArr[i6], bArr[i9], cArr, i5);
                        i5++;
                    } else {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                } else if (i6 < i3 - 2) {
                    byte b4 = bArr[i6];
                    int i10 = i + 3;
                    byte b5 = bArr[i + 2];
                    i += 4;
                    wt5.f(b2, b4, b5, bArr[i10], cArr, i5);
                    i5 += 2;
                } else {
                    throw InvalidProtocolBufferException.invalidUtf8();
                }
            }
            return new String(cArr, 0, i5);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
    }

    public String e(ByteBuffer byteBuffer, int i, int i2) {
        return d(byteBuffer, i, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
    
        return r9 + r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int f(java.lang.String r7, byte[] r8, int r9, int r10) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nu5.f(java.lang.String, byte[], int, int):int");
    }

    public void h(String str, ByteBuffer byteBuffer) {
        g(str, byteBuffer);
    }

    public boolean k(byte[] bArr, int i, int i2) {
        if (l(0, i, i2, bArr) != 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        if (r14[r12] > (-65)) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0047, code lost:
    
        if (r14[r12] > (-65)) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0082, code lost:
    
        if (r14[r12] > (-65)) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int l(int r11, int r12, int r13, byte[] r14) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nu5.l(int, int, int, byte[]):int");
    }

    public int m(ByteBuffer byteBuffer, int i, int i2, int i3) {
        if (byteBuffer.hasArray()) {
            int arrayOffset = byteBuffer.arrayOffset();
            return l(i, i2 + arrayOffset, arrayOffset + i3, byteBuffer.array());
        }
        if (byteBuffer.isDirect()) {
            return o(byteBuffer, i, i2, i3);
        }
        return n(byteBuffer, i, i2, i3);
    }

    public int o(ByteBuffer byteBuffer, int i, int i2, int i3) {
        return n(byteBuffer, i, i2, i3);
    }
}
