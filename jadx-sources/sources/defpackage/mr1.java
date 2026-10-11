package defpackage;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class mr1 extends lr1 {
    @Override // defpackage.kr1, defpackage.ir1
    public void b(e46 e46Var, e46 e46Var2, Window window, View view, boolean z, boolean z2) {
        ViewGroup viewGroup;
        w57 w57Var;
        boolean z3;
        e46Var.getClass();
        e46Var2.getClass();
        window.getClass();
        view.getClass();
        yu5.k(window, false);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        if (view instanceof ViewGroup) {
            viewGroup = (ViewGroup) view;
        } else {
            viewGroup = null;
        }
        if (viewGroup != null) {
            int i = 0;
            while (true) {
                if (i < viewGroup.getChildCount()) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!z3) {
                    break;
                }
                int i2 = i + 1;
                View childAt = viewGroup.getChildAt(i);
                if (childAt != null) {
                    Object tag = childAt.getTag();
                    if (tag instanceof List) {
                        List list = (List) tag;
                        if (list.size() == 4 && (list.get(0) instanceof lp0)) {
                            Iterator it = ((Iterable) tag).iterator();
                            while (it.hasNext()) {
                                it.next();
                            }
                        }
                    }
                    i = i2;
                } else {
                    throw new IndexOutOfBoundsException();
                }
            }
        }
        window.setNavigationBarContrastEnforced(true);
        fq3 fq3Var = new fq3(view);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 35) {
            w57Var = new w57(window, fq3Var, (byte) 1);
        } else if (i3 >= 30) {
            w57Var = new w57(window, fq3Var, (byte) 1);
        } else {
            w57Var = new w57(window, fq3Var, (byte) 0);
        }
        w57Var.f(!z);
        w57Var.e(!z2);
    }
}
