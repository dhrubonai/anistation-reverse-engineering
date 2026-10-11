package defpackage;

import com.anistation.model.library.WatchProgress;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class g01 implements sb2 {
    public final /* synthetic */ boolean x;
    public final /* synthetic */ WatchProgress y;
    public final /* synthetic */ w44 z;

    public g01(boolean z, WatchProgress watchProgress, w44 w44Var) {
        this.x = z;
        this.y = watchProgress;
        this.z = w44Var;
    }

    @Override // defpackage.sb2
    public final Object invoke() {
        LinkedHashSet W;
        boolean z = this.x;
        WatchProgress watchProgress = this.y;
        w44 w44Var = this.z;
        if (z) {
            W = el5.V((Set) w44Var.getValue(), watchProgress.getAnimeId());
        } else {
            W = el5.W((Set) w44Var.getValue(), watchProgress.getAnimeId());
        }
        w44Var.setValue(W);
        return pn6.a;
    }
}
