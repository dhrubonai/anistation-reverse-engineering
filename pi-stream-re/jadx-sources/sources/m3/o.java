package m3;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class o extends i0 implements n0 {
    public static final int[] C = {R.attr.state_pressed};
    public static final int[] D = new int[0];
    public int A;
    public final k B;

    /* renamed from: a, reason: collision with root package name */
    public final int f7309a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7310b;

    /* renamed from: c, reason: collision with root package name */
    public final StateListDrawable f7311c;

    /* renamed from: d, reason: collision with root package name */
    public final Drawable f7312d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7313e;

    /* renamed from: f, reason: collision with root package name */
    public final int f7314f;

    /* renamed from: g, reason: collision with root package name */
    public final StateListDrawable f7315g;

    /* renamed from: h, reason: collision with root package name */
    public final Drawable f7316h;

    /* renamed from: i, reason: collision with root package name */
    public final int f7317i;

    /* renamed from: j, reason: collision with root package name */
    public final int f7318j;

    /* renamed from: k, reason: collision with root package name */
    public int f7319k;

    /* renamed from: l, reason: collision with root package name */
    public int f7320l;

    /* renamed from: m, reason: collision with root package name */
    public float f7321m;

    /* renamed from: n, reason: collision with root package name */
    public int f7322n;
    public int o;

    /* renamed from: p, reason: collision with root package name */
    public float f7323p;

    /* renamed from: s, reason: collision with root package name */
    public RecyclerView f7326s;

    /* renamed from: z, reason: collision with root package name */
    public final ValueAnimator f7333z;

    /* renamed from: q, reason: collision with root package name */
    public int f7324q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f7325r = 0;

    /* renamed from: t, reason: collision with root package name */
    public boolean f7327t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f7328u = false;

    /* renamed from: v, reason: collision with root package name */
    public int f7329v = 0;

    /* renamed from: w, reason: collision with root package name */
    public int f7330w = 0;

    /* renamed from: x, reason: collision with root package name */
    public final int[] f7331x = new int[2];

    /* renamed from: y, reason: collision with root package name */
    public final int[] f7332y = new int[2];

    /* JADX WARN: Multi-variable type inference failed */
    public o(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i10, int i11, int i12) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f7333z = ofFloat;
        this.A = 0;
        k kVar = new k(this, 0);
        this.B = kVar;
        l lVar = new l(this, 0 == true ? 1 : 0);
        this.f7311c = stateListDrawable;
        this.f7312d = drawable;
        this.f7315g = stateListDrawable2;
        this.f7316h = drawable2;
        this.f7313e = Math.max(i10, stateListDrawable.getIntrinsicWidth());
        this.f7314f = Math.max(i10, drawable.getIntrinsicWidth());
        this.f7317i = Math.max(i10, stateListDrawable2.getIntrinsicWidth());
        this.f7318j = Math.max(i10, drawable2.getIntrinsicWidth());
        this.f7309a = i11;
        this.f7310b = i12;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new m(this));
        ofFloat.addUpdateListener(new n(this));
        RecyclerView recyclerView2 = this.f7326s;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                k0 k0Var = recyclerView2.E;
                if (k0Var != null) {
                    k0Var.c("Cannot remove item decoration during a scroll  or layout");
                }
                ArrayList arrayList = recyclerView2.G;
                arrayList.remove(this);
                if (arrayList.isEmpty()) {
                    recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2);
                }
                recyclerView2.P();
                recyclerView2.requestLayout();
                RecyclerView recyclerView3 = this.f7326s;
                recyclerView3.H.remove(this);
                if (recyclerView3.I == this) {
                    recyclerView3.I = null;
                }
                ArrayList arrayList2 = this.f7326s.f1262z0;
                if (arrayList2 != null) {
                    arrayList2.remove(lVar);
                }
                this.f7326s.removeCallbacks(kVar);
            }
            this.f7326s = recyclerView;
            if (recyclerView != null) {
                recyclerView.i(this);
                this.f7326s.H.add(this);
                this.f7326s.j(lVar);
            }
        }
    }

    @Override // m3.i0
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        if (this.f7324q == this.f7326s.getWidth() && this.f7325r == this.f7326s.getHeight()) {
            if (this.A != 0) {
                if (this.f7327t) {
                    int i10 = this.f7324q;
                    int i11 = this.f7313e;
                    int i12 = i10 - i11;
                    int i13 = this.f7320l;
                    int i14 = this.f7319k;
                    int i15 = i13 - (i14 / 2);
                    StateListDrawable stateListDrawable = this.f7311c;
                    stateListDrawable.setBounds(0, 0, i11, i14);
                    int i16 = this.f7325r;
                    int i17 = this.f7314f;
                    Drawable drawable = this.f7312d;
                    drawable.setBounds(0, 0, i17, i16);
                    RecyclerView recyclerView2 = this.f7326s;
                    WeakHashMap weakHashMap = g0.y0.f4277a;
                    boolean z9 = true;
                    if (g0.i0.d(recyclerView2) != 1) {
                        z9 = false;
                    }
                    if (z9) {
                        drawable.draw(canvas);
                        canvas.translate(i11, i15);
                        canvas.scale(-1.0f, 1.0f);
                        stateListDrawable.draw(canvas);
                        canvas.scale(-1.0f, 1.0f);
                        canvas.translate(-i11, -i15);
                    } else {
                        canvas.translate(i12, 0.0f);
                        drawable.draw(canvas);
                        canvas.translate(0.0f, i15);
                        stateListDrawable.draw(canvas);
                        canvas.translate(-i12, -i15);
                    }
                }
                if (this.f7328u) {
                    int i18 = this.f7325r;
                    int i19 = this.f7317i;
                    int i20 = i18 - i19;
                    int i21 = this.o;
                    int i22 = this.f7322n;
                    int i23 = i21 - (i22 / 2);
                    StateListDrawable stateListDrawable2 = this.f7315g;
                    stateListDrawable2.setBounds(0, 0, i22, i19);
                    int i24 = this.f7324q;
                    int i25 = this.f7318j;
                    Drawable drawable2 = this.f7316h;
                    drawable2.setBounds(0, 0, i24, i25);
                    canvas.translate(0.0f, i20);
                    drawable2.draw(canvas);
                    canvas.translate(i23, 0.0f);
                    stateListDrawable2.draw(canvas);
                    canvas.translate(-i23, -i20);
                    return;
                }
                return;
            }
            return;
        }
        this.f7324q = this.f7326s.getWidth();
        this.f7325r = this.f7326s.getHeight();
        e(0);
    }

    public final boolean c(float f10, float f11) {
        if (f11 >= this.f7325r - this.f7317i) {
            int i10 = this.o;
            int i11 = this.f7322n;
            if (f10 >= i10 - (i11 / 2) && f10 <= (i11 / 2) + i10) {
                return true;
            }
        }
        return false;
    }

    public final boolean d(float f10, float f11) {
        boolean z9;
        RecyclerView recyclerView = this.f7326s;
        WeakHashMap weakHashMap = g0.y0.f4277a;
        if (g0.i0.d(recyclerView) == 1) {
            z9 = true;
        } else {
            z9 = false;
        }
        int i10 = this.f7313e;
        if (z9) {
            if (f10 > i10) {
                return false;
            }
        } else if (f10 < this.f7324q - i10) {
            return false;
        }
        int i11 = this.f7320l;
        int i12 = this.f7319k / 2;
        if (f11 < i11 - i12 || f11 > i12 + i11) {
            return false;
        }
        return true;
    }

    public final void e(int i10) {
        k kVar = this.B;
        StateListDrawable stateListDrawable = this.f7311c;
        if (i10 == 2 && this.f7329v != 2) {
            stateListDrawable.setState(C);
            this.f7326s.removeCallbacks(kVar);
        }
        if (i10 == 0) {
            this.f7326s.invalidate();
        } else {
            f();
        }
        if (this.f7329v == 2 && i10 != 2) {
            stateListDrawable.setState(D);
            this.f7326s.removeCallbacks(kVar);
            this.f7326s.postDelayed(kVar, 1200);
        } else if (i10 == 1) {
            this.f7326s.removeCallbacks(kVar);
            this.f7326s.postDelayed(kVar, 1500);
        }
        this.f7329v = i10;
    }

    public final void f() {
        int i10 = this.A;
        ValueAnimator valueAnimator = this.f7333z;
        if (i10 != 0) {
            if (i10 == 3) {
                valueAnimator.cancel();
            } else {
                return;
            }
        }
        this.A = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }
}
