package androidx.emoji2.text;

import android.content.Context;
import androidx.lifecycle.ProcessLifecycleInitializer;
import defpackage.c92;
import defpackage.dn0;
import defpackage.fg3;
import defpackage.ks1;
import defpackage.ls1;
import defpackage.og3;
import defpackage.yy2;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class EmojiCompatInitializer implements yy2 {
    /* JADX WARN: Type inference failed for: r1v0, types: [c41, js1, java.lang.Object] */
    @Override // defpackage.yy2
    public final Object create(Context context) {
        Object obj;
        ?? obj2 = new Object();
        obj2.a = context.getApplicationContext();
        c92 c92Var = new c92(obj2);
        c92Var.b = true;
        if (ks1.k == null) {
            synchronized (ks1.j) {
                try {
                    if (ks1.k == null) {
                        ks1.k = new ks1(c92Var);
                    }
                } finally {
                }
            }
        }
        dn0 A = dn0.A(context);
        A.getClass();
        synchronized (dn0.C) {
            try {
                obj = ((HashMap) A.y).get(ProcessLifecycleInitializer.class);
                if (obj == null) {
                    obj = A.x(ProcessLifecycleInitializer.class, new HashSet());
                }
            } finally {
            }
        }
        fg3 lifecycle = ((og3) obj).getLifecycle();
        lifecycle.a(new ls1(this, lifecycle));
        return Boolean.TRUE;
    }

    @Override // defpackage.yy2
    public final List dependencies() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }
}
