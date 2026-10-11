package g;

import android.os.Process;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.b2;
import androidx.appcompat.widget.m;
import androidx.lifecycle.c0;
import c1.t0;
import com.bumptech.glide.o;
import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.p002firebaseauthapi.zzaja;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import g0.h0;
import g0.y0;
import i8.n;
import j1.d0;
import java.util.WeakHashMap;
import msr.pistream.app.ui.player.PlayerActivity;

/* loaded from: classes.dex */
public final class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4126a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4127b;

    public /* synthetic */ f(Object obj, int i10) {
        this.f4126a = i10;
        this.f4127b = obj;
    }

    /* JADX INFO: Infinite loop detected, blocks: 8, insns: 0 */
    @Override // java.lang.Runnable
    public final void run() {
        m mVar;
        Object obj;
        boolean z9 = true;
        switch (this.f4126a) {
            case 0:
                i iVar = (i) this.f4127b;
                iVar.a(true);
                iVar.invalidateSelf();
                return;
            case 1:
                b2 b2Var = (b2) this.f4127b;
                b2Var.C = null;
                b2Var.drawableStateChanged();
                return;
            case 2:
                ActionMenuView actionMenuView = ((Toolbar) this.f4127b).f375a;
                if (actionMenuView != null && (mVar = actionMenuView.K) != null) {
                    mVar.l();
                    return;
                }
                return;
            case 3:
                k0.g gVar = (k0.g) this.f4127b;
                if (gVar.F) {
                    if (gVar.D) {
                        gVar.D = false;
                        k0.a aVar = gVar.f6297a;
                        aVar.getClass();
                        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        aVar.f6292e = currentAnimationTimeMillis;
                        aVar.f6294g = -1L;
                        aVar.f6293f = currentAnimationTimeMillis;
                        aVar.f6295h = 0.5f;
                    }
                    k0.a aVar2 = gVar.f6297a;
                    if (aVar2.f6294g <= 0 || AnimationUtils.currentAnimationTimeMillis() <= aVar2.f6294g + aVar2.f6296i) {
                        z9 = false;
                    }
                    if (!z9 && gVar.f()) {
                        if (gVar.E) {
                            gVar.E = false;
                            long uptimeMillis = SystemClock.uptimeMillis();
                            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                            gVar.f6299c.onTouchEvent(obtain);
                            obtain.recycle();
                        }
                        if (aVar2.f6293f != 0) {
                            long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                            float a10 = aVar2.a(currentAnimationTimeMillis2);
                            long j4 = currentAnimationTimeMillis2 - aVar2.f6293f;
                            aVar2.f6293f = currentAnimationTimeMillis2;
                            k0.h.b(gVar.H, (int) (((float) j4) * ((a10 * 4.0f) + ((-4.0f) * a10 * a10)) * aVar2.f6291d));
                            View view = gVar.f6299c;
                            WeakHashMap weakHashMap = y0.f4277a;
                            h0.m(view, this);
                            return;
                        }
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    gVar.F = false;
                    return;
                }
                return;
            case 4:
                ((o0.d) this.f4127b).p(0);
                return;
            case 5:
                synchronized (((c0) this.f4127b).f1079a) {
                    obj = ((c0) this.f4127b).f1084f;
                    ((c0) this.f4127b).f1084f = c0.f1078k;
                }
                ((c0) this.f4127b).j(obj);
                return;
            case 6:
                ((z1.m) this.f4127b).e();
                return;
            case zzaja.zze.zzg /* 7 */:
                o oVar = (o) this.f4127b;
                oVar.f2279c.c(oVar);
                return;
            case 8:
                x3.c cVar = (x3.c) this.f4127b;
                cVar.getClass();
                while (true) {
                    try {
                        cVar.b((x3.b) cVar.f11152d.remove());
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            case 9:
                Process.setThreadPriority(0);
                ((Runnable) this.f4127b).run();
                return;
            case 10:
                v vVar = (v) this.f4127b;
                vVar.f2471c = false;
                o0.d dVar = ((BottomSheetBehavior) vVar.f2473e).M;
                if (dVar != null && dVar.g()) {
                    vVar.b(vVar.f2470b);
                    return;
                }
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) vVar.f2473e;
                if (bottomSheetBehavior.L == 2) {
                    bottomSheetBehavior.A(vVar.f2470b);
                    return;
                }
                return;
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                View view2 = (View) this.f4127b;
                ((InputMethodManager) view2.getContext().getSystemService("input_method")).showSoftInput(view2, 1);
                return;
            case 12:
                n nVar = (n) this.f4127b;
                if (!nVar.f5453c.isEmpty()) {
                    int size = (nVar.f5461k + 1) % nVar.f5453c.size();
                    nVar.f5461k = size;
                    nVar.a((a8.b) nVar.f5453c.get(size));
                }
                nVar.f5454d.postDelayed(this, 6500L);
                return;
            default:
                q8.b bVar = (q8.b) this.f4127b;
                if (bVar.f9239h && bVar.f9233b.f() != null && !bVar.f9237f) {
                    bVar.f9238g = true;
                    bVar.f9242k = ((d0) bVar.f9233b.f()).F().f1894a;
                    c1.i iVar2 = (c1.i) bVar.f9233b.f();
                    iVar2.getClass();
                    d0 d0Var = (d0) iVar2;
                    d0Var.W(new t0(2.0f, d0Var.F().f1895b));
                    PlayerActivity playerActivity = bVar.f9233b.f8024b;
                    q8.c cVar2 = playerActivity.f7763n0;
                    if (cVar2 != null) {
                        cVar2.f9246c = "2x";
                        cVar2.f9247d = 1.0f;
                        cVar2.f9248e = true;
                        cVar2.invalidate();
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) playerActivity.f7763n0.getLayoutParams();
                        layoutParams.gravity = 17;
                        layoutParams.setMargins(0, 0, 0, 0);
                        playerActivity.f7763n0.setLayoutParams(layoutParams);
                        playerActivity.f7763n0.setAlpha(1.0f);
                        playerActivity.f7763n0.setVisibility(0);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
