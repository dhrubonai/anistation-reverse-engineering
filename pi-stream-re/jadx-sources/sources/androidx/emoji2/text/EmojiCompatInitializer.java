package androidx.emoji2.text;

import android.content.Context;
import androidx.lifecycle.ProcessLifecycleInitializer;
import androidx.lifecycle.p;
import androidx.lifecycle.u;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import o3.a;
import o3.b;
import q0.l;
import q0.m;
import q0.n;

/* loaded from: classes.dex */
public class EmojiCompatInitializer implements b {
    @Override // o3.b
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // o3.b
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Boolean b(Context context) {
        n nVar = new n(context);
        if (l.f8923j == null) {
            synchronized (l.f8922i) {
                if (l.f8923j == null) {
                    l.f8923j = new l(nVar);
                }
            }
        }
        d(context);
        return Boolean.TRUE;
    }

    public final void d(Context context) {
        Object obj;
        a c6 = a.c(context);
        c6.getClass();
        synchronized (a.f8187e) {
            try {
                obj = c6.f8188a.get(ProcessLifecycleInitializer.class);
                if (obj == null) {
                    obj = c6.b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        p lifecycle = ((u) obj).getLifecycle();
        lifecycle.a(new m(this, lifecycle));
    }
}
