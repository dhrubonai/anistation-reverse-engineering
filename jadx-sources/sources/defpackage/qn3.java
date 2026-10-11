package defpackage;

import android.net.Uri;
import android.os.StrictMode;
import android.util.Log;
import java.io.IOException;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class qn3 implements qc2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qn3(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, ht7] */
    @Override // defpackage.qc2
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                tn3 tn3Var = (tn3) this.b;
                entry.getClass();
                return new pn3(entry, tn3Var);
            case 1:
                Log.w("FlagStore", "Failed to commit to updated flags for ".concat(String.valueOf(((a28) this.b).c)), (Throwable) obj);
                return null;
            default:
                g48 g48Var = (g48) this.b;
                e08 e08Var = (e08) obj;
                ?? obj2 = new Object();
                StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskWrites().build());
                try {
                    try {
                        synchronized (g48.j) {
                            u48 u48Var = (u48) g48Var.d.get();
                            Uri uri = g48Var.g;
                            fk7 fk7Var = new fk7(e08Var.r());
                            fk7Var.y = new ht7[]{obj2};
                            u48Var.a(uri, fk7Var);
                            g48Var.h = e08Var.r();
                        }
                        synchronized (g48.k) {
                            u48 u48Var2 = (u48) g48Var.d.get();
                            Uri uri2 = g48Var.i;
                            fk7 fk7Var2 = new fk7(e08Var.s());
                            fk7Var2.y = new ht7[]{obj2};
                            u48Var2.a(uri2, fk7Var2);
                            e08Var.s();
                        }
                        return null;
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                } finally {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
        }
    }
}
