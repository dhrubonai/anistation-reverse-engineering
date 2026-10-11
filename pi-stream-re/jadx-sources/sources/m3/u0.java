package m3;

import android.util.Log;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class u0 {

    /* renamed from: d, reason: collision with root package name */
    public int f7384d = -1;

    /* renamed from: f, reason: collision with root package name */
    public boolean f7386f = false;

    /* renamed from: g, reason: collision with root package name */
    public int f7387g = 0;

    /* renamed from: a, reason: collision with root package name */
    public int f7381a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f7382b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f7383c = Integer.MIN_VALUE;

    /* renamed from: e, reason: collision with root package name */
    public Interpolator f7385e = null;

    public final void a(RecyclerView recyclerView) {
        int i10 = this.f7384d;
        if (i10 >= 0) {
            this.f7384d = -1;
            recyclerView.O(i10);
            this.f7386f = false;
            return;
        }
        if (this.f7386f) {
            Interpolator interpolator = this.f7385e;
            if (interpolator != null && this.f7383c < 1) {
                throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
            }
            int i11 = this.f7383c;
            if (i11 >= 1) {
                recyclerView.f1254u0.c(this.f7381a, this.f7382b, i11, interpolator);
                int i12 = this.f7387g + 1;
                this.f7387g = i12;
                if (i12 > 10) {
                    Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                }
                this.f7386f = false;
                return;
            }
            throw new IllegalStateException("Scroll duration must be a positive number");
        }
        this.f7387g = 0;
    }
}
