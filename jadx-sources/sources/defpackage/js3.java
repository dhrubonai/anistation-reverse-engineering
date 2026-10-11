package defpackage;

import android.content.ComponentName;
import android.content.Context;
import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class js3 {
    public i75 A;
    public ds3 B;
    public boolean C;
    public u92 D;
    public boolean E;
    public final Context x;
    public final sn3 y;
    public final fu z = new fu(this);

    public js3(Context context, sn3 sn3Var) {
        if (context != null) {
            this.x = context;
            if (sn3Var == null) {
                this.y = new sn3((Object) new ComponentName(context, getClass()), (byte) 4);
                return;
            } else {
                this.y = sn3Var;
                return;
            }
        }
        ze0.k("context must not be null");
        throw null;
    }

    public gs3 a(String str, is3 is3Var) {
        if (str != null) {
            return null;
        }
        ze0.k("initialMemberRouteId cannot be null.");
        return null;
    }

    public hs3 b(String str) {
        if (str != null) {
            return null;
        }
        ze0.k("routeId cannot be null");
        return null;
    }

    public hs3 c(String str, is3 is3Var) {
        return b(str);
    }

    public hs3 d(String str, String str2) {
        if (str != null) {
            if (str2 != null) {
                return c(str, is3.b);
            }
            ze0.k("routeGroupId cannot be null");
            return null;
        }
        ze0.k("routeId cannot be null");
        return null;
    }

    public abstract void e(ds3 ds3Var);

    public final void f(u92 u92Var) {
        rs3.b();
        if (this.D != u92Var) {
            this.D = u92Var;
            if (!this.E) {
                this.E = true;
                this.z.sendEmptyMessage(1);
            }
        }
    }

    public final void g(ds3 ds3Var) {
        rs3.b();
        if (!Objects.equals(this.B, ds3Var)) {
            this.B = ds3Var;
            if (!this.C) {
                this.C = true;
                this.z.sendEmptyMessage(2);
            }
        }
    }
}
