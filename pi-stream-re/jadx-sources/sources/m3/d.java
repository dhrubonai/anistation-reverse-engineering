package m3;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7189a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f7190b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f7191c;

    public /* synthetic */ d(j jVar, ArrayList arrayList, int i10) {
        this.f7189a = i10;
        this.f7191c = jVar;
        this.f7190b = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view;
        View view2;
        long j4;
        int i10 = this.f7189a;
        j jVar = this.f7191c;
        ArrayList arrayList = this.f7190b;
        switch (i10) {
            case 0:
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    i iVar = (i) it.next();
                    a1 a1Var = iVar.f7240a;
                    jVar.getClass();
                    View view3 = a1Var.f7153a;
                    int i11 = iVar.f7243d - iVar.f7241b;
                    int i12 = iVar.f7244e - iVar.f7242c;
                    if (i11 != 0) {
                        view3.animate().translationX(0.0f);
                    }
                    if (i12 != 0) {
                        view3.animate().translationY(0.0f);
                    }
                    ViewPropertyAnimator animate = view3.animate();
                    jVar.f7263p.add(a1Var);
                    animate.setDuration(jVar.f7234e).setListener(new f(jVar, a1Var, i11, view3, i12, animate)).start();
                }
                arrayList.clear();
                jVar.f7261m.remove(arrayList);
                return;
            case 1:
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    h hVar = (h) it2.next();
                    jVar.getClass();
                    a1 a1Var2 = hVar.f7224a;
                    if (a1Var2 == null) {
                        view = null;
                    } else {
                        view = a1Var2.f7153a;
                    }
                    a1 a1Var3 = hVar.f7225b;
                    if (a1Var3 != null) {
                        view2 = a1Var3.f7153a;
                    } else {
                        view2 = null;
                    }
                    ArrayList arrayList2 = jVar.f7265r;
                    long j10 = jVar.f7235f;
                    if (view != null) {
                        ViewPropertyAnimator duration = view.animate().setDuration(j10);
                        arrayList2.add(hVar.f7224a);
                        duration.translationX(hVar.f7228e - hVar.f7226c);
                        duration.translationY(hVar.f7229f - hVar.f7227d);
                        j4 = j10;
                        duration.alpha(0.0f).setListener(new g(jVar, hVar, duration, view, 0)).start();
                    } else {
                        j4 = j10;
                    }
                    if (view2 != null) {
                        ViewPropertyAnimator animate2 = view2.animate();
                        arrayList2.add(hVar.f7225b);
                        animate2.translationX(0.0f).translationY(0.0f).setDuration(j4).alpha(1.0f).setListener(new g(jVar, hVar, animate2, view2, 1)).start();
                    }
                }
                arrayList.clear();
                jVar.f7262n.remove(arrayList);
                return;
            default:
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    a1 a1Var4 = (a1) it3.next();
                    jVar.getClass();
                    View view4 = a1Var4.f7153a;
                    ViewPropertyAnimator animate3 = view4.animate();
                    jVar.o.add(a1Var4);
                    animate3.alpha(1.0f).setDuration(jVar.f7232c).setListener(new e(jVar, a1Var4, view4, animate3)).start();
                }
                arrayList.clear();
                jVar.f7260l.remove(arrayList);
                return;
        }
    }
}
