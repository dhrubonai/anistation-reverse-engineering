package o0;

import a6.e;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.fragment.app.o;
import com.google.android.material.chip.Chip;
import g0.h0;
import g0.y0;
import h0.h;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class a extends o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f8073b;

    public a(e eVar) {
        this.f8073b = eVar;
    }

    @Override // androidx.fragment.app.o
    public final h g(int i10) {
        return new h(AccessibilityNodeInfo.obtain(this.f8073b.n(i10).f4539a));
    }

    @Override // androidx.fragment.app.o
    public final h h(int i10) {
        int i11;
        e eVar = this.f8073b;
        if (i10 == 2) {
            i11 = eVar.f126k;
        } else {
            i11 = eVar.f127l;
        }
        if (i11 == Integer.MIN_VALUE) {
            return null;
        }
        return g(i11);
    }

    @Override // androidx.fragment.app.o
    public final boolean i(int i10, int i11, Bundle bundle) {
        int i12;
        e eVar = this.f8073b;
        View view = eVar.f124i;
        if (i10 != -1) {
            boolean z9 = true;
            if (i11 != 1) {
                if (i11 != 2) {
                    boolean z10 = false;
                    if (i11 != 64) {
                        if (i11 != 128) {
                            if (i11 == 16) {
                                Chip chip = eVar.f129n;
                                if (i10 == 0) {
                                    return chip.performClick();
                                }
                                if (i10 == 1) {
                                    chip.playSoundEffect(0);
                                    View.OnClickListener onClickListener = chip.f2699y;
                                    if (onClickListener != null) {
                                        onClickListener.onClick(chip);
                                        z10 = true;
                                    }
                                    if (chip.J) {
                                        chip.I.q(1, 1);
                                    }
                                }
                            }
                            return z10;
                        }
                        if (eVar.f126k == i10) {
                            eVar.f126k = Integer.MIN_VALUE;
                            view.invalidate();
                            eVar.q(i10, 65536);
                        }
                        z9 = false;
                    } else {
                        AccessibilityManager accessibilityManager = eVar.f123h;
                        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled() && (i12 = eVar.f126k) != i10) {
                            if (i12 != Integer.MIN_VALUE) {
                                eVar.f126k = Integer.MIN_VALUE;
                                eVar.f124i.invalidate();
                                eVar.q(i12, 65536);
                            }
                            eVar.f126k = i10;
                            view.invalidate();
                            eVar.q(i10, 32768);
                        }
                        z9 = false;
                    }
                    return z9;
                }
                return eVar.j(i10);
            }
            return eVar.p(i10);
        }
        WeakHashMap weakHashMap = y0.f4277a;
        return h0.j(view, i11, bundle);
    }
}
