package defpackage;

import com.anistation.model.settings.SubtitleArgbColor;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class x23 implements xo3, j23 {
    public final /* synthetic */ j23 x;
    public final ia3 y;

    public x23(j23 j23Var, ia3 ia3Var) {
        this.x = j23Var;
        this.y = ia3Var;
    }

    @Override // defpackage.ud1
    public final long D0(long j) {
        return this.x.D0(j);
    }

    @Override // defpackage.ud1
    public final float H0(long j) {
        return this.x.H0(j);
    }

    @Override // defpackage.ud1
    public final long N(float f) {
        return this.x.N(f);
    }

    @Override // defpackage.ud1
    public final float T(int i) {
        return this.x.T(i);
    }

    @Override // defpackage.ud1
    public final float W(float f) {
        return this.x.W(f);
    }

    @Override // defpackage.ud1
    public final float b() {
        return this.x.b();
    }

    @Override // defpackage.j23
    public final boolean d0() {
        return this.x.d0();
    }

    @Override // defpackage.ud1
    public final float g0(float f) {
        return this.x.g0(f);
    }

    @Override // defpackage.ud1
    public final float getFontScale() {
        return this.x.getFontScale();
    }

    @Override // defpackage.j23
    public final ia3 getLayoutDirection() {
        return this.y;
    }

    @Override // defpackage.ud1
    public final int p0(long j) {
        return this.x.p0(j);
    }

    @Override // defpackage.ud1
    public final long r(float f) {
        return this.x.r(f);
    }

    @Override // defpackage.ud1
    public final long s(long j) {
        return this.x.s(j);
    }

    @Override // defpackage.xo3
    public final wo3 v0(int i, int i2, Map map, ub2 ub2Var, ub2 ub2Var2) {
        if (i < 0) {
            i = 0;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        if ((i & SubtitleArgbColor.BLACK) != 0 || ((-16777216) & i2) != 0) {
            ez2.b("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new w23(i, i2, map, ub2Var);
    }

    @Override // defpackage.ud1
    public final int x0(float f) {
        return this.x.x0(f);
    }

    @Override // defpackage.ud1
    public final float y(long j) {
        return this.x.y(j);
    }
}
