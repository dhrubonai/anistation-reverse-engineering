package g0;

import android.graphics.Insets;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class u1 extends WindowInsetsAnimation$Callback {

    /* renamed from: a, reason: collision with root package name */
    public final w5.d f4260a;

    /* renamed from: b, reason: collision with root package name */
    public List f4261b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f4262c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f4263d;

    public u1(w5.d dVar) {
        super(0);
        this.f4263d = new HashMap();
        this.f4260a = dVar;
    }

    public final x1 a(WindowInsetsAnimation windowInsetsAnimation) {
        x1 x1Var = (x1) this.f4263d.get(windowInsetsAnimation);
        if (x1Var == null) {
            x1 x1Var2 = new x1(windowInsetsAnimation);
            this.f4263d.put(windowInsetsAnimation, x1Var2);
            return x1Var2;
        }
        return x1Var;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        w5.d dVar = this.f4260a;
        a(windowInsetsAnimation);
        dVar.f11006b.setTranslationY(0.0f);
        this.f4263d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        w5.d dVar = this.f4260a;
        a(windowInsetsAnimation);
        View view = dVar.f11006b;
        int[] iArr = dVar.f11009e;
        view.getLocationOnScreen(iArr);
        dVar.f11007c = iArr[1];
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        float fraction;
        ArrayList arrayList = this.f4262c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f4262c = arrayList2;
            this.f4261b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                WindowInsetsAnimation k10 = b2.t.k(list.get(size));
                x1 a10 = a(k10);
                fraction = k10.getFraction();
                a10.f4276a.d(fraction);
                this.f4262c.add(a10);
            } else {
                w5.d dVar = this.f4260a;
                k2 h10 = k2.h(null, windowInsets);
                dVar.a(h10, this.f4261b);
                return h10.g();
            }
        }
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        Insets lowerBound;
        Insets upperBound;
        w5.d dVar = this.f4260a;
        a(windowInsetsAnimation);
        lowerBound = bounds.getLowerBound();
        z.d c6 = z.d.c(lowerBound);
        upperBound = bounds.getUpperBound();
        z.d c10 = z.d.c(upperBound);
        View view = dVar.f11006b;
        int[] iArr = dVar.f11009e;
        view.getLocationOnScreen(iArr);
        int i10 = dVar.f11007c - iArr[1];
        dVar.f11008d = i10;
        view.setTranslationY(i10);
        b2.t.m();
        return b2.t.i(c6.d(), c10.d());
    }
}
