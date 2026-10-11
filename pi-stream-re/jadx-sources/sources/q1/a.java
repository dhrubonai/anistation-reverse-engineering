package q1;

import android.net.Uri;
import android.os.SystemClock;
import androidx.lifecycle.q0;
import f1.b0;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class a implements q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f8972a;

    public a(c cVar) {
        this.f8972a = cVar;
    }

    @Override // q1.q
    public final boolean a(Uri uri, f1.r rVar, boolean z9) {
        HashMap hashMap;
        b bVar;
        c cVar = this.f8972a;
        if (cVar.C == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            l lVar = cVar.A;
            int i10 = b0.f3799a;
            List list = lVar.f9037e;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                int size = list.size();
                hashMap = cVar.f8985d;
                if (i11 >= size) {
                    break;
                }
                b bVar2 = (b) hashMap.get(((k) list.get(i11)).f9029a);
                if (bVar2 != null && elapsedRealtime < bVar2.f8980y) {
                    i12++;
                }
                i11++;
            }
            z1.h hVar = new z1.h(1, 0, cVar.A.f9037e.size(), i12);
            cVar.f8984c.getClass();
            z1.i y9 = q0.y(hVar, rVar);
            if (y9 != null && y9.f11928a == 2 && (bVar = (b) hashMap.get(uri)) != null) {
                b.a(bVar, y9.f11929b);
            }
        }
        return false;
    }

    @Override // q1.q
    public final void b() {
        this.f8972a.f8986e.remove(this);
    }
}
