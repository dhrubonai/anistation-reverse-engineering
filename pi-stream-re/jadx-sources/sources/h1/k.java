package h1;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
import r6.s1;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public Uri f4589a;

    /* renamed from: d, reason: collision with root package name */
    public long f4592d;

    /* renamed from: f, reason: collision with root package name */
    public String f4594f;

    /* renamed from: g, reason: collision with root package name */
    public int f4595g;

    /* renamed from: b, reason: collision with root package name */
    public int f4590b = 1;

    /* renamed from: c, reason: collision with root package name */
    public Map f4591c = Collections.emptyMap();

    /* renamed from: e, reason: collision with root package name */
    public long f4593e = -1;

    public final l a() {
        w7.b.x(this.f4589a, "The uri must be set.");
        return new l(this.f4589a, 0L, this.f4590b, null, this.f4591c, this.f4592d, this.f4593e, this.f4594f, this.f4595g, null);
    }

    public final void b(int i10) {
        this.f4595g = i10;
    }

    public final void c() {
        this.f4591c = s1.f9531x;
    }

    public final void d(String str) {
        this.f4594f = str;
    }
}
