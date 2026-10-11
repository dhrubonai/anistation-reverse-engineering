package defpackage;

import android.os.AsyncTask;
import java.util.ArrayDeque;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public abstract class fa7 extends AsyncTask {
    public xf6 a;
    public final l33 b;

    public fa7(l33 l33Var) {
        this.b = l33Var;
    }

    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        xf6 xf6Var = this.a;
        if (xf6Var != null) {
            xf6Var.A = null;
            fa7 fa7Var = (fa7) ((ArrayDeque) xf6Var.z).poll();
            xf6Var.A = fa7Var;
            if (fa7Var != null) {
                fa7Var.executeOnExecutor((ThreadPoolExecutor) xf6Var.y, new Object[0]);
            }
        }
    }
}
