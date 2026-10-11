package defpackage;

import android.os.Looper;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class qn7 {
    public static final zk3 g = new zk3("SessionTransController", null);
    public final di0 a;
    public final Set b = Collections.synchronizedSet(new HashSet());
    public final h15 c = new h15(Looper.getMainLooper(), (byte) 4);
    public final on7 d = new on7(this, (byte) 1);
    public boolean e;
    public pk5 f;

    public qn7(di0 di0Var) {
        this.a = di0Var;
    }

    public final void a() {
        this.c.removeCallbacks(this.d);
    }
}
