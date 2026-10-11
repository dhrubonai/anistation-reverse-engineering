package defpackage;

import com.anistation.model.Episode;
import com.anistation.model.watch.Server;
import com.anistation.model.watch.WatchSession;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class h27 extends t36 implements ic2 {
    public Object A;
    public Server B;
    public boolean C;
    public byte D;
    public final /* synthetic */ v27 E;
    public final /* synthetic */ Long F;
    public final /* synthetic */ boolean G;
    public final /* synthetic */ Long H;
    public final /* synthetic */ int I;
    public final /* synthetic */ long J;
    public final /* synthetic */ boolean K;
    public final /* synthetic */ boolean L;
    public final /* synthetic */ boolean M;
    public final /* synthetic */ Episode N;
    public WatchSession x;
    public String y;
    public w05 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h27(v27 v27Var, Long l, boolean z, Long l2, int i, long j, boolean z2, boolean z3, boolean z4, Episode episode, vz0 vz0Var) {
        super(2, vz0Var);
        this.E = v27Var;
        this.F = l;
        this.G = z;
        this.H = l2;
        this.I = i;
        this.J = j;
        this.K = z2;
        this.L = z3;
        this.M = z4;
        this.N = episode;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        return new h27(this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, vz0Var);
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        return ((h27) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:129:0x0110, code lost:
    
        if (r4 != r15) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0435, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0436, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0399, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x039a, code lost:
    
        r1 = r14.o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x039c, code lost:
    
        r2 = r1.getValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x03c5, code lost:
    
        r1 = r3.getValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0422, code lost:
    
        r1 = r14.p;
        r0 = r0.getMessage();
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x042a, code lost:
    
        if (r0 == null) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x042c, code lost:
    
        r0 = "Failed to open offline episode";
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x042e, code lost:
    
        r1.i(new defpackage.s17(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0434, code lost:
    
        return r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0277, code lost:
    
        if (r2 == r15) goto L141;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0012. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:104:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01c4  */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, w05] */
    @Override // defpackage.h30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r77) {
        /*
            Method dump skipped, instructions count: 1522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h27.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
