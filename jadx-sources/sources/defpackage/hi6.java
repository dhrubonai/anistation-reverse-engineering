package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Looper;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class hi6 {
    public static final o15 r;
    public final Context a;
    public String b;
    public String c;
    public bi6 d;
    public final o15 e;
    public final o15 f;
    public final o15 g;
    public final boolean h;
    public final long i;
    public final ui3 j;
    public tp k;
    public final i18 l;
    public final fc1 m;
    public final j81 n;
    public final cn7 o;
    public final Looper p;
    public final t91 q;

    static {
        z62 z62Var = nw2.y;
        Object[] objArr = {0, 90, 180, 270};
        jf7.p(objArr, 4);
        r = nw2.j(objArr, 4);
    }

    public hi6(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.i = ii6.z;
        z62 z62Var = nw2.y;
        o15 o15Var = o15.B;
        this.e = o15Var;
        this.f = o15Var;
        this.l = new i18((byte) 13);
        this.m = new fc1(false, null, null, null, 0, true, true);
        this.n = new j81(new j81(applicationContext));
        this.o = new cn7((byte) 16);
        Looper z = eq6.z();
        this.p = z;
        this.j = new ui3(z);
        if (Build.VERSION.SDK_INT >= 35) {
            this.h = true;
            this.q = new t91(context, false);
        }
        this.g = r;
    }
}
