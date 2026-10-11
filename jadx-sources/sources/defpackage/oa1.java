package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Gainmap;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.opengl.Matrix;
import android.os.Build;
import com.anistation.android.R;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class oa1 extends n30 implements ve2 {
    public static final o15 w;
    public static final float[] x;
    public static final float[] y;
    public final re2 h;
    public final nw2 i;
    public final nw2 j;
    public final boolean k;
    public final float[][] l;
    public final float[][] m;
    public final float[] n;
    public final float[] o;
    public final float[] p;
    public final int q;
    public o15 r;
    public Gainmap s;
    public int t;
    public boolean u;
    public boolean v;

    static {
        z62 z62Var = nw2.y;
        Object[] objArr = {new float[]{-1.0f, -1.0f, 0.0f, 1.0f}, new float[]{-1.0f, 1.0f, 0.0f, 1.0f}, new float[]{1.0f, 1.0f, 0.0f, 1.0f}, new float[]{1.0f, -1.0f, 0.0f, 1.0f}};
        jf7.p(objArr, 4);
        w = nw2.j(objArr, 4);
        x = new float[]{1.0f, 1.0f, 1.0f, 0.0f, -0.1646f, 1.8814f, 1.4746f, -0.5714f, 0.0f};
        y = new float[]{1.1689f, 1.1689f, 1.1689f, 0.0f, -0.1881f, 2.1502f, 1.6853f, -0.653f, 0.0f};
    }

    public oa1(re2 re2Var, nw2 nw2Var, nw2 nw2Var2, boolean z) {
        super(z, 1);
        this.h = re2Var;
        this.i = nw2Var;
        this.j = nw2Var2;
        this.k = z;
        int[] iArr = {nw2Var.size(), 16};
        Class cls = Float.TYPE;
        this.l = (float[][]) Array.newInstance((Class<?>) cls, iArr);
        this.m = (float[][]) Array.newInstance((Class<?>) cls, nw2Var2.size(), 16);
        this.n = a34.I();
        this.o = a34.I();
        this.p = new float[16];
        this.r = w;
        this.t = -1;
        int i = 9729;
        for (int i2 = 0; i2 < nw2Var.size(); i2++) {
            i = Math.max(i, ((ko3) nw2Var.get(i2)).c());
        }
        this.q = i;
    }

    public static oa1 j(Context context, o15 o15Var, List list, hp0 hp0Var, int i) {
        boolean z;
        int i2;
        int i3;
        boolean h = hp0.h(hp0Var);
        boolean z2 = false;
        if (i == 2) {
            z = true;
        } else {
            z = false;
        }
        if (h) {
            i2 = R.raw.vertex_shader_transformation_es3;
        } else {
            i2 = R.raw.vertex_shader_transformation_es2;
        }
        if (h) {
            i3 = R.raw.fragment_shader_oetf_es3;
        } else if (z) {
            i3 = R.raw.fragment_shader_transformation_sdr_oetf_es2;
        } else if (list.isEmpty()) {
            i3 = R.raw.fragment_shader_copy_es2;
        } else {
            i3 = R.raw.fragment_shader_transformation_es2;
        }
        re2 k = k(context, i2, i3);
        int i4 = hp0Var.c;
        if (h) {
            if (i4 == 7 || i4 == 6) {
                z2 = true;
            }
            io3.n(z2);
            k.g(i4, "uOutputColorTransfer");
        } else if (z) {
            if (i4 == 3 || i4 == 10) {
                z2 = true;
            }
            io3.n(z2);
            k.g(i4, "uOutputColorTransfer");
        }
        return new oa1(k, nw2.o(o15Var), nw2.o(list), h);
    }

    public static re2 k(Context context, int i, int i2) {
        try {
            re2 re2Var = new re2(context, i, i2);
            re2Var.f("uTexTransformationMatrix", a34.I());
            return re2Var;
        } catch (IOException | ze2 e) {
            throw new ns6(e);
        }
    }

    public static oa1 l(re2 re2Var, hp0 hp0Var, hp0 hp0Var2, nw2 nw2Var) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean h = hp0.h(hp0Var);
        int i = hp0Var.a;
        boolean z5 = false;
        if ((i == 1 || i == 2) && hp0Var2.a == 6) {
            z = true;
        } else {
            z = false;
        }
        int i2 = hp0Var2.c;
        if (h) {
            if (i2 == 3) {
                i2 = 10;
            }
            if (i2 != 1 && i2 != 10 && i2 != 6 && i2 != 7) {
                z4 = false;
            } else {
                z4 = true;
            }
            io3.n(z4);
            re2Var.g(i2, "uOutputColorTransfer");
        } else if (z) {
            if (i2 != 1 && i2 != 6 && i2 != 7) {
                z3 = false;
            } else {
                z3 = true;
            }
            io3.n(z3);
            re2Var.g(i2, "uOutputColorTransfer");
        } else {
            re2Var.g(0, "uSdrWorkingColorSpace");
            if (i2 != 3 && i2 != 1) {
                z2 = false;
            } else {
                z2 = true;
            }
            io3.n(z2);
            re2Var.g(i2, "uOutputColorTransfer");
        }
        z62 z62Var = nw2.y;
        o15 o15Var = o15.B;
        if (h || z) {
            z5 = true;
        }
        return new oa1(re2Var, nw2Var, o15Var, z5);
    }

    public static boolean o(float[][] fArr, float[][] fArr2) {
        boolean z;
        boolean z2 = false;
        for (int i = 0; i < fArr.length; i++) {
            float[] fArr3 = fArr[i];
            float[] fArr4 = fArr2[i];
            if (!Arrays.equals(fArr3, fArr4)) {
                if (fArr4.length == 16) {
                    z = true;
                } else {
                    z = false;
                }
                io3.A("A 4x4 transformation matrix must have 16 elements", z);
                System.arraycopy(fArr4, 0, fArr3, 0, fArr4.length);
                z2 = true;
            }
        }
        return z2;
    }

    @Override // defpackage.n30
    public final sq5 a(int i, int i2) {
        return h41.j(this.i, i, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.n30
    public final void h(int i, long j) {
        boolean z;
        int i2;
        boolean z2;
        float[] fArr;
        boolean z3;
        boolean z4;
        boolean z5;
        int i3;
        int i4;
        re2 re2Var = this.h;
        HashMap hashMap = (HashMap) re2Var.f;
        nw2 nw2Var = this.j;
        boolean z6 = true;
        int[] iArr = {nw2Var.size(), 16};
        int i5 = 0;
        Class cls = Float.TYPE;
        float[][] fArr2 = (float[][]) Array.newInstance((Class<?>) cls, iArr);
        if (nw2Var.size() <= 0) {
            boolean o = o(this.m, fArr2);
            float[] fArr3 = this.o;
            if (!o) {
                z = false;
            } else {
                Matrix.setIdentityM(fArr3, 0);
                if (nw2Var.size() <= 0) {
                    z = true;
                } else {
                    nw2Var.get(0).getClass();
                    ov3.d();
                    return;
                }
            }
            nw2 nw2Var2 = this.i;
            float[][] fArr4 = (float[][]) Array.newInstance((Class<?>) cls, nw2Var2.size(), 16);
            int i6 = 0;
            while (true) {
                i2 = 3;
                if (i6 >= nw2Var2.size()) {
                    break;
                }
                float[] fArr5 = new float[9];
                ((ko3) nw2Var2.get(i6)).b().getValues(fArr5);
                float[] fArr6 = new float[16];
                fArr6[10] = 1.0f;
                boolean z7 = z6;
                for (int i7 = 0; i7 < 3; i7++) {
                    for (int i8 = 0; i8 < 3; i8++) {
                        if (i7 == 2) {
                            i3 = 3;
                        } else {
                            i3 = i7;
                        }
                        if (i8 == 2) {
                            i4 = 3;
                        } else {
                            i4 = i8;
                        }
                        fArr6[(i3 * 4) + i4] = fArr5[(i7 * 3) + i8];
                    }
                }
                float[] fArr7 = new float[16];
                Matrix.transposeM(fArr7, 0, fArr6, 0);
                fArr4[i6] = fArr7;
                i6++;
                z6 = z7;
            }
            boolean z8 = z6;
            int i9 = 4;
            float[][] fArr8 = this.l;
            boolean o2 = o(fArr8, fArr4);
            int i10 = 6;
            float[] fArr9 = this.n;
            if (!o2) {
                z4 = z;
                fArr = fArr9;
            } else {
                Matrix.setIdentityM(fArr9, 0);
                this.r = w;
                int length = fArr8.length;
                int i11 = 0;
                boolean z9 = z;
                while (true) {
                    float[] fArr10 = this.p;
                    if (i11 < length) {
                        float[] fArr11 = fArr8[i11];
                        float[] fArr12 = fArr9;
                        Matrix.multiplyMM(fArr10, 0, fArr11, 0, fArr12, 0);
                        fArr = fArr12;
                        System.arraycopy(fArr10, i5, fArr, i5, fArr10.length);
                        o15 h0 = h41.h0(fArr11, this.r);
                        if (h0.A >= i2) {
                            z3 = z8 ? 1 : 0;
                        } else {
                            z3 = i5;
                        }
                        io3.m("A polygon must have at least 3 vertices.", z3);
                        int i12 = i9;
                        ew2 ew2Var = new ew2(i12);
                        ew2Var.d(h0);
                        float[][] fArr13 = h41.c;
                        int i13 = i5;
                        boolean z10 = z9;
                        jw2 jw2Var = ew2Var;
                        while (i13 < i10) {
                            float[] fArr14 = fArr13[i13];
                            o15 g = jw2Var.g();
                            ew2 ew2Var2 = new ew2(i12);
                            int i14 = 0;
                            boolean z11 = z10;
                            while (i14 < g.A) {
                                float[] fArr15 = (float[]) g.get(i14);
                                boolean z12 = z11;
                                float[] fArr16 = (float[]) g.get(((r3 + i14) - 1) % g.A);
                                if (h41.J(fArr15, fArr14)) {
                                    if (!h41.J(fArr16, fArr14)) {
                                        float[] i15 = h41.i(fArr14, fArr14, fArr16, fArr15);
                                        if (!Arrays.equals(fArr15, i15)) {
                                            ew2Var2.c(i15);
                                        }
                                    }
                                    ew2Var2.c(fArr15);
                                } else if (h41.J(fArr16, fArr14)) {
                                    float[] i16 = h41.i(fArr14, fArr14, fArr16, fArr15);
                                    if (!Arrays.equals(fArr16, i16)) {
                                        ew2Var2.c(i16);
                                    }
                                }
                                i14++;
                                z11 = z12;
                            }
                            i13++;
                            jw2Var = ew2Var2;
                            i10 = 6;
                            i12 = 4;
                            z10 = z11;
                        }
                        z2 = z10;
                        o15 g2 = jw2Var.g();
                        this.r = g2;
                        if (g2.A < 3) {
                            break;
                        }
                        i11++;
                        fArr9 = fArr;
                        z9 = z2;
                        i10 = 6;
                        i5 = 0;
                        i2 = 3;
                        i9 = 4;
                    } else {
                        z2 = z9;
                        fArr = fArr9;
                        int i17 = i5;
                        Matrix.invertM(fArr10, i17, fArr, i17);
                        this.r = h41.h0(fArr10, this.r);
                        break;
                    }
                }
                i5 = z8 ? 1 : 0;
                z4 = z2;
            }
            if (!z4 && i5 == 0) {
                z5 = false;
            } else {
                z5 = z8 ? 1 : 0;
            }
            if (this.r.A >= 3) {
                if (this.u && !z5 && this.v) {
                    return;
                }
                try {
                    GLES20.glUseProgram(re2Var.a);
                    a34.p();
                    n();
                    int i18 = this.q;
                    qe2 qe2Var = (qe2) hashMap.get("uTexSampler");
                    qe2Var.getClass();
                    qe2Var.e = i;
                    qe2Var.f = false;
                    qe2Var.g = i18;
                    re2Var.f("uTransformationMatrix", fArr);
                    qe2 qe2Var2 = (qe2) hashMap.get("uRgbMatrix");
                    if (qe2Var2 != null) {
                        System.arraycopy(fArr3, 0, qe2Var2.c, 0, fArr3.length);
                    }
                    o15 o15Var = this.r;
                    float[] fArr17 = new float[o15Var.A * 4];
                    for (int i19 = 0; i19 < o15Var.A; i19++) {
                        System.arraycopy(o15Var.get(i19), 0, fArr17, i19 * 4, 4);
                    }
                    re2Var.d(fArr17);
                    re2Var.c();
                    GLES20.glDrawArrays(6, 0, this.r.A);
                    a34.p();
                    this.v = z8;
                    return;
                } catch (ze2 e) {
                    throw new ns6(e, j);
                }
            }
            return;
        }
        nw2Var.get(0).getClass();
        ov3.d();
    }

    @Override // defpackage.n30
    public final boolean i() {
        if (this.v && this.u) {
            return false;
        }
        return true;
    }

    public final void m(Gainmap gainmap) {
        Bitmap gainmapContents;
        Bitmap gainmapContents2;
        float[] gamma;
        float[] gamma2;
        float[] ratioMax;
        float[] ratioMax2;
        float[] ratioMin;
        float[] ratioMin2;
        float[] epsilonHdr;
        float[] epsilonHdr2;
        float[] epsilonSdr;
        float[] epsilonSdr2;
        float displayRatioForFullHdr;
        float displayRatioForFullHdr2;
        float minDisplayRatioForHdrTransition;
        float minDisplayRatioForHdrTransition2;
        Bitmap gainmapContents3;
        Bitmap gainmapContents4;
        Bitmap gainmapContents5;
        Bitmap gainmapContents6;
        if (this.k) {
            Gainmap gainmap2 = this.s;
            if (gainmap2 != null) {
                gamma = gainmap2.getGamma();
                gamma2 = gainmap.getGamma();
                if (gamma == gamma2) {
                    ratioMax = gainmap2.getRatioMax();
                    ratioMax2 = gainmap.getRatioMax();
                    if (ratioMax == ratioMax2) {
                        ratioMin = gainmap2.getRatioMin();
                        ratioMin2 = gainmap.getRatioMin();
                        if (ratioMin == ratioMin2) {
                            epsilonHdr = gainmap2.getEpsilonHdr();
                            epsilonHdr2 = gainmap.getEpsilonHdr();
                            if (epsilonHdr == epsilonHdr2) {
                                epsilonSdr = gainmap2.getEpsilonSdr();
                                epsilonSdr2 = gainmap.getEpsilonSdr();
                                if (epsilonSdr == epsilonSdr2) {
                                    displayRatioForFullHdr = gainmap2.getDisplayRatioForFullHdr();
                                    displayRatioForFullHdr2 = gainmap.getDisplayRatioForFullHdr();
                                    if (displayRatioForFullHdr == displayRatioForFullHdr2) {
                                        minDisplayRatioForHdrTransition = gainmap2.getMinDisplayRatioForHdrTransition();
                                        minDisplayRatioForHdrTransition2 = gainmap.getMinDisplayRatioForHdrTransition();
                                        if (minDisplayRatioForHdrTransition == minDisplayRatioForHdrTransition2) {
                                            gainmapContents3 = gainmap2.getGainmapContents();
                                            gainmapContents4 = gainmap.getGainmapContents();
                                            if (gainmapContents3 == gainmapContents4) {
                                                gainmapContents5 = gainmap2.getGainmapContents();
                                                int generationId = gainmapContents5.getGenerationId();
                                                gainmapContents6 = gainmap.getGainmapContents();
                                                if (generationId == gainmapContents6.getGenerationId()) {
                                                    return;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            this.v = false;
            this.s = gainmap;
            int i = this.t;
            if (i == -1) {
                gainmapContents2 = gainmap.getGainmapContents();
                int[] iArr = new int[1];
                GLES20.glGenTextures(1, iArr, 0);
                a34.p();
                int i2 = iArr[0];
                a34.j(gainmapContents2.getWidth(), gainmapContents2.getHeight());
                a34.k(3553, i2, 9729);
                GLUtils.texImage2D(3553, 0, gainmapContents2, 0);
                a34.p();
                this.t = i2;
                return;
            }
            gainmapContents = gainmap.getGainmapContents();
            a34.j(gainmapContents.getWidth(), gainmapContents.getHeight());
            a34.k(3553, i, 9729);
            GLUtils.texImage2D(3553, 0, gainmapContents, 0);
            a34.p();
        }
    }

    public final void n() {
        Bitmap gainmapContents;
        int i;
        float[] gamma;
        int i2;
        int i3;
        float[] ratioMin;
        float[] ratioMax;
        float[] epsilonSdr;
        float[] epsilonHdr;
        float displayRatioForFullHdr;
        float minDisplayRatioForHdrTransition;
        float[] ratioMax2;
        float[] ratioMin2;
        if (this.s == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 34) {
            int i4 = this.t;
            re2 re2Var = this.h;
            re2Var.h("uGainmapTexSampler", i4, 1);
            Gainmap gainmap = this.s;
            gainmapContents = gainmap.getGainmapContents();
            if (gainmapContents.getConfig() == Bitmap.Config.ALPHA_8) {
                i = 1;
            } else {
                i = 0;
            }
            gamma = gainmap.getGamma();
            if (gamma[0] == 1.0f && gamma[1] == 1.0f && gamma[2] == 1.0f) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            if (jf7.f(gamma)) {
                ratioMax2 = gainmap.getRatioMax();
                if (jf7.f(ratioMax2)) {
                    ratioMin2 = gainmap.getRatioMin();
                    if (jf7.f(ratioMin2)) {
                        i3 = 1;
                        re2Var.g(i, "uGainmapIsAlpha");
                        re2Var.g(i2, "uNoGamma");
                        re2Var.g(i3, "uSingleChannel");
                        ratioMin = gainmap.getRatioMin();
                        re2Var.f("uLogRatioMin", new float[]{(float) Math.log(ratioMin[0]), (float) Math.log(ratioMin[1]), (float) Math.log(ratioMin[2])});
                        ratioMax = gainmap.getRatioMax();
                        re2Var.f("uLogRatioMax", new float[]{(float) Math.log(ratioMax[0]), (float) Math.log(ratioMax[1]), (float) Math.log(ratioMax[2])});
                        epsilonSdr = gainmap.getEpsilonSdr();
                        re2Var.f("uEpsilonSdr", epsilonSdr);
                        epsilonHdr = gainmap.getEpsilonHdr();
                        re2Var.f("uEpsilonHdr", epsilonHdr);
                        re2Var.f("uGainmapGamma", gamma);
                        displayRatioForFullHdr = gainmap.getDisplayRatioForFullHdr();
                        re2Var.e("uDisplayRatioHdr", displayRatioForFullHdr);
                        minDisplayRatioForHdrTransition = gainmap.getMinDisplayRatioForHdrTransition();
                        re2Var.e("uDisplayRatioSdr", minDisplayRatioForHdrTransition);
                        a34.p();
                        return;
                    }
                }
            }
            i3 = 0;
            re2Var.g(i, "uGainmapIsAlpha");
            re2Var.g(i2, "uNoGamma");
            re2Var.g(i3, "uSingleChannel");
            ratioMin = gainmap.getRatioMin();
            re2Var.f("uLogRatioMin", new float[]{(float) Math.log(ratioMin[0]), (float) Math.log(ratioMin[1]), (float) Math.log(ratioMin[2])});
            ratioMax = gainmap.getRatioMax();
            re2Var.f("uLogRatioMax", new float[]{(float) Math.log(ratioMax[0]), (float) Math.log(ratioMax[1]), (float) Math.log(ratioMax[2])});
            epsilonSdr = gainmap.getEpsilonSdr();
            re2Var.f("uEpsilonSdr", epsilonSdr);
            epsilonHdr = gainmap.getEpsilonHdr();
            re2Var.f("uEpsilonHdr", epsilonHdr);
            re2Var.f("uGainmapGamma", gamma);
            displayRatioForFullHdr = gainmap.getDisplayRatioForFullHdr();
            re2Var.e("uDisplayRatioHdr", displayRatioForFullHdr);
            minDisplayRatioForHdrTransition = gainmap.getMinDisplayRatioForHdrTransition();
            re2Var.e("uDisplayRatioSdr", minDisplayRatioForHdrTransition);
            a34.p();
            return;
        }
        ze0.m("Gainmaps not supported under API 34.");
    }

    @Override // defpackage.ve2
    public final void release() {
        try {
            this.a.b();
            try {
                GLES20.glDeleteProgram(this.h.a);
                a34.p();
                int i = this.t;
                if (i != -1) {
                    GLES20.glDeleteTextures(1, new int[]{i}, 0);
                    a34.p();
                }
            } catch (ze2 e) {
                throw new ns6(e);
            }
        } catch (ze2 e2) {
            throw new ns6(e2);
        }
    }
}
