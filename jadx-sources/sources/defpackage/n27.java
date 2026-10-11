package defpackage;

import com.anistation.model.Episode;
import com.anistation.model.watch.SourcesResponse;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class n27 extends t36 implements ic2 {
    public final /* synthetic */ SourcesResponse A;
    public final /* synthetic */ Episode B;
    public final /* synthetic */ long C;
    public final /* synthetic */ boolean D;
    public final /* synthetic */ ym6 E;
    public final /* synthetic */ yx1 F;
    public /* synthetic */ Object x;
    public final /* synthetic */ long y;
    public final /* synthetic */ v27 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n27(long j, v27 v27Var, SourcesResponse sourcesResponse, Episode episode, long j2, boolean z, ym6 ym6Var, yx1 yx1Var, vz0 vz0Var) {
        super(2, vz0Var);
        this.y = j;
        this.z = v27Var;
        this.A = sourcesResponse;
        this.B = episode;
        this.C = j2;
        this.D = z;
        this.E = ym6Var;
        this.F = yx1Var;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        n27 n27Var = new n27(this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, vz0Var);
        n27Var.x = obj;
        return n27Var;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        n27 n27Var = (n27) create((v11) obj, (vz0) obj2);
        pn6 pn6Var = pn6.a;
        n27Var.invokeSuspend(pn6Var);
        return pn6Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x006a, code lost:
    
        if (r2.I(r28.F) == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x006c, code lost:
    
        r0 = r9.getValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0091, code lost:
    
        if (r9.j(r0, defpackage.dq4.a((defpackage.dq4) r0, false, false, false, 0, 0, null, false, null, false, false, null, 1791)) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0093, code lost:
    
        r8.i(new defpackage.s17("Video stream is currently unavailable. Try another server."));
     */
    @Override // defpackage.h30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r29) {
        /*
            r28 = this;
            r1 = r28
            java.lang.Object r0 = r1.x
            v11 r0 = (defpackage.v11) r0
            defpackage.m37.N(r29)
            v27 r2 = r1.z
            za0 r8 = r2.p
            sx5 r9 = r2.o
            long r3 = r2.c0
            long r10 = r1.y
            int r0 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            pn6 r12 = defpackage.pn6.a
            if (r0 != 0) goto L9d
            java.lang.Object r0 = r9.getValue()
            dq4 r0 = (defpackage.dq4) r0
            boolean r0 = r0.j
            if (r0 == 0) goto L25
            goto L9d
        L25:
            s17 r0 = new s17
            java.lang.String r3 = "Direct playback was interrupted. Retrying through the compatibility route."
            r0.<init>(r3)
            r8.i(r0)
            com.anistation.model.watch.SourcesResponse r3 = r1.A
            com.anistation.model.Episode r4 = r1.B
            long r5 = r1.C
            boolean r0 = r1.D
            java.lang.Long r7 = new java.lang.Long     // Catch: java.lang.Throwable -> L44
            r7.<init>(r5)     // Catch: java.lang.Throwable -> L44
            r5 = r7
            r7 = 1
            r6 = r0
            r2.C(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L44
            r3 = r12
            goto L4a
        L44:
            r0 = move-exception
            y45 r3 = new y45
            r3.<init>(r0)
        L4a:
            java.lang.Throwable r0 = defpackage.z45.b(r3)
            if (r0 == 0) goto L9d
            java.lang.String r3 = "WatchViewModel"
            java.lang.String r4 = "Shiro compatibility playback failed to prepare."
            android.util.Log.w(r3, r4, r0)
            ym6 r0 = r1.E
            java.lang.String r0 = r0.e
            r2.W = r0
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r10)
            r2.X = r0
            yx1 r0 = r1.F
            boolean r0 = r2.I(r0)
            if (r0 != 0) goto L9d
        L6c:
            java.lang.Object r0 = r9.getValue()
            r13 = r0
            dq4 r13 = (defpackage.dq4) r13
            r26 = 0
            r27 = 1791(0x6ff, float:2.51E-42)
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r19 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            dq4 r1 = defpackage.dq4.a(r13, r14, r15, r16, r17, r19, r21, r22, r23, r24, r25, r26, r27)
            boolean r0 = r9.j(r0, r1)
            if (r0 == 0) goto L6c
            s17 r0 = new s17
            java.lang.String r1 = "Video stream is currently unavailable. Try another server."
            r0.<init>(r1)
            r8.i(r0)
        L9d:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n27.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
