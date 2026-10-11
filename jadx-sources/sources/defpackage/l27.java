package defpackage;

import com.anistation.model.Episode;
import com.anistation.model.watch.Provider;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class l27 extends t36 implements ic2 {
    public final /* synthetic */ String A;
    public final /* synthetic */ Provider B;
    public final /* synthetic */ Episode C;
    public final /* synthetic */ long D;
    public final /* synthetic */ long x;
    public final /* synthetic */ v27 y;
    public final /* synthetic */ yx1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l27(long j, v27 v27Var, yx1 yx1Var, String str, Provider provider, Episode episode, long j2, vz0 vz0Var) {
        super(2, vz0Var);
        this.x = j;
        this.y = v27Var;
        this.z = yx1Var;
        this.A = str;
        this.B = provider;
        this.C = episode;
        this.D = j2;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        return new l27(this.x, this.y, this.z, this.A, this.B, this.C, this.D, vz0Var);
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        l27 l27Var = (l27) create((v11) obj, (vz0) obj2);
        pn6 pn6Var = pn6.a;
        l27Var.invokeSuspend(pn6Var);
        return pn6Var;
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        Object value;
        Provider provider;
        String j;
        m37.N(obj);
        v27 v27Var = this.y;
        long j2 = v27Var.c0;
        long j3 = this.x;
        pn6 pn6Var = pn6.a;
        if (j3 == j2 && !((dq4) v27Var.o.getValue()).j) {
            sx5 sx5Var = v27Var.n;
            do {
                value = sx5Var.getValue();
                provider = this.B;
            } while (!sx5Var.j(value, ym6.a((ym6) value, null, null, null, null, provider.getId(), null, null, false, 0.0f, false, null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, false, false, false, null, false, false, false, false, false, false, false, -17, 15)));
            String str = this.A;
            yx1 yx1Var = this.z;
            if (yx1Var != null) {
                if (pn4.a.contains(Integer.valueOf(yx1Var.x))) {
                    j = h11.j(str, " video format is unsupported on this device");
                    v27Var.p.i(new s17(j + ". Switched to " + provider.getId() + "."));
                    v27.w(v27Var, this.C.getNumber(), new Long(this.D), false, null, 56);
                }
            }
            if (yx1Var != null) {
                j = h11.j(str, " stream is unavailable");
            } else {
                j = h11.j(str, " couldn't play this video");
            }
            v27Var.p.i(new s17(j + ". Switched to " + provider.getId() + "."));
            v27.w(v27Var, this.C.getNumber(), new Long(this.D), false, null, 56);
        }
        return pn6Var;
    }
}
