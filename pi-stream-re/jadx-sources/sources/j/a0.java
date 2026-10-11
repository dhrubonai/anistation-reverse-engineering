package j;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import g0.y0;
import java.util.WeakHashMap;
import msr.pistream.app.R;

/* loaded from: classes.dex */
public class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f5487a;

    /* renamed from: b, reason: collision with root package name */
    public final o f5488b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f5489c;

    /* renamed from: d, reason: collision with root package name */
    public final int f5490d;

    /* renamed from: e, reason: collision with root package name */
    public final int f5491e;

    /* renamed from: f, reason: collision with root package name */
    public View f5492f;

    /* renamed from: g, reason: collision with root package name */
    public int f5493g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f5494h;

    /* renamed from: i, reason: collision with root package name */
    public b0 f5495i;

    /* renamed from: j, reason: collision with root package name */
    public x f5496j;

    /* renamed from: k, reason: collision with root package name */
    public PopupWindow.OnDismissListener f5497k;

    /* renamed from: l, reason: collision with root package name */
    public final y f5498l;

    public a0(Context context, o oVar, View view, boolean z9) {
        this(R.attr.actionOverflowMenuStyle, 0, context, view, oVar, z9);
    }

    public final x a() {
        boolean z9;
        x h0Var;
        if (this.f5496j == null) {
            Context context = this.f5487a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            z.a(defaultDisplay, point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9) {
                h0Var = new i(this.f5487a, this.f5492f, this.f5490d, this.f5491e, this.f5489c);
            } else {
                Context context2 = this.f5487a;
                o oVar = this.f5488b;
                h0Var = new h0(this.f5490d, this.f5491e, context2, this.f5492f, oVar, this.f5489c);
            }
            h0Var.l(this.f5488b);
            h0Var.r(this.f5498l);
            h0Var.n(this.f5492f);
            h0Var.j(this.f5495i);
            h0Var.o(this.f5494h);
            h0Var.p(this.f5493g);
            this.f5496j = h0Var;
        }
        return this.f5496j;
    }

    public final boolean b() {
        x xVar = this.f5496j;
        if (xVar != null && xVar.b()) {
            return true;
        }
        return false;
    }

    public void c() {
        this.f5496j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f5497k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i10, int i11, boolean z9, boolean z10) {
        x a10 = a();
        a10.s(z10);
        if (z9) {
            int i12 = this.f5493g;
            View view = this.f5492f;
            WeakHashMap weakHashMap = y0.f4277a;
            if ((Gravity.getAbsoluteGravity(i12, g0.i0.d(view)) & 7) == 5) {
                i10 -= this.f5492f.getWidth();
            }
            a10.q(i10);
            a10.t(i11);
            int i13 = (int) ((this.f5487a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a10.f5607a = new Rect(i10 - i13, i11 - i13, i10 + i13, i11 + i13);
        }
        a10.d();
    }

    public a0(int i10, int i11, Context context, View view, o oVar, boolean z9) {
        this.f5493g = 8388611;
        this.f5498l = new y(this);
        this.f5487a = context;
        this.f5488b = oVar;
        this.f5492f = view;
        this.f5489c = z9;
        this.f5490d = i10;
        this.f5491e = i11;
    }
}
