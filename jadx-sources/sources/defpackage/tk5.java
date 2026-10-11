package defpackage;

import android.os.Bundle;
import android.os.SystemClock;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class tk5 {
    public static final String e;
    public static final String f;
    public static final String g;
    public static final String h;
    public final int a;
    public final Bundle b;
    public final long c;
    public final ok5 d;

    static {
        String str = eq6.a;
        e = Integer.toString(0, 36);
        f = Integer.toString(1, 36);
        g = Integer.toString(2, 36);
        h = Integer.toString(3, 36);
    }

    public tk5(int i, Bundle bundle, long j, ok5 ok5Var) {
        boolean z = true;
        if (ok5Var != null && i >= 0 && i != 1) {
            z = false;
        }
        io3.n(z);
        this.a = i;
        this.b = new Bundle(bundle);
        this.c = j;
        if (ok5Var == null && i < 0) {
            ok5Var = new ok5(i);
        }
        this.d = ok5Var;
    }

    public static tk5 a(Bundle bundle) {
        ok5 ok5Var;
        int i = bundle.getInt(e, -1);
        Bundle n = eq6.n(bundle.getBundle(f));
        long j = bundle.getLong(g, SystemClock.elapsedRealtime());
        Bundle bundle2 = bundle.getBundle(h);
        if (bundle2 != null) {
            int i2 = bundle2.getInt(ok5.d, UnityAdsConstants.SafeGuards.InitRequestTimeoutPolicy.MIN_TIMEOUT);
            String string = bundle2.getString(ok5.e, "");
            Bundle n2 = eq6.n(bundle2.getBundle(ok5.f));
            if (n2 == null) {
                n2 = Bundle.EMPTY;
            }
            ok5Var = new ok5(i2, n2, string);
        } else if (i != 0) {
            ok5Var = new ok5(i);
        } else {
            ok5Var = null;
        }
        ok5 ok5Var2 = ok5Var;
        if (n == null) {
            n = Bundle.EMPTY;
        }
        return new tk5(i, n, j, ok5Var2);
    }

    public tk5(int i) {
        this(i, Bundle.EMPTY, SystemClock.elapsedRealtime(), null);
    }
}
