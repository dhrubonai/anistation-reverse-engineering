package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public interface ud1 {
    default long D0(long j) {
        if (j == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        float g0 = g0(ym1.b(j));
        float g02 = g0(ym1.a(j));
        return (Float.floatToRawIntBits(g0) << 32) | (Float.floatToRawIntBits(g02) & 4294967295L);
    }

    default float H0(long j) {
        if (!fe6.a(ee6.b(j), 4294967296L)) {
            gz2.b("Only Sp can convert to Px");
        }
        return g0(y(j));
    }

    default long N(float f) {
        return r(W(f));
    }

    default float T(int i) {
        return i / b();
    }

    default float W(float f) {
        return f / b();
    }

    float b();

    default float g0(float f) {
        return b() * f;
    }

    float getFontScale();

    default int p0(long j) {
        return Math.round(H0(j));
    }

    default long r(float f) {
        float fontScale;
        float[] fArr = m92.a;
        if (getFontScale() >= 1.03f) {
            l92 a = m92.a(getFontScale());
            if (a != null) {
                fontScale = a.a(f);
            } else {
                fontScale = f / getFontScale();
            }
            return hz5.h(fontScale, 4294967296L);
        }
        return hz5.h(f / getFontScale(), 4294967296L);
    }

    default long s(long j) {
        if (j == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        return n03.e(W(Float.intBitsToFloat((int) (j >> 32))), W(Float.intBitsToFloat((int) (j & 4294967295L))));
    }

    default int x0(float f) {
        float g0 = g0(f);
        if (Float.isInfinite(g0)) {
            return Integer.MAX_VALUE;
        }
        return Math.round(g0);
    }

    default float y(long j) {
        if (!fe6.a(ee6.b(j), 4294967296L)) {
            gz2.b("Only Sp can convert to Px");
        }
        float[] fArr = m92.a;
        if (getFontScale() >= 1.03f) {
            l92 a = m92.a(getFontScale());
            if (a == null) {
                return getFontScale() * ee6.c(j);
            }
            return a.b(ee6.c(j));
        }
        return getFontScale() * ee6.c(j);
    }
}
