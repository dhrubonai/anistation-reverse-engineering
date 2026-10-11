package g;

import android.content.res.Resources;

/* loaded from: classes.dex */
public abstract class j extends h {
    public int[][] H;

    public j(j jVar, k kVar, Resources resources) {
        super(jVar, kVar, resources);
        if (jVar != null) {
            this.H = jVar.H;
        } else {
            this.H = new int[this.f4136g.length];
        }
    }
}
