package defpackage;

import android.content.Context;
import android.os.Looper;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class zx1 {
    public static final int E;
    public static final boolean F;
    public boolean A;
    public final String B;
    public boolean C;
    public final boolean D;
    public final Context a;
    public final f46 b;
    public final r26 c;
    public r26 d;
    public r26 e;
    public r26 f;
    public final av g;
    public final pb0 h;
    public Looper i;
    public final int j;
    public final ru k;
    public final boolean l;
    public final boolean m;
    public final if5 n;
    public final sd5 o;
    public final short p;
    public final short q;
    public final short r;
    public final p91 s;
    public final short t;
    public final short u;
    public int v;
    public int w;
    public int x;
    public final int y;
    public boolean z;

    static {
        int i;
        if (eq6.Q()) {
            i = 30000;
        } else {
            i = UnityAdsConstants.AdOperations.SHOW_TIMEOUT_MS;
        }
        E = i;
        F = true;
    }

    public zx1(Context context, r26 r26Var, r26 r26Var2) {
        int i;
        byte b = 3;
        av avVar = new av(context, b);
        xw xwVar = new xw(b);
        av avVar2 = new av(context, (byte) 4);
        pb0 pb0Var = new pb0((byte) 5);
        context.getClass();
        this.a = context;
        this.c = r26Var;
        this.d = r26Var2;
        this.e = avVar;
        this.f = xwVar;
        this.g = avVar2;
        this.h = pb0Var;
        this.i = eq6.z();
        this.k = ru.i;
        this.l = true;
        this.m = true;
        this.n = if5.e;
        this.p = (short) 5000;
        this.q = (short) 15000;
        this.r = (short) 3000;
        this.o = sd5.b;
        this.s = new p91(eq6.U(20L), eq6.U(500L));
        this.b = f46.a;
        this.t = (short) 500;
        this.u = (short) 2000;
        this.v = 600000;
        boolean z = F;
        if (z) {
            i = E;
        } else {
            i = Integer.MAX_VALUE;
        }
        this.w = i;
        this.x = z ? 60000 : Integer.MAX_VALUE;
        this.y = 600000;
        this.z = true;
        this.B = "";
        this.j = -1000;
        new r18();
        this.C = true;
        this.D = true;
    }
}
