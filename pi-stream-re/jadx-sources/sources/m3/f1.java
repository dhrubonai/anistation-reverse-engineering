package m3;

import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class f1 {

    /* renamed from: a, reason: collision with root package name */
    public int f7211a;

    /* renamed from: b, reason: collision with root package name */
    public int f7212b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f7213c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f7214d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f7215e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f7216f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f7217g;

    public f1(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.f7217g = staggeredGridLayoutManager;
        a();
    }

    public final void a() {
        this.f7211a = -1;
        this.f7212b = Integer.MIN_VALUE;
        this.f7213c = false;
        this.f7214d = false;
        this.f7215e = false;
        int[] iArr = this.f7216f;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
    }
}
