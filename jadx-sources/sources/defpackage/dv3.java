package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class dv3 implements ay0, c46 {
    public final /* synthetic */ int x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ dv3(int i, Object obj, Object obj2) {
        this.y = obj;
        this.z = obj2;
        this.x = i;
    }

    @Override // defpackage.ay0
    public void accept(Object obj) {
        tk5 tk5Var;
        int i;
        bu3 bu3Var = (bu3) this.y;
        dt3 dt3Var = (dt3) this.z;
        try {
            tk5Var = (tk5) ((ii3) obj).get();
            io3.w(tk5Var, "SessionResult must not be null");
        } catch (InterruptedException | ExecutionException e) {
            kb0.P("MediaSessionStub", "Session operation failed", e);
            if (e.getCause() instanceof UnsupportedOperationException) {
                i = -6;
            } else {
                i = -1;
            }
            tk5Var = new tk5(i);
        } catch (CancellationException e2) {
            kb0.P("MediaSessionStub", "Session operation cancelled", e2);
            tk5Var = new tk5(1);
        }
        gw3.V(bu3Var, dt3Var, this.x, tk5Var);
    }

    @Override // defpackage.c46
    public Object i() {
        kp6 kp6Var = (kp6) this.y;
        kp6Var.d.N((oy) this.z, this.x + 1, false);
        return null;
    }
}
