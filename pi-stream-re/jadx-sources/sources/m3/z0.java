package m3;

import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class z0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public int f7427a;

    /* renamed from: b, reason: collision with root package name */
    public int f7428b;

    /* renamed from: c, reason: collision with root package name */
    public OverScroller f7429c;

    /* renamed from: d, reason: collision with root package name */
    public Interpolator f7430d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f7431e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f7432f;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f7433x;

    public z0(RecyclerView recyclerView) {
        this.f7433x = recyclerView;
        o0.c cVar = RecyclerView.Y0;
        this.f7430d = cVar;
        this.f7431e = false;
        this.f7432f = false;
        this.f7429c = new OverScroller(recyclerView.getContext(), cVar);
    }

    public final void a(int i10, int i11) {
        RecyclerView recyclerView = this.f7433x;
        recyclerView.setScrollState(2);
        this.f7428b = 0;
        this.f7427a = 0;
        Interpolator interpolator = this.f7430d;
        o0.c cVar = RecyclerView.Y0;
        if (interpolator != cVar) {
            this.f7430d = cVar;
            this.f7429c = new OverScroller(recyclerView.getContext(), cVar);
        }
        this.f7429c.fling(0, 0, i10, i11, Integer.MIN_VALUE, com.google.android.gms.common.api.f.API_PRIORITY_OTHER, Integer.MIN_VALUE, com.google.android.gms.common.api.f.API_PRIORITY_OTHER);
        b();
    }

    public final void b() {
        if (this.f7431e) {
            this.f7432f = true;
            return;
        }
        RecyclerView recyclerView = this.f7433x;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = g0.y0.f4277a;
        g0.h0.m(recyclerView, this);
    }

    public final void c(int i10, int i11, int i12, Interpolator interpolator) {
        boolean z9;
        int height;
        RecyclerView recyclerView = this.f7433x;
        if (i12 == Integer.MIN_VALUE) {
            int abs = Math.abs(i10);
            int abs2 = Math.abs(i11);
            if (abs > abs2) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9) {
                height = recyclerView.getWidth();
            } else {
                height = recyclerView.getHeight();
            }
            if (!z9) {
                abs = abs2;
            }
            i12 = Math.min((int) (((abs / height) + 1.0f) * 300.0f), 2000);
        }
        int i13 = i12;
        if (interpolator == null) {
            interpolator = RecyclerView.Y0;
        }
        if (this.f7430d != interpolator) {
            this.f7430d = interpolator;
            this.f7429c = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.f7428b = 0;
        this.f7427a = 0;
        recyclerView.setScrollState(2);
        this.f7429c.startScroll(0, 0, i10, i11, i13);
        b();
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        int i11;
        int i12;
        int i13;
        boolean awakenScrollBars;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        int i14;
        RecyclerView recyclerView = this.f7433x;
        if (recyclerView.E == null) {
            recyclerView.removeCallbacks(this);
            this.f7429c.abortAnimation();
            return;
        }
        this.f7432f = false;
        this.f7431e = true;
        recyclerView.p();
        OverScroller overScroller = this.f7429c;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i15 = currX - this.f7427a;
            int i16 = currY - this.f7428b;
            this.f7427a = currX;
            this.f7428b = currY;
            int o = RecyclerView.o(i15, recyclerView.f1231b0, recyclerView.f1235d0, recyclerView.getWidth());
            int o6 = RecyclerView.o(i16, recyclerView.f1233c0, recyclerView.f1237e0, recyclerView.getHeight());
            int[] iArr = recyclerView.J0;
            iArr[0] = 0;
            iArr[1] = 0;
            boolean u9 = recyclerView.u(o, o6, 1, iArr, null);
            int[] iArr2 = recyclerView.J0;
            if (u9) {
                o -= iArr2[0];
                o6 -= iArr2[1];
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.n(o, o6);
            }
            if (recyclerView.D != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
                recyclerView.d0(o, o6, iArr2);
                int i17 = iArr2[0];
                int i18 = iArr2[1];
                int i19 = o - i17;
                int i20 = o6 - i18;
                w wVar = recyclerView.E.f7282e;
                if (wVar != null && !wVar.f7394d && wVar.f7395e) {
                    int b10 = recyclerView.f1258x0.b();
                    if (b10 == 0) {
                        wVar.i();
                    } else if (wVar.f7391a >= b10) {
                        wVar.f7391a = b10 - 1;
                        wVar.g(i17, i18);
                    } else {
                        wVar.g(i17, i18);
                    }
                }
                i13 = i17;
                i10 = i19;
                i11 = i20;
                i12 = i18;
            } else {
                i10 = o;
                i11 = o6;
                i12 = 0;
                i13 = 0;
            }
            if (!recyclerView.G.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.J0;
            iArr3[0] = 0;
            iArr3[1] = 0;
            int i21 = i12;
            recyclerView.v(i13, i12, i10, i11, null, 1, iArr3);
            int i22 = i10 - iArr2[0];
            int i23 = i11 - iArr2[1];
            if (i13 != 0 || i21 != 0) {
                recyclerView.w(i13, i21);
            }
            awakenScrollBars = recyclerView.awakenScrollBars();
            if (!awakenScrollBars) {
                recyclerView.invalidate();
            }
            if (overScroller.getCurrX() == overScroller.getFinalX()) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (overScroller.getCurrY() == overScroller.getFinalY()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!overScroller.isFinished() && ((!z9 && i22 == 0) || (!z10 && i23 == 0))) {
                z11 = false;
            } else {
                z11 = true;
            }
            w wVar2 = recyclerView.E.f7282e;
            if (wVar2 != null && wVar2.f7394d) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (!z12 && z11) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    if (i22 < 0) {
                        i14 = -currVelocity;
                    } else if (i22 > 0) {
                        i14 = currVelocity;
                    } else {
                        i14 = 0;
                    }
                    if (i23 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i23 <= 0) {
                        currVelocity = 0;
                    }
                    if (i14 < 0) {
                        recyclerView.y();
                        if (recyclerView.f1231b0.isFinished()) {
                            recyclerView.f1231b0.onAbsorb(-i14);
                        }
                    } else if (i14 > 0) {
                        recyclerView.z();
                        if (recyclerView.f1235d0.isFinished()) {
                            recyclerView.f1235d0.onAbsorb(i14);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.A();
                        if (recyclerView.f1233c0.isFinished()) {
                            recyclerView.f1233c0.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.x();
                        if (recyclerView.f1237e0.isFinished()) {
                            recyclerView.f1237e0.onAbsorb(currVelocity);
                        }
                    }
                    if (i14 != 0 || currVelocity != 0) {
                        WeakHashMap weakHashMap = g0.y0.f4277a;
                        g0.h0.k(recyclerView);
                    }
                }
                if (RecyclerView.W0) {
                    n.g gVar = recyclerView.f1256w0;
                    int[] iArr4 = gVar.f7875c;
                    if (iArr4 != null) {
                        Arrays.fill(iArr4, -1);
                    }
                    gVar.f7876d = 0;
                }
            } else {
                b();
                q qVar = recyclerView.f1255v0;
                if (qVar != null) {
                    qVar.a(recyclerView, i13, i21);
                }
            }
        }
        w wVar3 = recyclerView.E.f7282e;
        if (wVar3 != null && wVar3.f7394d) {
            wVar3.g(0, 0);
        }
        this.f7431e = false;
        if (this.f7432f) {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap2 = g0.y0.f4277a;
            g0.h0.m(recyclerView, this);
        } else {
            recyclerView.setScrollState(0);
            recyclerView.j0(1);
        }
    }
}
