package j;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.appcompat.widget.q2;
import androidx.appcompat.widget.u2;
import f.p0;
import g0.y0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import msr.pistream.app.R;

/* loaded from: classes.dex */
public final class i extends x implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public final e A;
    public final f B;
    public View F;
    public View G;
    public int H;
    public boolean I;
    public boolean J;
    public int K;
    public int L;
    public boolean N;
    public b0 O;
    public ViewTreeObserver P;
    public PopupWindow.OnDismissListener Q;
    public boolean R;

    /* renamed from: b, reason: collision with root package name */
    public final Context f5522b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5523c;

    /* renamed from: d, reason: collision with root package name */
    public final int f5524d;

    /* renamed from: e, reason: collision with root package name */
    public final int f5525e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f5526f;

    /* renamed from: x, reason: collision with root package name */
    public final Handler f5527x;

    /* renamed from: y, reason: collision with root package name */
    public final ArrayList f5528y = new ArrayList();

    /* renamed from: z, reason: collision with root package name */
    public final ArrayList f5529z = new ArrayList();
    public final p0 C = new p0(this, 2);
    public int D = 0;
    public int E = 0;
    public boolean M = false;

    public i(Context context, View view, int i10, int i11, boolean z9) {
        this.A = new e(this, r1);
        this.B = new f(this, r1);
        this.f5522b = context;
        this.F = view;
        this.f5524d = i10;
        this.f5525e = i11;
        this.f5526f = z9;
        WeakHashMap weakHashMap = y0.f4277a;
        this.H = g0.i0.d(view) != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f5523c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f5527x = new Handler();
    }

    @Override // j.c0
    public final void a(o oVar, boolean z9) {
        int i10;
        ArrayList arrayList = this.f5529z;
        int size = arrayList.size();
        int i11 = 0;
        while (true) {
            if (i11 < size) {
                if (oVar == ((h) arrayList.get(i11)).f5512b) {
                    break;
                } else {
                    i11++;
                }
            } else {
                i11 = -1;
                break;
            }
        }
        if (i11 < 0) {
            return;
        }
        int i12 = i11 + 1;
        if (i12 < arrayList.size()) {
            ((h) arrayList.get(i12)).f5512b.c(false);
        }
        h hVar = (h) arrayList.remove(i11);
        hVar.f5512b.r(this);
        boolean z10 = this.R;
        u2 u2Var = hVar.f5511a;
        if (z10) {
            q2.b(u2Var.Q, null);
            u2Var.Q.setAnimationStyle(0);
        }
        u2Var.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.H = ((h) arrayList.get(size2 - 1)).f5513c;
        } else {
            View view = this.F;
            WeakHashMap weakHashMap = y0.f4277a;
            if (g0.i0.d(view) == 1) {
                i10 = 0;
            } else {
                i10 = 1;
            }
            this.H = i10;
        }
        if (size2 == 0) {
            dismiss();
            b0 b0Var = this.O;
            if (b0Var != null) {
                b0Var.a(oVar, true);
            }
            ViewTreeObserver viewTreeObserver = this.P;
            if (viewTreeObserver != null) {
                if (viewTreeObserver.isAlive()) {
                    this.P.removeGlobalOnLayoutListener(this.A);
                }
                this.P = null;
            }
            this.G.removeOnAttachStateChangeListener(this.B);
            this.Q.onDismiss();
            return;
        }
        if (z9) {
            ((h) arrayList.get(0)).f5512b.c(false);
        }
    }

    @Override // j.g0
    public final boolean b() {
        ArrayList arrayList = this.f5529z;
        if (arrayList.size() <= 0 || !((h) arrayList.get(0)).f5511a.b()) {
            return false;
        }
        return true;
    }

    @Override // j.g0
    public final void d() {
        boolean z9;
        if (b()) {
            return;
        }
        ArrayList arrayList = this.f5528y;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            v((o) it.next());
        }
        arrayList.clear();
        View view = this.F;
        this.G = view;
        if (view != null) {
            if (this.P == null) {
                z9 = true;
            } else {
                z9 = false;
            }
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.P = viewTreeObserver;
            if (z9) {
                viewTreeObserver.addOnGlobalLayoutListener(this.A);
            }
            this.G.addOnAttachStateChangeListener(this.B);
        }
    }

    @Override // j.g0
    public final void dismiss() {
        ArrayList arrayList = this.f5529z;
        int size = arrayList.size();
        if (size > 0) {
            h[] hVarArr = (h[]) arrayList.toArray(new h[size]);
            while (true) {
                size--;
                if (size >= 0) {
                    h hVar = hVarArr[size];
                    if (hVar.f5511a.b()) {
                        hVar.f5511a.dismiss();
                    }
                } else {
                    return;
                }
            }
        }
    }

    @Override // j.c0
    public final void e() {
        Iterator it = this.f5529z.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((h) it.next()).f5511a.f590c.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((l) adapter).notifyDataSetChanged();
        }
    }

    @Override // j.g0
    public final ListView f() {
        ArrayList arrayList = this.f5529z;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((h) arrayList.get(arrayList.size() - 1)).f5511a.f590c;
    }

    @Override // j.c0
    public final boolean h() {
        return false;
    }

    @Override // j.c0
    public final void j(b0 b0Var) {
        this.O = b0Var;
    }

    @Override // j.c0
    public final boolean k(i0 i0Var) {
        Iterator it = this.f5529z.iterator();
        while (it.hasNext()) {
            h hVar = (h) it.next();
            if (i0Var == hVar.f5512b) {
                hVar.f5511a.f590c.requestFocus();
                return true;
            }
        }
        if (i0Var.hasVisibleItems()) {
            l(i0Var);
            b0 b0Var = this.O;
            if (b0Var != null) {
                b0Var.m(i0Var);
            }
            return true;
        }
        return false;
    }

    @Override // j.x
    public final void l(o oVar) {
        oVar.b(this, this.f5522b);
        if (b()) {
            v(oVar);
        } else {
            this.f5528y.add(oVar);
        }
    }

    @Override // j.x
    public final void n(View view) {
        if (this.F != view) {
            this.F = view;
            int i10 = this.D;
            WeakHashMap weakHashMap = y0.f4277a;
            this.E = Gravity.getAbsoluteGravity(i10, g0.i0.d(view));
        }
    }

    @Override // j.x
    public final void o(boolean z9) {
        this.M = z9;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        h hVar;
        ArrayList arrayList = this.f5529z;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                hVar = (h) arrayList.get(i10);
                if (!hVar.f5511a.b()) {
                    break;
                } else {
                    i10++;
                }
            } else {
                hVar = null;
                break;
            }
        }
        if (hVar != null) {
            hVar.f5512b.c(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && i10 == 82) {
            dismiss();
            return true;
        }
        return false;
    }

    @Override // j.x
    public final void p(int i10) {
        if (this.D != i10) {
            this.D = i10;
            View view = this.F;
            WeakHashMap weakHashMap = y0.f4277a;
            this.E = Gravity.getAbsoluteGravity(i10, g0.i0.d(view));
        }
    }

    @Override // j.x
    public final void q(int i10) {
        this.I = true;
        this.K = i10;
    }

    @Override // j.x
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.Q = onDismissListener;
    }

    @Override // j.x
    public final void s(boolean z9) {
        this.N = z9;
    }

    @Override // j.x
    public final void t(int i10) {
        this.J = true;
        this.L = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0150  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v(j.o r19) {
        /*
            Method dump skipped, instructions count: 532
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j.i.v(j.o):void");
    }
}
