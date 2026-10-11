package defpackage;

import com.anistation.model.watch.Track;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class x07 implements sb2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ ub2 y;
    public final /* synthetic */ Track z;

    public /* synthetic */ x07(ub2 ub2Var, Track track, byte b) {
        this.x = b;
        this.y = ub2Var;
        this.z = track;
    }

    @Override // defpackage.sb2
    public final Object invoke() {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        Track track = this.z;
        ub2 ub2Var = this.y;
        switch (b) {
            case 0:
                ub2Var.invoke(track);
                return pn6Var;
            default:
                ub2Var.invoke(track);
                return pn6Var;
        }
    }
}
