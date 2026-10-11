package defpackage;

import android.view.ActionMode;
import android.view.View;
import com.anistation.android.R;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class i5 implements bi1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i5(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // defpackage.bi1
    public final void dispose() {
        bx5 bx5Var;
        boolean isTerminated;
        byte b = this.a;
        boolean z = false;
        Object obj = this.b;
        switch (b) {
            case 0:
                e5 e5Var = ((a5) obj).a;
                if (e5Var != null) {
                    e5Var.b.d(e5Var.c);
                    return;
                } else {
                    ze0.m("Launcher has not been initialized");
                    return;
                }
            case 1:
                hg1 hg1Var = (hg1) obj;
                hg1Var.dismiss();
                hg1Var.E.e();
                return;
            case 2:
                vr4 vr4Var = (vr4) obj;
                vr4Var.e();
                vr4Var.setTag(R.id.view_tree_lifecycle_owner, null);
                vr4Var.M.removeViewImmediate(vr4Var);
                return;
            case 3:
                af afVar = (af) obj;
                eu5 eu5Var = afVar.e;
                xv3 xv3Var = eu5Var.h;
                if (xv3Var != null) {
                    xv3Var.d();
                }
                eu5Var.a();
                ActionMode actionMode = afVar.h;
                if (actionMode != null) {
                    actionMode.finish();
                }
                afVar.h = null;
                return;
            case 4:
                ((View) obj).setKeepScreenOn(false);
                return;
            case 5:
                e40 e40Var = (e40) ((f40) obj).c.getValue();
                if (e40Var != null) {
                    e40Var.close();
                    return;
                }
                return;
            case 6:
                cc6 cc6Var = (cc6) obj;
                f96 f96Var = cc6Var.d.a;
                if (f96Var != null && (bx5Var = f96Var.R) != null) {
                    bx5Var.l(null);
                    f96Var.R = null;
                }
                cc6Var.j = null;
                return;
            case 7:
                qg0 qg0Var = ((ng6) obj).c;
                if (qg0Var != null) {
                    qg0Var.a(null);
                    return;
                }
                return;
            case 8:
                ((jb6) obj).m();
                return;
            case 9:
                ((pd3) obj).d = null;
                return;
            case 10:
                be3 be3Var = (be3) obj;
                tu tuVar = be3Var.c;
                if (tuVar != null) {
                    tuVar.x = false;
                }
                be3Var.c = null;
                return;
            case 11:
                xd3 xd3Var = (xd3) obj;
                xd3Var.f = true;
                xd3Var.d = 0;
                xd3Var.b.x.remove(xd3Var);
                xd3 xd3Var2 = xd3Var.e;
                if (xd3Var2 != null) {
                    xd3Var2.b();
                }
                xd3Var.e = null;
                return;
            case 12:
                dz3 dz3Var = (dz3) obj;
                dz3Var.dismiss();
                dz3Var.F.e();
                return;
            case 13:
                AutoCloseable autoCloseable = (hw6) obj;
                if (autoCloseable instanceof AutoCloseable) {
                    autoCloseable.close();
                    return;
                }
                if (autoCloseable instanceof ExecutorService) {
                    ExecutorService executorService = (ExecutorService) autoCloseable;
                    if (executorService != ForkJoinPool.commonPool() && !(isTerminated = executorService.isTerminated())) {
                        executorService.shutdown();
                        while (!isTerminated) {
                            try {
                                isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                            } catch (InterruptedException unused) {
                                if (!z) {
                                    executorService.shutdownNow();
                                    z = true;
                                }
                            }
                        }
                        if (z) {
                            Thread.currentThread().interrupt();
                            return;
                        }
                        return;
                    }
                    return;
                }
                p65.b();
                return;
            case 14:
                w44 w44Var = (w44) obj;
                if (((qt4) w44Var.getValue()) != null) {
                    w44Var.setValue(null);
                    return;
                }
                return;
            case 15:
                ((sf5) ((qt0) obj)).U(null);
                return;
            default:
                ((r07) obj).x.a();
                return;
        }
    }
}
