package defpackage;

import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class z47 extends WindowInsetsAnimation$Callback {
    public final po0 a;
    public List b;
    public ArrayList c;
    public final HashMap d;

    public z47(po0 po0Var) {
        super(po0Var.x);
        this.d = new HashMap();
        this.a = po0Var;
    }

    public final c57 a(WindowInsetsAnimation windowInsetsAnimation) {
        HashMap hashMap = this.d;
        c57 c57Var = (c57) hashMap.get(windowInsetsAnimation);
        if (c57Var == null) {
            c57 c57Var2 = new c57(0, null, 0L);
            c57Var2.a = new a57(windowInsetsAnimation);
            hashMap.put(windowInsetsAnimation, c57Var2);
            return c57Var2;
        }
        return c57Var;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.a.d(a(windowInsetsAnimation));
        this.d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        this.a.e(a(windowInsetsAnimation));
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        float fraction;
        ArrayList arrayList = this.c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.c = arrayList2;
            this.b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation j = pu5.j(list.get(size));
            c57 a = a(j);
            fraction = j.getFraction();
            a.a.e(fraction);
            this.c.add(a);
        }
        return this.a.f(v57.c(windowInsets, null), this.b).b();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        l33 g = this.a.g(a(windowInsetsAnimation), new l33(bounds));
        g.getClass();
        pu5.l();
        return pu5.h(((yz2) g.y).d(), ((yz2) g.z).d());
    }
}
