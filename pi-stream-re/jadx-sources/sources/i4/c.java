package i4;

import android.content.Context;
import java.util.Set;

/* loaded from: classes.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    public final Context f5344a;

    /* renamed from: b, reason: collision with root package name */
    public final a f5345b;

    public c(Context context, com.bumptech.glide.n nVar) {
        this.f5344a = context.getApplicationContext();
        this.f5345b = nVar;
    }

    @Override // i4.j
    public final void c() {
        v d10 = v.d(this.f5344a);
        a aVar = this.f5345b;
        synchronized (d10) {
            ((Set) d10.f5382d).remove(aVar);
            if (d10.f5380b && ((Set) d10.f5382d).isEmpty()) {
                ((q) d10.f5381c).b();
                d10.f5380b = false;
            }
        }
    }

    @Override // i4.j
    public final void j() {
        v d10 = v.d(this.f5344a);
        a aVar = this.f5345b;
        synchronized (d10) {
            ((Set) d10.f5382d).add(aVar);
            if (!d10.f5380b && !((Set) d10.f5382d).isEmpty()) {
                d10.f5380b = ((q) d10.f5381c).a();
            }
        }
    }

    @Override // i4.j
    public final void k() {
    }
}
