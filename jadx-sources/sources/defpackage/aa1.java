package defpackage;

import com.unity3d.ads.adplayer.DisplayRecoverer;
import java.math.BigInteger;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class aa1 implements hf5 {
    public final /* synthetic */ ba1 a;

    public aa1(ba1 ba1Var) {
        this.a = ba1Var;
    }

    @Override // defpackage.hf5
    public final boolean b() {
        return true;
    }

    @Override // defpackage.hf5
    public final gf5 f(long j) {
        ba1 ba1Var = this.a;
        long j2 = ba1Var.y;
        BigInteger valueOf = BigInteger.valueOf((ba1Var.A.i * j) / 1000000);
        long j3 = ba1Var.z;
        jf5 jf5Var = new jf5(j, eq6.k((valueOf.multiply(BigInteger.valueOf(j3 - j2)).divide(BigInteger.valueOf(ba1Var.C)).longValue() + j2) - DisplayRecoverer.DEFAULT_MAX_BACKGROUND_AGE_MS, ba1Var.y, j3 - 1));
        return new gf5(jf5Var, jf5Var);
    }

    @Override // defpackage.hf5
    public final long h() {
        return (this.a.C * 1000000) / r5.A.i;
    }
}
