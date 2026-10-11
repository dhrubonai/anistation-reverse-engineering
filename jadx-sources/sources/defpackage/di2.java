package defpackage;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RecordingCanvas;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.os.Build;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class di2 {
    public boolean A;
    public RectF B;
    public final hi2 a;
    public Outline f;
    public float j;
    public bb4 k;
    public id l;
    public id m;
    public boolean n;
    public xg0 o;
    public ad p;
    public int q;
    public boolean s;
    public long t;
    public long u;
    public int v;
    public int w;
    public int x;
    public int y;
    public long z;
    public ud1 b = bx7.f;
    public ia3 c = ia3.x;
    public ub2 d = yj.N;
    public final bk e = new bk(this, 5);
    public boolean g = true;
    public long h = 0;
    public long i = 9205357640488583168L;
    public final qb0 r = new Object();

    static {
        a34.i(Build.FINGERPRINT, "robolectric");
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, qb0] */
    public di2(hi2 hi2Var) {
        this.a = hi2Var;
        hi2Var.w = false;
        hi2Var.a();
        this.t = 0L;
        this.u = 0L;
        this.z = 9205357640488583168L;
    }

    public final void a() {
        hi2 hi2Var = this.a;
        RenderNode renderNode = hi2Var.c;
        if (this.g) {
            boolean z = this.A;
            if (!z && hi2Var.p <= 0.0f) {
                hi2Var.w = false;
                hi2Var.a();
                renderNode.setOutline(null);
                hi2Var.g = false;
                hi2Var.a();
            } else {
                id idVar = this.l;
                if (idVar != null) {
                    RectF rectF = this.B;
                    if (rectF == null) {
                        rectF = new RectF();
                        this.B = rectF;
                    }
                    boolean z2 = idVar instanceof id;
                    if (z2) {
                        Path path = idVar.a;
                        path.computeBounds(rectF, false);
                        Outline outline = this.f;
                        if (outline == null) {
                            outline = new Outline();
                            this.f = outline;
                        }
                        if (Build.VERSION.SDK_INT >= 30) {
                            if (z2) {
                                outline.setPath(path);
                            } else {
                                ov3.g("Unable to obtain android.graphics.Path");
                                return;
                            }
                        } else if (z2) {
                            outline.setConvexPath(path);
                        } else {
                            ov3.g("Unable to obtain android.graphics.Path");
                            return;
                        }
                        outline.offset(this.v, this.w);
                        this.n = !outline.canClip();
                        this.l = idVar;
                        outline.setAlpha(hi2Var.h);
                        Math.round(rectF.width());
                        Math.round(rectF.height());
                        renderNode.setOutline(outline);
                        hi2Var.g = true;
                        hi2Var.a();
                        if (this.n && this.A) {
                            hi2Var.w = false;
                            hi2Var.a();
                            renderNode.discardDisplayList();
                        } else {
                            hi2Var.w = this.A;
                            hi2Var.a();
                        }
                    } else {
                        ov3.g("Unable to obtain android.graphics.Path");
                        return;
                    }
                } else {
                    hi2Var.w = z;
                    hi2Var.a();
                    Outline outline2 = this.f;
                    if (outline2 == null) {
                        outline2 = new Outline();
                        this.f = outline2;
                    }
                    Outline outline3 = outline2;
                    long O = m37.O(this.u);
                    long j = this.h;
                    long j2 = this.i;
                    if (j2 != 9205357640488583168L) {
                        O = j2;
                    }
                    int i = (int) (j >> 32);
                    int i2 = (int) (j & 4294967295L);
                    int i3 = (int) (O >> 32);
                    int i4 = (int) (O & 4294967295L);
                    outline3.setRoundRect(Math.round(Float.intBitsToFloat(i)), Math.round(Float.intBitsToFloat(i2)), Math.round(Float.intBitsToFloat(i3) + Float.intBitsToFloat(i)), Math.round(Float.intBitsToFloat(i4) + Float.intBitsToFloat(i2)), this.j);
                    outline3.setAlpha(hi2Var.h);
                    Math.round(Float.intBitsToFloat(i3));
                    Math.round(Float.intBitsToFloat(i4));
                    renderNode.setOutline(outline3);
                    hi2Var.g = true;
                    hi2Var.a();
                }
            }
        }
        this.g = false;
    }

    public final void b() {
        if (this.s && this.q == 0) {
            qb0 qb0Var = this.r;
            di2 di2Var = (di2) qb0Var.y;
            if (di2Var != null) {
                di2Var.q--;
                di2Var.b();
                qb0Var.y = null;
            }
            q44 q44Var = (q44) qb0Var.A;
            if (q44Var != null) {
                Object[] objArr = q44Var.b;
                long[] jArr = q44Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    r11.q--;
                                    ((di2) objArr[(i << 3) + i3]).b();
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                                break;
                            }
                        }
                        if (i == length) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                q44Var.b();
            }
            this.a.c.discardDisplayList();
        }
    }

    public final void c(bp1 bp1Var) {
        qb0 qb0Var = this.r;
        qb0Var.z = (di2) qb0Var.y;
        q44 q44Var = (q44) qb0Var.A;
        if (q44Var != null && q44Var.h()) {
            q44 q44Var2 = (q44) qb0Var.B;
            if (q44Var2 == null) {
                q44 q44Var3 = db5.a;
                q44Var2 = new q44();
                qb0Var.B = q44Var2;
            }
            q44Var2.j(q44Var);
            q44Var.b();
        }
        qb0Var.x = true;
        this.d.invoke(bp1Var);
        qb0Var.x = false;
        di2 di2Var = (di2) qb0Var.z;
        if (di2Var != null) {
            di2Var.q--;
            di2Var.b();
        }
        q44 q44Var4 = (q44) qb0Var.B;
        if (q44Var4 != null && q44Var4.h()) {
            Object[] objArr = q44Var4.b;
            long[] jArr = q44Var4.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                r9.q--;
                                ((di2) objArr[(i << 3) + i3]).b();
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
            q44Var4.b();
        }
    }

    public final bb4 d() {
        bb4 ah4Var;
        bb4 bb4Var = this.k;
        id idVar = this.l;
        if (bb4Var != null) {
            return bb4Var;
        }
        if (idVar != null) {
            zg4 zg4Var = new zg4(idVar);
            this.k = zg4Var;
            return zg4Var;
        }
        long O = m37.O(this.u);
        long j = this.h;
        long j2 = this.i;
        if (j2 != 9205357640488583168L) {
            O = j2;
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (O >> 32)) + intBitsToFloat;
        float intBitsToFloat4 = Float.intBitsToFloat((int) (O & 4294967295L)) + intBitsToFloat2;
        if (this.j > 0.0f) {
            ah4Var = new bh4(bx7.b(intBitsToFloat, intBitsToFloat2, intBitsToFloat3, intBitsToFloat4, (Float.floatToRawIntBits(r0) << 32) | (4294967295L & Float.floatToRawIntBits(r0))));
        } else {
            ah4Var = new ah4(new n05(intBitsToFloat, intBitsToFloat2, intBitsToFloat3, intBitsToFloat4));
        }
        this.k = ah4Var;
        return ah4Var;
    }

    public final void e() {
        ud1 ud1Var = this.b;
        ia3 ia3Var = this.c;
        hi2 hi2Var = this.a;
        xg0 xg0Var = hi2Var.b;
        RenderNode renderNode = hi2Var.c;
        RecordingCanvas beginRecording = renderNode.beginRecording();
        float f = hi2Var.x;
        float f2 = hi2Var.y;
        long floatToRawIntBits = (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
        try {
            yg0 yg0Var = hi2Var.a;
            t9 t9Var = yg0Var.a;
            Canvas canvas = t9Var.a;
            t9Var.a = beginRecording;
            dn0 dn0Var = xg0Var.y;
            dn0Var.Q(ud1Var);
            dn0Var.R(ia3Var);
            dn0Var.z = this;
            dn0Var.S(hi2Var.d);
            dn0Var.P(t9Var);
            float f3 = hi2Var.x;
            bk bkVar = this.e;
            if (f3 <= 0.0f && hi2Var.y <= 0.0f) {
                bkVar.invoke(xg0Var);
                yg0Var.a.a = canvas;
                renderNode.endRecording();
            }
            int i = (int) (floatToRawIntBits >> 32);
            int i2 = (int) (floatToRawIntBits & 4294967295L);
            t9Var.o(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
            bkVar.invoke(xg0Var);
            t9Var.o(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
            yg0Var.a.a = canvas;
            renderNode.endRecording();
        } catch (Throwable th) {
            renderNode.endRecording();
            throw th;
        }
    }

    public final void f(float f) {
        hi2 hi2Var = this.a;
        if (hi2Var.h == f) {
            return;
        }
        hi2Var.h = f;
        hi2Var.c.setAlpha(f);
    }

    public final void g(long j) {
        if (!xc4.b(this.z, j)) {
            this.z = j;
            hi2 hi2Var = this.a;
            hi2Var.k = j;
            hi2Var.d();
        }
    }

    public final void h(long j, long j2) {
        hi2 hi2Var = this.a;
        RenderNode renderNode = hi2Var.c;
        hi2Var.D = (int) (j >> 32);
        hi2Var.E = (int) (j & 4294967295L);
        boolean b = uq5.b(hi2Var.d, m37.O(j2));
        hi2Var.d = m37.O(j2);
        hi2Var.e();
        if (!b && xc4.b(hi2Var.k, 9205357640488583168L)) {
            renderNode.setPivotX((((int) (j2 >> 32)) / 2.0f) + hi2Var.x);
            renderNode.setPivotY((((int) (j2 & 4294967295L)) / 2.0f) + hi2Var.y);
        }
    }

    public final void i(float f, long j, long j2) {
        float f2 = this.v;
        float f3 = this.w;
        long f4 = xc4.f(j, (Float.floatToRawIntBits(f3) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32));
        if (xc4.b(this.h, f4) && uq5.b(this.i, j2) && this.j == f && this.l == null) {
            return;
        }
        this.k = null;
        this.l = null;
        this.g = true;
        this.n = false;
        this.h = f4;
        this.i = j2;
        this.j = f;
        a();
    }
}
