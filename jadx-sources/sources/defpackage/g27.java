package defpackage;

import com.anistation.model.Episode;
import com.anistation.model.Resource;
import com.anistation.model.watch.Server;
import com.anistation.model.watch.Source;
import com.anistation.model.watch.SourcesResponse;
import java.util.List;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class g27 extends t36 implements ic2 {
    public final /* synthetic */ Episode A;
    public final /* synthetic */ int B;
    public final /* synthetic */ w05 C;
    public final /* synthetic */ boolean D;
    public final /* synthetic */ boolean E;
    public final /* synthetic */ String F;
    public final /* synthetic */ boolean G;
    public final /* synthetic */ Server H;
    public final /* synthetic */ boolean I;
    public /* synthetic */ Object x;
    public final /* synthetic */ long y;
    public final /* synthetic */ v27 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g27(long j, v27 v27Var, Episode episode, int i, w05 w05Var, boolean z, boolean z2, String str, boolean z3, Server server, boolean z4, vz0 vz0Var) {
        super(2, vz0Var);
        this.y = j;
        this.z = v27Var;
        this.A = episode;
        this.B = i;
        this.C = w05Var;
        this.D = z;
        this.E = z2;
        this.F = str;
        this.G = z3;
        this.H = server;
        this.I = z4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ff, code lost:
    
        if (r4.isEmpty() == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0102, code lost:
    
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0112, code lost:
    
        if (r4.isEmpty() == false) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void i(boolean r59, defpackage.v27 r60, com.anistation.model.Episode r61, int r62, defpackage.w05 r63, boolean r64, java.lang.String r65, long r66, boolean r68, com.anistation.model.watch.Server r69, boolean r70, java.lang.String r71) {
        /*
            Method dump skipped, instructions count: 627
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g27.i(boolean, v27, com.anistation.model.Episode, int, w05, boolean, java.lang.String, long, boolean, com.anistation.model.watch.Server, boolean, java.lang.String):void");
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        g27 g27Var = new g27(this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, vz0Var);
        g27Var.x = obj;
        return g27Var;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        g27 g27Var = (g27) create((Resource) obj, (vz0) obj2);
        pn6 pn6Var = pn6.a;
        g27Var.invokeSuspend(pn6Var);
        return pn6Var;
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        Object value;
        ym6 ym6Var;
        boolean z;
        Object value2;
        List<Source> sources;
        zw f;
        Resource resource = (Resource) this.x;
        m37.N(obj);
        v27 v27Var = this.z;
        long j = v27Var.c0;
        long j2 = this.y;
        pn6 pn6Var = pn6.a;
        if (j2 == j) {
            boolean z2 = resource instanceof Resource.Success;
            Episode episode = this.A;
            w05 w05Var = this.C;
            int i = this.B;
            if (z2) {
                SourcesResponse sourcesResponse = (SourcesResponse) ((Resource.Success) resource).getData();
                if (sourcesResponse != null && (sources = sourcesResponse.getSources()) != null && !sources.isEmpty()) {
                    try {
                        v27Var.C(sourcesResponse, episode, new Long(v27Var.G(i, (Long) w05Var.x)), this.D, false);
                        sx5 sx5Var = v27Var.n;
                        while (true) {
                            Object value3 = sx5Var.getValue();
                            SourcesResponse sourcesResponse2 = sourcesResponse;
                            if (sx5Var.j(value3, ym6.a((ym6) value3, null, null, null, sourcesResponse2, null, null, null, false, 0.0f, false, null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, false, false, false, null, false, false, false, false, false, false, false, -33554441, 14))) {
                                break;
                            }
                            sourcesResponse = sourcesResponse2;
                        }
                        ym6 ym6Var2 = (ym6) v27Var.n.getValue();
                        if (!ym6Var2.g() && (f = ym6Var2.f()) != null) {
                            v27Var.F(te4.H(f));
                            return pn6Var;
                        }
                    } catch (CancellationException e) {
                        throw e;
                    } catch (Throwable th) {
                        String message = th.getMessage();
                        if (message == null) {
                            message = "Failed to prepare video source";
                        }
                        i(this.E, this.z, episode, this.B, this.C, this.D, this.F, this.y, this.G, this.H, this.I, message);
                        return pn6Var;
                    }
                } else {
                    i(this.E, this.z, episode, this.B, this.C, this.D, this.F, this.y, this.G, this.H, this.I, null);
                    return pn6Var;
                }
            } else {
                if (resource instanceof Resource.Error) {
                    i(this.E, v27Var, episode, this.B, this.C, this.D, this.F, j2, this.G, this.H, this.I, ((Resource.Error) resource).getMessage());
                    return pn6Var;
                }
                if (!(resource instanceof Resource.Loading) && !a34.i(resource, Resource.Idle.INSTANCE)) {
                    ze0.l();
                    return null;
                }
                sx5 sx5Var2 = v27Var.n;
                sx5 sx5Var3 = v27Var.o;
                do {
                    value = sx5Var2.getValue();
                    ym6Var = (ym6) value;
                    if (((dq4) sx5Var3.getValue()).j && ym6Var.g() && !ym6Var.m.isEmpty()) {
                        z = false;
                    } else {
                        z = true;
                    }
                } while (!sx5Var2.j(value, ym6.a(ym6Var, null, null, null, null, null, null, null, false, 0.0f, false, null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, false, false, false, null, false, false, false, true, false, true, z, -1, 2)));
                do {
                    value2 = sx5Var3.getValue();
                } while (!sx5Var3.j(value2, dq4.a((dq4) value2, false, false, false, v27Var.G(i, (Long) w05Var.x), 0L, null, false, null, true, false, null, 1783)));
            }
        }
        return pn6Var;
    }
}
