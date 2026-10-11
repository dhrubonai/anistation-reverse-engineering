package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class wt3 implements xc2 {
    public final /* synthetic */ bu3 A;
    public final /* synthetic */ byte x = 0;
    public final /* synthetic */ dt3 y;
    public final /* synthetic */ boolean z;

    public wt3(bu3 bu3Var, dt3 dt3Var, boolean z) {
        this.A = bu3Var;
        this.y = dt3Var;
        this.z = z;
    }

    @Override // defpackage.xc2
    public final void onSuccess(Object obj) {
        boolean z;
        boolean z2;
        byte b = this.x;
        bu3 bu3Var = this.A;
        boolean z3 = this.z;
        dt3 dt3Var = this.y;
        switch (b) {
            case 0:
                if (((Boolean) obj).booleanValue()) {
                    byte b2 = 1;
                    byte b3 = 0;
                    if (bu3Var.t.t0(16) && bu3Var.t.q() != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!bu3Var.t.t0(31) && !bu3Var.t.t0(20)) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    dt3 q = bu3Var.q(dt3Var);
                    fo4 fo4Var = new fo4();
                    fo4Var.a.a(1);
                    go4 b4 = fo4Var.b();
                    if (!z && z2) {
                        bu3Var.e.getClass();
                        zv2 v = wc7.v(new UnsupportedOperationException());
                        v.a(new yc2(v, new wt3(bu3Var, q, z3, b4), b3), new ba(bu3Var, b2));
                        return;
                    }
                    if (!z) {
                        kb0.O("MediaSessionImpl", "Play requested without current MediaItem, but playback resumption prevented by missing available commands");
                    }
                    eq6.K(bu3Var.t);
                    if (z3) {
                        bu3Var.n(q);
                        return;
                    }
                    return;
                }
                return;
            default:
                x97.Q(bu3Var.t, (et3) obj);
                eq6.K(bu3Var.t);
                if (z3) {
                    bu3Var.n(dt3Var);
                    return;
                }
                return;
        }
    }

    @Override // defpackage.xc2
    public final void t(Throwable th) {
        switch (this.x) {
            case 0:
                kb0.t("MediaSessionImpl", "Failed calling onPlayRequested", th);
                return;
            default:
                if (th instanceof UnsupportedOperationException) {
                    kb0.P("MediaSessionImpl", "UnsupportedOperationException: Make sure to implement MediaSession.Callback.onPlaybackResumption() if you add a media button receiver to your manifest or if you implement the recent media item contract with your MediaLibraryService.", th);
                } else {
                    kb0.t("MediaSessionImpl", "Failure calling MediaSession.Callback.onPlaybackResumption(): " + th.getMessage(), th);
                }
                bu3 bu3Var = this.A;
                eq6.K(bu3Var.t);
                if (this.z) {
                    bu3Var.n(this.y);
                    return;
                }
                return;
        }
    }

    public wt3(bu3 bu3Var, dt3 dt3Var, boolean z, go4 go4Var) {
        this.A = bu3Var;
        this.y = dt3Var;
        this.z = z;
    }
}
