package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.BlendModeColorFilter;
import android.graphics.Paint;
import android.graphics.Shader;
import android.os.HandlerThread;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ad implements tv2, b23, ke4 {
    public Object A;
    public Object B;
    public final /* synthetic */ byte x;
    public int y;
    public final Object z;

    public ad(g53 g53Var) {
        this.x = (byte) 3;
        this.z = g53Var;
        this.A = new Object[8];
        int[] iArr = new int[8];
        for (int i = 0; i < 8; i++) {
            iArr[i] = -1;
        }
        this.B = iArr;
        this.y = -1;
    }

    @Override // defpackage.tv2
    public int a() {
        o96 o96Var = (o96) this.A;
        if (o96Var != null) {
            return o96Var.y.length();
        }
        return ((gi6) this.z).d().A.length();
    }

    @Override // defpackage.tv2
    public long b(long j) {
        gi6 gi6Var = (gi6) this.z;
        if (gi6Var.b != null) {
            return gi6Var.e(j);
        }
        return j;
    }

    @Override // defpackage.tv2
    public long c(long j) {
        gi6 gi6Var = (gi6) this.z;
        if (gi6Var.b != null) {
            return gi6Var.f(j);
        }
        return j;
    }

    public boolean d() {
        gi6 gi6Var = (gi6) this.z;
        z44 z44Var = (z44) this.B;
        int i = this.y - 1;
        this.y = i;
        if (i == 0 && z44Var.z != 0) {
            ic6 ic6Var = gi6Var.a;
            ic6Var.b.a().n();
            o96 o96Var = ic6Var.b;
            if (gi6Var.b == null) {
                this.A = o96Var;
            }
            Object[] objArr = z44Var.x;
            int i2 = z44Var.z;
            for (int i3 = 0; i3 < i2; i3++) {
                ((ub2) objArr[i3]).invoke(o96Var);
            }
            gi6Var.l(o96Var);
            ic6Var.b(false, ia6.x);
            ic6Var.f(true);
            ic6Var.e(ic6Var.b.A);
            z44Var.h();
        }
        if (this.y > 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.b23
    public void e(char c) {
        byte[] bArr = (byte[]) this.A;
        if (c < 128) {
            if (bArr.length - this.y < 1) {
                g();
            }
            int i = this.y;
            this.y = i + 1;
            bArr[i] = (byte) c;
            return;
        }
        if (c < 2048) {
            if (bArr.length - this.y < 2) {
                g();
            }
            int i2 = this.y;
            int i3 = i2 + 1;
            this.y = i3;
            bArr[i2] = (byte) ((c >> 6) | 192);
            this.y = i2 + 2;
            bArr[i3] = (byte) ((c & '?') | 128);
            return;
        }
        if (55296 <= c && c < 57344) {
            if (bArr.length - this.y < 1) {
                g();
            }
            int i4 = this.y;
            this.y = i4 + 1;
            bArr[i4] = 63;
            return;
        }
        if (c < 0) {
            if (bArr.length - this.y < 3) {
                g();
            }
            int i5 = this.y;
            int i6 = i5 + 1;
            this.y = i6;
            bArr[i5] = -32;
            int i7 = i5 + 2;
            this.y = i7;
            bArr[i6] = (byte) (((c >> 6) & 63) | 128);
            this.y = i5 + 3;
            bArr[i7] = (byte) ((c & '?') | 128);
            return;
        }
        if (c <= 65535) {
            if (bArr.length - this.y < 4) {
                g();
            }
            int i8 = this.y;
            int i9 = i8 + 1;
            this.y = i9;
            bArr[i8] = -16;
            int i10 = i8 + 2;
            this.y = i10;
            bArr[i9] = Byte.MIN_VALUE;
            int i11 = i8 + 3;
            this.y = i11;
            bArr[i10] = (byte) (((c >> 6) & 63) | 128);
            this.y = i8 + 4;
            bArr[i11] = (byte) ((c & '?') | 128);
            return;
        }
        throw new o53(qx1.i(c, "Unexpected code point: ", ". Check your strings for malformed UTF-8 sequences."), null, 6);
    }

    public void f(int i, int i2) {
        int i3 = i2 + i;
        char[] cArr = (char[]) this.B;
        if (cArr.length <= i3) {
            int i4 = i * 2;
            if (i3 < i4) {
                i3 = i4;
            }
            this.B = Arrays.copyOf(cArr, i3);
        }
    }

    public void g() {
        ((OutputStream) this.z).write((byte[]) this.A, 0, this.y);
        this.y = 0;
    }

    @Override // defpackage.b23
    public void h(String str) {
        int i;
        str.getClass();
        f(0, str.length() + 2);
        char[] cArr = (char[]) this.B;
        cArr[0] = '\"';
        int length = str.length();
        str.getChars(0, length, cArr, 1);
        int i2 = length + 1;
        int i3 = 1;
        while (i3 < i2) {
            char c = cArr[i3];
            byte[] bArr = jz5.b;
            if (c < bArr.length && bArr[c] != 0) {
                int length2 = str.length();
                for (int i4 = i3 - 1; i4 < length2; i4++) {
                    f(i3, 2);
                    char charAt = str.charAt(i4);
                    byte[] bArr2 = jz5.b;
                    if (charAt < bArr2.length) {
                        byte b = bArr2[charAt];
                        if (b == 0) {
                            i = i3 + 1;
                            ((char[]) this.B)[i3] = charAt;
                        } else {
                            if (b == 1) {
                                String str2 = jz5.a[charAt];
                                str2.getClass();
                                f(i3, str2.length());
                                str2.getChars(0, str2.length(), (char[]) this.B, i3);
                                i3 = str2.length() + i3;
                            } else {
                                char[] cArr2 = (char[]) this.B;
                                cArr2[i3] = '\\';
                                cArr2[i3 + 1] = (char) b;
                                i3 += 2;
                            }
                        }
                    } else {
                        i = i3 + 1;
                        ((char[]) this.B)[i3] = charAt;
                    }
                    i3 = i;
                }
                f(i3, 1);
                char[] cArr3 = (char[]) this.B;
                cArr3[i3] = '\"';
                z(cArr3, i3 + 1);
                g();
                return;
            }
            i3++;
        }
        cArr[i2] = '\"';
        z(cArr, length + 2);
        g();
    }

    @Override // defpackage.b23
    public void i(String str) {
        str.getClass();
        int length = str.length();
        f(0, length);
        str.getChars(0, length, (char[]) this.B, 0);
        z((char[]) this.B, length);
    }

    public String j() {
        StringBuilder sb = new StringBuilder("$");
        int i = this.y + 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = ((Object[]) this.A)[i2];
            if (obj instanceof aj5) {
                aj5 aj5Var = (aj5) obj;
                boolean i3 = a34.i(aj5Var.getKind(), f06.b);
                int[] iArr = (int[]) this.B;
                if (i3) {
                    if (iArr[i2] != -1) {
                        sb.append("[");
                        sb.append(((int[]) this.B)[i2]);
                        sb.append("]");
                    }
                } else {
                    int i4 = iArr[i2];
                    if (i4 >= 0) {
                        sb.append(".");
                        sb.append(aj5Var.f(i4));
                    }
                }
            } else if (obj == l68.F) {
                sb.append("[<debug info disabled>]");
            } else if (obj != p7.M) {
                sb.append("['");
                sb.append(obj);
                sb.append("']");
            }
        }
        return sb.toString();
    }

    public int k() {
        int i = this.y;
        if (i != 2) {
            if (i != 3) {
                return 0;
            }
            return 512;
        }
        return 2048;
    }

    public int l() {
        int i;
        Paint.Cap strokeCap = ((Paint) this.z).getStrokeCap();
        if (strokeCap == null) {
            i = -1;
        } else {
            i = bd.a[strokeCap.ordinal()];
        }
        if (i != 1) {
            if (i == 2) {
                return 1;
            }
            if (i == 3) {
                return 2;
            }
            return 0;
        }
        return 0;
    }

    public int m() {
        int i;
        Paint.Join strokeJoin = ((Paint) this.z).getStrokeJoin();
        if (strokeJoin == null) {
            i = -1;
        } else {
            i = bd.b[strokeJoin.ordinal()];
        }
        if (i != 1) {
            if (i == 2) {
                return 2;
            }
            if (i == 3) {
                return 1;
            }
            return 0;
        }
        return 0;
    }

    public void n() {
        boolean z;
        HandlerThread handlerThread;
        synchronized (this.z) {
            try {
                if (this.y > 0) {
                    z = true;
                } else {
                    z = false;
                }
                io3.B(z);
                int i = this.y - 1;
                this.y = i;
                if (i == 0 && (handlerThread = (HandlerThread) this.B) != null) {
                    handlerThread.quit();
                    this.B = null;
                    this.A = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void o() {
        int i = this.y * 2;
        this.A = Arrays.copyOf((Object[]) this.A, i);
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = -1;
        }
        ms.A0(0, 0, 14, (int[]) this.B, iArr);
        this.B = iArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kz] */
    @Override // defpackage.ke4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onSuccess(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = r11.z
            r3 = r0
            kv7 r3 = (defpackage.kv7) r3
            java.lang.Object r0 = r11.A
            r6 = r0
            java.lang.String r6 = (java.lang.String) r6
            int r0 = r11.y
            java.lang.Object r11 = r11.B
            r2 = r11
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2
            r5 = r12
            android.os.Bundle r5 = (android.os.Bundle) r5
            pk5 r11 = r3.a
            defpackage.a34.x(r11)
            qn7 r12 = r3.b
            r1 = 3
            r7 = 1
            java.lang.String r8 = "register callback = %s"
            r4 = 2
            if (r0 == r1) goto L25
            if (r0 != r4) goto L59
            r0 = r4
        L25:
            gl7 r1 = r3.c
            kz r9 = new kz
            r9.<init>()
            r9.x = r3
            r9.y = r1
            r9.z = r6
            uw7 r1 = new uw7
            r1.<init>(r9)
            r9.B = r1
            en7 r1 = new en7
            r1.<init>(r9, r4)
            r11.a(r1)
            if (r12 == 0) goto L59
            ky7 r1 = new ky7
            r1.<init>(r9, r7)
            zk3 r9 = defpackage.qn7.g
            java.lang.Object[] r10 = new java.lang.Object[]{r1}
            r9.b(r8, r10)
            defpackage.a34.s()
            java.util.Set r9 = r12.b
            r9.add(r1)
        L59:
            if (r0 == r7) goto L5d
            if (r0 != r4) goto L85
        L5d:
            gl7 r4 = r3.c
            qz7 r1 = new qz7
            r1.<init>(r2, r3, r4, r5, r6)
            en7 r0 = new en7
            r0.<init>(r1, r7)
            r11.a(r0)
            if (r12 == 0) goto L85
            ky7 r11 = new ky7
            r0 = 0
            r11.<init>(r1, r0)
            zk3 r0 = defpackage.qn7.g
            java.lang.Object[] r1 = new java.lang.Object[]{r11}
            r0.b(r8, r1)
            defpackage.a34.s()
            java.util.Set r12 = r12.b
            r12.add(r11)
        L85:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ad.onSuccess(java.lang.Object):void");
    }

    public void p(float f) {
        ((Paint) this.z).setAlpha((int) Math.rint(f * 255.0f));
    }

    public void q(int i) {
        if (this.y == i) {
            return;
        }
        this.y = i;
        c97.a.b((Paint) this.z, i);
    }

    public void r(long j) {
        c97.a.c((Paint) this.z, j);
    }

    public void s(w60 w60Var) {
        BlendModeColorFilter blendModeColorFilter;
        this.B = w60Var;
        Paint paint = (Paint) this.z;
        if (w60Var != null) {
            blendModeColorFilter = w60Var.a;
        } else {
            blendModeColorFilter = null;
        }
        paint.setColorFilter(blendModeColorFilter);
    }

    public void t(int i) {
        boolean z;
        Paint paint = (Paint) this.z;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        paint.setFilterBitmap(!z);
    }

    public String toString() {
        switch (this.x) {
            case 3:
                return j();
            default:
                return super.toString();
        }
    }

    public void u(Shader shader) {
        this.A = shader;
        ((Paint) this.z).setShader(shader);
    }

    public void v(int i) {
        Paint.Cap cap;
        Paint paint = (Paint) this.z;
        if (i == 2) {
            cap = Paint.Cap.SQUARE;
        } else if (i == 1) {
            cap = Paint.Cap.ROUND;
        } else if (i == 0) {
            cap = Paint.Cap.BUTT;
        } else {
            cap = Paint.Cap.BUTT;
        }
        paint.setStrokeCap(cap);
    }

    public void w(int i) {
        Paint.Join join;
        Paint paint = (Paint) this.z;
        if (i == 0) {
            join = Paint.Join.MITER;
        } else if (i == 2) {
            join = Paint.Join.BEVEL;
        } else if (i == 1) {
            join = Paint.Join.ROUND;
        } else {
            join = Paint.Join.MITER;
        }
        paint.setStrokeJoin(join);
    }

    @Override // defpackage.b23
    public void writeLong(long j) {
        i(String.valueOf(j));
    }

    public void x(float f) {
        ((Paint) this.z).setStrokeWidth(f);
    }

    public void y(int i) {
        Paint.Style style;
        Paint paint = (Paint) this.z;
        if (i == 1) {
            style = Paint.Style.STROKE;
        } else {
            style = Paint.Style.FILL;
        }
        paint.setStyle(style);
    }

    public void z(char[] cArr, int i) {
        char c;
        byte[] bArr = (byte[]) this.A;
        if (i >= 0) {
            if (i <= cArr.length) {
                int i2 = 0;
                while (i2 < i) {
                    char c2 = cArr[i2];
                    if (c2 < 128) {
                        if (bArr.length - this.y < 1) {
                            g();
                        }
                        int i3 = this.y;
                        int i4 = i3 + 1;
                        this.y = i4;
                        bArr[i3] = (byte) c2;
                        i2++;
                        int min = Math.min(i, (bArr.length - i4) + i2);
                        while (i2 < min) {
                            char c3 = cArr[i2];
                            if (c3 < 128) {
                                int i5 = this.y;
                                this.y = i5 + 1;
                                bArr[i5] = (byte) c3;
                                i2++;
                            }
                        }
                    } else {
                        if (c2 < 2048) {
                            if (bArr.length - this.y < 2) {
                                g();
                            }
                            int i6 = this.y;
                            int i7 = i6 + 1;
                            this.y = i7;
                            bArr[i6] = (byte) ((c2 >> 6) | 192);
                            this.y = i6 + 2;
                            bArr[i7] = (byte) ((c2 & '?') | 128);
                        } else if (c2 >= 55296 && c2 <= 57343) {
                            int i8 = i2 + 1;
                            if (i8 < i) {
                                c = cArr[i8];
                            } else {
                                c = 0;
                            }
                            if (c2 <= 56319 && 56320 <= c && c < 57344) {
                                int i9 = (((c2 & 1023) << 10) | (c & 1023)) + 65536;
                                if (bArr.length - this.y < 4) {
                                    g();
                                }
                                int i10 = this.y;
                                int i11 = i10 + 1;
                                this.y = i11;
                                bArr[i10] = (byte) ((i9 >> 18) | 240);
                                int i12 = i10 + 2;
                                this.y = i12;
                                bArr[i11] = (byte) (((i9 >> 12) & 63) | 128);
                                int i13 = i10 + 3;
                                this.y = i13;
                                bArr[i12] = (byte) (((i9 >> 6) & 63) | 128);
                                this.y = i10 + 4;
                                bArr[i13] = (byte) ((i9 & 63) | 128);
                                i2 += 2;
                            } else {
                                if (bArr.length - this.y < 1) {
                                    g();
                                }
                                int i14 = this.y;
                                this.y = i14 + 1;
                                bArr[i14] = 63;
                                i2 = i8;
                            }
                        } else {
                            if (bArr.length - this.y < 3) {
                                g();
                            }
                            int i15 = this.y;
                            int i16 = i15 + 1;
                            this.y = i16;
                            bArr[i15] = (byte) ((c2 >> '\f') | 224);
                            int i17 = i15 + 2;
                            this.y = i17;
                            bArr[i16] = (byte) (((c2 >> 6) & 63) | 128);
                            this.y = i15 + 3;
                            bArr[i17] = (byte) ((c2 & '?') | 128);
                        }
                        i2++;
                    }
                }
                return;
            }
            ze0.i(qx1.s(i, "count > string.length: ", " > "), cArr.length);
            return;
        }
        ze0.k("count < 0");
    }

    public ad(OutputStream outputStream) {
        this.x = (byte) 4;
        this.z = outputStream;
        this.A = vb0.c.c(512);
        this.B = nk0.c.d(128);
    }

    public /* synthetic */ ad(kv7 kv7Var, String str, int i, SharedPreferences sharedPreferences) {
        this.x = (byte) 8;
        this.z = kv7Var;
        this.A = str;
        this.y = i;
        this.B = sharedPreferences;
    }

    public ad(Paint paint) {
        this.x = (byte) 0;
        this.z = paint;
        this.y = 3;
    }

    public ad() {
        this.x = (byte) 5;
        this.z = new Object();
        this.A = null;
        this.B = null;
        this.y = 0;
    }

    public ad(Context context) {
        this.x = (byte) 1;
        this.z = context;
        this.y = -1;
    }

    public ad(gi6 gi6Var) {
        this.x = (byte) 2;
        this.z = gi6Var;
        this.B = new z44(new ub2[16], 0);
    }

    public ad(int i, String str, int i2, ArrayList arrayList, byte[] bArr) {
        List unmodifiableList;
        this.x = (byte) 7;
        this.z = str;
        this.y = i2;
        if (arrayList == null) {
            unmodifiableList = Collections.EMPTY_LIST;
        } else {
            unmodifiableList = Collections.unmodifiableList(arrayList);
        }
        this.A = unmodifiableList;
        this.B = bArr;
    }

    public ad(int i, ta0 ta0Var, l11 l11Var, w42 w42Var) {
        this.x = (byte) 6;
        this.z = w42Var;
        this.y = i;
        this.A = ta0Var;
        this.B = l11Var;
    }
}
