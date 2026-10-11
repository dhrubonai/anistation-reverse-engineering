package defpackage;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class l24 {
    public final String a;
    public final i33 b;
    public final Context c;
    public final v11 d;
    public final AtomicBoolean e;
    public int f;
    public pt2 g;
    public final in5 h;
    public final j24 i;
    public final i24 j;
    public final k24 k;

    public l24(Context context, String str, i33 i33Var) {
        context.getClass();
        str.getClass();
        this.a = str;
        this.b = i33Var;
        this.c = context.getApplicationContext();
        this.d = i33Var.a.getCoroutineScope();
        this.e = new AtomicBoolean(true);
        this.h = jn5.a(0, 0, ta0.x);
        this.i = new j24(this, i33Var.b);
        this.j = new i24(this);
        this.k = new k24(this);
    }
}
